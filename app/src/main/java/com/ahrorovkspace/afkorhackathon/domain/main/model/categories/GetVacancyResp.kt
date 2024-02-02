package com.ahrorovkspace.afkorhackathon.domain.main.model.categories

data class GetVacancyResp(
    val count: Int,
    val next: String,
    val previous: String,
    val results: List<Result>
)