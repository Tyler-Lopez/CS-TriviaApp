package com.company.triviaapp.presentation.view_flashcards

import com.company.triviaapp.data.model.Chapter
import com.company.triviaapp.data.model.QuestionAnswer

data class ViewFlashcardsState(
    val isLoading: Boolean = false,
    val flashcards: List<QuestionAnswer> = emptyList(),
    val error: String = "" // Potential error
)
