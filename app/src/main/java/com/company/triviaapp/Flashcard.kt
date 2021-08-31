package com.company.triviaapp

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Box
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FlashcardView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    listOf(Color.Black, Color(5, 5, 5))
                )
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Current Quiz Status
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(horizontal = 10.dp, vertical = 5.dp),

            elevation = 10.dp
        ) {
            Canvas(modifier = Modifier.fillMaxSize()) {
                drawRect(
                    size = size,
                    color = Color(94, 27, 35),
                )
                drawRect(
                    size = size,
                    color = Color(8, 74, 23),
                    topLeft = Offset(x = center.x, y = 0f)
                )
            }
        }
        // Question
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .requiredHeight(100.dp)
                .padding(horizontal = 10.dp, vertical = 5.dp),
            elevation = 10.dp
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(13, 45, 120))
            ) {
                Text(
                    text = retrieveRandomQuestion().first,
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(10.dp)
                )
            }
        }
        // Answer
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .requiredHeight(200.dp)
                .padding(horizontal = 10.dp, vertical = 5.dp),
            elevation = 10.dp
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(13, 45, 120))
            ) {
                Text(
                    text = retrieveRandomQuestion().second,
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(10.dp)
                )
            }
        }
    }
}