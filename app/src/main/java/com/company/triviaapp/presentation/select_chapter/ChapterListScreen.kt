package com.company.triviaapp.presentation.select_chapter

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
import androidx.navigation.compose.navArgument
import com.company.triviaapp.presentation.Screen
import com.company.triviaapp.presentation.select_chapter.components.ChapterListItem
import com.company.triviaapp.presentation.select_course.CourseSelectViewModel
import com.company.triviaapp.presentation.select_course.components.CourseListItem
import com.company.triviaapp.presentation.ui.HeaderText
import com.company.triviaapp.presentation.ui.SubHeaderText

@Composable
fun ChapterListScreen(
    navController: NavController,
    viewModel: ChapterSelectViewModel = hiltViewModel()
) {
    val state = viewModel.state.value
    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ) {
            item {
                HeaderText("Chapter")
                SubHeaderText(state.courseName)
            }
            items(state.chapters) { chapter ->
                ChapterListItem(
                    chapter = chapter,
                    navController = navController,
                    onItemClick = {
                        navController.navigate(Screen.FlashCard.route + "/${state.courseName}/${chapter.name}")
                    })
            }
        }
    }
}
