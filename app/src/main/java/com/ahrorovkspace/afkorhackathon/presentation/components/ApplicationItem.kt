package com.ahrorovkspace.afkorhackathon.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.selection.selectable
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

data class Request(val id: Int, val text: String, var isSelected: Boolean = false)

@Composable
fun ExistingRequestList(existingRequests: List<Request>, onApprove: (Set<Request>) -> Unit) {
    var selectedRequests: Set<Request> by remember { mutableStateOf(emptySet<Request>()) }

    LazyColumn {
        items(existingRequests) { request ->
            val isSelected = selectedRequests.contains(element = request)
            val context = LocalContext.current

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .selectable(
                        selected = isSelected,
                        onClick = {
                            selectedRequests = if (isSelected) {
                                selectedRequests.toMutableSet().apply { remove(request) }
                            } else {
                                selectedRequests.toMutableSet().apply { add(request) }
                            }
                        }
                    )
                    .padding(16.dp)
            ) {
                Checkbox(
                    checked = isSelected,
                    onCheckedChange = {
                        selectedRequests = if (it) {
                            selectedRequests.toMutableSet().apply { add(request) }
                        } else {
                            selectedRequests.toMutableSet().apply { remove(request) }
                        }
                    }
                )

                Text(
                    text = request.text,
                    style = MaterialTheme.typography.body1,
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .align(Alignment.CenterVertically)
                )
            }
        }
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.End
            ) {
                IconButton(onClick = { onApprove(selectedRequests) }) {
                    Icon(Icons.Default.Send, contentDescription = null)
                }
            }
        }
    }
}
