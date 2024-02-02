package com.ahrorovkspace.afkorhackathon.presentation.profileScreen

import android.content.Context
import android.net.Uri
import com.ahrorovkspace.afkorhackathon.core.states.ChangeProfileInfoRespState
import com.ahrorovkspace.afkorhackathon.core.states.GetProfileInfoRespState

sealed class ProfileEvent {
    data class OnUsernameChange(val state: String) : ProfileEvent()
    data class OnFirstNameChange(val state: String) : ProfileEvent()
    data class OnSpecialityChange(val state: String) : ProfileEvent()
    data class OnEmailChange(val state: String) : ProfileEvent()
    data class OnWorkTimeStartChange(val state: String) : ProfileEvent()
    data class OnWorkTimeEndChange(val state: String) : ProfileEvent()
    data class OnPhoneChange(val state: String) : ProfileEvent()
    data class OnDescriptionChange(val state: String) : ProfileEvent()
    data class OnGetProfileInfoRespState(val state: GetProfileInfoRespState) : ProfileEvent()
    data class OnChangeProfileInfoRespState(val state: ChangeProfileInfoRespState) : ProfileEvent()
    data class OnSelectImageUriChange(val uri: Uri?): ProfileEvent()
    data class OnSelectPdfUriChange(val uri: Uri?): ProfileEvent()
    data class SaveChanges(val context: Context) : ProfileEvent()
    object GetProfileInfo : ProfileEvent()
}
