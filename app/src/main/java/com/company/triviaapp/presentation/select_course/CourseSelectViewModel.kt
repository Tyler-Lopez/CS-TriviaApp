package com.company.triviaapp.presentation.select_course

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.company.triviaapp.common.Resource
import com.company.triviaapp.data.model.Course
import com.company.triviaapp.domain.use_case.get_categories.GetCoursesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class CourseSelectViewModel @Inject constructor(
    private val getCoursesUseCase: GetCoursesUseCase
) : ViewModel() {

    private val _state = mutableStateOf(CourseListState()) // Encapsulate mutable state
    val state: State<CourseListState> = _state // Publicly expose non-mutable state

    init { // When a CourseSelectViewModel object is created, invoke getCourses
        getCourses()
    }


    private fun getCourses() {
        getCoursesUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = CourseListState(courses = result.data ?: emptyList())
                }
                is Resource.Error -> {
                    _state.value =
                        CourseListState(error = result.message ?: "Unexpected error occurred")
                }
                is Resource.Loading -> {
                    _state.value = CourseListState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope) // A class, but because we overrode the invoke operator this works
    }

}