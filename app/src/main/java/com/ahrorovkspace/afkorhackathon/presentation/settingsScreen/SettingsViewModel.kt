package com.ahrorovkspace.afkorhackathon.presentation.settingsScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.plus
import javax.inject.Inject
@HiltViewModel
class SettingsViewModel @Inject constructor(

) : ViewModel() {
    private val _state = MutableStateFlow(SettingsState())
    val state = _state.stateIn(
        viewModelScope + Dispatchers.IO,
        SharingStarted.WhileSubscribed(5000),
        SettingsState()
    )

    fun onEvent(event: SettingsEvent) {
        when (event) {
            is SettingsEvent.OnLanguageStateChange -> {
                _state.update {
                    it.copy(
                        languageState = event.language
                    )
                }
            }
        }
    }
}