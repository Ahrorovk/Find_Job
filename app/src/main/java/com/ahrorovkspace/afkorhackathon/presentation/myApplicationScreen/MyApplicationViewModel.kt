package com.ahrorovkspace.afkorhackathon.presentation.myApplicationScreen

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ahrorovkspace.afkorhackathon.core.Resource
import com.ahrorovkspace.afkorhackathon.core.states.GetMyApplicationRespState
import com.ahrorovkspace.afkorhackathon.data.local.DataStoreManager
import com.ahrorovkspace.afkorhackathon.domain.myApplication.model.ApproveApplicationBody
import com.ahrorovkspace.afkorhackathon.domain.myApplication.model.ApproveApplicationResp
import com.ahrorovkspace.afkorhackathon.domain.myApplication.model.GetMyApplicationResp
import com.ahrorovkspace.afkorhackathon.domain.myApplication.useCase.ApproveApplicationUseCase
import com.ahrorovkspace.afkorhackathon.domain.myApplication.useCase.GetMyApplicationUseCase
import com.ahrorovkspace.afkorhackathon.domain.refreshToken.model.RefreshTokenBody
import com.ahrorovkspace.afkorhackathon.domain.refreshToken.model.RefreshTokenResp
import com.ahrorovkspace.afkorhackathon.domain.refreshToken.useCase.RefreshTokenUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.plus
import javax.inject.Inject

@HiltViewModel
class MyApplicationViewModel @Inject constructor(
    private val dataStoreManager: DataStoreManager,
    private val getMyApplicationUseCase: GetMyApplicationUseCase,
    private val refreshTokenUseCase: RefreshTokenUseCase,
    private val approveApplicationUseCase: ApproveApplicationUseCase
) : ViewModel() {
    private val _state = MutableStateFlow(MyApplicationState())
    val state = _state.stateIn(
        viewModelScope + Dispatchers.IO,
        SharingStarted.WhileSubscribed(5000),
        MyApplicationState()
    )

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

    fun onEvent(event: MyApplicationEvent) {
        when (event) {
            is MyApplicationEvent.OnGetMyApplicationChange -> {
                _state.update {
                    it.copy(
                        myApplicationRespState = event.state
                    )
                }
            }

            is MyApplicationEvent.OnApplicationStateChange -> {
                _state.update {
                    it.copy(
                        applicationState = event.state
                    )
                }
            }

            MyApplicationEvent.GetMyApplication -> {
                getMyApplications()
            }

            is MyApplicationEvent.OnSelectedResultsChange -> {
                val approveId = mutableListOf<Int>()
                event.selected.forEach {
                    approveId.add(it.id)
                }
                _state.update {
                    it.copy(
                        approveApplication = approveId
                    )
                }
                approveApplication()
            }
        }
    }

    private fun getMyApplications() {
        getMyApplicationUseCase.invoke(
            token = "Bearer ${_state.value.accessToken}"
        ).onEach { result: Resource<GetMyApplicationResp> ->
            when (result) {
                is Resource.Success -> {
                    val response: GetMyApplicationResp? = result.data
                    onEvent(
                        MyApplicationEvent.OnGetMyApplicationChange(
                            GetMyApplicationRespState(
                                response = response
                            )
                        )
                    )
                    Log.e(
                        "TAG",
                        "GetMyApplicationsResponse->\n ${_state.value.myApplicationRespState}"
                    )
                }

                is Resource.Error -> {
                    Log.e("TAG", "GetMyApplicationsResponseError->\n ${result.message}")
                    refreshToken { getMyApplications() }
                    onEvent(
                        MyApplicationEvent.OnGetMyApplicationChange(
                            GetMyApplicationRespState(
                                error = "${result.message}"
                            )
                        )
                    )
                }

                is Resource.Loading -> {
                    onEvent(
                        MyApplicationEvent.OnGetMyApplicationChange(
                            GetMyApplicationRespState(
                                isLoading = true
                            )
                        )
                    )
                }
            }
        }.launchIn(viewModelScope)
    }

    private fun approveApplication() {
        approveApplicationUseCase.invoke(
            token = "Bearer ${_state.value.accessToken}",
            ApproveApplicationBody(_state.value.approveApplication)
        ).onEach { result: Resource<ApproveApplicationResp> ->
            when (result) {
                is Resource.Success -> {
                    val response: ApproveApplicationResp? = result.data
                    Log.e(
                        "TAG",
                        "ApproveResponse->\n $response"
                    )
                    if (response != null) {
                        getMyApplications()
                    }
                }

                is Resource.Error -> {
                    Log.e("TAG", "ApproveResponseError->\n ${result.message}")
                    refreshToken { approveApplication() }
                }

                is Resource.Loading -> {

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
                        dataStoreManager.updateAccessToken(token = it.access)
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
                        MyApplicationEvent.OnGetMyApplicationChange(
                            GetMyApplicationRespState(
                                isLoading = true
                            )
                        )
                    )
                }
            }
        }.launchIn(viewModelScope)
    }
}