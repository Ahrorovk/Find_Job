package com.ahrorovkspace.afkorhackathon.presentation.profileScreen

import android.content.Context
import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ahrorovkspace.afkorhackathon.core.Resource
import com.ahrorovkspace.afkorhackathon.core.getRealPathFromURI
import com.ahrorovkspace.afkorhackathon.core.states.ChangeProfileInfoRespState
import com.ahrorovkspace.afkorhackathon.core.states.GetProfileInfoRespState
import com.ahrorovkspace.afkorhackathon.data.local.DataStoreManager
import com.ahrorovkspace.afkorhackathon.domain.profileInfo.model.ChangeProfileInfoResp
import com.ahrorovkspace.afkorhackathon.domain.profileInfo.model.GetProfileInfoResp
import com.ahrorovkspace.afkorhackathon.domain.profileInfo.useCase.ChangeProfileInfoUseCase
import com.ahrorovkspace.afkorhackathon.domain.profileInfo.useCase.GetProfileInfoUseCase
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
import okhttp3.MultipartBody
import okhttp3.RequestBody.Companion.asRequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.File
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val getProfileInfoUseCase: GetProfileInfoUseCase,
    private val dataStoreManager: DataStoreManager,
    private val refreshTokenUseCase: RefreshTokenUseCase,
    private val changeProfileInfoUseCase: ChangeProfileInfoUseCase
) : ViewModel() {
    private val _state = MutableStateFlow(ProfileState())
    val state = _state.stateIn(
        viewModelScope + Dispatchers.IO,
        SharingStarted.WhileSubscribed(5000),
        ProfileState()
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

    fun onEvent(event: ProfileEvent) {
        when (event) {
            is ProfileEvent.OnEmailChange -> {
                _state.update {
                    it.copy(
                        email = event.state
                    )
                }
            }

            is ProfileEvent.OnFirstNameChange -> {
                _state.update {
                    it.copy(
                        fullname = event.state
                    )
                }
            }

            is ProfileEvent.OnPhoneChange -> {
                _state.update {
                    it.copy(
                        phone = event.state
                    )
                }
            }

            is ProfileEvent.OnUsernameChange -> {
                _state.update {
                    it.copy(
                        username = event.state
                    )
                }
            }

            is ProfileEvent.OnGetProfileInfoRespState -> {
                _state.update {
                    it.copy(
                        getProfileInfoRespState = event.state,
                        fullname = event.state.response?.fullname ?: "",
                        speciality = event.state.response?.speciality ?: "",
                        imageUrl = event.state.response?.avatar ?: "",
                        about = event.state.response?.about ?: "",
                        email = event.state.response?.user?.email ?: "",
                        phone = event.state.response?.user?.phone ?: "",
                        username = event.state.response?.user?.username ?: "",
                        resumeUrl = event.state.response?.resume ?: "",
                        workTimeStart = event.state.response?.worktime_start ?: "",
                        workTimeEnd = event.state.response?.worktime_end ?: "",
                    )
                }
            }

            is ProfileEvent.OnDescriptionChange -> {
                _state.update {
                    it.copy(
                        about = event.state
                    )
                }
            }

            is ProfileEvent.OnSpecialityChange -> {
                _state.update {
                    it.copy(
                        speciality = event.state
                    )
                }
            }

            is ProfileEvent.SaveChanges -> {
                changeProfileInfo(event.context)
            }

            ProfileEvent.GetProfileInfo -> {
                getProfileInfo()
            }

            is ProfileEvent.OnChangeProfileInfoRespState -> {
                _state.update {
                    it.copy(
                        changeProfileInfoRespState = event.state
                    )
                }
            }

            is ProfileEvent.OnSelectImageUriChange -> {
                _state.update {
                    it.copy(
                        selectedImage = event.uri
                    )
                }
            }

            is ProfileEvent.OnSelectPdfUriChange -> {
                _state.update {
                    it.copy(
                        selectedPdf = event.uri
                    )
                }
            }

            is ProfileEvent.OnWorkTimeEndChange -> {
                _state.update {
                    it.copy(
                        workTimeEnd = event.state
                    )
                }
            }

            is ProfileEvent.OnWorkTimeStartChange -> {
                _state.update {
                    it.copy(
                        workTimeStart = event.state
                    )
                }
            }

            else -> {}
        }
    }

    private fun getProfileInfo() {
        getProfileInfoUseCase.invoke(
            token = "Bearer ${_state.value.accessToken}"
        ).onEach { result: Resource<GetProfileInfoResp> ->
            when (result) {
                is Resource.Success -> {
                    val response: GetProfileInfoResp? = result.data
                    onEvent(
                        ProfileEvent.OnGetProfileInfoRespState(
                            GetProfileInfoRespState(
                                response = response
                            )
                        )
                    )
                    dataStoreManager.updateRoleId(response?.user?.role ?: 0)
                    Log.e(
                        "TAG",
                        "AuthorizationResponse->\n ${_state.value.getProfileInfoRespState}"
                    )
                }

                is Resource.Error -> {
                    Log.e("TAG", "AuthorizationResponseError->\n ${result.message}")
                    refreshToken { getProfileInfo() }
                    onEvent(
                        ProfileEvent.OnGetProfileInfoRespState(
                            GetProfileInfoRespState(
                                error = "${result.message}"
                            )
                        )
                    )
                }

                is Resource.Loading -> {
                    onEvent(
                        ProfileEvent.OnGetProfileInfoRespState(
                            GetProfileInfoRespState(

                                isLoading = true
                            )
                        )
                    )
                }

                else -> {}
            }
        }.launchIn(viewModelScope)
    }

    private fun changeProfileInfo(context: Context) {
        val photo = mutableStateOf<File?>(null)
        _state.value.selectedImage?.let {
            photo.value = getRealPathFromURI(
                context,
                it
            )?.let { it1 ->
                File(
                    it1
                )
            }
        }
        val pdfFile = mutableStateOf<File?>(null)
        _state.value.selectedPdf?.let { uri ->
            pdfFile.value = getRealPathFromURI(
                context,
                uri
            )?.let { File(it) }
        }


        changeProfileInfoUseCase.invoke(
            token = "Bearer ${_state.value.accessToken}",
            avatar = if (photo.value != null) {
                MultipartBody.Part.createFormData(
                    name = "avatar",
                    filename = photo.value!!.name,
                    body = photo.value!!.asRequestBody()
                )
            } else null,
            resume = if (pdfFile.value != null) {
                MultipartBody.Part.createFormData(
                    name = "resume",
                    filename = pdfFile.value!!.name,
                    body = pdfFile.value!!.asRequestBody()
                )
            } else null,
            fullname = (_state.value.fullname.ifEmpty { "" }).toRequestBody(),
            about = (_state.value.about.ifEmpty { "" }).toRequestBody(),
            worktimeStart = (if (_state.value.workTimeStart == "Выбрать") "" else _state.value.workTimeStart).toRequestBody(),
            worktimeEnd = (if (_state.value.workTimeEnd == "Выбрать") "" else _state.value.workTimeEnd).toRequestBody(),
            isVerified = _state.value.isVerified.toString().toRequestBody(),
            location = (if (_state.value.location == 0) "" else _state.value.location.toString()).toRequestBody(),
            speciality = (_state.value.speciality.ifEmpty { "" }).toRequestBody(),
            company = (if (_state.value.company == 0) "" else _state.value.company.toString()).toRequestBody()
        ).onEach { result: Resource<ChangeProfileInfoResp> ->
            when (result) {
                is Resource.Success -> {
                    val response: ChangeProfileInfoResp? = result.data
                    onEvent(
                        ProfileEvent.OnChangeProfileInfoRespState(
                            ChangeProfileInfoRespState(
                                response = response
                            )
                        )
                    )
                    getProfileInfo()
                    Log.e(
                        "TAG",
                        "ChangeProfileInfoResponse->\n ${_state.value.changeProfileInfoRespState}"
                    )
                }

                is Resource.Error -> {
                    Log.e("TAG", "ChangeProfileInfoResponseError->\n ${result.message}")
                    refreshToken {
                        changeProfileInfo(context)
                    }
                    onEvent(
                        ProfileEvent.OnChangeProfileInfoRespState(
                            ChangeProfileInfoRespState(
                                error = "${result.message}"
                            )
                        )
                    )
                }

                is Resource.Loading -> {
                    onEvent(
                        ProfileEvent.OnChangeProfileInfoRespState(
                            ChangeProfileInfoRespState(
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
                        ProfileEvent.OnGetProfileInfoRespState(
                            GetProfileInfoRespState(
                                isLoading = true
                            )
                        )
                    )
                }
            }
        }.launchIn(viewModelScope)
    }
}