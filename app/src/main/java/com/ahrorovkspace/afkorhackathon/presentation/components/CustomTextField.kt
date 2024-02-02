package com.ahrorovkspace.afkorhackathon.presentation.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahrorovkspace.afkorhackathon.app.theme.White

@Composable
fun CustomTextField(
    modifier: Modifier = Modifier,
    value: String,
    hint: String,
    onValueChange: (String) -> Unit,
    isAvailable: Boolean = true,
    keyboardType: KeyboardType = KeyboardType.Text
) {
    Box(
        modifier = Modifier
            .padding(horizontal=22.dp)
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        TextField(
            shape = RoundedCornerShape(7.dp),
            maxLines = 10,
            readOnly = !isAvailable,
            modifier = modifier
                .border(
                    width = 1.dp,
                    color = Color(0xFF343434),
                    shape = RoundedCornerShape(size = 7.dp)
                )
                .fillMaxWidth()
                .height(55.dp),
            value = value,
            textStyle = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight(500),
                color = MaterialTheme.colors.onBackground,

                ),
            keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
            onValueChange = onValueChange,
            placeholder = {
                Text(text = hint, fontSize = 18.sp)
            },
            colors = TextFieldDefaults.textFieldColors(
                disabledTextColor = Color.Transparent,
                backgroundColor = White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            )
        )
    }
}