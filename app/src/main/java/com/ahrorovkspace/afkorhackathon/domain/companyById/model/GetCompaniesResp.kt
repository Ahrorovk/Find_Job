package com.ahrorovkspace.afkorhackathon.domain.companyById.model

data class GetCompaniesResp(
    val count: Int,
    val next: Any,
    val previous: Any,
    val results: List<Result>
)