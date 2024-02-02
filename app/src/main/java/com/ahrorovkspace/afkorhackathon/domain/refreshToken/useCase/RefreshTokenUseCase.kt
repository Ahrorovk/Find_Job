package com.ahrorovkspace.afkorhackathon.domain.refreshToken.useCase

import com.ahrorovkspace.afkorhackathon.core.Resource
import com.ahrorovkspace.afkorhackathon.domain.AfkorHackRepository
import com.ahrorovkspace.afkorhackathon.domain.refreshToken.model.RefreshTokenBody
import com.ahrorovkspace.afkorhackathon.domain.refreshToken.model.RefreshTokenResp
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class RefreshTokenUseCase @Inject constructor(
    private val repository: AfkorHackRepository
) {
    operator fun invoke(refreshTokenBody: RefreshTokenBody): Flow<Resource<RefreshTokenResp>> =
        flow {
            try {
                emit(Resource.Loading<RefreshTokenResp>())
                val response = repository.refreshToken(refreshTokenBody)
                emit(Resource.Success<RefreshTokenResp>(response))
            } catch (e: HttpException) {
                emit(
                    Resource.Error<RefreshTokenResp>(
                        e.message() ?: "Error"
                    )
                )
            } catch (e: IOException) {
                emit(Resource.Error<RefreshTokenResp>("Check your internet connection."))
            } catch (e: Exception) {
                emit(Resource.Error<RefreshTokenResp>("${e.message}"))
            }
        }
}