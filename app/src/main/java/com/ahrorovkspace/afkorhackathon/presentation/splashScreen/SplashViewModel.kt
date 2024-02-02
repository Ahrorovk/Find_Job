package com.ahrorovkspace.afkorhackathon.presentation.splashScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ahrorovkspace.afkorhackathon.data.local.DataStoreManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.plus
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    dataStoreManager: DataStoreManager
) : ViewModel() {
    private val _state = MutableStateFlow(SplashState())
    val state = _state.stateIn(
        viewModelScope + Dispatchers.IO,
        SharingStarted.WhileSubscribed(5000),
        SplashState()
    )

    init {
        dataStoreManager.getAccessToken.onEach { value ->
            if (value.isNotEmpty()) {
                _state.update {
                    it.copy(stateRegistered = true)
                }
            }
        }.launchIn(viewModelScope)
    }
}