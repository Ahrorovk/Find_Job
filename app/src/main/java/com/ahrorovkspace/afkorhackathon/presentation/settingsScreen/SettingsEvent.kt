package com.ahrorovkspace.afkorhackathon.presentation.settingsScreen

sealed class SettingsEvent{
    data class OnLanguageStateChange(val language: String) : SettingsEvent()
}
