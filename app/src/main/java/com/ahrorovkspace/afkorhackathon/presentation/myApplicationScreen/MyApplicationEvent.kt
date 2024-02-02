package com.ahrorovkspace.afkorhackathon.presentation.myApplicationScreen

import com.ahrorovkspace.afkorhackathon.core.states.GetMyApplicationRespState
import com.ahrorovkspace.afkorhackathon.domain.myApplication.model.GetMyApplicationRespItem

sealed class MyApplicationEvent {
    data class OnGetMyApplicationChange(val state: GetMyApplicationRespState) : MyApplicationEvent()
    object GetMyApplication : MyApplicationEvent()
    data class OnApplicationStateChange(val state: Boolean) : MyApplicationEvent()
    data class OnSelectedResultsChange(val selected: List<GetMyApplicationRespItem>) :
        MyApplicationEvent()
}
