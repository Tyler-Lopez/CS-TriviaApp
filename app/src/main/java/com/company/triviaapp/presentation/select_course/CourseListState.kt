package com.company.triviaapp.presentation.select_course

import com.company.triviaapp.data.model.Course

data class CourseListState(
    val isLoading: Boolean = false,
    val courses: List<Course> = emptyList(),
    val error: String = "" // Potential error
)
