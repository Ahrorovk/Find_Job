package com.ahrorovkspace.afkorhackathon.presentation.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ahrorovkspace.afkorhackathon.domain.main.model.categories.Children

@Composable
fun CategoryItem(
    parentName: String,
    modifier: Modifier = Modifier,
    items: List<Children>,
    changedCategories: List<Children>,
    response: Boolean,
    onSelectionChanged: (List<Children>) -> Unit
) {
    val openDialog = remember { mutableStateOf(false) }
    val selectedItems = remember { mutableStateListOf<Children>() }


    LaunchedEffect(key1 = changedCategories){
        selectedItems.clear()
        selectedItems.addAll(changedCategories)
    }
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .background(Color.White)
    ) {
        Column {
            ProjectCategoryItem(name = parentName,
                modifier = modifier
                    .clickable {
                        openDialog.value = true
                    })
            DropdownMenu(
                expanded = openDialog.value,
                onDismissRequest = { openDialog.value = false }
            ) {
                items.forEach { item ->
                    val isSelected = remember { mutableStateOf(selectedItems.contains(item)) }
                    DropdownMenuItem(
                        text = {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(text = item.name, color = Color(0x75000000))
                                Checkbox(
                                    checked = isSelected.value,
                                    colors = CheckboxDefaults.colors(Color(0x75000000)),
                                    onCheckedChange = {
                                        isSelected.value = it
                                        if (isSelected.value) {
                                            selectedItems.add(item)
                                        } else {
                                            selectedItems.remove(item)
                                        }
                                    }
                                )

                            }
                        },
                        onClick = {

                        }
                    )
                }
                LaunchedEffect(selectedItems) {
                    Log.e("TAG", "SELECTED_ITEMS ${selectedItems.toList()}")
                        onSelectionChanged(selectedItems)
                }
            }
        }
    }

}