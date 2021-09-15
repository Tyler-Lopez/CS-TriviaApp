package com.company.triviaapp.presentation.view_flashcards.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Edit
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.company.triviaapp.presentation.Screen

@Composable
fun IconButton(icon: ImageVector, description: String, onClick: () -> Unit) {
    Button(
        modifier = Modifier
            .fillMaxHeight()
            .padding(end = 4.dp)
            .border(
                width = 3.dp,
                color = Color(26, 29, 40, 100),
            )
            .shadow(elevation = 5.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface),
        onClick = {
            onClick()
        }) {
        Icon(
            imageVector = icon,
            contentDescription = description,
            //modifier = Modifier.fillMaxSize(),
            tint = MaterialTheme.colors.onSurface,
        )
    }
}