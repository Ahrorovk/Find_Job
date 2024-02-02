package com.ahrorovkspace.afkorhackathon.domain.companyById.useCase

import com.ahrorovkspace.afkorhackathon.core.Resource
import com.ahrorovkspace.afkorhackathon.domain.AfkorHackRepository
import com.ahrorovkspace.afkorhackathon.domain.companyById.model.GetCompaniesResp
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCompanyByIdUseCase @Inject constructor(
    private val repository: AfkorHackRepository
) {

    operator fun invoke(token:String): Flow<Resource<GetCompaniesResp>> =
        flow {
            try {
                emit(Resource.Loading<GetCompaniesResp>())
                val response = repository.getCompanyById(token)
                emit(Resource.Success<GetCompaniesResp>(response))
            } catch (e: HttpException) {
                emit(
                    Resource.Error<GetCompaniesResp>(
                        e.message() ?: "Error"
                    )
                )
            } catch (e: IOException) {
                emit(Resource.Error<GetCompaniesResp>("Check your internet connection."))
            } catch (e: Exception) {
                emit(Resource.Error<GetCompaniesResp>("${e.message}"))
            }
        }
}