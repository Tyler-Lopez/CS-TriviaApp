package com.company.triviaapp.presentation.select_chapter.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.company.triviaapp.data.model.Chapter
import com.company.triviaapp.data.model.Course
import com.company.triviaapp.presentation.theme.roboto

@Composable
fun ChapterListItem(
    chapter: Chapter,
    onItemClick: (Chapter) -> Unit
) {
    Card(
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 3.dp)
            .height(150.dp)
            .border(
                shape = RoundedCornerShape(10.dp),
                width = 3.dp,
                color = Color(26, 29, 40, 100),
            )
            .clickable {
                onItemClick(chapter)
                //  navController.navigate(Screen.FlashCard.withArgs(section.second))
            },
        elevation = 5.dp,
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.surface)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        modifier = Modifier
                            .padding(
                                start = 20.dp,
                                end = 20.dp,
                            )
                            .weight(6f),
                        text = chapter.name,
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
                        text = "${chapter.flashcards.size} Cards",
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
                        modifier = Modifier
                            .padding(horizontal = 20.dp)
                            .weight(4f)
                    )
                }
            }
        }
    }
}