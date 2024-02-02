package com.ahrorovkspace.afkorhackathon.app.navigation


import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIos
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.ahrorovkspace.afkorhackathon.app.navigation.components.FindJobBottomBar
import com.ahrorovkspace.afkorhackathon.app.theme.AntiFlashWhite
import com.ahrorovkspace.afkorhackathon.core.BottomSheetApplyOneTimeEvent
import com.ahrorovkspace.afkorhackathon.core.BottomSheets
import com.ahrorovkspace.afkorhackathon.core.Constants
import com.ahrorovkspace.afkorhackathon.core.Routes
import com.ahrorovkspace.afkorhackathon.core.doesScreenHaveBottomBar
import com.ahrorovkspace.afkorhackathon.core.doesScreenHaveMenu
import com.ahrorovkspace.afkorhackathon.core.doesScreenHaveTopBar
import com.ahrorovkspace.afkorhackathon.core.getTopBarTitle
import com.ahrorovkspace.afkorhackathon.presentation.applicationScreen.BottomSheetApplication
import com.ahrorovkspace.afkorhackathon.presentation.applicationScreen.BottomSheetApplicationEvent
import com.ahrorovkspace.afkorhackathon.presentation.applicationScreen.BottomSheetApplicationViewModel
import com.ahrorovkspace.afkorhackathon.presentation.authorizationScreen.AuthorizationEvent
import com.ahrorovkspace.afkorhackathon.presentation.authorizationScreen.AuthorizationScreen
import com.ahrorovkspace.afkorhackathon.presentation.authorizationScreen.AuthorizationViewModel
import com.ahrorovkspace.afkorhackathon.presentation.chatsScreen.ChatsEvent
import com.ahrorovkspace.afkorhackathon.presentation.chatsScreen.ChatsScreen
import com.ahrorovkspace.afkorhackathon.presentation.chatsScreen.ChatsViewModel
import com.ahrorovkspace.afkorhackathon.presentation.components.CustomIconButton
import com.ahrorovkspace.afkorhackathon.presentation.components.CustomSearchTextField
import com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainEvent
import com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainScreen
import com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainViewModel
import com.ahrorovkspace.afkorhackathon.presentation.myApplicationScreen.MyApplicationEvent
import com.ahrorovkspace.afkorhackathon.presentation.myApplicationScreen.MyApplicationScreen
import com.ahrorovkspace.afkorhackathon.presentation.myApplicationScreen.MyApplicationViewModel
import com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent
import com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileScreen
import com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileViewModel
import com.ahrorovkspace.afkorhackathon.presentation.registratrionScreen.RegistrationEvent
import com.ahrorovkspace.afkorhackathon.presentation.registratrionScreen.RegistrationScreen
import com.ahrorovkspace.afkorhackathon.presentation.registratrionScreen.RegistrationViewModel
import com.ahrorovkspace.afkorhackathon.presentation.settingsScreen.SettingsScreen
import com.ahrorovkspace.afkorhackathon.presentation.settingsScreen.SettingsViewModel
import com.ahrorovkspace.afkorhackathon.presentation.splashScreen.SplashEvent
import com.ahrorovkspace.afkorhackathon.presentation.splashScreen.SplashScreen
import com.ahrorovkspace.afkorhackathon.presentation.splashScreen.SplashViewModel
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.google.accompanist.navigation.material.ModalBottomSheetLayout
import com.google.accompanist.navigation.material.bottomSheet
import com.google.accompanist.navigation.material.rememberBottomSheetNavigator
import kotlinx.coroutines.launch

val searchState = mutableStateOf("")

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterialNavigationApi::class)
@SuppressLint("CoroutineCreationDuringComposition", "UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Navigation(
    navState: NavigationState,
    onEvent: (NavigationEvent) -> Unit
) {
    searchState.value = navState.searchState
    val scope = rememberCoroutineScope()
    val bottomSheetNavigator = rememberBottomSheetNavigator()
    val navController = rememberNavController(bottomSheetNavigator)
    val scaffoldState = rememberScaffoldState()
    val currentScreen = navController.currentBackStackEntryAsState().value?.destination?.route ?: ""
    ModalBottomSheetLayout(bottomSheetNavigator) {
        Scaffold(
            contentColor = AntiFlashWhite,
            topBar = {
                if (doesScreenHaveTopBar(currentScreen)) {
                    TopAppBar(
                        colors = TopAppBarDefaults.topAppBarColors(AntiFlashWhite),
                        title = {
                            when (currentScreen) {
                                Routes.MainScreen.route, BottomSheets.ApplicationSheet.route -> {
                                    CustomSearchTextField(
                                        value = navState.searchState,
                                        onValueChange = {
                                            onEvent(
                                                NavigationEvent.OnSearchStateChange(
                                                    it
                                                )
                                            )
                                        }, placeholder = "Поиск вакансий"
                                    )
                                }

                                else -> {
                                    Box(
                                        modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Text(
                                            text = getTopBarTitle(currentScreen),
                                            color = MaterialTheme.colors.onBackground
                                        )
                                    }
                                }
                            }
                        },
                        navigationIcon = {
                            if (doesScreenHaveMenu(currentScreen)) {
                                CustomIconButton(icon = Icons.Filled.Menu) {
                                    scope.launch {
                                        scaffoldState.drawerState.open()
                                    }
                                }
                            } else {
                                CustomIconButton(icon = Icons.Filled.ArrowBackIos) {
                                    navController.popBackStack()
                                }
                            }
                        }
                    )
                }
            },
            bottomBar = {
                if (doesScreenHaveBottomBar(currentScreen)) {
                    FindJobBottomBar(navController)
                }
            }
        ) { itt ->
            NavHost(
                modifier = Modifier.background(Color(0xFFE2F5EC)).padding(itt),
                navController = navController,
                startDestination = Routes.MainScreen.route
            ) {
                composable(Routes.SplashScreen.route) {
                    val viewModel = hiltViewModel<SplashViewModel>()
                    val state = viewModel.state.collectAsState()
                    SplashScreen(
                        state = state.value,
                        onEvent = { event ->
                            when (event) {
                                SplashEvent.GoToMainScreen -> {
                                    navController.navigate(Routes.MainScreen.route) {
                                        popUpTo(Routes.SplashScreen.route) {
                                            inclusive = true
                                        }
                                    }
                                }

                                SplashEvent.GoToAuthScreen -> {
                                    navController.navigate(Routes.AuthorizationScreen.route) {
                                        popUpTo(Routes.SplashScreen.route) {
                                            inclusive = true
                                        }
                                    }
                                }
                            }
                        }
                    )
                }
                composable(
                    Routes.RegistrationScreen.route
                ) {
                    val viewModel = hiltViewModel<RegistrationViewModel>()
                    val state = viewModel.state.collectAsState()

                    RegistrationScreen(
                        state = state.value,
                        onEvent = { event ->
                            when (event) {
                                RegistrationEvent.GoToSignUp -> {
                                    navController.navigate(Routes.AuthorizationScreen.route) {
                                        popUpTo(Routes.RegistrationScreen.route) {
                                            inclusive = true
                                        }
                                    }
                                }

                                RegistrationEvent.GoToMainScreen -> {
                                    navController.navigate(Routes.MainScreen.route) {
                                        popUpTo(Routes.RegistrationScreen.route) {
                                            inclusive = true
                                        }
                                    }
                                }

                                else -> viewModel.onEvent(event)
                            }
                        }
                    )
                }
                composable(Routes.AuthorizationScreen.route) {
                    val viewModel = hiltViewModel<AuthorizationViewModel>()
                    val state = viewModel.state.collectAsState()
                    AuthorizationScreen(
                        state = state.value,
                        onEvent = { event ->
                            when (event) {
                                AuthorizationEvent.GoToSignUp -> {
                                    navController.navigate(Routes.RegistrationScreen.route)
                                }

                                AuthorizationEvent.GoToMainScreen -> {
                                    navController.navigate(Routes.MainScreen.route) {
                                        popUpTo(Routes.AuthorizationScreen.route) {
                                            inclusive = true
                                        }
                                    }
                                }

                                else -> {
                                    viewModel.onEvent(event)
                                }
                            }
                        }
                    )
                }
                composable(Routes.SettingsScreen.route) {
                    val viewModel = hiltViewModel<SettingsViewModel>()
                    val state = viewModel.state.collectAsState()
                    SettingsScreen(
                        state = state.value,
                        onEvent = { event ->
                            when (event) {
                                else -> Unit
                            }

                        }
                    )
                }
                composable(Routes.MainScreen.route) {
                    val viewModel = hiltViewModel<MainViewModel>()
                    val state = viewModel.state.collectAsState()
                    viewModel.onEvent(MainEvent.OnSearchProjectChange(searchState.value))
                    LaunchedEffect(key1 = true) {
                    viewModel.onEvent(MainEvent.GetVacancies)
//                    viewModel.onEvent(MainEvent.GetCompanies)
                    }
                    MainScreen(
                        state = state.value,
                        scaffoldState = scaffoldState,
                        onEvent = { event ->
                            when (event) {
                                MainEvent.GoToAuthorization -> {
                                    navController.navigate(Routes.AuthorizationScreen.route)
                                }

                                MainEvent.Logout -> {
                                    navController.navigate(Routes.AuthorizationScreen.route) {
                                        popUpTo(Routes.MainScreen.route) {
                                            inclusive = true
                                        }
                                    }
                                }

                                MainEvent.GoToMyApplication -> {
                                    navController.navigate(Routes.MyApplicationScreen.route)
                                }

                                is MainEvent.GoToApplication -> {
                                    navController.navigate(
                                        BottomSheets.ApplicationSheet.route.replace(
                                            "{${Constants.PROJECT_ID_ARG}}",
                                            "${event.id}",
                                        )
                                    )
                                }

                                MainEvent.GoToRegistration -> {
                                    navController.navigate(Routes.RegistrationScreen.route)
                                }

                                MainEvent.GoToSettings -> {
                                    navController.navigate(Routes.SettingsScreen.route)
                                }

                                else -> {
                                    viewModel.onEvent(event)
                                }
                            }
                        }
                    )
                }
                composable(Routes.ChatScreen.route) {
                    val viewModel = hiltViewModel<ChatsViewModel>()
                    val state = viewModel.state.collectAsState()
                    ChatsScreen(
                        state = state.value,
                        scaffoldState = scaffoldState,
                        onEvent = { event ->
                            when (event) {
                                ChatsEvent.Logout -> {
                                    navController.navigate(Routes.AuthorizationScreen.route) {
                                        popUpTo(Routes.ChatScreen.route) {
                                            inclusive = true
                                        }
                                    }
                                }

                                ChatsEvent.GoToAuthorization -> {
                                    navController.navigate(Routes.AuthorizationScreen.route)
                                }

                                ChatsEvent.GoToProfile -> {
                                    navController.navigate(Routes.ProfileScreen.route)
                                }

                                ChatsEvent.GoToRegistration -> {
                                    navController.navigate(Routes.RegistrationScreen.route)
                                }

                                ChatsEvent.GoToMyApplication -> {
                                    navController.navigate(Routes.MyApplicationScreen.route)
                                }

                                ChatsEvent.GoToSettings -> {
                                    navController.navigate(Routes.SettingsScreen.route)
                                }

                                else -> Unit
                            }
                        }
                    )
                }
                composable(Routes.ProfileScreen.route) {
                    val viewModel = hiltViewModel<ProfileViewModel>()
                    val state = viewModel.state.collectAsState()
                    LaunchedEffect(key1 = true) {
                        viewModel.onEvent(ProfileEvent.GetProfileInfo)
                    }
                    ProfileScreen(
                        state = state.value,
                        onEvent = { event ->
                            when (event) {
                                else -> viewModel.onEvent(event)
                            }
                        }
                    )
                }
                composable(Routes.FavoritesScreen.route){

                }
                bottomSheet(
                    BottomSheets.ApplicationSheet.route, arguments = listOf(
                        navArgument(Constants.PROJECT_ID_ARG) {
                            type = NavType.IntType
                        })
                ) { backstackEntry ->
                    val projectId = backstackEntry.arguments?.getInt(Constants.PROJECT_ID_ARG) ?: -1
                    val viewModel = hiltViewModel<BottomSheetApplicationViewModel>()
                    val state = viewModel.state.collectAsState()
                    LaunchedEffect(key1 = true) {
                        viewModel.onEvent(BottomSheetApplicationEvent.OnProjectIdChange(projectId))
                    }
                    LaunchedEffect(key1 = false, block = {
                        viewModel.flow.collect() { event ->
                            when (event) {
                                is BottomSheetApplyOneTimeEvent.CloseBottomSheet -> {
                                    navController.popBackStack()
                                }

                                else -> {}
                            }
                        }
                    })
                    BottomSheetApplication(
                        state = state.value,
                        onEvent = { event ->
                            when (event) {
                                BottomSheetApplicationEvent.GoToMain -> {
                                    navController.popBackStack()
                                }

                                else -> viewModel.onEvent(event)
                            }
                        }
                    )
                }
                composable(
                    Routes.MyApplicationScreen.route
                ) {
                    val viewModel = hiltViewModel<MyApplicationViewModel>()
                    val state = viewModel.state.collectAsState()
                    LaunchedEffect(key1 = true) {
                        viewModel.onEvent(MyApplicationEvent.GetMyApplication)
                    }
                    MyApplicationScreen(
                        state = state.value,
                        onEvent = { event ->
                            when (event) {
                                else -> viewModel.onEvent(event)
                            }
                        }
                    )
                }
            }
        }
    }
}