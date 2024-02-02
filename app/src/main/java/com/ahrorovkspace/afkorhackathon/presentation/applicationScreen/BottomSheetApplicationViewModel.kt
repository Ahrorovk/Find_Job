package com.ahrorovkspace.afkorhackathon.presentation.applicationScreen

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ahrorovkspace.afkorhackathon.core.BottomSheetApplyOneTimeEvent
import com.ahrorovkspace.afkorhackathon.core.Resource
import com.ahrorovkspace.afkorhackathon.core.states.PostApplicationRespState
import com.ahrorovkspace.afkorhackathon.data.local.DataStoreManager
import com.ahrorovkspace.afkorhackathon.domain.application.model.PostApplicationBody
import com.ahrorovkspace.afkorhackathon.domain.application.model.PostApplicationResp
import com.ahrorovkspace.afkorhackathon.domain.application.useCase.SendApplicationUseCase
import com.ahrorovkspace.afkorhackathon.domain.refreshToken.model.RefreshTokenBody
import com.ahrorovkspace.afkorhackathon.domain.refreshToken.model.RefreshTokenResp
import com.ahrorovkspace.afkorhackathon.domain.refreshToken.useCase.RefreshTokenUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.plus
import javax.inject.Inject

@HiltViewModel
class BottomSheetApplicationViewModel @Inject constructor(
    private val dataStoreManager: DataStoreManager,
    private val sendApplicationUseCase: SendApplicationUseCase,
    private val refreshTokenUseCase: RefreshTokenUseCase
) : ViewModel() {
    private val _state = MutableStateFlow(BottomSheetApplicationState())
    val state = _state.stateIn(
        viewModelScope + Dispatchers.IO,
        SharingStarted.WhileSubscribed(5000),
        BottomSheetApplicationState()
    )
    private val channel = Channel<BottomSheetApplyOneTimeEvent>()
    val flow = channel.receiveAsFlow()

    init {
        dataStoreManager.getRefreshToken.onEach { value ->
            _state.update {
                it.copy(
                    refreshToken = value
                )
            }
        }.launchIn(viewModelScope)
        dataStoreManager.getAccessToken.onEach { value ->
            _state.update {
                it.copy(
                    accessToken = value
                )
            }
        }.launchIn(viewModelScope)
    }

    fun onEvent(event: BottomSheetApplicationEvent) {
        when (event) {
            is BottomSheetApplicationEvent.OnDescriptionChange -> {
                _state.update {
                    it.copy(
                        description = event.state
                    )
                }
            }

            is BottomSheetApplicationEvent.OnProjectIdChange -> {
                _state.update {
                    it.copy(
                        projectId = event.id
                    )
                }
            }

            is BottomSheetApplicationEvent.OnPostBottomSheetApplicationRespState -> {
                _state.update {
                    it.copy(
                        applicationRespState = event.state
                    )
                }
            }

            BottomSheetApplicationEvent.Apply -> {
                viewModelScope.launch {
                    postApplication()
                    channel.send(BottomSheetApplyOneTimeEvent.CloseBottomSheet)
                }
            }

            is BottomSheetApplicationEvent.OnStatusOfResumeChange -> {
                _state.update {
                    it.copy(
                        statusOfSendResume = event.status
                    )
                }
            }

            else -> Unit
        }
    }

    private fun postApplication() {
        sendApplicationUseCase.invoke(
            token = "Bearer ${_state.value.accessToken}",
            PostApplicationBody(_state.value.description,_state.value.projectId)
        ).onEach { result: Resource<PostApplicationResp> ->
            when (result) {
                is Resource.Success -> {
                    val response: PostApplicationResp? = result.data
                    onEvent(
                        BottomSheetApplicationEvent.OnPostBottomSheetApplicationRespState(
                            PostApplicationRespState(
                                response = response
                            )
                        )
                    )
                    Log.e(
                        "TAG",
                        "ProjectByCategoriesResponse->\n ${_state.value}"
                    )
                }

                is Resource.Error -> {
                    Log.e("TAG", "AuthorizationResponseError->\n ${result.message}")
                    onEvent(
                        BottomSheetApplicationEvent.OnPostBottomSheetApplicationRespState(
                            PostApplicationRespState(
                                error = "${result.message}"
                            )
                        )
                    )
                    refreshToken {
                        postApplication()
                    }
                }

                is Resource.Loading -> {
                    onEvent(
                        BottomSheetApplicationEvent.OnPostBottomSheetApplicationRespState(
                            PostApplicationRespState(
                                isLoading = true
                            )
                        )
                    )
                }

            }
        }.launchIn(viewModelScope)
    }

    private fun refreshToken(refreshFun: () -> Unit) {
        refreshTokenUseCase.invoke(
            refreshTokenBody = RefreshTokenBody(_state.value.refreshToken)
        ).onEach { result: Resource<RefreshTokenResp> ->
            when (result) {
                is Resource.Success -> {
                    val response: RefreshTokenResp? = result.data
                    response?.let {
                        dataStoreManager.updateAccessToken(it.access)
                        delay(100)
                        refreshFun()
                    }
                    Log.e("TAG", "RefreshTokenResponse->\n ${_state.value.accessToken}")
                }

                is Resource.Error -> {
                    Log.e("TAG", "RefreshTokenResponseError->\n ${result.message}")
                }

                is Resource.Loading -> {
                    onEvent(
                        BottomSheetApplicationEvent.OnPostBottomSheetApplicationRespState(
                            PostApplicationRespState(
                                isLoading = true
                            )
                        )
                    )
                }
            }
        }.launchIn(viewModelScope)
    }
}