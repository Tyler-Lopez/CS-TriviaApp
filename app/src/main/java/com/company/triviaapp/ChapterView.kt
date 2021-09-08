package com.company.triviaapp.ui.theme

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import categories
import com.company.triviaapp.R
import com.company.triviaapp.Screen

@Composable
fun ChapterSelect(navController: NavController, category: Int) {
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
        verticalArrangement = Arrangement.Top
    ) {
        // Current Quiz Status
        Box(modifier = Modifier.padding(horizontal = 20.dp)) {
            Column(
                //  verticalArrangement = Arrangement.Center,
                //  horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(state = rememberScrollState())
            ) {
                Text(
                    text = "Section Selection",
                    color = Color(240, 230, 255),
                    fontFamily = roboto,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Light,
                    modifier = Modifier.padding(top = 15.dp)
                )
                Text(
                    text = categories[category].first.uppercase(),
                    color = Color.LightGray,
                    fontFamily = roboto,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Thin,
                    modifier = Modifier.padding(top = 2.dp, end = 10.dp, bottom = 5.dp)
                )
                for (section in categories[category].second) {
                    Card(
                     //   shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 3.dp)
                            .height(75.dp)
                            .border(
                            //    shape = RoundedCornerShape(10.dp),
                                width = 2.dp,
                                color = Color(0.4f, 0.4f, 0.4f, 0.4f)
                            )
                            .clickable {
                                navController.navigate(Screen.FlashCard.withArgs(section.second))
                            },
                        elevation = 5.dp,
                    ) {
                        Box(modifier = Modifier.fillMaxSize().background(
                            Brush.verticalGradient(listOf(
                                Color(21, 23, 23),
                                Color(39, 41, 41)
                            ))
                        )) {
                            Column(
                                modifier = Modifier.fillMaxSize(),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    modifier = Modifier
                                        .padding(10.dp),
                                    text = section.first,
                                    textAlign = TextAlign.Center,
                                    color = Color(245, 220, 157),
                                    fontSize = 22.sp,
                                    fontFamily = roboto,
                                    style = MaterialTheme.typography.h4.copy(
                                        shadow = Shadow(
                                            color = Color(0.1f, 0.1f, 0.1f, 0.9f),
                                            offset = Offset(4f, 4f),
                                            blurRadius = 8f
                                        )
                                    ),
                                    fontWeight = FontWeight.Light,

                                )
                            }
                        }
                    }
                }
            }
        }
    }
}


