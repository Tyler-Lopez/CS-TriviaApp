package com.company.triviaapp.data.repository

import com.company.triviaapp.data.model.Chapter
import com.company.triviaapp.data.model.Course
import com.company.triviaapp.domain.repository.FlashcardRepository
import com.company.triviaapp.presentation.courses
import com.company.triviaapp.presentation.sections

class FlashcardRepositoryImpl(): FlashcardRepository {

    override suspend fun getCourses(): List<Course> {
        return courses.values.toList()
    }

    override suspend fun getChapter(courseId: String): List<Chapter> {
        return courses[courseId]?.chapters ?: courses["Programming Languages"]!!.chapters
    }

    override suspend fun getChapters(course: Course): List<Chapter> {
        return course.chapters
    }

}