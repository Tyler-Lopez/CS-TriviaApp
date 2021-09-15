package com.company.triviaapp.presentation.settings

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.company.triviaapp.presentation.Screen
import com.company.triviaapp.presentation.select_course.components.CourseListItem
import com.company.triviaapp.presentation.ui.HeaderText
import com.company.triviaapp.presentation.ui.SubHeaderText

@Composable
fun SettingsScreen(
    navController: NavController,
    onToggleTheme: () -> (Unit)
) {
  //  val state = viewModel.state.value
    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)) {
            HeaderText("Settings")
            SubHeaderText(text = "Coming Soon")
            Button(
                onClick = {
                    onToggleTheme()
                }, colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
            ) {
                Text(
                    text = "Toggle Dark Mode", fontSize = 25.sp, color = MaterialTheme.colors.onSurface,
                )
            }
        }
    }
}