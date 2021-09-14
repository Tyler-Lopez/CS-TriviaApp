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
import com.company.triviaapp.presentation.Screen
import com.company.triviaapp.presentation.select_chapter.components.ChapterListItem
import com.company.triviaapp.presentation.select_course.components.CourseListItem
import com.company.triviaapp.presentation.ui.HeaderText
import com.company.triviaapp.presentation.ui.SubheaderText

@Composable
fun ChapterListScreen(
    navController: NavController,
    viewModel: ChapterSelectViewModel = hiltViewModel()
) {
    println(viewModel.state.value)
    val state = viewModel.state.value
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            HeaderText("Chapter")
            SubheaderText(text = "Choose a Flashcard Deck")
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                items(state.chapters) { chapter ->
                    ChapterListItem(
                        chapter = chapter,
                        onItemClick = {
                            navController.navigate(Screen.FlashCard.withArgs(it.name))
                        })
                }
            }
            if (state.error.isNotBlank()) {
                // If there is an error, do something
            }
            if (state.isLoading) {
                // If we are still loading data, do something
            }

        }
    }
}