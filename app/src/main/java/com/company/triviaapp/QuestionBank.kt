import com.company.triviaapp.datastructures.DataStructures
import com.company.triviaapp.discretemath.DiscreteMath
import com.company.triviaapp.programminglanguages.ProgrammingLanguages

enum class Difficulty {
    Easy, Medium, Hard
}

// Defaulted easy difficulty.
data class QuestionWithAnswer(val question: String, val answer: String, val difficulty: Difficulty = Difficulty.Easy)

val categories = mapOf(
    "COSC 311: 01" to DataStructures().chapterOne,
    "COSC 311: 02" to DataStructures().chapterTwo,
    "COSC 311: 03" to DataStructures().chapterThree,
    "COSC 314: 01" to DiscreteMath().chapterOne,
    "COSC 341: 01" to ProgrammingLanguages().chapterOne,
    "COSC 341: 02" to ProgrammingLanguages().chapterTwo

)