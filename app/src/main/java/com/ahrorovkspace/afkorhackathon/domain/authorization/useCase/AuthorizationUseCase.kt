package com.ahrorovkspace.afkorhackathon.domain.authorization.useCase

import com.ahrorovkspace.afkorhackathon.core.Resource
import com.ahrorovkspace.afkorhackathon.domain.AfkorHackRepository
import com.ahrorovkspace.afkorhackathon.domain.authorization.model.AuthorizationBody
import com.ahrorovkspace.afkorhackathon.domain.authorization.model.AuthorizationResp
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class AuthorizationUseCase @Inject constructor(
    private val repository: AfkorHackRepository
) {
    operator fun invoke(authCodeBody: AuthorizationBody): Flow<Resource<AuthorizationResp>> =
        flow {
            try {
                emit(Resource.Loading<AuthorizationResp>())
                val response = repository.authorization(authCodeBody)
                emit(Resource.Success<AuthorizationResp>(response))
            } catch (e: HttpException) {
                emit(
                    Resource.Error<AuthorizationResp>(
                        e.message() ?: "Error"
                    )
                )
            } catch (e: IOException) {
                emit(Resource.Error<AuthorizationResp>("Check your internet connection."))
            } catch (e: Exception) {
                emit(Resource.Error<AuthorizationResp>("${e.message}"))
            }
        }
}