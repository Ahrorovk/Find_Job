package com.ahrorovkspace.afkorhackathon.domain.profileInfo.model

data class GetProfileInfoResp(
    val about: String,
    val avatar: String,
    val company: Int,
    val fullname: String,
    val is_verified: Boolean,
    val location: Int,
    val resume: String,
    val speciality: String,
    val user: User,
    val worktime_end: String,
    val worktime_start: String
)
data class User(
    val email: String,
    val phone: String,
    val role: Int,
    val username: String
)