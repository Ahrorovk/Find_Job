package com.ahrorovkspace.afkorhackathon.domain.main.model.project

data class Image(
    val created_at: String,
    val folder: Int,
    val id: Int,
    val original: String,
    val original_url: String,
    val thumbnail: String,
    val updated_at: String
)