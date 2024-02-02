package com.ahrorovkspace.afkorhackathon.core.states

import com.ahrorovkspace.afkorhackathon.domain.profileInfo.model.GetProfileInfoResp

data class GetProfileInfoRespState(
    var isLoading: Boolean = false,
    var response: GetProfileInfoResp? = null,
    val error: String = ""
)
