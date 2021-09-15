package com.company.triviaapp.presentation.view_flashcards

import androidx.compose.foundation.*
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material.icons.rounded.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.Shape
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
import com.company.triviaapp.presentation.view_flashcards.components.IconButton


@ExperimentalMaterialApi
@Composable
fun CardListItem(
    text: QuestionAnswer,
    currIndex: Int,
    listSize: Int,
    onSwipe: (Unit) -> Unit,
    onDecrement: (Unit) -> Unit,
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
                    // Top buttons
                    Column(
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.End,
                        modifier = Modifier.fillMaxWidth().height(50.dp)
                    ) {
                        Row(horizontalArrangement = Arrangement.SpaceEvenly) {
                            IconButton(
                                icon = Icons.Rounded.Undo,
                                description = "Revert",
                                onClick = {
                                    onDecrement(Unit)
                                })
                            IconButton(
                                icon = Icons.Rounded.Redo,
                                description = "Increment",
                                onClick = {
                                    onSwipe(Unit)
                                })
                        }
                    }
                    // NOTE!
                    // This is a hacky, terrible temporary fix
                    // For some reason(will look into) vertical drag does not work without this column being full sized
                    // It is alpha 0 so has no impact but allowing vertical to work
                    Column(
                        verticalArrangement = Arrangement.Bottom,
                        horizontalAlignment = Alignment.End,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Card(
                            modifier = Modifier.alpha(0f),
                            backgroundColor = Color(0,0,0,0),

                        ) {
                            Text(text="",modifier=Modifier.fillMaxSize())

                        }
                    }
                }
            }
        }