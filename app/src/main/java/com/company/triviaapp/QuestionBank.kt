import com.company.triviaapp.datastructures.DataStructures
import com.company.triviaapp.discretemath.DiscreteMath
import com.company.triviaapp.kotlincourse.KotlinCourse
import com.company.triviaapp.programminglanguages.ProgrammingLanguages

enum class Difficulty {
    Easy, Medium, Hard
}

// Defaulted easy difficulty.
data class QuestionWithAnswer(
    val question: String,
    val answer: String,
    val difficulty: Difficulty = Difficulty.Easy
)

val sections = mapOf(
    "COSC 311: 01" to DataStructures().chapterOne,
    "COSC 311: 02" to DataStructures().chapterTwo,
    "COSC 311: 03" to DataStructures().chapterThree,
    "COSC 314: 01" to DiscreteMath().sets,
    "COSC 314: 02" to DiscreteMath().logic,
    "COSC 314: 03" to DiscreteMath().relations,
    "COSC 314: 04" to DiscreteMath().functions,
    "COSC 341: 01" to ProgrammingLanguages().chapterOne,
    "COSC 341: 02" to ProgrammingLanguages().chapterTwo,
    "COSC 341: 03" to ProgrammingLanguages().chapterThree,

    "Kotlin: O2" to KotlinCourse().intermediete

)

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