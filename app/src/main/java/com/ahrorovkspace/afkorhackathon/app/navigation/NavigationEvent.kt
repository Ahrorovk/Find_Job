package com.ahrorovkspace.afkorhackathon.app.navigation

sealed class NavigationEvent{
    data class OnSearchStateChange(val search: String): NavigationEvent()
}
