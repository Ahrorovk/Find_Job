package com.ahrorovkspace.afkorhackathon.domain.profileInfo.model

import okhttp3.MultipartBody

data class ChangeProfileInfoBody(
    val avatar: MultipartBody.Part?,
    val resume: String?,
    val fullname: String,
    val about: String,
    val worktime_start: String,
    val worktime_end: String,
    val is_verified: Boolean,
    val location: Int,
    val speciality: String,
    val company: Int
)
