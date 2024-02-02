package com.ahrorovkspace.afkorhackathon.presentation.mainScreen

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ahrorovkspace.afkorhackathon.core.Resource
import com.ahrorovkspace.afkorhackathon.core.states.GetCompaniesRespState
import com.ahrorovkspace.afkorhackathon.core.states.GetVacancyRespState
import com.ahrorovkspace.afkorhackathon.data.local.DataStoreManager
import com.ahrorovkspace.afkorhackathon.domain.companyById.model.GetCompaniesResp
import com.ahrorovkspace.afkorhackathon.domain.companyById.useCase.GetCompanyByIdUseCase
import com.ahrorovkspace.afkorhackathon.domain.main.model.categories.GetVacancyResp
import com.ahrorovkspace.afkorhackathon.domain.main.useCase.GetVacanciesUseCase
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
import kotlinx.coroutines.launch
import kotlinx.coroutines.plus
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val dataStoreManager: DataStoreManager,
    private val getVacanciesUseCase: GetVacanciesUseCase,
    private val refreshTokenUseCase: RefreshTokenUseCase,
    private val getCompanyByIdUseCase: GetCompanyByIdUseCase
) : ViewModel() {
    private val _state = MutableStateFlow(MainState())
    val state = _state.stateIn(
        viewModelScope + Dispatchers.IO,
        SharingStarted.WhileSubscribed(5000),
        MainState()
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

    fun onEvent(event: MainEvent) {
        when (event) {
            is MainEvent.OnSearchProjectChange -> {
                _state.update {
                    it.copy(
                        searchState = event.state
                    )
                }
            }

            is MainEvent.GetVacancies -> {
                getVacancies()
            }

            is MainEvent.GetCompanies -> {
                getCompanyById()
            }

            is MainEvent.OnGetCompaniesRespStateChange -> {
                _state.update {
                    it.copy(
                        companiesRespState = event.state
                    )
                }
            }

            is MainEvent.OnGetVacanciesRespStateChange -> {
                event.state.response?.let { resp ->
                    _state.update {
                        it.copy(
                            vacanciesRespState = event.state,
                        )
                    }
                }
            }

            MainEvent.Clean -> {
                viewModelScope.launch {
                    dataStoreManager.updateAccessToken("")
                    dataStoreManager.updateRefreshToken("")
                }
            }

            else -> {}
        }
    }

    private fun getCompanyById() {
        if (_state.value.accessToken.isNotEmpty())
            getCompanyByIdUseCase.invoke(
                token = "Bearer ${_state.value.accessToken}"
            ).onEach { result: Resource<GetCompaniesResp> ->
                when (result) {
                    is Resource.Success -> {
                        val response: GetCompaniesResp? = result.data
                        onEvent(
                            MainEvent.OnGetCompaniesRespStateChange(
                                GetCompaniesRespState(
                                    response = response
                                )
                            )
                        )
                        Log.e(
                            "TAG",
                            "GetCompaniesResponse->\n ${_state.value.companiesRespState}"
                        )
                    }

                    is Resource.Error -> {
                        Log.e("TAG", "GetCompaniesResponseError->\n ${result.message}")
                        onEvent(
                            MainEvent.OnGetCompaniesRespStateChange(
                                GetCompaniesRespState(
                                    error = "${result.message}"
                                )
                            )
                        )
                        if (result.message != "Not Found")
                            refreshToken {
                                getCompanyById()
                            }
                    }

                    is Resource.Loading -> {
                        onEvent(
                            MainEvent.OnGetVacanciesRespStateChange(
                                GetVacancyRespState(
                                    isLoading = true
                                )
                            )
                        )
                    }

                }
            }.launchIn(viewModelScope)
    }

    private fun getVacancies() {
        if (_state.value.accessToken.isNotEmpty())
            getVacanciesUseCase.invoke("Bearer ${_state.value.accessToken}")
                .onEach { result: Resource<GetVacancyResp> ->
                    when (result) {
                        is Resource.Success -> {
                            val response: GetVacancyResp? = result.data
                            onEvent(
                                MainEvent.OnGetVacanciesRespStateChange(
                                    GetVacancyRespState(
                                        response = response
                                    )
                                )
                            )
                            Log.e(
                                "TAG",
                                "AuthorizationResponse->\n ${_state.value.vacanciesRespState.response?.results}"
                            )
                        }

                        is Resource.Error -> {
                            Log.e("TAG", "AuthorizationResponseError->\n ${result.message}")
                            onEvent(
                                MainEvent.OnGetVacanciesRespStateChange(
                                    GetVacancyRespState(
                                        error = "${result.message}"
                                    )
                                )
                            )
                            if (result.message != "Not Found")
                                refreshToken {
                                    getVacancies()
                                }
                        }

                        is Resource.Loading -> {
                            onEvent(
                                MainEvent.OnGetVacanciesRespStateChange(
                                    GetVacancyRespState(
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
                        MainEvent.OnGetVacanciesRespStateChange(
                            GetVacancyRespState(
                                isLoading = true
                            )
                        )
                    )
                }
            }
        }.launchIn(viewModelScope)
    }
}