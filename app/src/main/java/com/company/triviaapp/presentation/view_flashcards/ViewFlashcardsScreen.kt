package com.company.triviaapp.presentation.view_flashcards

import android.speech.SpeechRecognizer
import android.transition.Fade
import androidx.compose.animation.*
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.company.triviaapp.data.model.QuestionAnswer
import com.company.triviaapp.domain.*


@ExperimentalAnimationApi
@ExperimentalMaterialApi
@Composable
fun ViewFlashcardsScreen(
    navController: NavController,
    speechHelper: SpeechHelper,
    viewModel: ViewFlashcardsViewModel = hiltViewModel(),
) {
    val state = viewModel.state.value
    val list = rememberSaveable { state.flashcards.shuffled() }

    var currIndex = rememberSaveable {
        mutableStateOf(value = 0)
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    )
    {
        val isQuestion = rememberSaveable { mutableStateOf(true) }
        val speechOn = rememberSaveable { mutableStateOf(value = false) }

        CardListDummyItem(
            text = list[safeIncrement(list.lastIndex, currIndex.value)].question,
            safeIncrement(list.lastIndex, currIndex.value),
            list.size,
            speechOn.value
        )

        BoxWithConstraints() {
            val swipeState = rememberSwipeState(
                maxWidth = constraints.maxWidth.toFloat(),
                maxHeight = constraints.maxHeight.toFloat()
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .swiper(
                        state = swipeState,
                        onDragAccepted = {
                            currIndex.value = safeIncrement(list.lastIndex, currIndex.value)
                            isQuestion.value =
                                true // Ensures the new card will appear as a question, not an answer
                        },
                    ),
            ) {
                    CardListItem(
                        questionAnswer = list[currIndex.value],
                        currIndex = currIndex.value,
                        listSize = list.size,
                        isQuestion = isQuestion.value,
                        speechHelper = speechHelper,
                        speechOn = speechOn.value,
                        onSpeechChange = {
                            speechOn.value = !speechOn.value
                        },
                        onFlip = {
                            isQuestion.value = !isQuestion.value
                        },
                        onDecrement = {
                            currIndex.value = safeDecrement(list.lastIndex, currIndex.value)
                        })
                }
        }
    }

}

