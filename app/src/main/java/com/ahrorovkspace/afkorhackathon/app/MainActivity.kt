package com.ahrorovkspace.afkorhackathon.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.ahrorovkspace.afkorhackathon.app.navigation.Navigation
import com.ahrorovkspace.afkorhackathon.app.navigation.NavigationViewModel
import com.ahrorovkspace.afkorhackathon.app.theme.AfkorHackathonTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AfkorHackathonTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Permissions()
                    val viewModel = hiltViewModel<NavigationViewModel>()
                    val state = viewModel.state.collectAsState()
                    Navigation(
                        navState = state.value,
                        onEvent = { event ->
                            viewModel.onEvent(event)
                        }
                    )
                }
            }
        }
    }
}