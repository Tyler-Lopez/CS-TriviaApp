package com.company.triviaapp.domain.repository

import com.company.triviaapp.data.model.Chapter
import com.company.triviaapp.data.model.Course

interface FlashcardRepository {
    suspend fun getCourses(): List<Course> // List of Course
    suspend fun getChapter(courseId: String): List<Chapter> // List of Chapters for a given courseId
    suspend fun getChapters(course: Course): List<Chapter> // List of Chapters for a given Course
}