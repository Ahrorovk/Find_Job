package com.ahrorovkspace.afkorhackathon.domain.application.useCase

import com.ahrorovkspace.afkorhackathon.core.Resource
import com.ahrorovkspace.afkorhackathon.domain.AfkorHackRepository
import com.ahrorovkspace.afkorhackathon.domain.application.model.PostApplicationBody
import com.ahrorovkspace.afkorhackathon.domain.application.model.PostApplicationResp
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class SendApplicationUseCase @Inject constructor(
    private val repository: AfkorHackRepository
) {
    operator fun invoke(
        token: String,
        postApp: PostApplicationBody
    ): Flow<Resource<PostApplicationResp>> =
        flow {
            try {
                emit(Resource.Loading<PostApplicationResp>())
                val response = repository.sendApplication(token, postApp)
                emit(Resource.Success<PostApplicationResp>(response))
            } catch (e: HttpException) {
                emit(
                    Resource.Error<PostApplicationResp>(
                        e.message() ?: "Error"
                    )
                )
            } catch (e: IOException) {
                emit(Resource.Error<PostApplicationResp>("Check your internet connection."))
            } catch (e: Exception) {
                emit(Resource.Error<PostApplicationResp>("${e.message}"))
            }
        }
}