package com.company.triviaapp.presentation.view_flashcards.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.company.triviaapp.presentation.theme.roboto

@Composable
fun CardIndexText(
    curr: Int,
    size: Int
) {
    Text(
        text = "${curr + 1} / ${size}", // Example: 12/45 cards
        color = MaterialTheme.colors.primary,
        fontSize = 18.sp,
        fontFamily = roboto,
        fontWeight = FontWeight.Bold,
        style = MaterialTheme.typography.h4.copy(
            shadow = Shadow(
                color = Color(0.05f, 0.05f, 0.05f, 0.1f),
                offset = Offset(4f, 4f),
                blurRadius = 2f
            )
        ),
        modifier = Modifier.padding(
            vertical = 6.dp,
            horizontal = 6.dp
        )
    )
}