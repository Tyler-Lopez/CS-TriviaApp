package com.company.triviaapp.presentation.view_flashcards

import androidx.compose.foundation.*
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.company.triviaapp.data.model.QuestionAnswer
import com.company.triviaapp.domain.rememberSwipeState
import com.company.triviaapp.domain.swiper
import com.company.triviaapp.presentation.theme.roboto
import com.company.triviaapp.presentation.view_flashcards.components.CardIndexText
import com.company.triviaapp.presentation.view_flashcards.components.CardListText


@ExperimentalMaterialApi
@Composable
fun CardListItem(
    text: QuestionAnswer,
    currIndex: Int,
    listSize: Int,
    onSwipe: (Unit) -> Unit
) {
    // Used to remove clickable effect https://stackoverflow.com/questions/66703448/how-to-disable-ripple-effect-when-clicking-in-jetpack-compose
    val interactionSource = remember { MutableInteractionSource() }

    var isQuestion = remember { mutableStateOf(value = true) }

    // Some variables based on if it is or is not a question
    val text = if (isQuestion.value)
        text.question // Question Text
    else
        text.answer // Answer Text
    val textColor = if (isQuestion.value)
        MaterialTheme.colors.onSurface
    else
        MaterialTheme.colors.onSecondary
    val fontWeight = if (isQuestion.value)
        FontWeight.Medium
    else
        FontWeight.Medium


    /*

     Swipe implementation experiment

     If an animation is running, and that animation's target value is NOT the 0 initial spot, then progress to next card

     */
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
                            onSwipe(Unit)
                        },
                    ),
            ) {
                Card(
                    modifier = Modifier
                        .padding(top = 10.dp, bottom = 20.dp)
                        .clickable(
                            interactionSource = interactionSource,
                            indication = null
                        ) { isQuestion.value = !isQuestion.value },
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(MaterialTheme.colors.surface)
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .fillMaxSize()
                                .verticalScroll(rememberScrollState())
                        ) {
                            CardListText(
                                text,
                                textColor
                            )
                        }
                        Column(
                            verticalArrangement = Arrangement.Bottom,
                            horizontalAlignment = Alignment.End,
                            modifier = Modifier.fillMaxSize()
                        ) {
                            Card(
                                shape = RoundedCornerShape(12.dp),
                                backgroundColor = MaterialTheme.colors.background,
                                modifier = Modifier
                                    .padding(10.dp),
                            ) {
                                CardIndexText(
                                    currIndex,
                                    listSize
                                )
                            }
                        }
                    }
                }
      //      }
        }
    }
}