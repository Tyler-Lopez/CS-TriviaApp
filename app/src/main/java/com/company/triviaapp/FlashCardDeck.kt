package com.company.triviaapp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.zIndex

// https://medium.com/geekculture/part-2-ui-widgets-from-scratch-in-jetpack-compose-742a3342321b

data class FlippableCard(
    val index: Int,
    val frontVal: String,
    val backVal: String,
    val frontLang: String = "English",
    val backLang: String = "English"
)

// private val colors = arrayOf(primaryColor, secondaryColor, tertiaryColor) Likely unnecessary

private fun calculateScale(idx: Int): Float {
    return 1f - idx * (1f / 10f)
}

private fun calculateOffset(idx: Int): Int {
    return (10f * (idx + 1)).toInt() // Padding offset
}

@Composable
fun FlippableCardDeck(
    current: Int,
    visible: Int,
    dataSource: List<FlippableCard>
) {
    val topCard = 0
    val count = dataSource.size
    val visibleCards: Int = StrictMath.min(
        visible,
        dataSource.size - current
    ) // https://developer.android.com/reference/java/lang/StrictMath

    Box(Modifier.fillMaxSize()) {
        repeat(visibleCards) { idx ->
            val index = current + idx
            val card = dataSource[index]
            val data = card.frontVal
            val zIndex = 100f - idx
            val scaleX = calculateScale(idx)
            val offsetY = calculateOffset(idx)
            val cardModifier = Modifier
                .scale(scaleX, 1f)
                .offset { IntOffset(0, offsetY) }
                .align(Alignment.TopCenter)
                .zIndex(zIndex)
        }
    }
}