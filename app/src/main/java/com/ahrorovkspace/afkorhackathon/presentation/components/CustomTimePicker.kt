package com.ahrorovkspace.afkorhackathon.presentation.components

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import com.maxkeppeker.sheets.core.icons.LibIcons
import com.maxkeppeker.sheets.core.models.base.SheetState
import com.maxkeppeker.sheets.core.models.base.rememberSheetState
import com.maxkeppeler.sheets.clock.ClockDialog
import com.maxkeppeler.sheets.clock.models.ClockConfig
import com.maxkeppeler.sheets.clock.models.ClockSelection
import java.time.LocalTime

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("NewApi")
@Composable
fun CustomTimePicker(
    clockState: SheetState = rememberSheetState(),
    selectedTime: (String) -> Unit
) {
    ClockDialog(
        state = clockState,
        config = ClockConfig(
            defaultTime = LocalTime.now(),
            is24HourFormat = true,
            icons = LibIcons.Rounded
        ),
        selection = ClockSelection.HoursMinutesSeconds { hours, minutes, seconds ->
            selectedTime(
                "${if (hours <= 9) "0" else ""}$hours:${if (minutes <= 9) "0" else ""}$minutes:${if (seconds <= 9) "0" else ""}$seconds"
            )
        })
}