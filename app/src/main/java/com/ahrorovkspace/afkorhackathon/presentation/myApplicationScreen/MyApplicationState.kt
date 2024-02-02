package com.ahrorovkspace.afkorhackathon.presentation.myApplicationScreen

import com.ahrorovkspace.afkorhackathon.core.states.GetMyApplicationRespState

data class MyApplicationState(
    val myApplicationRespState: GetMyApplicationRespState = GetMyApplicationRespState(),
    val refreshToken: String = "",
    val accessToken: String = "",
    val approveApplication: List<Int> = emptyList(),
    val applicationState: Boolean = false
)
