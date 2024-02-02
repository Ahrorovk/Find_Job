package com.ahrorovkspace.afkorhackathon.presentation.registratrionScreen

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ahrorovkspace.afkorhackathon.core.Resource
import com.ahrorovkspace.afkorhackathon.core.states.RegistrationRespState
import com.ahrorovkspace.afkorhackathon.data.local.DataStoreManager
import com.ahrorovkspace.afkorhackathon.domain.registration.model.RegistrationBody
import com.ahrorovkspace.afkorhackathon.domain.registration.model.RegistrationResp
import com.ahrorovkspace.afkorhackathon.domain.registration.useCase.RegistrationUseCase
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
class RegistrationViewModel @Inject constructor(
    private val registrationUseCase: RegistrationUseCase,
    private val dataStoreManager: DataStoreManager
) : ViewModel() {
    private val _state = MutableStateFlow(RegistrationState())
    val state = _state.stateIn(
        viewModelScope + Dispatchers.IO,
        SharingStarted.WhileSubscribed(5000),
        RegistrationState()
    )

    fun onEvent(event: RegistrationEvent) {
        when (event) {
            is RegistrationEvent.OnEmailChange -> {
                _state.update {
                    it.copy(
                        email = event.email
                    )
                }
            }

            is RegistrationEvent.OnPasswordChange -> {
                _state.update {
                    it.copy(
                        password = event.password
                    )
                }
            }

            is RegistrationEvent.OnPasswordConfirmChange -> {
                _state.update {
                    it.copy(
                        passwordConfirm = event.passwordConfirm
                    )
                }
            }

            is RegistrationEvent.OnUsernameChange -> {
                _state.update {
                    it.copy(
                        username = event.username
                    )
                }
            }
            is RegistrationEvent.OnPhoneChange -> {
                _state.update {
                    it.copy(
                        phone = event.phone
                    )
                }
            }

            RegistrationEvent.Registration -> {
                registration()
            }

            is RegistrationEvent.OnRegistrationRespStateChange -> {
                _state.update {
                    it.copy(
                        registrationRespState = event.state
                    )
                }
            }

            is RegistrationEvent.OnRoleChange -> {
                _state.update {
                    it.copy(
                        selectedRole = event.role
                    )
                }
            }

            else -> Unit
        }
    }

    private fun registration() {
        registrationUseCase.invoke(
            RegistrationBody(
                username = _state.value.username,
                email = _state.value.email,
                phone = _state.value.phone,
                password = _state.value.password,
                password_confirmation = _state.value.passwordConfirm,
                role = _state.value.selectedRole.roleId
            )
        ).onEach { result: Resource<RegistrationResp> ->
            when (result) {
                is Resource.Success -> {
                    val response: RegistrationResp? = result.data
                    onEvent(
                        RegistrationEvent.OnRegistrationRespStateChange(
                            RegistrationRespState(
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
                    Log.e("TAG", "AuthorizationResponse->\n ${_state.value.registrationRespState}")
                }

                is Resource.Error -> {
                    Log.e("TAG", "AuthorizationResponseError->\n ${result.message}")
                    onEvent(
                        RegistrationEvent.OnRegistrationRespStateChange(
                            RegistrationRespState(
                                error = "${result.message}"
                            )
                        )
                    )
                }

                is Resource.Loading -> {
                    onEvent(
                        RegistrationEvent.OnRegistrationRespStateChange(
                            RegistrationRespState(
                                isLoading = true
                            )
                        )
                    )
                }
            }
        }.launchIn(viewModelScope)
    }

}