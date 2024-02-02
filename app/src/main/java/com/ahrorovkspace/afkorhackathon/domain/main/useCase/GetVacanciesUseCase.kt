package com.ahrorovkspace.afkorhackathon.domain.main.useCase

import com.ahrorovkspace.afkorhackathon.core.Resource
import com.ahrorovkspace.afkorhackathon.domain.AfkorHackRepository
import com.ahrorovkspace.afkorhackathon.domain.main.model.categories.GetVacancyResp
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetVacanciesUseCase @Inject constructor(
    private val repository: AfkorHackRepository
) {
    operator fun invoke(token: String): Flow<Resource<GetVacancyResp>> =
        flow {
            try {
                emit(Resource.Loading<GetVacancyResp>())
                val response = repository.getVacancies(token)
                emit(Resource.Success<GetVacancyResp>(response))
            } catch (e: HttpException) {
                emit(
                    Resource.Error<GetVacancyResp>(
                        e.message() ?: "Error"
                    )
                )
            } catch (e: IOException) {
                emit(Resource.Error<GetVacancyResp>("Check your internet connection."))
            } catch (e: Exception) {
                emit(Resource.Error<GetVacancyResp>("${e.message}"))
            }
        }
}