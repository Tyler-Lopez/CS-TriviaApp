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
fun CardListDummyItem(
    text: String,
    currIndex: Int,
    listSize: Int,
) {

            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Card(
                    modifier = Modifier
                        .padding(top = 10.dp, bottom = 20.dp)
                        .border(
                            width = 3.dp,
                            color = Color(26, 29, 40, 100),
                        ),
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
                            CardListText(
                                text,
                                Color.White
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
            }
        }

