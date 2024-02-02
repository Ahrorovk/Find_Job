package com.ahrorovkspace.afkorhackathon.presentation.myApplicationScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahrorovkspace.afkorhackathon.app.theme.AppColor
import com.ahrorovkspace.afkorhackathon.core.formatDateTime
import com.ahrorovkspace.afkorhackathon.core.parseDateTime
import com.ahrorovkspace.afkorhackathon.domain.myApplication.model.GetMyApplicationRespItem
import com.ahrorovkspace.afkorhackathon.presentation.components.CustomButton

@Composable
fun MyApplicationScreen(
    state: MyApplicationState,
    onEvent: (MyApplicationEvent) -> Unit
) {
    val selectedItems = remember { mutableStateListOf<GetMyApplicationRespItem>() }
    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn(modifier = Modifier.fillMaxHeight()) {
            item {
                Spacer(modifier = Modifier.padding(10.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    CustomButton(
                        text = "Отклики на мою       вакансию", textSize = 16, isLoading = false,
                        height = 50,
                        modifier = Modifier
                            .fillMaxWidth(0.5f),
                        textColor = if (!state.applicationState) Color(0xFFE7EAE8) else Color(
                            0xFF00D969
                        ),
                        color = if (!state.applicationState) Color(0xFF00D969) else Color(0xFFE7EAE8)
                    ) {
                        onEvent(MyApplicationEvent.OnApplicationStateChange(false))
                    }
                    CustomButton(
                        text = "Мои отклики", textSize = 16, isLoading = false,
                        height = 50,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 5.dp),
                        textColor = if (state.applicationState) Color(0xFFE7EAE8) else Color(
                            0xFF00D969
                        ),
                        color = if (state.applicationState) Color(0xFF00D969) else Color(0xFFE7EAE8)
                    ) {
                        onEvent(MyApplicationEvent.OnApplicationStateChange(true))
                    }
                }
                Spacer(modifier = Modifier.height(22.dp))
                if (!state.applicationState) {
                    state.myApplicationRespState.response?.let {
                        it.forEach { item ->
                            val isSelected = remember { mutableStateOf(false) }
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .background(Color.White),
                                contentAlignment = Alignment.Center
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(horizontal = 22.dp, vertical = 10.dp),
                                    verticalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text(
                                        text = item.created_by.username,
                                        style = TextStyle(
                                            fontSize = 15.sp,
                                            fontWeight = FontWeight(500),
                                            color = Color(0xFF343434),
                                            textAlign = TextAlign.Center,
                                        )
                                    )
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                    ) {

                                        Text(
                                            overflow = TextOverflow.Ellipsis,
                                            maxLines = 1,
                                            text = "Вакансия: " + item.vacancy_obj.title,
                                            style = TextStyle(
                                                fontSize = 18.sp,
                                                fontWeight = FontWeight(600),
                                                color = MaterialTheme.colorScheme.onBackground,
                                            )
                                        )
                                        when (item.status) {
                                            0 -> Checkbox(
                                                checked = isSelected.value,
                                                onCheckedChange = {
                                                    isSelected.value = it
                                                    if (isSelected.value) {
                                                        selectedItems.add(item)
                                                    } else {
                                                        selectedItems.remove(item)
                                                    }
                                                }
                                            )

                                            1 -> {
                                                Text(
                                                    text = "Одобрено",
                                                    color = AppColor
                                                )
                                            }

                                            2 -> {
                                                Text(
                                                    text = "Отказано",
                                                    color = Color.Red
                                                )
                                            }
                                        }
                                    }
                                    parseDateTime(item.vacancy_obj.created_at)?.let { parsed ->
                                        Text(
                                            text = "${item.vacancy_obj.location_name}, " + formatDateTime(
                                                parsed
                                            ),
                                            style = TextStyle(
                                                fontSize = 15.sp,
                                                fontWeight = FontWeight(500),
                                                color = Color(0xFF343434),

                                                textAlign = TextAlign.Center,
                                            )
                                        )
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.padding(10.dp))
                        }
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 30.dp),
                        contentAlignment = Alignment.BottomCenter
                    ) {
                        CustomButton(
                            text = "Одобрить", textSize = 16,
                            isLoading = false,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 22.dp)
                        ) {
                            onEvent(MyApplicationEvent.OnSelectedResultsChange(selectedItems))
                        }
                    }
                }
            }
        }
    }
}