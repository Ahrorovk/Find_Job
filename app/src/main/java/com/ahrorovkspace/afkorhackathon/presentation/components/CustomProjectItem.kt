package com.ahrorovkspace.afkorhackathon.presentation.components

import android.content.Intent
import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahrorovkspace.afkorhackathon.app.theme.White
import com.ahrorovkspace.afkorhackathon.domain.main.model.categories.Result

@Composable
fun CustomProjectItem(
    vacancy: Result,
    onApplyClick: (Int) -> Unit
) {
    val dialerLauncher =
        rememberLauncherForActivityResult(ActivityResultContracts.StartActivityForResult()) {}
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 22.dp, vertical = 6.dp)
            .clip(RoundedCornerShape(15.dp))
            .background(White)
            .clickable { onApplyClick(vacancy.id) }
    ) {
        Column(modifier = Modifier.padding(10.dp)) {
            Column(modifier = Modifier.padding(horizontal = 25.dp, vertical = 10.dp)) {
                Text(
                    text = vacancy.title,
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight(600),
                        color = MaterialTheme.colorScheme.onBackground,
                        textAlign = TextAlign.Center,
                    )
                )

                Spacer(modifier = Modifier.padding(5.dp))

                Text(
                    text = vacancy.salary + " смн",
                    modifier = Modifier,
                    color = MaterialTheme.colorScheme.onBackground
                )

                Spacer(modifier = Modifier.padding(5.dp))
                Text(
                    text = vacancy.company_name,
                    color = MaterialTheme.colorScheme.onBackground
                )

                Spacer(modifier = Modifier.padding(2.dp))

                Text(
                    text = vacancy.description,
                    maxLines = 10,
                    color = MaterialTheme.colorScheme.onBackground
                )

                Spacer(modifier = Modifier.padding(5.dp))
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (!vacancy.phone_number.isNullOrBlank()) {
                    CustomButton(
                        text = "Позвонить", textSize = 16, isLoading = false,
                        height = 35,
                        modifier = Modifier
                            .fillMaxWidth(0.5f),
                        color = Color(0xFFE7EAE8)
                    ) {
                        val dialUri = Uri.parse("tel:${vacancy.phone_number}")

                        val dialIntent = Intent(Intent.ACTION_CALL, dialUri)

                        dialerLauncher.launch(dialIntent)
                    }
                }
                CustomButton(
                    text = "Откликнуться", textSize = 16, isLoading = false,
                    height = 35,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 5.dp),
                    textColor = Color(0xFF00D969),
                    color = Color(0xFFE2F5EC)
                ) {
                    onApplyClick(vacancy.id)
                }
            }
        }
    }
}