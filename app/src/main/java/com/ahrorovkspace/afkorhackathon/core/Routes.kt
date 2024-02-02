package com.ahrorovkspace.afkorhackathon.core

sealed class Routes(val route: String) {
    object RegistrationScreen : Routes("RegistrationScreen")
    object SettingsScreen : Routes("SettingsScreen")
    object AuthorizationScreen : Routes("AuthorizationScreen")
    object ApplicationScreen : Routes("ApplicationScreen/{${Constants.PROJECT_ID_ARG}}")
    object MyApplicationScreen : Routes("MyApplicationScreen")
    object MainScreen : Routes("MainScreen")
    object FavoritesScreen : Routes("FavoritesScreen")
    object RolesScreen : Routes("RolesScreen")
    object ChatScreen : Routes("ChatScreen")
    object ProfileScreen : Routes("ProfileScreen")
    object BrieflyDescScreen : Routes("BrieflyDescScreen")
    object ChatWithUserScreen : Routes("ChatWithUserScreen/{${Constants.CHAT_ID_ARG}}")
    object SplashScreen : Routes("SplashScreen")
}
sealed class BottomSheets(val route: String){
    object ApplicationSheet: Routes("ApplicationSheet/{${Constants.PROJECT_ID_ARG}}")
}
sealed class BottomSheetApplyOneTimeEvent {
    object CloseBottomSheet : BottomSheetApplyOneTimeEvent()
}