package com.ahrorovkspace.afkorhackathon.domain.myApplication.model

data class VacancyObject(
    val company: Int,
    val company_name: String,
    val created_at: String,
    val description: String,
    val full_name: String,
    val id: Int,
    val location: Int,
    val location_name: String,
    val phone_number: String,
    val salary: String,
    val title: String,
    val updated_at: String
)