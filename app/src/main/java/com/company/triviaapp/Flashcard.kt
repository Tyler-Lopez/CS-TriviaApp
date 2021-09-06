package com.company.triviaapp

import QuestionWithAnswer
import android.content.Context
import android.media.AudioManager
import android.view.SoundEffectConstants
import androidx.compose.foundation.*
import androidx.compose.foundation.interaction.DragInteraction
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


    var activeState = remember {
        mutableStateOf(value = 0)
    }
    var isQuestion = remember {
        mutableStateOf(value = true)
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    listOf(
                        Color(7, 21, 56),
                        Color(25, 44, 77),
                        Color(42, 12, 56),
                        Color(64, 3, 62),
                    )
                )
            ),
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
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .padding(end = 4.dp)
                            .border(
                                shape = RoundedCornerShape(10.dp),
                                width = 1.dp,
                                color = Color(198, 190, 209)
                            )
                            .shadow(elevation = 5.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(30, 30, 30)),
                        onClick = {
                            navController.navigate(Screen.MainScreen.route)
                        }) {
                        Icon(
                            Icons.Rounded.Home, contentDescription = "HOME",
                            modifier = Modifier.fillMaxSize(), tint = Color.LightGray,
                        )
                    }
                    Button(
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .padding(horizontal = 4.dp)
                            .border(
                                shape = RoundedCornerShape(10.dp),
                                width = 1.dp,
                                color = Color(198, 190, 209)
                            )
                            .shadow(elevation = 5.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(56, 35, 84)),
                        onClick = {
                            isQuestion.value = true
                            activeState.value = safeDecrement(list.value, activeState.value)
                        }) {
                        Icon(
                            Icons.Rounded.KeyboardArrowLeft, contentDescription = "BACK",
                            modifier = Modifier.fillMaxSize(), tint = Color.LightGray,
                        )
                    }
                    Button(
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .padding(start = 4.dp)
                            .border(
                                shape = RoundedCornerShape(10.dp),
                                width = 1.dp,
                                color = Color(198, 190, 209)
                            )
                            .shadow(elevation = 5.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(56, 35, 84)),
                        onClick = {
                            isQuestion.value = true
                            activeState.value = safeIncrement(list.value, activeState.value)
                        }) {
                        Icon(
                            Icons.Rounded.KeyboardArrowRight, contentDescription = "NEXT",
                            modifier = Modifier.fillMaxSize(), tint = Color.LightGray,
                        )
                    }
                }

                // Question
                val text = if (isQuestion.value)
                    list.value[activeState.value].first
                else
                    list.value[activeState.value].second
                val textColor = if (isQuestion.value)
                    Color(245, 220, 157)
                else
                    Color.White
                Card(
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(vertical = 10.dp)
                        .border(
                            shape = RoundedCornerShape(10.dp),
                            width = 1.dp,
                            color = Color(198, 190, 209)
                        )
                        .clickable { isQuestion.value = !isQuestion.value },
                    elevation = 5.dp,
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                Brush.verticalGradient(
                                    listOf(
                                        Color(21, 23, 23),
                                        Color(39, 41, 41)
                                    )
                                )
                            )
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
                                textAlign = TextAlign.Center,
                                color = textColor,
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Light,
                                fontFamily = roboto,
                                modifier = Modifier.padding(20.dp)
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