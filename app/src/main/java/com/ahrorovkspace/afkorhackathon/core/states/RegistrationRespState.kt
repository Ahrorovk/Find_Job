package com.ahrorovkspace.afkorhackathon.core.states

import com.ahrorovkspace.afkorhackathon.domain.registration.model.RegistrationResp

data class RegistrationRespState(
    var isLoading: Boolean = false,
    var response: RegistrationResp? = null,
    val error: String = ""
)
