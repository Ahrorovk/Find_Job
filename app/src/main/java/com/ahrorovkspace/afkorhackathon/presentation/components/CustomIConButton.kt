package com.ahrorovkspace.afkorhackathon.presentation.components

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun CustomIconButton(
    icon: ImageVector,
    tint: Color = MaterialTheme.colors.onBackground,
    onClick: () -> Unit,
) {
    IconButton(onClick = {
        onClick()
    }) {
        Icon(
            icon,
            null,
            tint = tint
        )
    }
}