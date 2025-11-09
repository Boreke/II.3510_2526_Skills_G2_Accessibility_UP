package com.example.unfinished_project_presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.unfinished_project_presentation.HomeScreen
import com.example.unfinished_project_presentation.interactions.TouchTargetAndContrastExercise
import com.example.unfinished_project_presentation.semantics.LabeledIconsExercise
import com.example.unfinished_project_presentation.useranderror.AccessibleDialogExercise


sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Interaction : Screen("touch_target_and_contrast_exercise")

    object Semeantics : Screen("icon_exercise")
    object User : Screen("accessible_dialog_exercise")
}

@Composable
fun AppNavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) {
            HomeScreen(onNavigateToInteraction = { navController.navigate(Screen.Interaction.route) },
                onNavigateToSemantics = { navController.navigate(Screen.Semeantics.route)},
                onNavigateToUser = { navController.navigate(Screen.User.route)}
            )
        }
        composable(Screen.Interaction.route) {
            TouchTargetAndContrastExercise()
        }
        composable(Screen.Semeantics.route) {
            LabeledIconsExercise()
        }
        composable(Screen.User.route) {
            AccessibleDialogExercise()
        }
    }
}

