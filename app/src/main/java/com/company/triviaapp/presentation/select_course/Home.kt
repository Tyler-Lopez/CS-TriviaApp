package com.company.triviaapp.presentation

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.company.triviaapp.R
import com.company.triviaapp.presentation.theme.roboto

@Composable
fun HomeScreen(navController: NavController) {


    val image = arrayOf(
        painterResource(id = R.drawable.code),
        painterResource(id = R.drawable.code1),
        painterResource(id = R.drawable.code2),
        painterResource(id = R.drawable.code3)
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
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
                    text = "Course",
                    color = MaterialTheme.colors.onBackground,
                    fontFamily = roboto,
                    fontWeight = FontWeight.Medium,
                    fontSize = 33.sp,
                    modifier = Modifier.padding(top = 15.dp)
                )
                for (i in 0..categories.lastIndex step 2) {
                    for (j in 0..1) {
                        if (categories.lastIndex < i + j) break

                        Card(
                            shape = RoundedCornerShape(12.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp)
                                .height(130.dp)
                                .border(
                                    shape = RoundedCornerShape(12.dp),
                                    width = 3.dp,
                                    color = Color(26, 29, 40, 100),
                                )
                                .clickable {
                                    navController.navigate(Screen.ChapterSelect.withArgs((i + j).toString()))
                                },

                            backgroundColor = Color.Gray,
                            elevation = 8.dp,
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(MaterialTheme.colors.surface)
                            ) {

                                Column(
                                    modifier = Modifier.fillMaxSize(),
                                    verticalArrangement = Arrangement.Bottom,
                                ) {
                                    Text(
                                        text = "${categories[i + j].first}",
                                        textAlign = TextAlign.Left,
                                        color = MaterialTheme.colors.onSurface,
                                        fontSize = 26.sp,
                                        // fontFamily = roboto,
                                        fontWeight = FontWeight.Bold,
                                        style = MaterialTheme.typography.h4.copy(
                                            shadow = Shadow(
                                                color = Color(0.1f, 0.1f, 0.1f, 0.9f),
                                                offset = Offset(4f, 4f),
                                                blurRadius = 8f
                                            )
                                        ),
                                        modifier = Modifier.padding(
                                            start = 20.dp,
                                            end = 20.dp,
                                            bottom = 2.dp
                                        )
                                    )
                                    Text(
                                        text = "${categories[i + j].second.size} ${if (categories[i + j].second.size > 1) "Chapters" else "Chapter"}",
                                        textAlign = TextAlign.Left,
                                        color = MaterialTheme.colors.primaryVariant,
                                        fontSize = 20.sp,
                                        fontFamily = roboto,
                                        fontWeight = FontWeight.Medium,
                                        style = MaterialTheme.typography.h4.copy(
                                            shadow = Shadow(
                                                color = Color(0.1f, 0.1f, 0.1f, 0.9f),
                                                offset = Offset(4f, 4f),
                                                blurRadius = 8f
                                            )
                                        ),
                                        modifier = Modifier.padding(start = 20.dp, bottom = 15.dp)
                                    )
                                }
                            }

                        }
                    }
                }
                Spacer(modifier = Modifier.height(30.dp))
            }

        }
    }
}


