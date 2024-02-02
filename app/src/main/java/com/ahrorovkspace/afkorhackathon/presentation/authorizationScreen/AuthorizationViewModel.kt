package com.ahrorovkspace.afkorhackathon.presentation.authorizationScreen

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ahrorovkspace.afkorhackathon.core.Resource
import com.ahrorovkspace.afkorhackathon.core.states.AuthorizationRespState
import com.ahrorovkspace.afkorhackathon.data.local.DataStoreManager
import com.ahrorovkspace.afkorhackathon.domain.authorization.model.AuthorizationBody
import com.ahrorovkspace.afkorhackathon.domain.authorization.model.AuthorizationResp
import com.ahrorovkspace.afkorhackathon.domain.authorization.useCase.AuthorizationUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.plus
import javax.inject.Inject

@HiltViewModel
class AuthorizationViewModel @Inject constructor(
    private val authorizationUseCase: AuthorizationUseCase,
    private val dataStoreManager: DataStoreManager
) : ViewModel() {
    private val _state = MutableStateFlow(AuthorizationState())
    val state = _state.stateIn(
        viewModelScope + Dispatchers.IO,
        SharingStarted.WhileSubscribed(5000),
        AuthorizationState()
    )

    fun onEvent(event: AuthorizationEvent) {
        when (event) {
            is AuthorizationEvent.OnLoginChange -> {
                _state.update {
                    it.copy(
                        username = event.login
                    )
                }
            }

            is AuthorizationEvent.OnPasswordChange -> {
                _state.update {
                    it.copy(
                        password = event.password
                    )
                }
            }

            is AuthorizationEvent.OnAuthorizationStateChange -> {
                _state.update {
                    it.copy(
                        authorizationRespState = event.state
                    )
                }
            }

            AuthorizationEvent.Authorization -> {
                authorization(
                    _state.value.username,
                    _state.value.password
                )
            }

            else -> Unit
        }
    }

    fun authorization(username: String, password: String) {
        authorizationUseCase.invoke(
            AuthorizationBody(
                username,
                password
            )
        ).onEach { result: Resource<AuthorizationResp> ->
            when (result) {
                is Resource.Success -> {
                    val response: AuthorizationResp? = result.data
                    onEvent(
                        AuthorizationEvent.OnAuthorizationStateChange(
                            AuthorizationRespState(
                                response = response
                            )
                        )
                    )
                    viewModelScope.launch {
                        if (response != null) {
                            dataStoreManager.updateRefreshToken(response.refresh)
                            dataStoreManager.updateAccessToken(response.access)
                        }
                    }
                    Log.e("TAG", "AuthorizationResponse->\n ${_state.value.authorizationRespState}")
                }

                is Resource.Error -> {
                    Log.e("TAG", "AuthorizationResponseError->\n ${result.message}")
                    onEvent(
                        AuthorizationEvent.OnAuthorizationStateChange(
                            AuthorizationRespState(
                                error = "${result.message}"
                            )
                        )
                    )
                }

                is Resource.Loading -> {
                    onEvent(
                        AuthorizationEvent.OnAuthorizationStateChange(
                            AuthorizationRespState(
                                isLoading = true
                            )
                        )
                    )
                }
            }
        }.launchIn(viewModelScope)
    }
}