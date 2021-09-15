package com.company.triviaapp.presentation.view_flashcards

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.company.triviaapp.data.model.QuestionAnswer
import com.company.triviaapp.domain.rememberSwipeState
import com.company.triviaapp.domain.safeDecrement
import com.company.triviaapp.domain.safeIncrement
import com.company.triviaapp.domain.swiper


@ExperimentalAnimationApi
@ExperimentalMaterialApi
@Composable
fun ViewFlashcardsScreen(
    navController: NavController,
    viewModel: ViewFlashcardsViewModel = hiltViewModel(),
) {
    val state = viewModel.state.value
    val list = state.flashcards

    var currIndex = remember {
        mutableStateOf(value = 0)
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ) {
            Box(modifier = Modifier.fillMaxSize())
            {
                CardListDummyItem(
                    text = list[safeIncrement(list.lastIndex, currIndex.value)].question,
                    safeIncrement(list.lastIndex, currIndex.value),
                    list.size
                )
                val swiped = remember { mutableStateOf(false) }

                BoxWithConstraints() {
                    val swipeState = rememberSwipeState(
                        maxWidth = constraints.maxWidth.toFloat(),
                        maxHeight = constraints.maxHeight.toFloat()
                    )
                    //       if (swiped.value.not()) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .swiper(
                                state = swipeState,
                                onDragAccepted = {
                                    swiped.value = true
                                    currIndex.value = safeIncrement(list.lastIndex, currIndex.value)
                                },
                            ),
                    ) {
                        CardListItem(
                            text = list[currIndex.value],
                            currIndex = currIndex.value,
                            listSize = list.size,
                            onSwipe = {
                                currIndex.value = safeIncrement(list.lastIndex, currIndex.value)
                            },
                            onDecrement = {
                                currIndex.value = safeDecrement(list.lastIndex, currIndex.value)
                            })
                    }
                }
            }
        }
    }
}
