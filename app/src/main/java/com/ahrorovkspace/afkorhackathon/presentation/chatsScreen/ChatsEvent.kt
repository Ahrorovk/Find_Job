package com.ahrorovkspace.afkorhackathon.presentation.chatsScreen

sealed class ChatsEvent {
    data class OnChatsUserNameToNavChange(val user: String) : ChatsEvent()
    object GoToProfile : ChatsEvent()
    object GoToMyApplication : ChatsEvent()
    object GoToAuthorization : ChatsEvent()
    object GoToRegistration : ChatsEvent()
    object GoToSettings : ChatsEvent()
    object Logout : ChatsEvent()
    object Clean : ChatsEvent()
}
