package com.company.triviaapp.presentation.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.company.triviaapp.presentation.categories
import com.company.triviaapp.presentation.theme.roboto

@Composable
fun HeaderText(text: String) {
    Text(
        text = text,
        color = MaterialTheme.colors.onBackground,
        fontFamily = roboto,
        fontSize = 33.sp,
        fontWeight = FontWeight.Medium,
        modifier = Modifier.padding(top = 15.dp)
    )
}