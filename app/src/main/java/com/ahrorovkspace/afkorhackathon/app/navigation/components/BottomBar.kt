package com.ahrorovkspace.afkorhackathon.app.navigation.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.NotificationsNone
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.navigation.NavController
import com.ahrorovkspace.afkorhackathon.app.theme.AppColor
import com.ahrorovkspace.afkorhackathon.app.theme.BLUE
import com.ahrorovkspace.afkorhackathon.core.Routes
import com.ahrorovkspace.afkorhackathon.core.models.BottomNavDestination

@Composable
fun FindJobBottomBar(navController: NavController) {
    BottomNavigation(
        backgroundColor = White.copy(alpha = 0.95F),
        contentColor = BLUE
    ) {
        bottomNavDestinations.forEach { navItem ->
            BottomNavItem(navController = navController, item = navItem)
        }

    }
}

val bottomNavDestinations = listOf(
    BottomNavDestination(
        label = "Биржа",
        destinationRoute = Routes.MainScreen.route,
        icon = Icons.Default.Search
    ),
    BottomNavDestination(
        label = "Избранные",
        destinationRoute = Routes.FavoritesScreen.route,
        icon = Icons.Default.FavoriteBorder
    ),
    BottomNavDestination(
        label = "Чаты",
        destinationRoute = Routes.ChatScreen.route,
        icon = Icons.Default.Chat
    ),
    BottomNavDestination(
        label = "Уведомления",
        destinationRoute = Routes.MyApplicationScreen.route,
        icon = Icons.Default.NotificationsNone
    ),
    BottomNavDestination(
        label = "Профиль",
        destinationRoute = Routes.ProfileScreen.route,
        icon = Icons.Default.AccountCircle
    )
)