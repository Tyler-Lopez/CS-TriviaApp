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
import sections

@Composable
fun ChapterSelect(navController: NavController, category: Int) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background),
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
                    text = "Chapter",
                    color = MaterialTheme.colors.onBackground,
                    fontFamily = roboto,
                    fontSize = 33.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(top = 15.dp)
                )
                Text(
                    text = categories[category].first.uppercase(),
                    color = MaterialTheme.colors.secondary,
                    fontFamily = roboto,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Light,
                    modifier = Modifier.padding(top = 2.dp, end = 10.dp, bottom = 5.dp)
                )
                for (section in categories[category].second) {
                    Card(
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 3.dp)
                            .height(150.dp)
                            .border(
                                shape = RoundedCornerShape(10.dp),
                                width = 3.dp,
                                color = Color(26,29,40, 100),
                            )
                            .clickable {
                                navController.navigate(Screen.FlashCard.withArgs(section.second))
                            },
                        elevation = 5.dp,
                    ) {
                        Box(modifier = Modifier.fillMaxSize()
                            .background(MaterialTheme.colors.surface)) {
                            Column(
                                modifier = Modifier.fillMaxSize(),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Row(horizontalArrangement = Arrangement.SpaceAround, verticalAlignment = Alignment.CenterVertically) {
                                    Text(
                                        modifier = Modifier.padding(
                                            start = 20.dp,
                                            end = 20.dp,
                                        ).weight(6f),
                                        text = section.first,
                                        textAlign = TextAlign.Center,
                                        color = MaterialTheme.colors.onSurface,
                                        fontSize = 26.sp,
                                        fontFamily = roboto,
                                        style = MaterialTheme.typography.h4.copy(
                                            shadow = Shadow(
                                                color = Color(0.1f, 0.1f, 0.1f, 0.9f),
                                                offset = Offset(4f, 4f),
                                                blurRadius = 8f
                                            )
                                        ),
                                        fontWeight = FontWeight.Medium,
                                    )
                                    Text(
                                        text = "${sections[section.second]?.size} Cards",
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
                                        modifier = Modifier.padding(horizontal = 20.dp).weight(4f)
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


