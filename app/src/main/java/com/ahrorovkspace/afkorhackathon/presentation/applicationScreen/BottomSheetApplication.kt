package com.ahrorovkspace.afkorhackathon.presentation.applicationScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ahrorovkspace.afkorhackathon.presentation.components.CustomButton
import com.ahrorovkspace.afkorhackathon.presentation.components.CustomTextField
import com.ahrorovkspace.afkorhackathon.presentation.components.ModalSheetDefaultStick

@Composable
fun BottomSheetApplication(
    state: BottomSheetApplicationState,
    onEvent: (BottomSheetApplicationEvent) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.background)
            .fillMaxHeight(0.3f),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ModalSheetDefaultStick(modifier = Modifier.padding(top = 16.dp))
        Spacer(modifier = Modifier.padding(15.dp))
        Text(
            modifier = Modifier.padding(vertical = 10.dp),
            text = "Поделитесь своим опытом и расскажите нам\n, как вы можете внести свой вклад в нашу компанию",
            color = androidx.compose.material3.MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.padding(15.dp))

        CustomTextField(
            value = state.description,
            hint = "Description",
            onValueChange = { onEvent(BottomSheetApplicationEvent.OnDescriptionChange(it)) }
        )
        Spacer(modifier = Modifier.padding(15.dp))
        CustomButton(
            text = "Apply",
            textSize = 14,
            isLoading = state.applicationRespState.isLoading,
            modifier = Modifier.width(140.dp)
        ) {
            onEvent(BottomSheetApplicationEvent.Apply)
            onEvent(BottomSheetApplicationEvent.GoToMain)
        }
    }
}