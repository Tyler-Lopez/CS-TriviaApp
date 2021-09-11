package com.company.triviaapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    background = Black900,
    onBackground = White50,
    primary = Black700,
    onPrimary = White500,
    primaryVariant = Blurple200,
    secondary = Teal700,
    secondaryVariant = Color(20, 20, 20),
    onSecondary = Teal700,
    surface = Purplish900,
    onSurface = White50,
    )

private val LightColorPalette = lightColors(
    background = White100,
    onBackground = Black900,
    primary = Green900,
    onPrimary = White50,
    primaryVariant = NeonGreen,
    secondary = Black700,
    secondaryVariant = Color(50, 50, 50),
    onSecondary = White200,
    surface = Green900,
    onSurface = White50,

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun TriviaAppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    // Determine which color palette to use based on boolean
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}