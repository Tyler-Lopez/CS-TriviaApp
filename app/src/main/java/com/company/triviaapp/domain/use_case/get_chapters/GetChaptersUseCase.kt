package com.company.triviaapp.domain.use_case.get_chapters

import com.company.triviaapp.common.Resource
import com.company.triviaapp.data.model.Chapter
import com.company.triviaapp.data.model.Course
import com.company.triviaapp.domain.repository.IFlashcardRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

// https://www.youtube.com/watch?v=EF33KmyprEQ 32:30
// Use case should only have one public function

class GetChaptersUseCase @Inject constructor(
    private val repository: IFlashcardRepository,
) {
    // https://kotlinlang.org/docs/operator-overloading.html
    operator fun invoke(course: Course): Flow<Resource<List<Chapter>>> = flow {
        emit(Resource.Loading()) // Progress bar
        val returnCourses = repository.getChapters(course) // List of courses retrieved from repository
        emit(Resource.Success(returnCourses)) // Attach data we want to forward to the ViewModel, contains UseCase
    }
}