package com.company.triviaapp.data.courses.programminglanguages

import com.company.triviaapp.data.model.QuestionAnswer

class ProgrammingLanguages {
    val chapterOne = listOf(
        QuestionAnswer(
            question = "What is feature multiplicity?",
            answer = """
        More than one way to accomplish a operation

        Example: incrementing a integer in Java
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What are programming domains?",
            answer = """
        Places where programming is used
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What are Script languages?",
            answer = """
        Used to write small programs quickly
        
        Perl, MATLAB, R
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                Used to write small programs quickly
        
                For example, Pearl, MAT LAB, & R
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What are the three most important criteria of language evaluation?",
            answer = """
        Readability
        
        Writability
        
        Reliability
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What are the three less important criteria of language evaluation?",
            answer = """
        Generality
        
        Portability
        
        Cost
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What increases readability?",
            answer = """
        Simplicity (small # of language features)
        
        Process and data abstraction
        
        Control and block structures
    """.trimIndent(),
            questionTts = "",
            answerTts = """
       Simplicity, for example a small number of language features
        
        Process and data abstraction
        
        Control and block structures
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What decreases readability?",
            answer = """
        Method & operator overloading
        
        Generics & inheritance relations
        
        Over simplicity
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                Method and operator overloading
        
        Generics and inheritance relations
        
        Over simplicity
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is expressivity?",
            answer = """
        Ability to express ideas
        
        Inheritance, generics, exception handling, recursion
    """.trimIndent()
        ),
        QuestionAnswer(
            question = "What increases writability?",
            answer = """
        Simplicity
        
        Process & data abstraction
        
        Control & block structures
        
        Expressivity
    """.trimIndent(),
            questionTts = "",
            answerTts = """
            Simplicity
                        
            Process and data abstraction
                        
            Control and block structures
                        
            Expressivity
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What decreases writability?",
            answer = """
        Too much expressivity
        
        Extreme simplicity
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What increases reliability?",
            answer = """
        Type checking at compile time
        
        Exception handling
        
        Readability & writability
    """.trimIndent(),
            questionTts = "",
            answerTts = """
            Type checking at compile time
                        
            Exception handling
                        
            Readability and writability
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is generality?",
            answer = """
        When a language can be used to write many types of programs
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is portability?",
            answer = """
        When a language can be used to write programs that are machine independent
        
        Write once, run anywhere
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What are the four language categories?",
            answer = """
        Procedural
        
        Object Oriented
        
        Functional
        
        Logic
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is operator overloading?",
            answer = """
        A single operator has more than one meaning

        Example: + is used for both string concatenation and integer addition

        Can lead to reduced readability
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is orthogonality?",
            answer = """
        Small set of primitive constructs can be combined to build data structures

        From word orthogonal meaning independent of each other

        The more orthogonal a language is the more simple it is, less exceptions
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is aliasing?",
            answer = """
        Having two or more distinct names in a program used to access same memory

        Considered dangerous - decrease reliability

        Two points point to the same variable
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "Define optimization", """
        Techniques compilers do to decrease size and/or increase execution speed
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What two main factors influenced the development of languages?", """
        Computer hardware & programming methodologies
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is the von Neumann Architecture?",
            answer = """
        Languages designed around called imperative

        Data & program are in memory and must be fetched by the CPU
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is language translation?",
            answer = """
        Translating high-level language to machine code
        
        Compiling, interpreting, and hybrid compiling / interpreting
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "Which method of language translation do Java, Python, and JavaScript use?",
            answer = """
        Hybrid compiling / interpreting
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "Which method of language translation do Lisp, Basic, and Perl use?",
            answer = """
        Interpreting
    """.trimIndent(),
            questionTts = "Which method of language translation do Lisp, Basic, and Pearl use?",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "Which method of language translation do C, C++ and Fortran use?",
            answer = """
        Compiling
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is procedural programming?",
            answer = """
        Don't write whole program in one program, divide program into subprograms
        
        AKA imperative
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is functional programming?",
            answer = """
        Work performed by function calls
        
        AKA applicative languages
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is object oriented programming?",
            answer = """
        Encapsulation of data & methods
        
        Classes & objects
        
        Inheritance & polymorphism
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What are logic programming languages?",
            answer = """
        Work performed by logic
        
        AKA declarative
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is compiling language translation?",
            answer = """
        Source code completely translated to machine code
        
        Compiling & executing occur different times
        
        Compile once, run many times
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is interpreting language translation?",
            answer = """
        Interpreter translates source code & executes at the same time
        
        Translation occurs everytime program is run
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is hybrid method language translation?",
            answer = """
        Source code translated to intermediate code (byte code)
        
        Interpreted code may be executed at runtime, line-by-line
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What are the three main methods of language translation?",
            answer = """
        Compiling
        
        Interpreting
        
        Hybrid compiling / interpreting
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is an IDE?",
            answer = """
        Integrated development environment
        
        Provides package of components for programming
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What does it mean for a program to be reliable?",
            answer = """
        It performs to specification under all conditions
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What has been the strongest influence on programming language design?",
            answer = """
        Computer architecture & programming methodologies
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is the name of the category of programming languages whose structure is dictated by the von Neumann computer architecture?",
            answer = """
        Imperative
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "Which approach to language implementation produces the fastest program execution?",
            answer = """
        Compiler
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How does a more reliable language impact the development cost?",
            answer = """
        More reliable means less failure cost and cheaper
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How does a more readable language impact the development cost?",
            answer = """
        More readable means less cost to update and cheaper
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "Why do compiled programs typically run faster than interpreted programs?",
            answer = """
        The process of translating code at run-time adds to the overhead & can cause the program to be slower.
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
    )
    val chapterTwo = listOf(
        QuestionAnswer(
            question = "Which was the primary application area of computers at the time Fortran was designed?",
            answer = """
        Scientific
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            "Which user group was the target of the first version of BASIC?", """
        Liberal arts students
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            "PL/1 was designed to replace which two languages?", """
        FORTRAN and COBOL
    """.trimIndent(),
            questionTts = "P L 1 was designed to replace which two languages?",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "What is Plankalkul?",
            answer = """
        First programming language

        "Programming calculus"
        
        Konrad Zuse, Germany, 1945
    """.trimIndent(),
            questionTts = "",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "Who, where, & when was Plankalkul created?",
            answer = """
        Konrad Zuse, Germany, 1945
    """.trimIndent(),
            questionTts = "",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "What is minimal hardware programming?",
            answer = """
        Machine code programming

        Punch cards based on light transmission through the holes
        
        40's & 50's
    """.trimIndent(),
            questionTts = "",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "What is FORTRAN?",
            answer = """
        Procedural & FIRST high-level language
        
        Still used today in science / engineering applications

        Formula Translation System
        
        John Backus, IBM, 1954
    """.trimIndent(),
            questionTts = "",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "Who, where, & when was Fortran created?",
            answer = """
        John Backus, IBM, 1954
    """.trimIndent(),
            questionTts = "",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "What is Lisp?",
            answer = """
        Functional language
         
        Based on list processing
                        
        MIT & IBM, John McCarthy, 1958
    """.trimIndent(),
            questionTts = "",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "Who, where, & when was Lisp created?",
            answer = """
        John McCarthy, MIT & IBM, 1958
    """.trimIndent(),
            questionTts = "",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "What language is Common Lisp, Scheme, & Haskell descended from?",
            answer = """
        Lisp
    """.trimIndent(),
            questionTts = "",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "What is Algol?",
            answer = """
        FIRST programming language to describe SYNTAX formally

        Procedural, "Algorithmic" language
                        
        Committees in Europe/US, 1958
    """.trimIndent(),
            questionTts = "",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "Who, where, & when was Algol created?",
            answer = """
        Committees in Europe/US, 1958
    """.trimIndent(),
            questionTts = "",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "What is COBOL?",
            answer = """
        Common Business Oriented Language; for business applications
        
        Blamed for Y2K
        
        IBM, 1960
    """.trimIndent(),
            questionTts = "",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "Where & when was COBOL created?",
            answer = """
        IBM, 1960
    """.trimIndent(),
            questionTts = "",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "What is BASIC?",
            answer = """
        Beginners' All Purpose Symbolic Instruction Code
        
        For teaching basics of programming
        
        Dartmouth, 1963
    """.trimIndent(),
            questionTts = "",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "Where & when was BASIC created?",
            answer = """
        Dartmouth College, 1963
    """.trimIndent(),
            questionTts = "",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "What is PL/1?",
            answer = """
        Programming Language 1
        
        Designed to replace FORTRAN & COBOL
        
        IBM, 1963
    """.trimIndent(),
            questionTts = "What is P L 1?",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "Where & when was PL/1 created?",
            answer = """
        IBM, 1963
    """.trimIndent(),
            questionTts = "Where, and when was P L 1 created?",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "What is Simula?",
            answer = """
        FIRST object oriented language
        
        Designed for simulation applications
        
        Norway, 1965
    """.trimIndent(),
            questionTts = "",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "Where & when was Simula created?",
            answer = """
        Norway, 1965
    """.trimIndent(),
            questionTts = "",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "What is Pascal?",
            answer = """
        For teaching computer science students
        
        Niklaus Wirth, 70's
    """.trimIndent(),
            questionTts = "",
            answerTts = """
            For teaching computer science students
                        
            Niklaus Wirth, seventy's 
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "Which language is Pascal descended from?",
            answer = """
        Algol
    """.trimIndent(),
            questionTts = "",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "By whom & when was Pascal created?",
            answer = """
        Niklaus Wirth, 70's
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                Niklaus Wirth, seventy's
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is Ada?",
            answer = """
        Derived from Pascal
        
        Somewhat object-oriented; for embedded systems
        
        Designed with support of the U.S. government, 1980
    """.trimIndent(),
            questionTts = "",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "Which language is Ada descended from?",
            answer = """
        Pascal
    """.trimIndent(),
            questionTts = "",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "By whom & when was Ada created?",
            answer = """
        U.S. government, 1980
    """.trimIndent(),
            questionTts = "",
            answerTts = """
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is Prolog?",
            answer = """
        Logic language
        
        AI applications
        
        France & England, 1973
    """.trimIndent(),
            questionTts = "",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "By whom & when was Prolog created?",
            answer = """
        France & England, 1973
    """.trimIndent(),
            questionTts = "",
            answerTts = """
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is SmallTalk?",
            answer = """
        STRICT, early object-oriented language
        
        Xerox, Alan Kay, 80's
    """.trimIndent(),
            questionTts = "",
            answerTts = """  
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "Who, where, & when was SmallTalk created?",
            answer = """
        Alan Kay, Xerox, 1980
    """.trimIndent(),
            questionTts = "",
            answerTts = """
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is C?",
            answer = """
        Functional language
        
        General purpose, widely used
        
        Bell labs, Dennis Ritchie, 1972
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "Who, where, & when was C created?",
            answer = """
        Dennis Ritchie, Bell Labs, 1972
    """.trimIndent(),
            questionTts = "",
            answerTts = """
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is C++?",
            answer = """
        Object oriented, general purpose
        
        Evolved from C and Simula
        
        Bjarne Stroustrup, Bell Labs, 1985
    """.trimIndent()
        ),
        QuestionAnswer(
            question = "Who, where, & when was C++ created?",
            answer = """
        Bjarne Stroustrup, Bell Labs, 1985
    """.trimIndent(),
            questionTts = "",
            answerTts = """
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "Which languages did C++ evolve from?",
            answer = """
        Simula & C
    """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is Java?",
            answer = """
        Strictly object-oriented, general purpose
        
        Evolved from and simpler than C++
        
        James Gosling, Sun Micro Systems, 1994
    """.trimIndent(),
            questionTts = "",
            answerTts = """
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "Who, where, & when was Java created?",
            answer = """
        James Gosling, Sun Micro Systems, 1994
    """.trimIndent(),
            questionTts = "",
            answerTts = """
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is C#?",
            answer = """
        Object-oriented
        
        Widely used, part of .NET
        
        Microsoft, 2002
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                        Object-oriented
                        
                        Widely used, part of dot NET
                        
                        Microsoft, early 2002
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is Objective C?",
            answer = """           
        Used by Apple to develop mobile apps
        
        Object oriented
        
        Developed not by Apple, 80's
    """.trimIndent(),
            questionTts = "",
            answerTts = """
            Used by Apple to develop mobile apps
                        
            Object oriented
                        
            Developed not by Apple, eighties
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "Which languages influenced Objective C?",
            answer = """
        C & SmallTalk
    """.trimIndent(),
            questionTts = "",
            answerTts = """
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is Perl?",
            answer = """
        Scripting language related to Unix and C
        
        Considered "mother of all scripting languages"
        
        80's
    """.trimIndent(),
            questionTts = "",
            answerTts = """
            Scripting language related to Unix and C
        
            Considered "mother of all scripting languages"
        
            Eighties  
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is Python?",
            answer = """
        Started as a scripting language, became general purpose language
        
        Developed by individuals, non-profits, 90's
    """.trimIndent(),
            questionTts = "",
            answerTts = """
            Started as a scripting language, became general purpose language
        
            Developed by individuals, non-profits, nineties 
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is JavaScript, PHP?",
            answer = """
        Web programming languages
        
        Influenced by C, Perl
        
        Developed by individuals, non-profits, 90's
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is Swift?",
            answer = """
        Mobile application development language
        
        Developed by Apple, 2014
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "Which two programming languages in the 60's & 70's were mainly used for teaching purposes?",
            answer = """
        Pascal and Basic
    """.trimIndent(),
            questionTts = "Which two programming languages in the sixties and seventies were mainly used for teaching purposes?",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "In which language is the majority of the UNIX operating system written in?",
            answer = """
        C
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "Which two object oriented languages influenced the design of Java?",
            answer = """
        C++ & Simula
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is the first object oriented programming language?",
            answer = """
        Simula
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "When & by who was the markup language HTML developed?",
            answer = """
        Tim Berners-Lee
      
        1993
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "When & by whom was XML developed?",
            answer = """
        World Wide Web Consortium
      
        1996
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is the difference between a compiler and integrated development environment?",
            answer = """
        Compiler: transforms source code into a lower-level language
        
        IDE: set of software development tools designed to make coding easier
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "Name two Java language features that increase the reliability of Java programs",
            answer = """
        Compile time static type-checking
        
        Exception handling
        
        Try-with-resources
        
        Generics
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),

        )

    val chapterThree = listOf(
        QuestionAnswer(
            question = "What is the extension of C source files?",
            answer = """
        .c
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                dot c
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is the return type of the main function?",
            answer = """
        int
        
        Returning 0 is seen as a success
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "Does the main function require parameters?",
            answer = """
        No
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "Does C have public or static keywords?",
            answer = """
        No
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you print \"Hello World\" and a new line?",
            answer = """
        printf("Hello World\n");
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                print f open parenthesis open quote Hello world backslash n close quote close parenthesis
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "Do variables and function identifiers use camelCase?",
            answer = """
        No
        
        Best practice is all lowercase, with words separated by underscore
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What does size of types mean?",
            answer = """
        Size of types is fixed in Java - this is NOT the case in C
        
        Find bytes of type: sizeof(int), sizeof(variable)
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                The size of types is fixed in Java, this is not the case in C
                
                To find the bytes of a type, use the size of function and use a keyword or variable parameter
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you declare a integer named my_number?",
            answer = """
        int my_number;
    """.trimIndent(),
            questionTts = "How do you declare an integer named my underscore number?",
            answerTts = """
                int my underscore number semi-colon
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What are four categories of types in C?",
            answer = """
        Numerical
        
        Arrays
        
        Structs
        
        Pointers
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What are all of the integer types in C?",
            answer = """
        char
        
        short
        
        int
        
        long
        
        long long
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What are all of the floating point types in C?",
            answer = """
        float
        
        double
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you declare an array of 50 integers in C?",
            answer = """
        int x[50];
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                int space x open square bracket 50 close square bracket
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "When is a struct useful?",
            answer = """
        When you have a lot of information you want to keep together, like a class in Java
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "How would you define a struct for a person?",
            answer = """
        struct person { char name[50]; int age; }
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                struct person open curly brace char name open square bracket 50 close square bracket semi colon int age semi colon close curly brace
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "Provided a defined struct for person, how do you declare two different persons?",
            answer = """
        struct person person_1
        
        struct person person_2
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                struct person person underscore 1
                
                struct person person underscore 2
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What do pointers do?",
            answer = """
        Store memory addresses or locations in memory
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "Given an int y, what does int *p = &y; do?",
            answer = """
         p stores, or points to, the memory address location of y
    """.trimIndent(),
            questionTts = "Given an integer variable y, what does int space asterisk p = ampersand y do?",
            answerTts = """
                p will store or point to the memory address location of y
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "Given an int y, how do you declare a pointer p to it?",
            answer = """
         int *p = &y
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                int space asterisk p equals ampersand y
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "Provided a pointer int *p, what are two ways you can print it?",
            answer = """
         printf("%p", p) - prints the memory address
         
         printf("%i", *p) - prints the int which p points to
    """.trimIndent(),
            questionTts = "Provided a pointer which points to an int, asterisk p, what are two ways you can print it?",
            answerTts = """
                print f open parenthesis percent p in quotes comma p close parenthesis
                prints the memory address
                or
                print f open parenthesis percent i in quotes comma asterisk p close parenthesis
                prints the integer which p points to
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "If a pointer *p points at an int variable y, can you change the value of y from *p?",
            answer = """
         Yes: *p = new value;
    """.trimIndent(),
            questionTts = "If a pointer, asterisk p, points at an integer variable y, can you change the value of y from asterisk p?",
            answerTts = """
                Yes with asterisk p = new value
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What does it mean to be an unsigned type?",
            answer = """
        The type cannot be negative, but can store a larger positive number for the same size
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "How would you create an array of 1, 2, 3, 4, 5?",
            answer = """
        int arr[5] = { 1, 2, 3, 4, 5 }
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                int arr open square bracket 5 close square bracket = open curly brace 1, 2, 3, 4, 5 close curly brace
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "Provided an int variable n, is int *p = n acceptable?",
            answer = """
        No
        
        A pointer cannot be equal to an int, you must instead write int *p = &n
    """.trimIndent(),
            questionTts = "Provided an integer variable n, is int space asterisk p = n acceptable?",
            answerTts = """
                No
                
                A pointer cannot be equal to an int, you must instead write int space asterisk p = ampersand n
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "Provided an int variable n, is int *p = &n acceptable?",
            answer = """
        Yes
    """.trimIndent(),
            questionTts = "Provided an integer variable n, is int space asterisk p = ampersand n acceptable?",
            answerTts = """
                Yes
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "Provided an array variable n, is int *p = n acceptable?",
            answer = """
        Yes
        
        When creating a pointer to an array, you do not use &
    """.trimIndent(),
            questionTts = "Provided an array variable n, is int space asterisk p = n acceptable?",
            answerTts = """
                        Yes, an array is also a location in memory
                        
                        When creating a pointer to an array, you do not use ampersand
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "How are arrays different from pointers?",
            answer = """
        Arrays allocate space on definition
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you use a while loop?",
            answer = """
        Same as Java
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is different about a for loop in C compared to Java?",
            answer = """
        You must declare the count variable outside of the loop
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What does break mean in a loop?",
            answer = """
        Exit the loop entirely
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What does continue mean in a loop?",
            answer = """
        Exit the current iteration of the loop and continue iterations
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "Is int weights[3] = { 70, 90, 60 } or int weights[] = { 70, 90, 60 } valid?",
            answer = """
        Both are valid array initializations
    """.trimIndent(),
            questionTts = "Is int weights open square bracket 3 close square bracket = { 70, 90, 60 } or int weights empty square brackets = { 70, 90, 60 } valid?",
            answerTts = """
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "Given int x; double z; what happens if you attempt to assign x to z?",
            answer = """
        Integer x is converted to double
    """.trimIndent(),
            questionTts = "Given integer x and double z, what happens if you assign x to z?",
            answerTts = """
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "Given int x; double z; what happens if you attempt to assign z to x?",
            answer = """
        Double z is converted to int with loss of precision
        
        Java would prohibit you from doing this without explicit cast, C will not
    """.trimIndent(),
            questionTts = "Given integer x and double z, what happens if you assign z to x?",
            answerTts = """
                The double is converted to an int with loss of precision
                
                Java would prohibit you from doing this without explicit cast, C will not
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What does (9 > 5) return in C?", """
        1
        
        C does not have booleans, anything that doesn't return 0 is true
    """.trimIndent(),
            questionTts = "What does 9 greater than 5 return in C?",
            answerTts = """
                1
                
                C does not have booleans, anything that doesn't return 0 is true
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "Is 5 considered \"true\" in C?",
            answer = """
        Yes
        
        Anything that isn't 0 is considered true
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "How would you define constants to act as booleans?",
            answer = """
        #define TRUE 1
        #define FALSE 0
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                hashtag define space TRUE in all caps space 1
                
                hashtag define space FALSE in all caps space 0
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "How would you define pi as a constant?",
            answer = """
        #define PI 3.14
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                hashtag define PI in all caps space 3 point 1 4
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "Given int x; double y, z; what happens if you attempt to assign x * z to y?",
            answer = """
        y = z * x;
        
        Integer x is converted to double during multiplication
    """.trimIndent(),
            questionTts = "Given an integer x and double y and z, what happens if you attempt to assign x multiplied by z to y?",
            answerTts = """
                X is converted to a double during multiplication
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you explicitly cast a double variable x to int?",
            answer = """
        (int) x
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                Open parenthesis int close parenthesis x
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is 9 & 5?",
            answer = """
        Bitwise AND
        
        9: 1001
        
        5: 0101
        
        9 & 5 : 0001 = 1
    """.trimIndent(),
            questionTts = "What is 9 ampersand 5?",
            answerTts = """
                Bitwise AND
                
                9 is 1 0 0 1
                
                5 is 0 1 0 1
                
                9 ampersand 5 is 0 0 0 1 = 1
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is 9 | 5?",
            answer = """
        Bitwise OR
        
        9: 1001
        
        5: 0101
        
        9 | 5 : 1101 = 13
    """.trimIndent(),
            questionTts = "What is 9 vertical bar 5",
            answerTts = """
                Bitwise OR
                
                9 is 1 0 0 1
                
                5 is 0 1 0 1
                
                9 vertical bar 5 is 1 1 0 1 = 13
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is 9 ^ 5?",
            answer = """
        Bitwise Exclusive OR
                        
        9: 1001, 5: 0101
        
        9 ^ 5 : 1100 = 12
    """.trimIndent(),
            questionTts = "What is 9 caret 5",
            answerTts = """
                Bitwise Exclusive OR

                9 is 1 0 0 1
                
                5 is 0 1 0 1
                
                9 caret 5 is 1 1 0 0 = 12 
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is ~9?",
            answer = """
        Bitwise NOT

        9: 1001
        
        ~9: 0110 = 6 
    """.trimIndent(),
            questionTts = "What is tilde 9?",
            answerTts = """
                Bitwise NOT 

                9 is 1 0 0 1
                
                tilde 9 is 0 1 1 0 which is 6
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is 9 >> 2?",
            answer = """
        9: 1001
        
        9 >> 2: 0010 = 2
    """.trimIndent(),
            questionTts = "What is 9 right shift 2",
            answerTts = """
                9 is 1 0 0 1
                
                9 right shift 2 is 0 0 1 0 which is 2
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is 9 << 1?",
            answer = """
        9: 1001
        
        9 << 1: 10010 = 18
        
        Left shifting by 1 bit is same as multiplying by 2
    """.trimIndent(),
            questionTts = "What is 9 left shift 1",
            answerTts = """
                9 is 1 0 0 1
                
                9 left shift 1 is 1 0 0 1 0 which is 18
                
                Left shifting by 1 is the same as multiplying by 2
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do strings work in C?",
            answer = """
        There is no string class in C
        
        Strings are represented by an array of MUTABLE characters with a null terminator
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you declare a string containing \"Hello World\" using a pointer and an array?",
            answer = """
        Pointer: char *str1 = "Hello World"
        
        Array: char str2[] = "Hello World"
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                For a pointer: char space asterisk variable name equals hello world
                
                For an array: char space variable name square brackets equals hellow world
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you print a string variable my_string using printf?",
            answer = """
        printf("%s", my_string)
    """.trimIndent(),
            questionTts = "How do you print a string variable my underscore string using print f",
            answerTts = """
                print f open parenthesis % s in quotes comma my underscore string close parenthesis
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "How many bytes is a char in C?",
            answer = """
        1
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is the size (in bytes) of \"Hello\"?",
            answer = """
        6
        
        Each char is a byte, then there is an additional null char used to terminate the char array we don't see
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "How would you write a function to return the length of a string?",
            answer = """
        The input should be a pointer or array
        
        Loop through the array, incrementing count each iteration, until the null terminator is found and return
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "Does C have boolean data types?",
            answer = """
        No
        
        Use 1 or 0 to indicate true or false
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What does .h mean?", """
        Header file
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "Given a char array of size 20, what happens if you attempt to access a value at the 500th index?",
            answer = """
        Unlike Java, the problem will likely not crash
        
        It will access whatever byte of memory is at that location
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "Given a char array of size 20, what happens if you attempt to assign a value to the 500th index?",
            answer = """
        Unlike Java, the problem will likely not crash
        
        It will change that byte at that location in memory to whatever you assign it to
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you format print for a int, double, character, and character array?",
            answer = """
        int: %d
        
        double: %f
        
        char: %c
        
        char[]: %s
    """.trimIndent(),
            questionTts = "How do you format print for a int, double, character, and character array?",
            answerTts = """
               int is percent d
               
               double is percent f
               
               char is percent c
               
               char array is percent s
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you format user input for a int, double, character, and character array?",
            answer = """
        int: %d
        
        double: %lf
        
        char: %c
        
        char[]: %s
    """.trimIndent(),
            questionTts = "How do you format user input for a int, double, character, and character array?",
            answerTts = """
               int is percent d
               
               double is percent l f
               
               char is percent c
               
               char array is percent s
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you read user input?",
            answer = """
        scanf("% type of input", & name of the pre-declared variable where data should be stored)
    """.trimIndent(),
            questionTts = "How do you read user input?",
            answerTts = """
                With the method scan f which takes at least two parameters.
                
                The first parameter is the type of input specified by percent identifier enclosed in quotations
                
                The following parameters are the name of the pre-declared variable where the data should be stored, the ampersand symbol must be placed before it if primitive to specify this is a location
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "Of %d, %lf, %c, and %s, which of these will skip white spaces when reading inputs?",
            answer = """
        %d, %lf, and %s will skip white spaces when reading inputs
        
        %c will not
    """.trimIndent(),
            questionTts = "Consider percent d, percent l f, percent c, and percent s. Which of these will skip white spaces when reading input?",
            answerTts = """
                percent d, percent l f, and percent s will all skip white spaces when reading input
                
                percent c will not
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "If you want to define a function after the main method, what must you do?",
            """
        Declare AKA prototype the function before the main method
        
        Example: int maximum(int a, int b);
    """.trimIndent(),
            questionTts = "If you want to define a function after the main method, what must you do?",
            answerTts = """
                Declare also known as prototype the function before the main method
                
                For example, function int maximum which accepts two int variables semicolon
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How would you prototype a function call maximum which takes two integers?",
            """
        int maximum(int a, int b);
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                int space maximum open parenthesis int a comma int b close parenthesis semi colon
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "In C, how do you access the length of an array within a function where the array is a parameter?",
            """
        You must explicitly pass the length of an array into the function
        
        array.length does not exist in C
    """.trimIndent(),
            questionTts = "In C, how do you access the length of an array within a function where the array is a parameter?",
            answerTts = """
                In C, you must explicitly pass the length of an array into the function
                
                No function like array dot length exists in C to find the length of an array otherwise
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What do the function parameters (int* num, int length) imply the function is using them for?",
            """
        num is a pointer to the start of an array
        
        length is the length of the array
    """.trimIndent(),
            questionTts = "What do the function parameters int asterisk space num comma int space length imply the function is using them for?",
            answerTts = """
                This means that num is a pointer to the start of an array
                
                Length is the length of the array
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "Which is the correct way to declare a pointer: int *p or int* p?",
            """
        Both are correct
    """.trimIndent(),
            questionTts = "Which is the correct way to declare a pointer, int space asterisk p OR int asterisk space p?",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How can you determine the length of a string in a character array?", """
        strlen(s) can be used to find the length of a string in a character array
    """.trimIndent(),
            questionTts = "How can you determine the length of a string within a character array?",
            answerTts = """
                The function s t r l e n which accepts a character array may be used to find the length of a string in a character array
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "To use the printf function, what must you include in your C program?", """
        #include <stdio.h>
    """.trimIndent(),
            questionTts = "To use the print f function, what must you include in your C program?",
            answerTts = """
                hashtag include s t d i o dot h in angle brackets
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "To use the strlen function, what must you include in your C program?",
            answer = """
        #include<string.h>
    """.trimIndent(),
            questionTts = "To use the s t r l e n function, what must you include in your C program?",
            answerTts = """
                hashtag include string dot h in angle brackets
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "To use math functions, what must you include in your C program?",
            answer = """
        #include<math.h>
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                hashtag include math dot h in angle brackets
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "To use random number functions, what must you include in your C program?",
            answer = """
        #include<s t d l i b.h>
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                hashtag include s t d l i b dot h in angle brackets
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What does srand(int) do?",
            answer = """
        Initializes a random number generator which is automatically used by any call of rand
    """.trimIndent(),
            questionTts = "What does the function s rand open parenthesis int variable close parenthesis do?",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What does rand() do?",
            answer = """
        Returns a random number
    """.trimIndent(),
            questionTts = "What does rand empty parentheses do?",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How can you generate a random number from 1 to 100?",
            answer = """
        (rand() % 100) + 1 
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                Open parenthesis rand empty parentheses modulo 100 close parenthesis plus 1
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What are the parameters and return types of all math functions?",
            answer = """
        Double
    """.trimIndent(),
            questionTts = "",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "What happens when you pass \"s\" from char s[3] = \"pen\" into the strlen function?",
            answer = """
        Returns 3
        
        Returns length of the string, not including null terminator
    """.trimIndent(),
            questionTts = "What happens when you pass the character array char s size 3 equals pen into the s t r l e n function?",
            answerTts = "3 is returned. The s t r l e n function takes a character array and returns the length of the string, excluding null terminators"
        ),
        QuestionAnswer(
            question = "What is dynamic memory allocation?",
            answer = """
                When memory is allocated at run time
    """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
        QuestionAnswer(
            question = "How do you create a double array of dynamic size m?",
            answer = """
                double *array;
                
                array = (double*) malloc(m * sizeof(double));
    """.trimIndent(),
            questionTts = "How do you create a double array of dynamic size corresponding to variable m",
            answerTts = """
                First, declare a double type array with double space asterisk variable name
                
                Then, make the array equal to open parenthesis double asterisk close parenthesis malloc open parenthesis number of bytes that should be in the array found by variable m times size of double close parenthesis
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "When invoking the malloc function, what must you do to the result?",
            answer = """
            Cast to the correct pointer type    
            """.trimIndent(),
            questionTts = "",
            answerTts = """
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What must be included in your file to use the malloc function?",
            answer = """
            #include <stdlib.h>
            """.trimIndent(),
            questionTts = "",
            answerTts = """
                hashtag include s t d lib dot h in angle brackets
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What must be included in your file to use string functions?",
            answer = """
            #include <string.h>
            """.trimIndent(),
            questionTts = "",
            answerTts = """
                hashtag include string dot h in angle brackets
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What must be included in your file to use character functions?",
            answer = """
            #include <ctype.h>
            """.trimIndent(),
            questionTts = "",
            answerTts = """
                hashtag include c type dot h in angle brackets
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you free dynamically allocated memory?",
            answer = """
            free(array)
            """.trimIndent(),
            questionTts = "",
            answerTts = """
                The free function which takes a dynamically allocated array as input
                
                For example, free open parenthesis array close parenthesis
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What are the acceptable values for a character in C?",
            answer = """
            0 to 127
            """.trimIndent(),
            questionTts = "",
            answerTts = """
                0 to 127
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What happens when you attempt to assign 400 to a char?",
            answer = """
            Outside ASCII range
             
            Program does not crash but generates warning
            """.trimIndent(),
            questionTts = "",
            answerTts = """
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What does the function strcpy(t, s) do?",
            answer = """
            Copies the contents of array s into array t including null terminator
            """.trimIndent(),
            questionTts = "What does the function s t r c p y open parenthesis t comma s close parenthesis do?",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "What does the function strcat(t, s) do?",
            answer = """
            Concatenates two character arrays together
            """.trimIndent(),
            questionTts = "What does the function s t r cat open parenthesis t comma s close parenthesis do?",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "What does the function strcmp(t, s) do?",
            answer = """
            Compares two character arrays
            
            If s > t: returns -1, if s < t: returns 1, if s == t: return 0
            """.trimIndent(),
            questionTts = "What does the function s t r c m p open parenthesis t comma s close parenthesis do?",
            answerTts = """
                Compares two character arrays
                
                If s is greater than t, returns -1
                
                If s is less than t, returns 1
                
                If s is equal to t, return 0
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What does the function sprintf() do?",
            answer = """
                Prints the output of a printf() into a character array
                
                Parameters are the array variable to print to, then the standard print f parameters
            """.trimIndent(),
            questionTts = "What does the function s print f do?",
            answerTts = """
                Prints the output of a print f function into a character array
                
                Parameters are the array variable to print to, then the standard print f parameters
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How can you check if a character is an alphabetical letter?",
            answer = """
                isalpha(char c)
            """.trimIndent(),
            questionTts = "",
            answerTts = """
                The function is alpha which takes a character parameter
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How can you check if a character is a digit?",
            answer = """
                isdigit(char c)
            """.trimIndent(),
            questionTts = "",
            answerTts = """
                The function is digit which takes a character parameter
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How can you check if a character is alphanumerical?",
            answer = """
                isalnum(char c)
            """.trimIndent(),
            questionTts = "",
            answerTts = """
                The function is al num which takes a character parameter
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How can you check if a character is lowercase?",
            answer = """
                islower(char c)
            """.trimIndent(),
            questionTts = "",
            answerTts = """
                The function is lower which takes a character parameter
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How can you check if a character is uppercase?",
            answer = """
                isupper(char c)
            """.trimIndent(),
            questionTts = "",
            answerTts = """
                The function is upper which takes a character parameter
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "When does the function isspace(char c) return 1?",
            answer = """
                For space, tab, and new line
            """.trimIndent(),
            questionTts = "When does the function is space which takes a character parameter return 1?",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "How do you declare a file pointer variable?",
            answer = """
                FILE *fp
            """.trimIndent(),
            questionTts = "",
            answerTts = """
                FILE space asterisk f p
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you open a file for reading or writing?",
            answer = """
                FILE *fp = fopen("filename", "r" or "w" or "a");
            """.trimIndent(),
            questionTts = "",
            answerTts = """
                FILE in all caps space asterisk f p = f open parenthesis filename as a string comma open option as a string close parenthesis
                 
                Acceptable options are r, w, and a 
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you print to a file?",
            answer = """
                Similar to print f but the first parameter is the file pointer

                fprintf(file_pointer, "message");
            """.trimIndent(),
            questionTts = "",
            answerTts = """
                Similar to print f but the first parameter is the file pointer
                
                f print f open parenthesis file pointer variable comma string message close parenthesis
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "Do you need to always free allocated memory in C?",
            answer = """
                No, if your program is not running for very long the OS will automatically free it on termination
            """.trimIndent(),
            questionTts = "",
            answerTts = """
                 """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you read a double and a string from a file?",
            answer = """
                Similar to scanf but the first parameter is the file pointer

                fscanf(file_pointer, "%d%s", &var, str);
            """.trimIndent(),
            questionTts = "",
            answerTts = """
                Similar to scan f but the first parameter is the file pointer
                
                f scan f open parenthesis file pointer variable comma open quote percent d percent s close quote comma ampersand variable name comma string variable name close parenthesis
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you write one char to a file without using fprintf()?",
            answer = """
                putc('c', fp)
            """.trimIndent(),
            questionTts = "How do you write one char to a file without using the function f print f?",
            answerTts = """
                The function put c open parenthesis char variable comma file pointer variable close parenthesis
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How can you read a single character from a file or user input?",
            answer = """
                char c = getc(stdin)
                
                char c = getc(file_pointer)
            """.trimIndent(),
            questionTts = "",
            answerTts = """
                char c = get c open parenthesis s t d in close parenthesis
                
                char c = get c open parenthesis file pointer variable close parenthesis
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How can you print a single character to a file?",
            answer = """
                putc(ch, fp);
            """.trimIndent(),
            questionTts = "",
            answerTts = """
              put c open parenthesis character variable comma file pointer variable close parenthesis
                 """.trimIndent()
        ),
        QuestionAnswer(
            question = "How can you print a line of characters to a file?",
            answer = """
                fputs(buffer, fp);
            """.trimIndent(),
            questionTts = "",
            answerTts = """
              f puts open parenthesis character variable comma file pointer variable close parenthesis
                 """.trimIndent()
        ),
        QuestionAnswer(
            question = "How can you read a line of characters in a file?",
            answer = """
                fgets(buffer, fp);
            """.trimIndent(),
            questionTts = "",
            answerTts = """
              f gets open parenthesis character variable comma file pointer variable close parenthesis
                 """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you close an open file pointer?",
            answer = """
                fclose(fp);
            """.trimIndent(),
            questionTts = "",
            answerTts = """
              f close open parenthesis file pointer variable close parenthesis
                 """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you define a constant?",
            answer = """
                #define VARIABLE_NAME value
                
                No semi-colon
            """.trimIndent(),
            questionTts = "",
            answerTts = """
              hashtag define variable name in capital letters then the value without a semi-colon
                 """.trimIndent()
        ),
    )
    val python = listOf(
        QuestionAnswer(
            question = "How do you print Hello World to console in Python?",
            answer = """
        print('Hello World')
    """.trimIndent(),
            questionTts = "",
            answerTts = """    
                print open parenthesis Hello World close parenthesis
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do open a file for reading in Python?",
            answer = """
        file = open(file name, "r")
    """.trimIndent(),
            questionTts = "",
            answerTts = """    
                file equals open open parenthesis file name as a string comma r in quotes close parenthesis
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "Which functions returns a string with all characters lowercase?",
            answer = """
        .lower()
    """.trimIndent(),
            questionTts = "",
            answerTts = """    
                dot lower parentheses
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "Which method of language translation does Python use?",
            answer = """
        Hybrid compiled / interpreted
    """.trimIndent(),
            questionTts = "",
            answerTts = """    
                
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you print with a new line in Python?",
            answer = """
        print
        
        The print function automatically adds a new line to the end of the print
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you print without a new line in Python?",
            answer = """
        Change the named end variable to an empty string
    """.trimIndent(),
            questionTts = "",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "How do you read user input in python?",
            answer = """
        variable_name = input("Input Prompt: ")
        
        Returns a string, then cast it as needed
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                variable underscore name equals input open parenthesis open quote Input Prompt String close quote close parenthesis
                
                This returns a string, cast it to other types as needed
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you cast a string to an int?",
            answer = """
        int(string_variable)
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                int open parenthesis string underscore variable close parenthesis
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is the difference between / and // operators in Python?",
            answer = """
        / performs fractional division 13 / 4 = 3.25
        
        // performs integer division 13 // 4 = 3
    """.trimIndent(),
            questionTts = "What is the difference between single forward slash and double forward slash operators in Python",
            answerTts = """
                Single forward slash performs fraction division for example 13 fractional division by 4 is 3 point 2 5
                
                Double forward slash performs integer division for example 13 integer division by 4 is 3
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you compare two strings in Python?",
            answer = """
        In Python, you can simply use relational operators directly
    """.trimIndent(),
            questionTts = "",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "What are the equivalents of &&, ||, and ! operators in Python?",
            answer = """
        && = and
        
        || = or
        
        ! = not
    """.trimIndent(),
            questionTts = "What are the equivalents of double ampersand, double vertical line, and exclamation mark operators in Python",
            answerTts = """
                and
                
                or
                
                not
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is the syntax of an if, else block in Python?",
            answer = """
        Without curly braces
        
        Conditions have colons at the end of them
        
        Indentations are important
    """.trimIndent(),
            questionTts = "",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "What is the else-if keyword in Python?",
            answer = """
        elif
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                e l if
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What does for k in range(2, 10, 2): print(k) do?",
            answer = """
        Prints 2, 4, 6, 8
    """.trimIndent(),
            questionTts = "What does for k in range open parenthesis 2 comma 10 comma 2 close parenthesis colon print open parenthesis k close parenthesis do",
            answerTts = """
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you import a module?",
            answer = """
        import module_name
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                import module underscore name
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you create a list named list containing numbers from 0 to 5?",
            answer = """
        list = [0, 1, 2, 3, 4, 5]
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                list = open square bracket 0, 1, 2, 3, 4, 5 close square bracket
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you create a list of 100 elements of value 100?",
            answer = """
        list = [100] * 100
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                list = open square bracket 100 close square bracket times 100
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you print a list?",
            answer = """
        print(list)
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                print open parenthesis list close parenthesis
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you find the length of a list?",
            answer = """
        len(list)
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                len open parenthesis list close parenthesis
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What does the input '9 in list' return?",
            answer = """
        True if element 9 is in list named list
    """.trimIndent(),
            questionTts = "",
            answerTts = """
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What does \"hello\"[3:5] return?",
            answer = """
        lo
    """.trimIndent(),
            questionTts = "What does open quote hello close quote open square bracket 3 colon 5 close square bracket return?",
            answerTts = """l o
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What does \"hello\".split('e') return?",
            answer = """
        ['h', 'llo']
    """.trimIndent(),
            questionTts = "What does open quote hello close quote dot split open parenthesis character e close parenthesis return?",
            answerTts = """A list containing two elements, h and l l o
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you open a file named outfile for writing?",
            answer = """
         outfile = open("filepath", "w") 
    """.trimIndent(),
            questionTts = "",
            answerTts = """outfile equals open open parenthesis open quote file name close quote comma open quote w close quote close parenthesis
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "Do functions have return types in Python?",
            answer = """
        No, because there are no strict types in Python
    """.trimIndent(),
            questionTts = "",
            answerTts = """
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What does for k in range(1, 5): print(k) do?",
            answer = """
        Prints 1, 2, 3, 4
    """.trimIndent(),
            questionTts = "What does for k in range open parenthesis 1 comma 5 close parenthesis colon print open parenthesis k close parenthesis do",
            answerTts = """
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What does for k in range(5): print(k) do?",
            answer = """
        Prints 0, 1, 2, 3, 4
    """.trimIndent(),
            questionTts = "What does for k in range open parenthesis 5 close parenthesis colon print open parenthesis k close parenthesis do",
            answerTts = """
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What does the ** operator do in Python?",
            answer = """
            Exponent operator
            
            2**3 = 8
    """.trimIndent(),
            questionTts = "What does the double asterisk operator do in Python",
            answerTts = """
                Exponent operator
                
                2 double asterisk 3 equals 8
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "Do increment and decrement operators exist in Python?",
            answer = """
            No
    """.trimIndent(),
            questionTts = "",
            answerTts = """ """.trimIndent()
        ),
        QuestionAnswer(
            question = "What happens if you attempt to print(\"Hello\" + 5)?",
            answer = """
        Compile error
        
        Python will not let you concatenate any variables to a string other than a string, you must first convert 5 to a string with str(5)
    """.trimIndent(),
            questionTts = "What happens if you attempt to print open parenthesis open quote Hello close quote plus 5 close parenthesis?",
            answerTts = """
               Compile error
        
        Python will not let you concatenate any variables to a string other than a string, you must first convert 5 to a string with s t r open parenthesis 5 close parenthesis
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do declare a variable named sum of value 5 and print it?",
            answer = """
        sum = 5
        
        print (sum)
    """.trimIndent(),
            questionTts = "",
            answerTts = """    
                sum = 5
                
                print open parenthesis sum close parenthesis
                """.trimIndent()
        ),
    )
    // COMMON LISP
    val lisp = listOf(
        QuestionAnswer(
            question = "What programming paradigm does LISP represent?",
            answer = """
                Functional
        
    """.trimIndent(),
            questionTts = "",
            answerTts = """    
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "Which function makes a list from s-expressions?",
            answer = """
               list
        
    """.trimIndent(),
            questionTts = "",
            answerTts = """    
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What programming paradigm does LISP represent?",
            answer = """
                Functional
        
    """.trimIndent(),
            questionTts = "",
            answerTts = """    
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "Before using the append function to join an integer I to a list, what must you do?",
            answer = """
                Convert the integer to a list with (list I)
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                 Convert the integer to a list with the list function
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is the keyword to define a function?",
            answer = """
                defun
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                    de fun
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "How would you define a function to return the average of two values?",
            answer = """
               (defun average (x y) (/ (+ x y) 2))
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                    open parenthesis de fun average x and y in parentheses open parenthesis divide symbol plus x and y in parentheses 2 close parenthesis close parenthesis
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "How would you invoke a custom function average which takes two numbers and returns their average?",
            answer = """
               (average number1 number2)
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                    open parenthesis average number 1 number 2 close parenthesis
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you sum 3 and 8 in LISP?",
            answer = """
          (+ 3 8)
    """.trimIndent(),
            questionTts = "",
            answerTts = """
            plus 3 8 in parentheses
            """.trimIndent()
        ),
        QuestionAnswer(
            question = "What does (* (+ 8 3) 2) equate to in LISP?",
            answer = """
            22
    """.trimIndent(),
            questionTts = "",
            answerTts = """    
                What does open parenthesis multiplication symbol open parenthesis plus 8 3 close parenthesis 2 close parenthesis equate to in LISP?
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is the general syntax from in LISP?",
            answer = """
        (function x y z...)
    """.trimIndent(),
            questionTts = "",
            answerTts = """    
                Open parenthesis function identifier variables close parenthesis
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is an atom?",
            answer = """
        A single number, variable, operator, or function names
    """.trimIndent(),
            questionTts = "",
            answerTts = """    
                
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is an s-expression?",
            answer = """
        An atom or a list
    """.trimIndent(),
            questionTts = "What is an s expression",
            answerTts = """    
                
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "How many s-expressions are there in this list: (+ 5 1)?",
            answer = """
        4
    """.trimIndent(),
            questionTts = "How many s expressions are in this list open parenthesis plus 5 1 close parenthesis",
            answerTts = """    
                
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "How many atoms are in this list: (+ 5 1)?",
            answer = """
        3
    """.trimIndent(),
            questionTts = "How many atoms are in this list open parenthesis plus 5 1 close parenthesis",
            answerTts = """    
                
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is returned when an atom is evaluated?",
            answer = """
        A value
    """.trimIndent(),
            questionTts = "",
            answerTts = """    
                
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "How is a list evaluated?",
            answer = """
        First item is the function & other items are arguments
        
        Arguments are evaluated first then function is applied
    """.trimIndent(),
            questionTts = "",
            answerTts = """    
                
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do you set variable x to 6?",
            answer = """
        (setq x 6)
    """.trimIndent(),
            questionTts = "",
            answerTts = """    
                open parenthesis set q   x   6 close parenthesis
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What does (setq x 6) return?",
            answer = """
        6
    """.trimIndent(),
            questionTts = "What does open parenthesis set q   x   6 close parenthesis return?",
            answerTts = """    
                
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "How does the setq function work?",
            answer = """
        The first argument is a variable which is not evaluated
        
        Other arguments are evaluated
    """.trimIndent(),
            questionTts = "How does the set q function work?",
            answerTts = """    
                
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What does the quote function do?",
            answer = """
        Return the input without evaluating it
    """.trimIndent(),
            questionTts = "",
            answerTts = """    
                
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What is a shorthand for (quote 2)?",
            answer = """
       '(2)
    """.trimIndent(),
            questionTts = "What is a shorthand for quote 2 in parenthesis",
            answerTts = """    
                single quote symbol then 2 in parenthesis
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What does '(+ 2 3) return?",
            answer = """
       (+ 2 3)
    """.trimIndent(),
            questionTts = "What does single quote symbol open parenthesis plus 2 3 close parenthesis return?",
            answerTts = """    
                open parenthesis plus 2 3 close parenthesis
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "Why are setq x and set 'x equivalent?",
            answer = """
       The setq function automatically quotes the first parameter
    """.trimIndent(),
            questionTts = "Why are set q and set single quote x equivalent?",
            answerTts = """    
                The set q function automatically quotes the first parameter
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What must the argument of the car function be?",
            answer = """
       A list
    """.trimIndent(),
            questionTts = "",
            answerTts = """    
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What must the argument of the cdr function be?",
            answer = """
       A list
    """.trimIndent(),
            questionTts = "What must the argument of the c d r function be?",
            answerTts = """    
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What the car function return?",
            answer = """
       The first item of the list
    """.trimIndent(),
            questionTts = "",
            answerTts = """    
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What the cdr function return?",
            answer = """
       All list items excluding the first item
    """.trimIndent(),
            questionTts = "What does the c d r function return?",
            answerTts = """    
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What does invoking the cdr or car function on the empty list return?",
            answer = """
       NIL
    """.trimIndent(),
            questionTts = "What does invoking the c d r or car function on the empty list return?",
            answerTts = """    
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "How do write two cdr then a car function by shorthand?",
            answer = """
       caddr
    """.trimIndent(),
            questionTts = "How do write two c d r then a car function by shorthand?",
            answerTts = """
                    c a d d r
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What are the arguments of the cons function?",
            answer = """
       The first is any S-expression, second must be a list
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                    
                """.trimIndent()
        ),
        QuestionAnswer(
            question = "What function is invoked to use conditionals?",
            answer = """
       cond 
    """.trimIndent(),
            questionTts = "",
            answerTts = """
                    
                """.trimIndent()
        ),
    )
    val syntax = listOf(
        QuestionAnswer(
            question = "What is a mathematical definition of grammar?",
            answer = """
            Collection of rules or definitions that describe how to construct valid or correct strings in a language
        """.trimIndent(),
            questionTts = "",
            answerTts = """
        """.trimIndent()
        ),

        QuestionAnswer(
            question = "Which four things make up a grammar?",
            answer = """
            Variables, Terminals, Starting Symbol, Production Rules
        """.trimIndent(),
            questionTts = "",
            answerTts = """
        """.trimIndent()
        ),
    )
    val javaScript = listOf(
        QuestionAnswer(
            question = "What company did JavaScript start in?",
            answer = """
            NetScape
        """.trimIndent(),
            questionTts = "",
            answerTts = """
        """.trimIndent()
        ),
    )
    val swift = listOf(
        QuestionAnswer(
            question = "How do you declare a integer variable of name x?",
            answer = """
            var x: Int
        """.trimIndent(),
            questionTts = "",
            answerTts = """
            var x colon int
        """.trimIndent()
        ),
    )
}