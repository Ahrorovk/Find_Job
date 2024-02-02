package com.ahrorovkspace.afkorhackathon.app.navigation

data class NavigationState(
    val searchState: String = "",
    val refreshToken: String = "",
    val accessToken: String = ""
)
