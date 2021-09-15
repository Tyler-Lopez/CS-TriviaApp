package com.company.triviaapp.data.model

data class Course(
    val name: String,
    val chapters: Map<String, Chapter>
)
