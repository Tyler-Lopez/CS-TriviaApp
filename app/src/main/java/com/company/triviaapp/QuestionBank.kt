import com.company.triviaapp.datastructures.DataStructures
import com.company.triviaapp.discretemath.DiscreteMath
import com.company.triviaapp.kotlincourse.KotlinCourse
import com.company.triviaapp.programminglanguages.ProgrammingLanguages

<<<<<<< Updated upstream:app/src/main/java/com/company/triviaapp/QuestionBank.kt
val sections = mapOf(
    "COSC 311: 01" to DataStructures().chapterOne,
    "COSC 311: 02" to DataStructures().chapterTwo,
    "COSC 311: 03" to DataStructures().chapterThree,
    "COSC 311: Sorting" to DataStructures().sortingAlgo,
    "COSC 314: 01" to DiscreteMath().sets,
    "COSC 314: 02" to DiscreteMath().logic,
    "COSC 314: 03" to DiscreteMath().relations,
    "COSC 314: 04" to DiscreteMath().functions,
    "COSC 341: 01" to ProgrammingLanguages().chapterOne,
    "COSC 341: 02" to ProgrammingLanguages().chapterTwo,
    "COSC 341: 03" to ProgrammingLanguages().chapterThree,
    "Kotlin: O2" to KotlinCourse().intermediete
)

=======
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
val sections = mapOf<String, List<QuestionAnswer>>(
    "COSC 311: 01" to convertToQuestionAnswer(DataStructures().chapterOne),
    "COSC 311: 02" to convertToQuestionAnswer(DataStructures().chapterTwo),
    "COSC 311: 03" to convertToQuestionAnswer(DataStructures().chapterThree),
    "COSC 311: Sorting" to convertToQuestionAnswer(DataStructures().sortingAlgo),
    "COSC 314: 01" to convertToQuestionAnswer(DiscreteMath().sets),
    "COSC 314: 02" to convertToQuestionAnswer(DiscreteMath().logic),
    "COSC 314: 03" to convertToQuestionAnswer(DiscreteMath().relations),
    "COSC 314: 04" to convertToQuestionAnswer(DiscreteMath().functions),
    "COSC 341: 01" to convertToQuestionAnswer(ProgrammingLanguages().chapterOne),
    "COSC 341: 02" to convertToQuestionAnswer(ProgrammingLanguages().chapterTwo),
    "COSC 341: 03" to convertToQuestionAnswer(ProgrammingLanguages().chapterThree),
    "Kotlin: O2" to convertToQuestionAnswer(KotlinCourse().intermediete)
)

fun convertToQuestionAnswer(list: List<Pair<String, String>>): List<QuestionAnswer> {
    val toReturn = mutableListOf<QuestionAnswer>()
    list.forEach {
        toReturn.add(QuestionAnswer(it.first, it.second))
    }
    return toReturn
}

val courses = mapOf(
    "Discrete Math" to Course("Discrete Math", listOf(
        Chapter("Sets", sections["COSC 314: 01"]!!),
        Chapter("Logic", sections["COSC 314: 02"]!!),
        Chapter("Functions", sections["COSC 314: 04"]!!),
        Chapter("Relations", sections["COSC 314: 03"]!!)
    )),
    "Data Structures & Algorithms" to Course("Data Structures & Algorithms", listOf(
        Chapter("Introduction", sections["COSC 311: 01"]!!),
        Chapter("Searching & Algorithm Analysis", sections["COSC 311: 02"]!!),
        Chapter("Recursion", sections["COSC 311: 03"]!!),
        Chapter("Sorting Algorithms", sections["COSC 311: Sorting"]!!),
    )),
    "Programming Languages" to Course("Programming Languages", listOf(
        Chapter("Introduction", sections["COSC 341: 01"]!!),
        Chapter("Overview of Languages", sections["COSC 341: 02"]!!),
        Chapter("C", sections["COSC 341: 03"]!!),
    ))
)
// Categories with associated list of each chapter
>>>>>>> Stashed changes:app/src/main/java/com/company/triviaapp/data/courses/QuestionBank.kt
val categories = listOf(
    Pair(
        "Discrete Math", listOf(
            Pair("Sets", "COSC 314: 01"),
            Pair("Logic", "COSC 314: 02"),
            Pair("Functions", "COSC 314: 04"),
            Pair("Relations", "COSC 314: 03")
        )
    ),
    Pair(
        "Data Structures & Algorithms", listOf(
            Pair("Introduction", "COSC 311: 01"),
            Pair("Searching & Algorithm Analysis", "COSC 311: 02"),
            Pair("Recursion", "COSC 311: 03"),
            Pair("Sorting Algorithms", "COSC 311: Sorting"),
        )
    ),
    Pair(
        "Programming Languages", listOf(
            Pair("Introduction", "COSC 341: 01"),
            Pair("Overview of Languages", "COSC 341: 02"),
            Pair("C", "COSC 341: 03"),
            )
    ),
    Pair(
        "Kotlin", listOf(
            Pair("Intermediate", "Kotlin: O2"),
        )
    ),
)