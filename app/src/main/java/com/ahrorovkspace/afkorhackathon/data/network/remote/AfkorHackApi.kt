package com.ahrorovkspace.afkorhackathon.data.network.remote

import com.ahrorovkspace.afkorhackathon.domain.application.model.PostApplicationBody
import com.ahrorovkspace.afkorhackathon.domain.application.model.PostApplicationResp
import com.ahrorovkspace.afkorhackathon.domain.authorization.model.AuthorizationBody
import com.ahrorovkspace.afkorhackathon.domain.authorization.model.AuthorizationResp
import com.ahrorovkspace.afkorhackathon.domain.companyById.model.GetCompaniesResp
import com.ahrorovkspace.afkorhackathon.domain.main.model.categories.GetVacancyResp
import com.ahrorovkspace.afkorhackathon.domain.main.model.project.GetProjectByCategoriesBody
import com.ahrorovkspace.afkorhackathon.domain.main.model.project.GetProjectByCategoriesResp
import com.ahrorovkspace.afkorhackathon.domain.myApplication.model.ApproveApplicationBody
import com.ahrorovkspace.afkorhackathon.domain.myApplication.model.ApproveApplicationResp
import com.ahrorovkspace.afkorhackathon.domain.myApplication.model.GetMyApplicationResp
import com.ahrorovkspace.afkorhackathon.domain.profileInfo.model.ChangeProfileInfoResp
import com.ahrorovkspace.afkorhackathon.domain.profileInfo.model.GetProfileInfoResp
import com.ahrorovkspace.afkorhackathon.domain.refreshToken.model.RefreshTokenBody
import com.ahrorovkspace.afkorhackathon.domain.refreshToken.model.RefreshTokenResp
import com.ahrorovkspace.afkorhackathon.domain.registration.model.RegistrationBody
import com.ahrorovkspace.afkorhackathon.domain.registration.model.RegistrationResp
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Part

interface AfkorHackApi {
    @POST("account/login/")
    suspend fun authorization(
        @Body
        authBody: AuthorizationBody
    ): AuthorizationResp

    @POST("account/register/")
    suspend fun registration(
        @Body
        regBody: RegistrationBody
    ): RegistrationResp

    @POST("vacancies/send-application")
    suspend fun sendApplication(
        @Header("Authorization") token: String,
        @Body
        postApp: PostApplicationBody
    ): PostApplicationResp

    @POST("account/token/refresh/")
    suspend fun refreshToken(
        @Body
        refreshTokenBody: RefreshTokenBody
    ): RefreshTokenResp

    @POST("vacancies/applications")
    suspend fun approveApplications(
        @Header("Authorization")
        token: String,
        @Body
        approveApp: ApproveApplicationBody
    ): ApproveApplicationResp

    @Multipart
    @PUT("account/clients/profile/")
    suspend fun changeProfileInfo(
        @Header("Authorization") token: String,
        @Part avatar: MultipartBody.Part?,
        @Part resume: MultipartBody.Part?,
        @Part("fullname") fullname: RequestBody,
        @Part("about") about: RequestBody,
        @Part("worktime_start") worktimeStart: RequestBody,
        @Part("worktime_end") worktimeEnd: RequestBody,
        @Part("is_verified") isVerified: RequestBody,
        @Part("location") location: RequestBody,
        @Part("speciality") speciality: RequestBody,
        @Part("company") company: RequestBody
    ): ChangeProfileInfoResp

    @GET("account/clients/profile/")
    suspend fun getProfileInfo(
        @Header("Authorization") token: String
    ): GetProfileInfoResp

    @GET("handbook/companies/")
    suspend fun getCompanyById(
        @Header("Authorization") token: String,
    ): GetCompaniesResp

    @GET("vacancies/applications")
    suspend fun getMyApplication(
        @Header("Authorization") token: String
    ): GetMyApplicationResp

    @GET("vacancies/")
    suspend fun getVacancies(
        @Header("Authorization") token: String
    ): GetVacancyResp

    @POST("handbook/categories/projects/")
    suspend fun getProjectByCategories(
        @Header("Authorization") token: String,
        @Body projectBody: GetProjectByCategoriesBody
    ): GetProjectByCategoriesResp
}