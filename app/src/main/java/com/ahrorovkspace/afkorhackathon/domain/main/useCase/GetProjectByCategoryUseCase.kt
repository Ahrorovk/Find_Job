package com.ahrorovkspace.afkorhackathon.domain.main.useCase

import com.ahrorovkspace.afkorhackathon.core.Resource
import com.ahrorovkspace.afkorhackathon.domain.AfkorHackRepository
import com.ahrorovkspace.afkorhackathon.domain.main.model.project.GetProjectByCategoriesBody
import com.ahrorovkspace.afkorhackathon.domain.main.model.project.GetProjectByCategoriesResp
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetProjectByCategoryUseCase @Inject constructor(
    private val repository: AfkorHackRepository
) {
    operator fun invoke(
        token: String,
        projectByCategoriesBody: GetProjectByCategoriesBody
    ): Flow<Resource<GetProjectByCategoriesResp>> =
        flow {
            try {
                emit(Resource.Loading<GetProjectByCategoriesResp>())
                val response = repository.getProjectByCategories(token, projectByCategoriesBody)
                emit(Resource.Success<GetProjectByCategoriesResp>(response))
            } catch (e: HttpException) {

                emit(
                    Resource.Error<GetProjectByCategoriesResp>(
                        e.message() ?: "Error"
                    )
                )
            } catch (e: IOException) {
                emit(Resource.Error<GetProjectByCategoriesResp>("Check your internet connection."))
            } catch (e: Exception) {
                emit(Resource.Error<GetProjectByCategoriesResp>("${e.message}"))
            }
        }
}