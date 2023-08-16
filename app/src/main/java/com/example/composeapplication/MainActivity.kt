package com.example.composeapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composeapplication.navigation.navigate
import com.example.composeapplication.ui.theme.ComposeApplicationTheme
import com.example.core.navigation.Route
import com.example.onboarding_presentation.activity.ActivityScreen
import com.example.onboarding_presentation.age.AgeScreen
import com.example.onboarding_presentation.gender.GenderScreen
import com.example.onboarding_presentation.goal.GoalScreen
import com.example.onboarding_presentation.height.HeightScreen
import com.example.onboarding_presentation.nutrient_goal.NutrientGoalScreen
import com.example.onboarding_presentation.weight.WeightScreen
import com.example.onboarding_presentation.welcome.WelcomeScreen
import com.example.tracker_presentation.tracker_overview.TrackerOverviewScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeApplicationTheme {
                val navController = rememberNavController()
                val snackbarHostState = remember { SnackbarHostState() }
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Scaffold(
                        snackbarHost = { SnackbarHost(snackbarHostState) }
                    ) {
                        NavHost(
                            navController = navController,
                            startDestination = Route.WELCOME
                        ) {
                            composable(Route.WELCOME) {
                                WelcomeScreen(onNavigate = navController::navigate)
                            }
                            composable(Route.AGE) {
                                AgeScreen(
                                    snackbarHostState = snackbarHostState,
                                    onNavigate = navController::navigate
                                )
                            }
                            composable(Route.GENDER) {
                                GenderScreen(onNavigate = navController::navigate)
                            }
                            composable(Route.HEIGHT) {
                                HeightScreen(
                                    snackbarHostState = snackbarHostState,
                                    onNavigate = navController::navigate
                                )
                            }
                            composable(Route.WEIGHT) {
                                WeightScreen(
                                    snackbarHostState = snackbarHostState,
                                    onNavigate = navController::navigate
                                )
                            }
                            composable(Route.NUTRIENT_GOAL) {
                                NutrientGoalScreen(
                                    snackbarHostState = snackbarHostState,
                                    onNavigate = navController::navigate
                                )
                            }
                            composable(Route.ACTIVITY) {
                                ActivityScreen(onNavigate = navController::navigate)
                            }
                            composable(Route.GOAL) {
                                GoalScreen(onNavigate = navController::navigate)
                            }
                            composable(Route.TRACKER_OVERVIEW) {
                                TrackerOverviewScreen(onNavigate = navController::navigate)
                            }
                            composable(Route.SEARCH) {

                            }
                        }
                    }
                }
            }
        }
    }
}

