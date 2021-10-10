package com.company.triviaapp.data.courses.kotlincourse

import com.company.triviaapp.data.model.QuestionAnswer

class KotlinCourse {
    val intermediete = listOf(
        QuestionAnswer("What does an interface do and what does it not do?",
            """
           Describes what a class should do, and not how to do it
        """.trimIndent()),
        QuestionAnswer(
            question = "How do you declare an interface named Computer?",
            answer = """
           interface Computer { }
        """.trimIndent(),
            questionTts = "",
            answerTts = "interface Computer open curly brace close curly brace"),
        QuestionAnswer(
            question = "Which modifier must be used when implementing a member of an interface?",
            answer = """
           override
        """.trimIndent(),
            questionTts = "",
            answerTts = ""),
        QuestionAnswer(
            question = "Can an interface declare properties?",
            answer = """
           Yes and must be overridden in classes implementing the interface
        """.trimIndent(),
            questionTts = "",
            answerTts = ""),
        QuestionAnswer(
            question = "Can an enum class implement an interface?",
            answer = """
           Yes, each enum element must provide implementation
        """.trimIndent(),
            questionTts = "",
            answerTts = ""),
        QuestionAnswer(
            question = "What does fun interface mean?",
            answer = """
           Single Abstract Method
           
           Interface with only a single member function
        """.trimIndent(),
            questionTts = "",
            answerTts = ""),
        QuestionAnswer(
            question = "What is a constructor?",
            answer = """
           Special function which creates an object
        """.trimIndent(),
            questionTts = "",
            answerTts = ""),
        QuestionAnswer(
            question = "Which keyword is used to declare a secondary constructor?",
            answer = """
           constructor
        """.trimIndent(),
            questionTts = "",
            answerTts = ""),
        QuestionAnswer(
            question = "When used within a secondary constructor, what does the keyword this do?",
            answer = """
           Calls either the primary constructor or a secondary constructor
        """.trimIndent(),
            questionTts = "",
            answerTts = ""),
        QuestionAnswer(
            question = "Consider calling another constructor from a secondary constructor: when should it be called?",
            answer = """
           Before the constructor body of the secondary constructor
        """.trimIndent(),
            questionTts = "",
            answerTts = ""),
        QuestionAnswer(
            question = "What must always be called in a secondary constructor?",
            answer = """
            The primary constructor, either directly or indirectly
        """.trimIndent(),
            questionTts = "",
            answerTts = ""),
        QuestionAnswer(
            question = "What happens if the primary constructor is not directly or indirectly called from a secondary constructor?",
            answer = """
            Compile error
        """.trimIndent(),
            questionTts = "",
            answerTts = ""),
        QuestionAnswer(
            question = "How is an init block declared for a secondary constructor?",
            answer = """
            After calling another constructor open a block of curly braces
        """.trimIndent(),
            questionTts = "",
            answerTts = ""),
        QuestionAnswer(
            question = "Consider a constructor C1 which calls upon a constructor C2 which calls upon the primary constructor C3, in which order are the constructors invoked?",
            answer = """
            C3 then C2 then C1
        """.trimIndent(),
            questionTts = "",
            answerTts = ""),
        QuestionAnswer(
            question = "What is an init block?",
            answer = """
           Code executed during object creation
        """.trimIndent(),
            questionTts = "What is an in it block?",
            answerTts = ""),
        QuestionAnswer(
            question = "Suppose Employee implements Person which declares a name property, how would name be overridden in the constructor?",
            answer = """
           class Employee(override val name: String) : Person { }
        """.trimIndent(),
            questionTts = "",
            answerTts = "class employee open parenthesis override val name colon string close parenthesis colon person open and close curly brace"),
    )
}