package com.company.triviaapp.presentation.view_flashcards

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.company.triviaapp.presentation.Screen
import com.company.triviaapp.presentation.select_chapter.components.ChapterListItem
import com.company.triviaapp.presentation.ui.HeaderText
import com.company.triviaapp.presentation.ui.SubHeaderText

@ExperimentalAnimationApi
@ExperimentalMaterialApi
@Composable
fun ViewFlashcardsScreen(
    navController: NavController,
    viewModel: ViewFlashcardsViewModel = hiltViewModel()
) {
    val state = viewModel.state.value
    val list = state.flashcards

    val currIndex = 0

    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)) {
            CardListItem(
                text = list[currIndex],
                currIndex = currIndex,
                listSize = list.size,
                onSwipe = {

                })
        }

    }
}
