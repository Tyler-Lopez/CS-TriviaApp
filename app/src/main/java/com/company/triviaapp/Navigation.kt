package com.company.triviaapp

import Difficulty
import QuestionWithAnswer
import android.provider.ContactsContract
import androidx.compose.runtime.Composable
import androidx.fragment.app.FragmentManager
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.company.triviaapp.datastructures.DataStructures
import com.company.triviaapp.discretemath.DiscreteMath
import com.company.triviaapp.ui.theme.HomeScreen
import com.google.gson.Gson

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {
        composable(route = Screen.MainScreen.route) {
            HomeScreen(navController = navController)
        }
        composable(route = Screen.DataStructures01.route) {
            FlashcardView(navController = navController, DataStructures().chapterOne)
        }
        composable(route = Screen.DiscreteMath01.route) {
            FlashcardView(navController = navController, DiscreteMath().chapterOne)
        }
    }
}