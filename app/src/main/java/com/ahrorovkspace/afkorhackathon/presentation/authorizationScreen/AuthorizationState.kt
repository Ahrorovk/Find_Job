package com.ahrorovkspace.afkorhackathon.presentation.authorizationScreen

import com.ahrorovkspace.afkorhackathon.core.states.AuthorizationRespState

data class AuthorizationState(
    val username: String = "",
    val password: String = "",
    val authorizationRespState: AuthorizationRespState = AuthorizationRespState()
)
