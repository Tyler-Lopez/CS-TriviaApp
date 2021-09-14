package com.company.triviaapp.domain.repository

import com.company.triviaapp.data.model.Chapter
import com.company.triviaapp.data.model.Course

interface FlashcardRepository {
    suspend fun getCourses(): List<Course> // List of Course
    suspend fun getChapters(course: Course): List<Chapter> // List of Chapters for a given Course
    suspend fun getFlashcardsByChapter(chapterId: String): List<Pair<String, String>> // List of Question / Answer
}