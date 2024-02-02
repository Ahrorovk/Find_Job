package com.ahrorovkspace.afkorhackathon.presentation.chatsScreen

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
import kotlinx.coroutines.launch
import kotlinx.coroutines.plus
import javax.inject.Inject

@HiltViewModel
class ChatsViewModel @Inject constructor(
    private val dataStoreManager: DataStoreManager
) : ViewModel() {
    private val _state = MutableStateFlow(ChatsState())
    val state = _state.stateIn(
        viewModelScope + Dispatchers.IO,
        SharingStarted.WhileSubscribed(5000),
        ChatsState()
    )

    init {
        dataStoreManager.getAccessToken.onEach { value ->
            _state.update {
                it.copy(
                    accessToken = value
                )
            }
        }.launchIn(viewModelScope)
        dataStoreManager.getRefreshToken.onEach { value ->
            _state.update {
                it.copy(
                    refreshToken = value
                )
            }
        }.launchIn(viewModelScope)
    }

    fun onEvent(event: ChatsEvent) {
        when (event) {
            ChatsEvent.Clean -> {
                viewModelScope.launch {
                    dataStoreManager.updateAccessToken("")
                    dataStoreManager.updateRefreshToken("")
                }
            }

            is ChatsEvent.OnChatsUserNameToNavChange -> {
                _state.update {
                    it.copy(
                        chatUserName = event.user
                    )
                }
            }

            else -> Unit
        }
    }
}