package com.ahrorovkspace.afkorhackathon.presentation.chatsScreen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.graphics.Color
import com.ahrorovkspace.afkorhackathon.app.navigation.components.DrawerContent
import com.ahrorovkspace.afkorhackathon.presentation.components.ChatsItem
import kotlinx.coroutines.launch

@Composable
fun ChatsScreen(
    state: ChatsState,
    scaffoldState: ScaffoldState,
    onEvent: (ChatsEvent) -> Unit
) {
    val scope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState,
        drawerContent = {
            DrawerContent(
                openLoginScreen = {
                    scope.launch {
                        scaffoldState.drawerState.close()
                    }
                    onEvent(ChatsEvent.GoToAuthorization)
                },
                openRegistrationScreen = {
                    scope.launch {
                        scaffoldState.drawerState.close()
                    }
                    onEvent(ChatsEvent.GoToRegistration)
                },
                openSettingsScreen = {
                    scope.launch {
                        scaffoldState.drawerState.close()
                    }
                    onEvent(ChatsEvent.GoToSettings)
                },
                openDonationsLink = { /*TODO*/ },
                openGithubPage = { /*TODO*/ },
                shareApp = { /*TODO*/ },
                sendEmail = { /*TODO*/ },
                isReg = state.accessToken.isNotEmpty(),
                logOut = {
                    onEvent(ChatsEvent.Clean)
                    onEvent(ChatsEvent.Logout)
                }
            )
        },
        backgroundColor = Color.Transparent
    ) { itt ->
        LazyColumn() {
            items(state.chats) {
                ChatsItem(
                    user = it,
                    lastMsg = "sent 10 min ago",
                    imageUrl = "https://proprikol.ru/wp-content/uploads/2022/10/kartinki-s-mezhdunarodnym-dnem-gor-16-scaled.jpg",
                    onChatClick = { user ->
                        onEvent(
                            ChatsEvent.OnChatsUserNameToNavChange(
                                user
                            )
                        )
                    }
                )
            }
        }
    }
}