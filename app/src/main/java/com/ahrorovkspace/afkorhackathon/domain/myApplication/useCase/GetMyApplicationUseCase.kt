package com.ahrorovkspace.afkorhackathon.domain.myApplication.useCase

import com.ahrorovkspace.afkorhackathon.core.Resource
import com.ahrorovkspace.afkorhackathon.domain.AfkorHackRepository
import com.ahrorovkspace.afkorhackathon.domain.myApplication.model.GetMyApplicationResp
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetMyApplicationUseCase @Inject constructor(
    private val repository: AfkorHackRepository
) {
    operator fun invoke(token: String): Flow<Resource<GetMyApplicationResp>> =
        flow {
            try {
                emit(Resource.Loading<GetMyApplicationResp>())
                val response = repository.getMyApplications(token)
                emit(Resource.Success<GetMyApplicationResp>(response))
            } catch (e: HttpException) {
                emit(
                    Resource.Error<GetMyApplicationResp>(
                        e.toString() ?: "Error"
                    )
                )
            } catch (e: IOException) {
                emit(Resource.Error<GetMyApplicationResp>("Check your internet connection."))
            } catch (e: Exception) {
                emit(Resource.Error<GetMyApplicationResp>("${e.message}"))
            }
        }
}