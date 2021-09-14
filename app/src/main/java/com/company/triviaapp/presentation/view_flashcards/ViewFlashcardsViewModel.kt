package com.company.triviaapp.presentation.view_flashcards

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.company.triviaapp.common.Constants
import com.company.triviaapp.common.Resource
import com.company.triviaapp.domain.use_case.get_cards.GetCardsUseCase
import com.company.triviaapp.presentation.tempMap
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class ViewFlashcardsViewModel @Inject constructor(
    private val getCardsUseCase: GetCardsUseCase,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {


    private val _state = mutableStateOf(ViewFlashcardsState()) // Encapsulate mutable state
    val state: State<ViewFlashcardsState> = _state // Publicly expose non-mutable state

    init { // When a CourseSelectViewModel object is created, invoke getCourses

        savedStateHandle.get<String>(Constants.PARAM_CHAPTER_ID)?.let {
                    chapterId -> getQuestionAnswers(chapterId)
        }
    }

    private fun getQuestionAnswers(chapterId: String) {
        val chapter = tempMap["Temp"]!! // This is a temporary, bad way of doing this - come back to and restructure
        getCardsUseCase(chapter).onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = ViewFlashcardsState(flashcards = result.data ?: emptyList())
                }
                is Resource.Error -> {
                    _state.value =
                        ViewFlashcardsState(error = result.message ?: "Unexpected error occurred")
                }
                is Resource.Loading -> {
                    _state.value = ViewFlashcardsState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope) // A class, but because we overrode the invoke operator this works
    }

}