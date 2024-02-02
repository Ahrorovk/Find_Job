package com.ahrorovkspace.afkorhackathon.domain.myApplication.useCase

import com.ahrorovkspace.afkorhackathon.core.Resource
import com.ahrorovkspace.afkorhackathon.domain.AfkorHackRepository
import com.ahrorovkspace.afkorhackathon.domain.myApplication.model.ApproveApplicationBody
import com.ahrorovkspace.afkorhackathon.domain.myApplication.model.ApproveApplicationResp
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class ApproveApplicationUseCase @Inject constructor(
    private val repository: AfkorHackRepository
) {
    operator fun invoke(
        token: String,
        approveApp: ApproveApplicationBody
    ): Flow<Resource<ApproveApplicationResp>> =
        flow {
            try {
                emit(Resource.Loading<ApproveApplicationResp>())
                val response = repository.approveApplications(token, approveApp)
                emit(Resource.Success<ApproveApplicationResp>(response))
            } catch (e: HttpException) {
                emit(
                    Resource.Error<ApproveApplicationResp>(
                        e.toString() ?: "Error"
                    )
                )
            } catch (e: IOException) {
                emit(Resource.Error<ApproveApplicationResp>("Check your internet connection."))
            } catch (e: Exception) {
                emit(Resource.Error<ApproveApplicationResp>("${e.message}"))
            }
        }
}