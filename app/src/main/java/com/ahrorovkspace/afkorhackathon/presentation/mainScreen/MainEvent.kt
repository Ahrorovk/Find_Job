package com.ahrorovkspace.afkorhackathon.presentation.mainScreen

import com.ahrorovkspace.afkorhackathon.core.states.GetVacancyRespState
import com.ahrorovkspace.afkorhackathon.core.states.GetCompaniesRespState

sealed class MainEvent {
    data class OnGetVacanciesRespStateChange(val state: GetVacancyRespState) : MainEvent()
    data class OnGetCompaniesRespStateChange(val state: GetCompaniesRespState) : MainEvent()
    data class OnSearchProjectChange(val state: String) : MainEvent()
    data class GoToApplication(val id: Int) : MainEvent()
    object GetCompanies : MainEvent()
    object GoToMyApplication : MainEvent()
    object GoToAuthorization : MainEvent()
    object GetVacancies : MainEvent()
    object GoToRegistration : MainEvent()
    object GoToSettings : MainEvent()
    object Logout : MainEvent()
    object Clean : MainEvent()
}
