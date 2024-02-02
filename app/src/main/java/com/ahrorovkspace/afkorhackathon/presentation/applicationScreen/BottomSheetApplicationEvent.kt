package com.ahrorovkspace.afkorhackathon.presentation.applicationScreen

import com.ahrorovkspace.afkorhackathon.core.states.PostApplicationRespState

sealed class BottomSheetApplicationEvent{
    data class OnDescriptionChange(val state: String): BottomSheetApplicationEvent()
    data class OnProjectIdChange(val id: Int): BottomSheetApplicationEvent()
    data class OnStatusOfResumeChange(val status: Boolean): BottomSheetApplicationEvent()
    data class OnPostBottomSheetApplicationRespState(val state: PostApplicationRespState): BottomSheetApplicationEvent()
    object Apply: BottomSheetApplicationEvent()
    object GoToMain: BottomSheetApplicationEvent()
}
