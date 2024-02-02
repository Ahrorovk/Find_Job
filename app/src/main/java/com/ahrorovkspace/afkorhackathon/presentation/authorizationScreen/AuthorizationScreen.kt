package com.ahrorovkspace.afkorhackathon.presentation.authorizationScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ahrorovkspace.afkorhackathon.R
import com.ahrorovkspace.afkorhackathon.presentation.components.CustomButton
import com.ahrorovkspace.afkorhackathon.presentation.components.CustomTextField

@Composable
fun AuthorizationScreen(
    state: AuthorizationState,
    onEvent: (AuthorizationEvent) -> Unit
) {
    LaunchedEffect(key1 = state.authorizationRespState.response) {
        if (state.authorizationRespState.response != null) {
            onEvent(AuthorizationEvent.GoToMainScreen)
        }
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.app_icon),
                contentDescription = "appIcon",
                modifier = Modifier
                    .padding(bottom = 129.dp)
                    .width(100.dp)
                    .height(100.dp)
                    .clip(RoundedCornerShape(size = 15.dp))
            )

            CustomTextField(
                value = state.username,
                hint = "Login",
                onValueChange = {
                    onEvent(
                        AuthorizationEvent.OnLoginChange(
                            it
                        )
                    )
                }
            )

            Spacer(modifier = Modifier.height(15.dp))

            CustomTextField(
                value = state.password,
                hint = "Password",
                onValueChange = {
                    onEvent(
                        AuthorizationEvent.OnPasswordChange(
                            it
                        )
                    )
                }
            )

            Spacer(modifier = Modifier.height(213.dp))

            CustomButton(
                text = "Войти",
                textSize = 16,
                isLoading = state.authorizationRespState.isLoading,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 22.dp)
            ) {
                onEvent(AuthorizationEvent.Authorization)
            }
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 15.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text(text = "Регистрация", color =
            MaterialTheme.colorScheme.primary,
                modifier = Modifier.clickable {
                    onEvent(AuthorizationEvent.GoToSignUp)
                })
        }

    }
}