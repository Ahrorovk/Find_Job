package com.ahrorovkspace.afkorhackathon.core.states

import com.ahrorovkspace.afkorhackathon.domain.myApplication.model.GetMyApplicationResp

data class GetMyApplicationRespState(
    var isLoading: Boolean = false,
    var response: GetMyApplicationResp? = null,
    val error: String = ""
)
