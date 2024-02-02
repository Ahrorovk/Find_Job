package com.ahrorovkspace.afkorhackathon.domain.main.model.categories

data class Result(
    val company: Int,
    val phone_number: String?,
    val created_at: String,
    val location_name: String,
    val company_name: String,
    val description: String,
    val id: Int,
    val location: Int,
    val salary: String,
    val title: String,
    val updated_at: String
)