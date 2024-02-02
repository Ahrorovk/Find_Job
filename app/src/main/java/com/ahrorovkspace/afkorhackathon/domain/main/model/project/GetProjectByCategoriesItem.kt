package com.ahrorovkspace.afkorhackathon.domain.main.model.project

data class GetProjectByCategoriesItem(
    val categories: List<Category>,
    val comments_count: Int,
    val description: String,
    val downloads_count: Int,
    val `file`: Any,
    val images: List<Image>,
    val likes_count: Int,
    val name: String,
    val slug: String,
    val tags: List<Tag>,
    val user: User,
    val views_count: Int,
    val id: Int
)