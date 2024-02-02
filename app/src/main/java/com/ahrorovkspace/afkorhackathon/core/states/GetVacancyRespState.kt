package com.ahrorovkspace.afkorhackathon.core.states

import com.ahrorovkspace.afkorhackathon.domain.main.model.categories.GetVacancyResp

data class GetVacancyRespState(
    var isLoading: Boolean = false,
    var response: GetVacancyResp? = null,
    val error: String = ""
)
