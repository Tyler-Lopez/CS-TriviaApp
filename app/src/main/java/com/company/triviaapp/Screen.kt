package com.company.triviaapp

sealed class Screen(val route: String) {
    object MainScreen : Screen("main_screen")
    object DataStructures01 : Screen("datastructures_01")
    object DiscreteMath01: Screen("discretemath_01")

    fun withArgs(arg: String): String {
        return buildString {
            append(route)
            append("/$arg")

        }
    }
}
