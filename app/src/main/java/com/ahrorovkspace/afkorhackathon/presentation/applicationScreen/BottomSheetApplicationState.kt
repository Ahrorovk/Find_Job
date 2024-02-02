package com.ahrorovkspace.afkorhackathon.presentation.applicationScreen

import com.ahrorovkspace.afkorhackathon.core.states.PostApplicationRespState

data class BottomSheetApplicationState(
    val description: String= "",
    val projectId: Int = 0,
    val refreshToken: String = "",
    val accessToken: String = "",
    val statusOfSendResume: Boolean = false,
    val applicationRespState: PostApplicationRespState = PostApplicationRespState()
)
