package com.company.triviaapp.data.courses.kotlincourse

import com.company.triviaapp.data.model.QuestionAnswer

class KotlinCourse {
    // DESIGN PATTERNS
    val designPatterns = listOf(
        QuestionAnswer(
            question = "What is a Design Pattern?",
            answer = """
           Blueprint for a problem that occurs very often
        """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
        QuestionAnswer(
            question = "What is the Singleton pattern?",
            answer = """
           An object where a single instance exists in the code base
        """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
        QuestionAnswer(
            question = "Which keyword creates a Singleton?",
            answer = """
            object
        """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
        QuestionAnswer(
            question = "What is the Factory pattern?",
            answer = """
            Distinguishes between different types of objects, then creates the desired object
        """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
        QuestionAnswer(
            question = "Consider a Factory named DialogFactory, what is the most likely name of the function contained within?",
            answer = """
            createDialog
        """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
        QuestionAnswer(
            question = "What is the Builder pattern?",
            answer = """
            Class within a class which returns an instance of the class when .build() is called
            
            Not very necessary in Kotlin because default arguments
        """.trimIndent(),
            questionTts = "",
            answerTts = """Class within a class which returns an instance of the class when dot build open and close parenthesis is called
                
                Not very necessary in Kotlin because of default arguments
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is the Facade pattern?",
            answer = """
            Used to only show code you should see
            
            For example, an interface which describes an abstract function getHamburgers()
        """.trimIndent(),
            questionTts = "",
            answerTts = """
                Used to only show code you should see
            
            For example,  an interface which describes an abstract function get Hamburgers open and close parenthesis
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is the Adapter pattern?",
            answer = """
            Takes a parameter and adapts it into something else, like UI
        """.trimIndent(),
            questionTts = "",
            answerTts = """
            
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is the Dependency Injection pattern?",
            answer = """
            Passing an object its instance variables
        """.trimIndent(),
            questionTts = "",
            answerTts = """
            
                """.trimIndent()
        ),
    )

    // QUESTIONS ABOUT THE ANDROID LIFECYCLE
    val lifeCycle = listOf(
        QuestionAnswer(
            question = "What are the 6 callbacks provided by the Activity class?",
            answer = """
           onCreate(), onStart(), onResume(), onStop(), onDestroy()
        """.trimIndent(),
            questionTts = "",
            answerTts = "on create on start on resume on stop on destroy"
        ),
        QuestionAnswer(
            question = "Which callback is fired when the system first creates an activity?",
            answer = """
           onCreate()
        """.trimIndent(),
            questionTts = "",
            answerTts = "on create"
        ),
        QuestionAnswer(
            question = "Which parameter, if any, does onCreate() receive?",
            answer = """
           savedInstanceState: Bundle?
        """.trimIndent(),
            questionTts = "Which parameter, if any, does on create receive?",
            answerTts = "Saved instance state of type nullable bundle"
        ),
        QuestionAnswer(
            question = "Does an activity reside in the Created state?",
            answer = """
           No
        """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
        QuestionAnswer(
            question = "Does an activity reside in the Started state?",
            answer = """
           No
        """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
        QuestionAnswer(
            question = "What should onResume() be implemented for?",
            answer = """
           To initialize components released during onPause()
        """.trimIndent(),
            questionTts = "What should on resume be implemented for?",
            answerTts = "To initialize components released during on pause"
        ),
        QuestionAnswer(
            question = "Why must the superclass of onCreate() callback be called if overridden?",
            answer = """
           To complete the creation of the activity, like creating the view hierarchy
        """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
    )

    // QUESTIONS ABOUT OBJECT ORIENTED PROGRAMMING
    val objectOriented = listOf(
        QuestionAnswer(
            "What does an interface do and what does it not do?",
            """
           Describes what a class should do, and not how to do it
        """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you declare an interface named Computer?",
            answer = """
           interface Computer { }
        """.trimIndent(),
            questionTts = "",
            answerTts = "interface Computer open curly brace close curly brace"
        ),
        QuestionAnswer(
            question = "Which modifier must be used when implementing a member of an interface?",
            answer = """
           override
        """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
        QuestionAnswer(
            question = "Can an interface declare properties?",
            answer = """
           Yes and must be overridden in classes implementing the interface
        """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
        QuestionAnswer(
            question = "Can an enum class implement an interface?",
            answer = """
           Yes, each enum element must provide implementation
        """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
        QuestionAnswer(
            question = "What does fun interface mean?",
            answer = """
           Single Abstract Method
           
           Interface with only a single member function
        """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
        QuestionAnswer(
            question = "What is a constructor?",
            answer = """
           Special function which creates an object
        """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
        QuestionAnswer(
            question = "Which keyword is used to declare a secondary constructor?",
            answer = """
           constructor
        """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
        QuestionAnswer(
            question = "When used within a secondary constructor, what does the keyword this do?",
            answer = """
           Calls either the primary constructor or a secondary constructor
        """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
        QuestionAnswer(
            question = "Consider calling another constructor from a secondary constructor: when should it be called?",
            answer = """
           Before the constructor body of the secondary constructor
        """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
        QuestionAnswer(
            question = "What must always be called in a secondary constructor?",
            answer = """
            The primary constructor, either directly or indirectly
        """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
        QuestionAnswer(
            question = "What happens if the primary constructor is not directly or indirectly called from a secondary constructor?",
            answer = """
            Compile error
        """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
        QuestionAnswer(
            question = "Should parameters of the secondary constructors be declared with val or var?",
            answer = """
            NO
            
            Only parameters of the primary constructor can be declared val or var
        """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
        QuestionAnswer(
            question = "Can a secondary constructor declare a parameter with val or var?",
            answer = """
            NO
            
            Compile-time error
        """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
        QuestionAnswer(
            question = "What keyword must be used on a class before it is extended?",
            answer = """
            open
            
            All classes are final by default
        """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
        QuestionAnswer(
            question = "Can a derived class access private members of the base class?",
            answer = """
            No
        """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
        QuestionAnswer(
            question = "Must member functions of a concrete superclass have concrete implementations?",
            answer = """
            Yes
            
            open fun functionName() { }
        """.trimIndent(),
            questionTts = "",
            answerTts = """
                Yes
                
                open fun function name open and close parentheses open and close curly brace
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "Can an interface concretely implement functions?",
            answer = """
            Yes
        """.trimIndent(),
            questionTts = "",
            answerTts = """
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "Does an interface need to use the abstract keyword for abstract properties and functions?",
            answer = """
            No, it is redundant
        """.trimIndent(),
            questionTts = "",
            answerTts = """
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is the difference between an interface and an abstract class?",
            answer = """
            An abstract class can contain state while an interface cannot
        """.trimIndent(),
            questionTts = "",
            answerTts = """
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What does it mean that an abstract class can contain state but an interface cannot?",
            answer = """
            An interface may declare properties abstractly but actual data is stored in classes that implement interface
        """.trimIndent(),
            questionTts = "",
            answerTts = """
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "Which can contain functions with implementations: abstract classes or interfaces?",
            answer = """
            Both may contain functions with implementations
        """.trimIndent(),
            questionTts = "",
            answerTts = """
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "Can interfaces inherit from each other?",
            answer = """
            Yes
        """.trimIndent(),
            questionTts = "",
            answerTts = """
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What happens if a class inherits several interfaces which contain functions with the same signature?",
            answer = """
            Collisions must be resolved manually
        """.trimIndent(),
            questionTts = "",
            answerTts = """
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How can a function access the base version of itself in interface A?",
            answer = """
            super<A>.functionName
        """.trimIndent(),
            questionTts = "",
            answerTts = """
                super A in angle brackets dot function name
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How can functionality be added to a class without inheritance?",
            answer = """
            Extension functions
        """.trimIndent(),
            questionTts = "",
            answerTts = """
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is the Liskov Substitution Principle?",
            answer = """
            After upcasting, the derived type can be treated exactly like the base type
        """.trimIndent(),
            questionTts = "",
            answerTts = """
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "Consider super class Shape / subclass Square which has a color function; if a Shape object shape points to an instance of Square can color be accessed?",
            answer = """
            Not without casting or checking if shape is an instance of Square
        """.trimIndent(),
            questionTts = "Consider super class Shape and a subclass Square which has a color function; if a Shape object shape points to an instance of Square can color be accessed?",
            answerTts = """
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How is an init block declared for a secondary constructor?",
            answer = """
            After calling another constructor open a block of curly braces
        """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
        QuestionAnswer(
            question = "Consider a constructor C1 which calls upon a constructor C2 which calls upon the primary constructor C3, in which order are the constructors invoked?",
            answer = """
            C3 then C2 then C1
        """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
        QuestionAnswer(
            question = "What is an init block?",
            answer = """
           Code executed during object creation
        """.trimIndent(),
            questionTts = "What is an in it block?",
            answerTts = ""
        ),
        QuestionAnswer(
            question = "Suppose Employee implements Person which declares a name property, how would name be overridden in the constructor?",
            answer = """
           class Employee(override val name: String) : Person { }
        """.trimIndent(),
            questionTts = "",
            answerTts = "class employee open parenthesis override val name colon string close parenthesis colon person open and close curly brace"
        ),
    )
}