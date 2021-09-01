package com.company.triviaapp

sealed class Screen(val route: String) {
    object MainScreen : Screen("main_screen")
    object FlashScreen : Screen("flash_screen")
}
