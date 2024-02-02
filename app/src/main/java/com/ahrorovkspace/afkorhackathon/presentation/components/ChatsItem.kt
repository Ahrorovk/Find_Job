package com.ahrorovkspace.afkorhackathon.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.ahrorovkspace.afkorhackathon.app.theme.AntiFlashWhite

@Composable
fun ChatsItem(
    user: String,
    lastMsg: String,
    imageUrl: String,
    modifier: Modifier = Modifier,
    onChatClick: (String) -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(6.dp)
            .clip(RoundedCornerShape(8.dp))
            .clickable { onChatClick(user) }
            .background(AntiFlashWhite)
            ,
    ) {
        Row(
            modifier
                .fillMaxWidth()
                .padding(3.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier
                    .clip(CircleShape)
                    .size(50.dp),
                painter = rememberAsyncImagePainter(model = imageUrl),
                contentDescription = "imageUrl"
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = user,
                    fontSize = 16.sp,
                    color = Color(0x75000000)
                )
                Spacer(
                    modifier = Modifier.padding(2.dp)
                )
                Text(
                    text = lastMsg,
                    fontSize = 14.sp,
                    color = Color(0x75000000)
                )
            }
            Box(
                modifier = Modifier
                    .padding(end = 4.dp)
                    .fillMaxWidth(),
                contentAlignment = Alignment.CenterEnd
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowForwardIos,
                    contentDescription = "openChat"
                )
            }
        }
    }
}