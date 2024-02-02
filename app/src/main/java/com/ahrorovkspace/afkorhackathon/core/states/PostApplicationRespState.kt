package com.ahrorovkspace.afkorhackathon.core.states

import com.ahrorovkspace.afkorhackathon.domain.application.model.PostApplicationResp

data class PostApplicationRespState(
    var isLoading: Boolean = false,
    var response: PostApplicationResp? = null,
    val error: String = ""
)
