package com.company.triviaapp.presentation

import com.company.triviaapp.data.courses.datastructures.DataStructures
import com.company.triviaapp.data.courses.discretemath.DiscreteMath
import com.company.triviaapp.data.courses.kotlincourse.KotlinCourse
import com.company.triviaapp.data.courses.programminglanguages.ProgrammingLanguages
import com.company.triviaapp.data.model.Chapter
import com.company.triviaapp.data.model.Course
import com.company.triviaapp.data.model.QuestionAnswer

/*

Note: this is a temporary way of managing questions, this will eventually be moved to a database rather than being hard-coded.

*/

// Dictionary mapping of chapter keyword to actual question bank
val sections = mapOf(
    "COSC 311: 01" to DataStructures().chapterOne,
    "COSC 311: 02" to DataStructures().chapterTwo,
    "COSC 311: 03" to DataStructures().chapterThree,
    "COSC 311: Sorting" to DataStructures().sortingAlgo,
    "COSC 314: 01" to DiscreteMath().sets,
    "COSC 314: 02" to DiscreteMath().logic,
    "COSC 314: 03" to DiscreteMath().relations,
    "COSC 314: 04" to DiscreteMath().functions,
    "COSC 314: 05" to DiscreteMath().sequences,
    "COSC 341: 01" to ProgrammingLanguages().chapterOne,
    "COSC 341: 02" to ProgrammingLanguages().chapterTwo,
    "COSC 341: 03" to ProgrammingLanguages().chapterThree,
    "Kotlin: O2" to KotlinCourse().intermediete
)

val tempMap = mapOf(
    "Temp" to Chapter("Sets", sections["COSC 314: 01"]!!)
)

fun pairStringToQuestion(list: List<Pair<String, String>>): List<QuestionAnswer> {
    val toReturn = mutableListOf<QuestionAnswer>()
    list.forEach {
        toReturn.add(QuestionAnswer(it.first, it.second))
    }
    return toReturn
}

val courses = mapOf(
    "Discrete Math" to
            Course(
                "Discrete Math", mapOf(
                    "Sets" to Chapter("Sets", sections["COSC 314: 01"]!!),
                    "Logic" to Chapter("Logic", sections["COSC 314: 02"]!!),
                    "Functions" to Chapter("Functions", sections["COSC 314: 04"]!!),
                    "Relations" to Chapter("Relations", sections["COSC 314: 03"]!!),
                    "Sequences" to Chapter("Sequences", sections["COSC 314: 05"]!!)
                )),
    "Data Structures & Algorithms" to
            Course(
                "Data Structures & Algorithms", mapOf(
                    "Introduction" to Chapter("Introduction", sections["COSC 311: 01"]!!),
                    "Searching & Algorithm Analysis" to Chapter("Searching & Algorithm Analysis", sections["COSC 311: 02"]!!),
                    "Recursion" to Chapter("Recursion", sections["COSC 311: 03"]!!),
                    "Sorting Algorithms" to Chapter("Sorting Algorithms", sections["COSC 311: Sorting"]!!),
                )
            ),
    "Programming Languages" to
            Course(
                "Programming Languages", mapOf(
                    "Language Analysis" to Chapter("Language Analysis", sections["COSC 341: 01"]!!),
                    "Overview of Languages" to Chapter("Overview of Languages", sections["COSC 341: 02"]!!),
                    "C" to Chapter("C", sections["COSC 341: 03"]!!),
                )
            )
)