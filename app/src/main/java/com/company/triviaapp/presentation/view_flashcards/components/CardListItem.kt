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
import com.company.triviaapp.domain.SpeechHelper
import com.company.triviaapp.domain.rememberSwipeState
import com.company.triviaapp.domain.swiper
import com.company.triviaapp.presentation.theme.roboto
import com.company.triviaapp.presentation.view_flashcards.components.CardIndexText
import com.company.triviaapp.presentation.view_flashcards.components.CardListText
import com.company.triviaapp.presentation.view_flashcards.components.IconButton


@ExperimentalMaterialApi
@Composable
fun CardListItem(
    questionAnswer: QuestionAnswer,
    currIndex: Int,
    listSize: Int,
    isQuestion: Boolean,
    speechHelper: SpeechHelper,
    speechOn: Boolean,
    onSpeechChange: (Unit) -> Unit,
    onFlip: (Unit) -> Unit,
    onDecrement: (Unit) -> Unit,
) {
    // Used to remove clickable effect https://stackoverflow.com/questions/66703448/how-to-disable-ripple-effect-when-clicking-in-jetpack-compose
    val interactionSource = remember { MutableInteractionSource() }


    // Some variables based on if it is or is not a question
    val text = if (isQuestion)
        questionAnswer.question // Question Text
    else
        questionAnswer.answer // Answer Text
    val textColor = if (isQuestion)
        MaterialTheme.colors.onSurface
    else
        MaterialTheme.colors.onSecondary
    val textSize = if (isQuestion)
        30
    else
        24

    val textToSpeech = if (isQuestion) {
        if (questionAnswer.questionTts != "") {
            questionAnswer.questionTts
        } else questionAnswer.question
    } else {
        if (questionAnswer.answerTts != "") {
            questionAnswer.answerTts
        } else questionAnswer.answer
    }
    if (speechOn) speechHelper.talk(textToSpeech)


    /*

     Swipe implementation experiment

     If an animation is running, and that animation's target value is NOT the 0 initial spot, then progress to next card

     */

    Card(
        modifier = Modifier
            .padding(top = 5.dp, bottom = 5.dp)
            .border(
                width = 3.dp,
                color = Color(40, 40, 40), // Replace with theme
            )
            .clickable(
                interactionSource = interactionSource,
                indication = null
            ) { onFlip(Unit) },
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
                    textSize,
                    textColor
                )
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
                    backgroundColor = Color(0, 0, 0, 0),

                    ) {
                    Text(text = "", modifier = Modifier.fillMaxSize())

                }
            }

            // Top buttons
            Column(
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.End,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row(horizontalArrangement = Arrangement.SpaceEvenly) {
                    IconButton(
                        icon = if (speechOn) Icons.Rounded.VolumeUp else Icons.Rounded.VolumeMute,
                        description = "TTS",
                        onClick = {
                            onSpeechChange(Unit)
                        },
                        background =
                        if (speechOn)
                            ButtonDefaults.buttonColors(backgroundColor = Color(67, 110, 45))
                        else
                            ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.background)
                    )
                    IconButton(
                        icon = Icons.Rounded.Undo,
                        description = "Revert",
                        onClick = {
                            onDecrement(Unit)
                            if (!isQuestion) onFlip(Unit) // Fix to revert not reverting to question first
                        })
                }
            }
            Column(
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.End,
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Row(horizontalArrangement = Arrangement.SpaceEvenly) {
                    CardIndexText(curr = currIndex, size = listSize)
                }
            }
        }
    }
}