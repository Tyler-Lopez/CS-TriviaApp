package com.company.triviaapp.presentation.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.company.triviaapp.presentation.theme.roboto

@Composable
fun SubHeaderText(text: String) {
    Text(
        text = text.uppercase(),
        color = MaterialTheme.colors.secondary,
        fontFamily = roboto,
        fontSize = 25.sp,
        fontWeight = FontWeight.Light,
        modifier = Modifier.padding(top = 2.dp, end = 10.dp, bottom = 5.dp)
    )
}