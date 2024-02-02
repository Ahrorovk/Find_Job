package com.ahrorovkspace.afkorhackathon.presentation.registratrionScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.ahrorovkspace.afkorhackathon.R
import com.ahrorovkspace.afkorhackathon.core.getEnable
import com.ahrorovkspace.afkorhackathon.presentation.components.CustomButton
import com.ahrorovkspace.afkorhackathon.presentation.components.CustomTextField

@Composable
fun RegistrationScreen(
    state: RegistrationState,
    onEvent: (RegistrationEvent) -> Unit
) {
    LaunchedEffect(key1 = state.registrationRespState.response) {
        if (state.registrationRespState.response != null) {
            onEvent(RegistrationEvent.GoToMainScreen)
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
                    .padding(22.dp)
                    .width(100.dp)
                    .height(100.dp)
                    .clip(RoundedCornerShape(size = 15.dp))
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 22.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                state.rolesState.forEach {
                    CustomButton(
                        text = it.role,
                        textSize = 16,
                        isLoading = false,
                        height = 55,
                        shape = 5,
                        selected = state.selectedRole.roleId == it.roleId,
                        modifier = Modifier.width(170.dp)
                    ) {
                        onEvent(RegistrationEvent.OnRoleChange(it))
                    }
                }
            }
            Spacer(modifier = Modifier.height(15.dp))

            CustomTextField(
                value = state.username,
                hint = "никнейм",
                onValueChange = {
                    onEvent(
                        RegistrationEvent.OnUsernameChange(
                            it
                        )
                    )
                }
            )
            Spacer(modifier = Modifier.height(15.dp))

            CustomTextField(
                value = state.email,
                hint = "почта",
                onValueChange = {
                    onEvent(
                        RegistrationEvent.OnEmailChange(
                            it
                        )
                    )
                }
            )

            Spacer(modifier = Modifier.height(15.dp))

            CustomTextField(
                value = state.phone,
                hint = "телефон",
                keyboardType = KeyboardType.Number,
                onValueChange = {
                    onEvent(
                        RegistrationEvent.OnPhoneChange(
                            it
                        )
                    )
                }
            )

            Spacer(modifier = Modifier.height(15.dp))

            CustomTextField(
                value = state.password,
                hint = "пароль",
                onValueChange = {
                    onEvent(
                        RegistrationEvent.OnPasswordChange(
                            it
                        )
                    )
                }
            )

            Spacer(modifier = Modifier.height(15.dp))

            CustomTextField(
                value = state.passwordConfirm,
                hint = "подтвердите пароль",
                onValueChange = {
                    onEvent(
                        RegistrationEvent.OnPasswordConfirmChange(
                            it
                        )
                    )
                }
            )

            Spacer(modifier = Modifier.height(15.dp))

            CustomButton(
                text = "Регистрироваться",
                textSize = 16,
                isLoading = state.registrationRespState.isLoading,
                enabled = getEnable(state),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 22.dp, end = 22.dp, top = 53.dp)
            ) {
                onEvent(RegistrationEvent.Registration)
            }
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 15.dp), contentAlignment = Alignment.BottomCenter
        ) {
            Text(
                text = "Авторизация",
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.clickable { onEvent(RegistrationEvent.GoToSignUp) })
        }
    }
}