package com.ahrorovkspace.afkorhackathon.presentation.profileScreen

import android.content.Context
import android.net.Uri
import com.ahrorovkspace.afkorhackathon.core.states.ChangeProfileInfoRespState
import com.ahrorovkspace.afkorhackathon.core.states.GetProfileInfoRespState

data class ProfileState(
    val username: String = "",
    val email: String = "",
    val phone: String = "",
    val fullname: String = "",
    val isVerified: Boolean = false,
    val speciality: String = "",
    val location: Int = 0,
    val company: Int = 0,
    val about: String = "",
    val workTimeEnd: String = "Выбрать",
    val workTimeStart: String = "Выбрать",
    val refreshToken: String = "",
    val accessToken: String = "",
    val imageUrl:String = "",
    val resumeUrl:String = "",
    val selectedImage: Uri? = null,
    val selectedPdf: Uri? = null,
    val context: Context? = null,
    val getProfileInfoRespState: GetProfileInfoRespState = GetProfileInfoRespState(),
    val changeProfileInfoRespState: ChangeProfileInfoRespState = ChangeProfileInfoRespState()
)