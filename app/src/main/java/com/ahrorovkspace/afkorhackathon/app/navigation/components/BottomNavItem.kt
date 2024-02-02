package com.ahrorovkspace.afkorhackathon.app.navigation.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import com.ahrorovkspace.afkorhackathon.app.theme.AppColor
import com.ahrorovkspace.afkorhackathon.app.theme.BLUE
import com.ahrorovkspace.afkorhackathon.app.theme.PrimaryText
import com.ahrorovkspace.afkorhackathon.core.Routes
import com.ahrorovkspace.afkorhackathon.core.models.BottomNavDestination

@Composable
fun RowScope.BottomNavItem(
    navController: NavController,
    item: BottomNavDestination
) {

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomNavigationItem(
        selected = currentDestination?.hierarchy?.any {
            when (item.destinationRoute) {
                Routes.MainScreen.route -> {
                    it.route == Routes.MainScreen.route
                }

                Routes.FavoritesScreen.route -> {
                    it.route == Routes.FavoritesScreen.route
                }


                Routes.MyApplicationScreen.route -> {
                    it.route == Routes.MyApplicationScreen.route
                }

                Routes.ChatScreen.route -> {
                    it.route == Routes.ChatScreen.route
                }
                Routes.ProfileScreen.route -> {
                    it.route == Routes.ProfileScreen.route
                }

                else -> {
                    it.route == Routes.MainScreen.route
                }
            }
        } == true,
        onClick = {
            if (currentDestination?.route != item.destinationRoute)
                navigateToScreen(item.destinationRoute, navController)
        },
        icon = {
            Icon(
                modifier = Modifier.size(24.dp),
                imageVector = item.icon,
                contentDescription = "BottomNavIcon"
            )
        },
        selectedContentColor = PrimaryText,
        unselectedContentColor = BLUE
    )
}

private fun navigateToScreen(route: String, navController: NavController) {
    navController.navigate(route = route) {
        popUpTo(navController.graph.findStartDestination().id) { saveState = true }
        launchSingleTop = true
        restoreState = true
    }
}