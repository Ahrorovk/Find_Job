package com.ahrorovkspace.afkorhackathon.domain.application.model

data class Project(
    val id: Int,
    val name: String,
    val user: User
)