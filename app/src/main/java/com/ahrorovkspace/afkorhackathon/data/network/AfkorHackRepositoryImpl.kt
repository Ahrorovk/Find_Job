package com.ahrorovkspace.afkorhackathon.data.network

import com.ahrorovkspace.afkorhackathon.data.network.remote.AfkorHackApi
import com.ahrorovkspace.afkorhackathon.domain.AfkorHackRepository
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

class AfkorHackRepositoryImpl(
    private val api: AfkorHackApi
) : AfkorHackRepository {
    override suspend fun authorization(authBody: AuthorizationBody): AuthorizationResp =
        api.authorization(authBody)

    override suspend fun registration(regBody: RegistrationBody): RegistrationResp =
        api.registration(regBody)

    override suspend fun sendApplication(
        token: String,
        postApp: PostApplicationBody
    ): PostApplicationResp =
        api.sendApplication(token, postApp)

    override suspend fun refreshToken(refresh: RefreshTokenBody): RefreshTokenResp =
        api.refreshToken(refresh)

    override suspend fun getProfileInfo(token: String): GetProfileInfoResp =
        api.getProfileInfo(token)

    override suspend fun getMyApplications(token: String): GetMyApplicationResp =
        api.getMyApplication(token)

    override suspend fun getVacancies(token: String): GetVacancyResp =
        api.getVacancies(token)

    override suspend fun approveApplications(
        token: String,
        approveApp: ApproveApplicationBody
    ): ApproveApplicationResp =
        api.approveApplications(token, approveApp)

    override suspend fun changeProfileInfo(
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
    ): ChangeProfileInfoResp =
        api.changeProfileInfo(
            token,
            avatar,
            resume,
            fullname,
            about,
            worktimeStart,
            worktimeEnd,
            isVerified,
            location,
            speciality,
            company
        )

    override suspend fun getCompanyById(token: String): GetCompaniesResp =
        api.getCompanyById(token)

    override suspend fun getProjectByCategories(
        token: String,
        projectBody: GetProjectByCategoriesBody
    ): GetProjectByCategoriesResp =
        api.getProjectByCategories(token, projectBody)
}