

enum class Difficulty {
    Easy, Medium, Hard
}

// Defaulted easy difficulty.
data class QuestionWithAnswer(val question: String, val answer: String, val difficulty: Difficulty = Difficulty.Easy)

