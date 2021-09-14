package com.company.triviaapp.presentation.select_chapter

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.company.triviaapp.common.Constants
import com.company.triviaapp.common.Resource
import com.company.triviaapp.data.model.Course
import com.company.triviaapp.domain.use_case.get_categories.GetCoursesUseCase
import com.company.triviaapp.domain.use_case.get_chapters.GetChaptersUseCase
import com.company.triviaapp.presentation.courses
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class ChapterSelectViewModel @Inject constructor(
    private val getChaptersUseCase: GetChaptersUseCase,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {


    private val _state = mutableStateOf(ChapterListState()) // Encapsulate mutable state
    val state: State<ChapterListState> = _state // Publicly expose non-mutable state

    init { // When a CourseSelectViewModel object is created, invoke getCourses

        savedStateHandle.get<String>(Constants.PARAM_COURSE_ID)?.let {
            courseId -> getChapters(courseId)
        }
    }


    private fun getChapters(courseId: String) {
        getChaptersUseCase(courseId).onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = ChapterListState(chapters = result.data ?: emptyList())
                }
                is Resource.Error -> {
                    _state.value =
                        ChapterListState(error = result.message ?: "Unexpected error occurred")
                }
                is Resource.Loading -> {
                    _state.value = ChapterListState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope) // A class, but because we overrode the invoke operator this works
    }

}