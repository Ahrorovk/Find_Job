package com.ahrorovkspace.afkorhackathon.core.states

import com.ahrorovkspace.afkorhackathon.domain.authorization.model.AuthorizationResp

data class AuthorizationRespState(
    var isLoading: Boolean = false,
    var response: AuthorizationResp? = null,
    val error: String = ""
)
