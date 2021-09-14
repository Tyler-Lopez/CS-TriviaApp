package com.company.triviaapp.presentation

sealed class Screen(val route: String) {
    object MainScreen : Screen("main_screen")
    object FlashCard : Screen("flashcard")
    object ChapterSelect : Screen("chapter_select")
    object Settings : Screen("settings")
    object Search : Screen("search")

    // Invoked to pass string arguments(section key) to screens
    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg -> append("/$arg")}
        }
    }
}
