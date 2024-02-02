package com.ahrorovkspace.afkorhackathon.core.models

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavDestination(
    val label: String,
    val destinationRoute: String,
    val icon: ImageVector
)