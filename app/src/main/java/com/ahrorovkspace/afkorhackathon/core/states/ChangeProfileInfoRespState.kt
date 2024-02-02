package com.ahrorovkspace.afkorhackathon.core.states

import com.ahrorovkspace.afkorhackathon.domain.profileInfo.model.ChangeProfileInfoResp

data class ChangeProfileInfoRespState(
    var isLoading: Boolean = false,
    var response: ChangeProfileInfoResp? = null,
    val error: String = ""
)
