package com.ahrorovkspace.afkorhackathon.domain.myApplication.model

data class GetMyApplicationRespItem(
    val created_by: CreatedBy,
    val description: String,
    val id: Int,
    val status: Int,
    val vacancy: Int,
    val vacancy_obj: VacancyObject
)