package com.ahrorovkspace.afkorhackathon.presentation.mainScreen

import com.ahrorovkspace.afkorhackathon.core.states.GetVacancyRespState
import com.ahrorovkspace.afkorhackathon.core.states.GetCompaniesRespState
import com.ahrorovkspace.afkorhackathon.domain.companyById.model.GetCompaniesResp

data class MainState(
    val searchState: String = "",
    val vacanciesRespState: GetVacancyRespState = GetVacancyRespState(),
    val companiesRespState: GetCompaniesRespState = GetCompaniesRespState(),
    val companies: List<GetCompaniesResp> = emptyList(),
    val refreshToken: String ="",
    val accessToken: String =""
)
