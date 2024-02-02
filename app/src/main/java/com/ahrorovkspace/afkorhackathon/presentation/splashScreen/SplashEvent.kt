package com.ahrorovkspace.afkorhackathon.presentation.splashScreen

sealed class SplashEvent {
    object GoToMainScreen : SplashEvent()
    object GoToAuthScreen : SplashEvent()
}
