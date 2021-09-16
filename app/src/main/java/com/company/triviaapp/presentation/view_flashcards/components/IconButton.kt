package com.company.triviaapp.presentation.view_flashcards.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
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
fun IconButton(icon: ImageVector, description: String, onClick: () -> Unit, background: ButtonColors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.background)) {
    Button(
        shape = RoundedCornerShape(30.dp),
        modifier = Modifier
            .offset(x = (-3).dp, y = (10).dp)
            .padding(horizontal = 3.dp)
            .height(50.dp),
         //   .shadow(elevation = 5.dp),
        colors = background,
        onClick = {
            onClick()
        }) {
        Icon(
            imageVector = icon,
            modifier = Modifier.height(50.dp),
            contentDescription = description,
            //modifier = Modifier.fillMaxSize(),
            tint = MaterialTheme.colors.onBackground,
        )
    }
}