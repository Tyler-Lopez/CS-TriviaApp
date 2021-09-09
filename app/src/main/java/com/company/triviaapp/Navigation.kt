package com.company.triviaapp

import androidx.compose.animation.*
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import com.google.accompanist.navigation.animation.composable
import androidx.navigation.compose.navArgument
import com.company.triviaapp.ui.theme.ChapterSelect
import com.company.triviaapp.ui.theme.HomeScreen
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.rememberAnimatedNavController

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun Navigation() {
    val navController = rememberAnimatedNavController()
    AnimatedNavHost(navController = navController, startDestination = Screen.MainScreen.route) {
        composable(
            route = Screen.MainScreen.route,
            exitTransition = null,
            popEnterTransition = { _, _ ->
                slideInHorizontally(
                    initialOffsetX = { -1200 },
                    animationSpec = tween(400)
                ) + fadeIn(initialAlpha = 0.0f, animationSpec = tween(400))
            },
            enterTransition = { _, _ ->
                slideInHorizontally(
                    initialOffsetX = { -1200 },
                    animationSpec = tween(400)
                ) + fadeIn(initialAlpha = 0.0f, animationSpec = tween(400))
            }
        ) {
            HomeScreen(navController = navController)
        }
        composable(route = Screen.FlashCard.route + "/{listID}",
            arguments = listOf(
                navArgument("listID") {
                    type = NavType.StringType
                    defaultValue = ""
                    nullable = false
                }
            ), exitTransition = null,
            popExitTransition = null,
            popEnterTransition = { _, _ ->
                slideInHorizontally(
                    initialOffsetX = { -1200 },
                    animationSpec = tween(400)
                ) + fadeIn(initialAlpha = 0.0f, animationSpec = tween(400))
            },
            enterTransition = { _, _ ->
                slideInHorizontally(
                    initialOffsetX = { 1200 },
                    animationSpec = tween(400)
                ) + fadeIn(initialAlpha = 0.0f, animationSpec = tween(400))
            }) {
            FlashcardView(navController = navController, it.arguments?.getString("listID"))
        }
        composable(route = Screen.ChapterSelect.route + "/{categoryIndex}",
            arguments = listOf(
                navArgument("categoryIndex") {
                    type = NavType.IntType
                    defaultValue = 0
                    nullable = false
                }
            ),
            exitTransition = null,
            popExitTransition = null,
            popEnterTransition = { _, _ ->
                slideInHorizontally(
                    initialOffsetX = { -1200 },
                    animationSpec = tween(400, 100)
                ) + fadeIn(initialAlpha = 0.0f, animationSpec = tween(400))
            },
            enterTransition = { _, _ ->
                slideInHorizontally(
                    initialOffsetX = { 1200 },
                    animationSpec = tween(400, 100)
                ) + fadeIn(initialAlpha = 0.0f, animationSpec = tween(400))
            }) {
            ChapterSelect(navController = navController, it.arguments?.getInt("categoryIndex") ?: 0)
        }
    }
}