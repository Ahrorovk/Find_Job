package com.ahrorovkspace.afkorhackathon.presentation.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahrorovkspace.afkorhackathon.app.theme.AppColor

@Composable
fun CustomButton(
    modifier: Modifier = Modifier,
    text: String,
    textSize: Int,
    enabled: Boolean = true,
    color: Color = AppColor,
    selected: Boolean = true,
    isLoading: Boolean,
    height: Int = 50,
    shape: Int = 10,
    textColor: Color = MaterialTheme.colorScheme.onBackground,
    onClick: () -> Unit
) {
    Button(
        onClick = {
            onClick()
        },
        enabled = enabled,
        shape = RoundedCornerShape(shape.dp),
        modifier = modifier
            .height(height.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = if (selected) color else Color(
                0xFFDADADA
            ), contentColor = Color.White
        ),
        content = {
            if (!isLoading) {
                Text(
                    text = text,
                    fontSize = textSize.sp,
                    color = textColor
                )
            } else {
                CircularProgressIndicator()
            }
        },
    )
}