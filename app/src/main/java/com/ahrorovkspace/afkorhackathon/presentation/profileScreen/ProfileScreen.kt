package com.ahrorovkspace.afkorhackathon.presentation.profileScreen

import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.ahrorovkspace.afkorhackathon.R
import com.ahrorovkspace.afkorhackathon.core.getRealPathFromURI
import com.ahrorovkspace.afkorhackathon.presentation.components.CustomButton
import com.ahrorovkspace.afkorhackathon.presentation.components.CustomTextField
import com.ahrorovkspace.afkorhackathon.presentation.components.CustomTimePicker
import com.maxkeppeker.sheets.core.models.base.rememberSheetState
import java.io.File

@Composable
fun ProfileScreen(
    state: ProfileState,
    onEvent: (ProfileEvent) -> Unit
) {
    val context = LocalContext.current
    val clockStateStart = rememberSheetState()
    val clockStateEnd = rememberSheetState()
    val imageLauncher =
        rememberLauncherForActivityResult(contract = ActivityResultContracts.GetContent()) {
            onEvent(ProfileEvent.OnSelectImageUriChange(it))
        }
    val pdfLauncher =
        rememberLauncherForActivityResult(contract = ActivityResultContracts.GetContent()) {
            onEvent(ProfileEvent.OnSelectPdfUriChange(it))
        }
    LaunchedEffect(key1 = state.changeProfileInfoRespState.response) {
        if (state.changeProfileInfoRespState.response != null)
            Toast.makeText(context, "Данные успешно сохранились", Toast.LENGTH_SHORT).show()
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                if (state.selectedImage != null) {
                    Image(
                        painter = rememberAsyncImagePainter(state.selectedImage),
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(150.dp)
                            .clip(CircleShape)
                            .clickable {
                                imageLauncher.launch("image/*")
                            },
                        contentDescription = "",
                    )
                } else {
                    Image(
                        painter = rememberAsyncImagePainter(
                            model = if (state.imageUrl != "") "http://185.244.48.91:8000" + state.imageUrl else R.drawable.app_icon
                        ),
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(150.dp)
                            .clip(CircleShape)
                            .clickable {
                                imageLauncher.launch("image/*")
                            },
                        contentDescription = "",
                    )
                }

                Spacer(modifier = Modifier.padding(12.dp))

                CustomTextField(
                    value = state.fullname,
                    hint = "Фамилия Имя",
                    onValueChange = {
                        onEvent(
                            ProfileEvent.OnFirstNameChange(
                                it
                            )
                        )
                    }
                )

                Spacer(modifier = Modifier.padding(12.dp))

                CustomTextField(
                    value = state.username,
                    hint = "Username",
                    onValueChange = {
                    }, isAvailable = false
                )

                Spacer(modifier = Modifier.padding(12.dp))

                CustomTextField(
                    value = state.email,
                    hint = "Почта",
                    onValueChange = {
                    },
                    isAvailable = false
                )

                Spacer(modifier = Modifier.padding(12.dp))

                CustomTextField(
                    value = state.phone,
                    hint = "Телефон",
                    onValueChange = {
                    },
                    keyboardType = KeyboardType.Number,
                    isAvailable = false
                )
                Spacer(modifier = Modifier.padding(12.dp))

                CustomTextField(
                    value = state.speciality,
                    hint = "Специальность",
                    onValueChange = {
                        onEvent(ProfileEvent.OnSpecialityChange(it))
                    },
                    keyboardType = KeyboardType.Number,
                    isAvailable = false
                )

                Spacer(modifier = Modifier.padding(12.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 22.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Начало работы", color = MaterialTheme.colorScheme.onBackground)
                    Text(text = state.workTimeStart, modifier = Modifier.clickable {
                        clockStateEnd.show()
                    }, color = MaterialTheme.colorScheme.onBackground)
                    CustomTimePicker(clockStateEnd) {
                        onEvent(ProfileEvent.OnWorkTimeStartChange(it))
                    }
                }

                Spacer(modifier = Modifier.padding(12.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 22.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Конец работы", color = MaterialTheme.colorScheme.onBackground)
                    Text(text = state.workTimeEnd, modifier = Modifier.clickable {
                        clockStateStart.show()
                    }, color = MaterialTheme.colorScheme.onBackground)
                    CustomTimePicker(clockStateStart) {
                        onEvent(ProfileEvent.OnWorkTimeEndChange(it))
                    }
                }

                Spacer(modifier = Modifier.padding(12.dp))

                CustomTextField(
                    value = state.about,
                    hint = "Про Себя",
                    onValueChange = {
                        onEvent(
                            ProfileEvent.OnDescriptionChange(
                                it
                            )
                        )
                    }
                )
                Spacer(modifier = Modifier.padding(12.dp))

                if (state.selectedPdf != null) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 22.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "Резюме", color = MaterialTheme.colorScheme.onBackground)
                        Text(
                            text = File(
                                getRealPathFromURI(
                                    context,
                                    state.selectedPdf
                                ) ?: ""
                            ).name, modifier = Modifier.clickable {
                                pdfLauncher.launch("application/pdf")
                            }, color = MaterialTheme.colorScheme.onBackground
                        )
                    }
                } else {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 22.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "Резюме", color = MaterialTheme.colorScheme.onBackground)
                        Text(
                            text = state.resumeUrl.ifEmpty { "Прикрепить файл" },
                            modifier = Modifier.clickable {
                                pdfLauncher.launch("application/pdf")
                            },
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    }
                }
                Spacer(modifier = Modifier.padding(12.dp))

                CustomButton(
                    text = "Сохранить",
                    textSize = 16,
                    isLoading = false,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 22.dp)
                ) {
                    onEvent(ProfileEvent.SaveChanges(context))
                }
            }
        }
    }
}