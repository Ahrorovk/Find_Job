package com.ahrorovkspace.afkorhackathon.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun ProjectActionItem(
    number: Int,
    icon: ImageVector,
    onClick: () -> Unit
) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(text = number.toString())
        Spacer(modifier= Modifier.padding(1.dp))
        IconButton(onClick = onClick) {
            Icon(imageVector = icon, contentDescription = "icon")
        }
    }
}