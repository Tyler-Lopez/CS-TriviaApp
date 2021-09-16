package com.company.triviaapp.data.model

data class QuestionAnswer(
    val question: String,
    val answer: String,
    val questionTts: String = "",
    val answerTts: String = ""
    )
