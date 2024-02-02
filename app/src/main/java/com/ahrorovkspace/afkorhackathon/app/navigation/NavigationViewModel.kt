package com.ahrorovkspace.afkorhackathon.app.navigation

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
class NavigationViewModel @Inject constructor(
    private val dataStoreManager: DataStoreManager
) : ViewModel() {
    private val _state = MutableStateFlow(NavigationState())
    val state = _state.stateIn(
        viewModelScope + Dispatchers.IO,
        SharingStarted.WhileSubscribed(5000),
        NavigationState()
    )

    init {
        dataStoreManager.getRefreshToken.onEach { value ->
            _state.update {
                it.copy(
                    refreshToken = value
                )
            }
        }.launchIn(viewModelScope)
        dataStoreManager.getAccessToken.onEach { value ->
            _state.update {
                it.copy(
                    accessToken = value
                )
            }
        }.launchIn(viewModelScope)
    }

    fun onEvent(event: NavigationEvent) {
        when (event) {
            is NavigationEvent.OnSearchStateChange -> {
                _state.update {
                    it.copy(
                        searchState = event.search
                    )
                }
            }

            else -> Unit
        }
    }
}