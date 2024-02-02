package com.ahrorovkspace.afkorhackathon.presentation.registratrionScreen

import com.ahrorovkspace.afkorhackathon.core.getRoles
import com.ahrorovkspace.afkorhackathon.core.states.RegistrationRespState
import com.ahrorovkspace.afkorhackathon.core.states.RoleState

data class RegistrationState(
    val username: String = "",
    val email: String = "",
    val password: String = "",
    val passwordConfirm: String = "",
    val registrationRespState: RegistrationRespState = RegistrationRespState(),
    val selectedRole: RoleState = RoleState(),
    val phone: String = "",
    val rolesState: List<RoleState> = getRoles()
)
