package com.company.triviaapp.domain.repository

import com.company.triviaapp.data.model.Chapter
import com.company.triviaapp.data.model.Course
import com.company.triviaapp.data.model.QuestionAnswer

interface IFlashcardRepository {
    suspend fun getCourses(): List<Course> // List of Course
    // This should be eventually turned into taking course ID
    suspend fun getChapters(course: Course): List<Chapter> // List of Chapters for a given Course
    // This should be eventually turned into taking chapter ID
    suspend fun getQuestionAnswers(chapter: Chapter): List<QuestionAnswer> // List of Chapters for a given Course
}