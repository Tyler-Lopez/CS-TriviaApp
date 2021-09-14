package com.company.triviaapp.data.repository

import com.company.triviaapp.data.model.Chapter
import com.company.triviaapp.data.model.Course
import com.company.triviaapp.domain.repository.FlashcardRepository
import com.company.triviaapp.presentation.courses
import com.company.triviaapp.presentation.sections

class FlashcardRepositoryImpl(): FlashcardRepository {

    override suspend fun getCourses(): List<Course> {
        return courses
    }

    override suspend fun getChapters(course: Course): List<Chapter> {
        return course.chapters
    }

    override suspend fun getFlashcardsByChapter(chapterId: String): List<Pair<String, String>> {
        return sections[chapterId] ?: listOf(Pair("Invalid", "Invalid"))
    }
}