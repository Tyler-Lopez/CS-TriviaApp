package com.company.triviaapp.data.repository

import com.company.triviaapp.data.model.Chapter
import com.company.triviaapp.data.model.Course
import com.company.triviaapp.data.model.QuestionAnswer
import com.company.triviaapp.domain.repository.FlashcardRepository
import com.company.triviaapp.presentation.tempCourseMap

class FlashcardRepositoryImpl(): FlashcardRepository {

    override suspend fun getCourses(): List<Course> {
        return tempCourseMap.values.toList() // Extremely temporary, this is very bad
    }

    override suspend fun getChapters(course: Course): List<Chapter> {
        return course.chapters
    }

    override suspend fun getQuestionAnswers(chapter: Chapter): List<QuestionAnswer> {
        return chapter.flashcards
    }
}