package com.company.triviaapp.presentation.select_course

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.company.triviaapp.presentation.Screen
import com.company.triviaapp.presentation.select_course.components.CourseListItem
import com.company.triviaapp.presentation.ui.HeaderText

@Composable
fun CourseListScreen(
    navController: NavController,
    viewModel: CourseSelectViewModel = hiltViewModel()
) {
    val state = viewModel.state.value
    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ) {
            item {
                HeaderText("Course")
            }
            items(state.courses) { course ->
                CourseListItem(
                    course = course,
                    onItemClick = {
                        navController.navigate(Screen.ChapterSelect.route + "/${course.name}")
                    })
            }
        }
    }
}
