package com.ahrorovkspace.afkorhackathon.domain.registration.model

data class RegistrationBody(
    val username: String,
    val email: String,
    val phone: String,
    val password: String,
    val password_confirmation: String,
    val role: Int
)
