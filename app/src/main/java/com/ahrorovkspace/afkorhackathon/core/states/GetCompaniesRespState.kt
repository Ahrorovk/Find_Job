package com.ahrorovkspace.afkorhackathon.core.states

import com.ahrorovkspace.afkorhackathon.domain.companyById.model.GetCompaniesResp

data class GetCompaniesRespState(
    var isLoading: Boolean = false,
    var response: GetCompaniesResp? = null,
    val error: String = ""
)
