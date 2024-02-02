package com.ahrorovkspace.afkorhackathon.presentation.chatsScreen

data class ChatsState(
    val message: String = "",
    val refreshToken: String = "",
    val accessToken: String = "",
    val chatUserName: String = "",
    val chats: List<String> = listOf("user1","user2")
)
