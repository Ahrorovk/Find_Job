package com.ahrorovkspace.afkorhackathon.domain.profileInfo.useCase

import com.ahrorovkspace.afkorhackathon.core.Resource
import com.ahrorovkspace.afkorhackathon.domain.AfkorHackRepository
import com.ahrorovkspace.afkorhackathon.domain.profileInfo.model.ChangeProfileInfoBody
import com.ahrorovkspace.afkorhackathon.domain.profileInfo.model.ChangeProfileInfoResp
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class ChangeProfileInfoUseCase @Inject constructor(
    private val repository: AfkorHackRepository
) {
    operator fun invoke(
        token: String,
        avatar: MultipartBody.Part?,
        resume: MultipartBody.Part?,
        fullname: RequestBody,
        about: RequestBody,
        worktimeStart: RequestBody,
        worktimeEnd: RequestBody,
        isVerified: RequestBody,
        location: RequestBody,
        speciality: RequestBody,
        company: RequestBody
    ): Flow<Resource<ChangeProfileInfoResp>> =
        flow {
            try {
                emit(Resource.Loading<ChangeProfileInfoResp>())
                val response = repository.changeProfileInfo(
                    token, avatar,
                    resume,
                    fullname,
                    about,
                    worktimeStart,
                    worktimeEnd,
                    isVerified,
                    location,
                    speciality,
                    company
                )
                emit(Resource.Success<ChangeProfileInfoResp>(response))
            } catch (e: HttpException) {
                emit(
                    Resource.Error<ChangeProfileInfoResp>(
                        e.message() ?: "Error"
                    )
                )
            } catch (e: IOException) {
                emit(Resource.Error<ChangeProfileInfoResp>("Check your internet connection."))
            } catch (e: Exception) {
                emit(Resource.Error<ChangeProfileInfoResp>("${e.message}"))
            }
        }
}