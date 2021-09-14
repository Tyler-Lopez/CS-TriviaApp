package com.company.triviaapp.presentation.select_chapter

import com.company.triviaapp.data.model.Chapter

data class ChapterListState(
    val isLoading: Boolean = false,
    val chapters: List<Chapter> = emptyList(),
    val courseName: String = "",
    val error: String = "" // Potential error
)
