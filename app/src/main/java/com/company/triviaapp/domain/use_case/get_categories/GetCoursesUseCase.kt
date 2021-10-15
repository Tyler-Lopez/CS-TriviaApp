package com.company.triviaapp.domain.use_case.get_categories

import com.company.triviaapp.common.Resource
import com.company.triviaapp.data.model.Course
import com.company.triviaapp.domain.repository.IFlashcardRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

// https://www.youtube.com/watch?v=EF33KmyprEQ 32:30
// Use case should only have one public function

class GetCoursesUseCase @Inject constructor(
    private val repository: IFlashcardRepository
) {
    // https://kotlinlang.org/docs/operator-overloading.html
    operator fun invoke(): Flow<Resource<List<Course>>> = flow {
        emit(Resource.Loading()) // Progress bar
        val returnCourses = repository.getCourses() // List of courses retrieved from repository
        emit(Resource.Success(returnCourses)) // Attach data we want to forward to the ViewModel, contains UseCase
    }
}