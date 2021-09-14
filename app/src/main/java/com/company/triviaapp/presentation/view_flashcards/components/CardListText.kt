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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.company.triviaapp.presentation.theme.roboto

@Composable
fun CardListText(text: String, textColor: Color) {
    Text(
        text = text,
        color = textColor,
        fontSize = 28.sp,
        fontWeight = FontWeight.Medium,
        fontFamily = roboto,
        modifier = Modifier.padding(20.dp),
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.h4.copy(
            shadow = Shadow(
                color = Color(0.1f, 0.1f, 0.1f, 0.7f),
                offset = Offset(3f, 3f),
                blurRadius = 5f
            )
        ),
    )
}