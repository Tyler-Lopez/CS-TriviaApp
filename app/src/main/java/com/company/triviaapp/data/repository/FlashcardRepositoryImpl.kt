package com.company.triviaapp.data.repository

import com.company.triviaapp.data.model.Chapter
import com.company.triviaapp.data.model.Course
import com.company.triviaapp.data.model.QuestionAnswer
import com.company.triviaapp.domain.repository.FlashcardRepository
import com.company.triviaapp.presentation.courses

class FlashcardRepositoryImpl(): FlashcardRepository {

    override suspend fun getCourses(): List<Course> {
        return courses.values.toList() // Non-ideal, but how else to retrieve from mapping?
    }

    override suspend fun getChapters(course: Course): List<Chapter> {
        return course.chapters.values.toList() // Non-ideal, but how else to retrieve from mapping?
    }

    override suspend fun getQuestionAnswers(chapter: Chapter): List<QuestionAnswer> {
        return chapter.flashcards
    }
}