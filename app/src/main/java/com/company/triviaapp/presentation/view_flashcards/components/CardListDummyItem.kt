package com.company.triviaapp.presentation.view_flashcards

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Undo
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.company.triviaapp.presentation.view_flashcards.components.CardIndexText
import com.company.triviaapp.presentation.view_flashcards.components.CardListText
import com.company.triviaapp.presentation.view_flashcards.components.IconButton


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
                .padding(top = 5.dp, bottom = 5.dp)
                .border(
                    width = 3.dp,
                    color = Color(40, 40, 40), // Replace with theme
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

                // Top buttons
                Column(
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.End,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Row(horizontalArrangement = Arrangement.SpaceEvenly) {
                        IconButton(
                            icon = Icons.Rounded.Undo,
                            description = "Revert",
                            onClick = {
                                1
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
}

