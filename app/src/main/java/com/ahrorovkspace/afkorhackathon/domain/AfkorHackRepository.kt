package com.ahrorovkspace.afkorhackathon.domain

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

interface AfkorHackRepository {
    suspend fun authorization(authBody: AuthorizationBody): AuthorizationResp
    suspend fun registration(regBody: RegistrationBody): RegistrationResp
    suspend fun sendApplication(token: String, postApp: PostApplicationBody): PostApplicationResp
    suspend fun refreshToken(refresh: RefreshTokenBody): RefreshTokenResp
    suspend fun getProfileInfo(token: String): GetProfileInfoResp
    suspend fun getMyApplications(token: String): GetMyApplicationResp
    suspend fun getVacancies(token: String): GetVacancyResp
    suspend fun changeProfileInfo(
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
    ): ChangeProfileInfoResp

    suspend fun getCompanyById(token: String): GetCompaniesResp

    suspend fun approveApplications(
        token: String,
        approveApp: ApproveApplicationBody
    ): ApproveApplicationResp

    suspend fun getProjectByCategories(
        token: String,
        projectBody: GetProjectByCategoriesBody
    ): GetProjectByCategoriesResp
}