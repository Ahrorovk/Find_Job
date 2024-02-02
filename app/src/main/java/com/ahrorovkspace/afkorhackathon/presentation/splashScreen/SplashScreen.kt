package com.ahrorovkspace.afkorhackathon.presentation.splashScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ahrorovkspace.afkorhackathon.R
import com.ahrorovkspace.afkorhackathon.presentation.components.ProgressIndicator
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    state: SplashState,
    onEvent: (SplashEvent) -> Unit
) {
    LaunchedEffect(key1 = state.stateRegistered) {
        delay(400)
        if (state.stateRegistered)
            onEvent(SplashEvent.GoToMainScreen)
        else
            onEvent(SplashEvent.GoToAuthScreen)
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Image(
                painter = painterResource(id = R.drawable.app_icon),
                contentDescription = "appIcon",
                modifier = Modifier
                    .padding(22.dp)
                    .width(100.dp)
                    .height(100.dp)
                    .clip(RoundedCornerShape(size = 15.dp))
            )
        }
    }
}