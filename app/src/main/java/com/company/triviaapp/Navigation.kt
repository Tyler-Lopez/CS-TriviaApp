package com.company.triviaapp

import QuestionWithAnswer
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.company.triviaapp.ui.theme.HomeScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {
        composable(route = Screen.MainScreen.route) {
            HomeScreen(navController = navController)
        }
        composable(route = Screen.FlashScreen.route + "/{list}",
        arguments = listOf(navArgument("list") {
            type = NavType.ParcelableType(List::class.java)
        })) {
            entry -> FlashcardView(navController = navController,
            entry.arguments?.get("list")!! as List<QuestionWithAnswer>)
        }
    }
}