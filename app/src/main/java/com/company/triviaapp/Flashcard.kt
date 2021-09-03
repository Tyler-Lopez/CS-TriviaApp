package com.company.triviaapp

import QuestionWithAnswer
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Box
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import categories
import com.company.triviaapp.datastructures.DataStructures
import com.company.triviaapp.discretemath.DiscreteMath

@Composable
fun FlashcardView(navController: NavController, listID: String?) {
    val list = remember {
        mutableStateOf(value = categories[listID]?.shuffled() ?: DataStructures().chapterOne.shuffled())
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
                    listOf(Color(85, 85, 85), Color(75, 75, 75))
                )
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Current Quiz Status


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(75.dp)
                .padding(top = 10.dp)
                .padding(horizontal = 15.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .padding(horizontal = 8.dp)
                    .shadow(elevation = 15.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(36, 36, 36)),
                onClick = {
                    isQuestion.value = true
                    activeState.value = safeDecrement(list.value, activeState.value)
                }) {
                Text(
                    text = "BACK",
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                    color = Color(232, 200, 104)
                )
            }
            Button(
                modifier = Modifier
                    .weight(0.5f)
                    .fillMaxHeight()
                    .shadow(elevation = 15.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(49, 49, 49)),
                onClick = {
                    navController.navigate(Screen.MainScreen.route)
                }) {
                Text(
                    text = "⌂",
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                    color = Color(155, 155, 155)
                )
            }
            Button(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .padding(horizontal = 8.dp)
                    .shadow(elevation = 15.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(35, 91, 32)),
                onClick = {
                    isQuestion.value = true
                    activeState.value = safeIncrement(list.value, activeState.value)
                }) {
                Text(
                    text = "NEXT",
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                    color = Color(67, 194, 67)
                )
            }
        }

        // Question
        val text = if (isQuestion.value)
            list.value[activeState.value].question
        else
            list.value[activeState.value].answer
        val textColor = if (isQuestion.value)
            Color(227, 192, 95)
        else
            Color.White
        Card(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp, vertical = 20.dp)
                .clickable { isQuestion.value = !isQuestion.value },
            elevation = 10.dp,
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .background(
                        Brush.verticalGradient(
                            listOf(Color(55, 55, 55), Color(45, 45, 45))
                        )
                    )
            ) {
                Text(
                    text = text,
                    textAlign = TextAlign.Center,
                    color = textColor,
                    fontSize = 25.sp,
                    modifier = Modifier.padding(20.dp)
                )
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