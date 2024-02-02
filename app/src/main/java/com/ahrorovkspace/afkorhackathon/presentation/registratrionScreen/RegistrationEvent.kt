package com.ahrorovkspace.afkorhackathon.presentation.registratrionScreen

import com.ahrorovkspace.afkorhackathon.core.states.RegistrationRespState
import com.ahrorovkspace.afkorhackathon.core.states.RoleState

sealed class RegistrationEvent{
    data class OnEmailChange(val email: String): RegistrationEvent()
    data class OnUsernameChange(val username: String): RegistrationEvent()
    data class OnRoleChange(val role: RoleState): RegistrationEvent()
    data class OnPhoneChange(val phone: String ): RegistrationEvent()
    data class OnPasswordChange(val password: String): RegistrationEvent()
    data class OnPasswordConfirmChange(val passwordConfirm: String): RegistrationEvent()
    data class OnRegistrationRespStateChange(val state: RegistrationRespState): RegistrationEvent()
    object Registration: RegistrationEvent()
    object GoToMainScreen: RegistrationEvent()
    object GoToSignUp : RegistrationEvent()
}
