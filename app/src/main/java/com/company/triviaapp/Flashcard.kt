package com.company.triviaapp

import android.content.Context
import android.media.AudioManager
import android.view.SoundEffectConstants
import androidx.compose.foundation.*
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.KeyboardArrowLeft
import androidx.compose.material.icons.rounded.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import categories
import com.company.triviaapp.datastructures.DataStructures
import com.company.triviaapp.ui.theme.roboto
import sections


@Composable
fun FlashcardView(navController: NavController, listID: String?) {

    val list = remember {
        mutableStateOf(
            value = sections[listID]?.shuffled() ?: DataStructures().chapterOne.shuffled()
        )
    }
    // Used to remove clickable effect https://stackoverflow.com/questions/66703448/how-to-disable-ripple-effect-when-clicking-in-jetpack-compose
    val interactionSource = remember { MutableInteractionSource() }


    var activeState = remember {
        mutableStateOf(value = 0)
    }
    var isQuestion = remember {
        mutableStateOf(value = true)
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Current Quiz Status

        Box(modifier = Modifier.padding(horizontal = 20.dp)) {
            Column() {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(75.dp)
                        .padding(top = 15.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                //        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .padding(end = 4.dp)
                            .border(
                          //      shape = RoundedCornerShape(12.dp),
                                width = 3.dp,
                                color = Color(26,29,40, 100),
                            )
                            .shadow(elevation = 5.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface),
                        onClick = {
                            navController.navigate(Screen.MainScreen.route)
                        }) {
                        Icon(
                            Icons.Rounded.Home, contentDescription = "HOME",
                            modifier = Modifier.fillMaxSize(), tint = MaterialTheme.colors.onSurface,
                        )
                    }
                    Button(
              //          shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .padding(horizontal = 4.dp)
                            .border(
                           //     shape = RoundedCornerShape(12.dp),
                                width = 3.dp,
                                color = Color(26,29,40, 100),
                            )
                            .shadow(elevation = 5.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.secondaryVariant),
                        onClick = {
                            isQuestion.value = true
                            activeState.value = safeDecrement(list.value, activeState.value)
                        }) {
                        Icon(
                            Icons.Rounded.KeyboardArrowLeft, contentDescription = "BACK",
                            modifier = Modifier.size(160.dp), tint = MaterialTheme.colors.onSecondary,
                        )
                    }
                    Button(
             //           shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .padding(start = 4.dp)
                            .border(
                          //      shape = RoundedCornerShape(12.dp),
                                width = 3.dp,
                                color = Color(26,29,40, 100),
                            )
                            .shadow(elevation = 5.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.secondaryVariant),
                        onClick = {
                            isQuestion.value = true
                            activeState.value = safeIncrement(list.value, activeState.value)
                        }) {
                        Icon(
                            Icons.Rounded.KeyboardArrowRight, contentDescription = "NEXT",
                            modifier = Modifier.fillMaxSize(), tint = MaterialTheme.colors.onSecondary,
                        )
                    }
                }

                // Question
                val text = if (isQuestion.value)
                    list.value[activeState.value].first
                else
                    list.value[activeState.value].second
                val textColor = if (isQuestion.value)
                    MaterialTheme.colors.onSurface
                else
                    MaterialTheme.colors.onSecondary
                val fontWeight = if (isQuestion.value)
                    FontWeight.Medium
                else
                    FontWeight.Medium
                Card(
               //     shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 10.dp, bottom = 20.dp)
                        .border(
                       //     shape = RoundedCornerShape(12.dp),
                            width = 3.dp,
                            color = Color(26,29,40, 100),
                        )
                        .clickable(interactionSource = interactionSource, indication = null) { isQuestion.value = !isQuestion.value },
                    elevation = 5.dp,
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
                            Text(
                                text = text,
                                color = textColor,
                                fontSize = 28.sp,
                                fontWeight = fontWeight,
                                fontFamily = roboto,
                                modifier = Modifier.padding(20.dp),
                                textAlign = TextAlign.Center,
                                style = MaterialTheme.typography.h4.copy(
                                    shadow = Shadow(
                                        color = Color(0.1f, 0.1f, 0.1f, 0.7f),
                                        offset = Offset(3f, 3f),
                                        blurRadius = 5f
                                    )
                                ),
                            )
                        }
                        Column(
                            verticalArrangement = Arrangement.Bottom,
                            horizontalAlignment = Alignment.End,
                            modifier = Modifier.fillMaxSize()
                        ) {
                            Text(
                                text = "${activeState.value + 1} / ${list.value.lastIndex + 1}",
                                color = MaterialTheme.colors.primaryVariant,
                                fontSize = 18.sp,
                                fontFamily = roboto,
                                fontWeight = FontWeight.Medium,
                                style = MaterialTheme.typography.h4.copy(
                                    shadow = Shadow(
                                        color = Color(0.1f, 0.1f, 0.1f, 0.3f),
                                        offset = Offset(4f, 4f),
                                        blurRadius = 8f
                                    )
                                ),
                            modifier = Modifier.padding(vertical = 10.dp, horizontal = 15.dp)
                            )
                        }
                    }
                }
            }
        }
    }

}


fun safeIncrement(array: List<Any>, currentIndex: Int): Int {
    return when (currentIndex) {
        array.lastIndex -> 0
        else -> currentIndex + 1
    }
}

fun safeDecrement(array: List<Any>, currentIndex: Int): Int {
    return when (currentIndex) {
        0 -> array.lastIndex
        else -> currentIndex - 1
    }
}