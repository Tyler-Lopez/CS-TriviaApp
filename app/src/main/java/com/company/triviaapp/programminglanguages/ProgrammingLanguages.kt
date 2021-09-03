package com.company.triviaapp.programminglanguages

import QuestionWithAnswer

class ProgrammingLanguages {
    val chapterOne: List<QuestionWithAnswer> = listOf(
        QuestionWithAnswer(
            "What is feature multiplicity?", """
        • More than one way to accomplish a operation

        • Example: incrementing a integer in Java
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is operator overloading?", """
        • A single operator has more than one meaning

        • Example: + is used for both string concatenation and integer addition 

        • Can lead to reduced readability
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is orthogonality?", """
        • Small set of primitive constructs can be combined to build data structures

        • From word orthogonal meaning independent of each other

        • The more orthogonal a language is the more simple it is, less exceptions
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is aliasing(ale-e-s-ing)?", """
        • Having two or more distinct names in a program used to access same memory

        • Considered dangerous - decrease reliability

        • Two points point to the same variable

        • Changing value pointed to by one of the two changes value of other
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "Define optimization", """
        • Techniques compilers do to decrease size and/or increase execution speed
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is portability?", """
        • How easy it is to move programs from one implementation to another

        • Influenced by standardization of language
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is the von Neumann(Noyman) Architecture?", """
        • Languages designed around called imperative

        • Both data and programs stored in same memory

        • CPU is separate from memory; instructions piped to CPU

        • Variables = memory cells

        • Assignment = piping
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is the fetch-execute cycle?", """
        • Instruction to be executed must be moved from memory to processor

        • Initialize program counter

        • Repeat forever

        • Fetch instruction

        • Increment counter

        • Decode instruction

        • Execute instruction, go back to repeat until end of repeat
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is language translation?", """
        • Translating high-level language to machine code
        
        • Compiling, interpreting, and hybrid compiling / interpreting
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is procedural programming?", """
        • Don't write whole program in one program
        
        • Divide program into subprograms, then put them together
        
        • Makes programs more manageable
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is compiling?", """
        • Source code translated to machine code
        
        • Compiling and executing occur different times
        
        • Compile once run many times
        
        • C, C++, Fortran
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is interpreting?", """
        • Interpreter decodes instructions in source program and executes
        
        • Compiling and executing occur same time
        
        • Translation occurs everytime program is run
        
        • Lisp, Basic, Perl
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is hybrid method?", """
        • Compiler compiles code into intermediate code (byte code)
        
        • Interpreter interprets intermediate code
        
        • Java, Python, JavaScript
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is an IDE?", """
        • Integrated development environment
        
        • Provides package of components: editor, compiler, debugger, libraries
    """.trimIndent()
        ),
    )
    val chapterTwo: List<QuestionWithAnswer> = listOf(
        QuestionWithAnswer(
            "What is Plankalkul?", """
        • First "programming language"

        • "Programming calculus"
        
        • Theoretical language, 1945
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is minimal hardware programming?", """
        • Machine code programming

        • Punch cards based on light transmission through the holes
        
        • 40's & 50's
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is Fortran?", """
        • First high-level language BUT statement-oriented

        • Formula Translation System (like scientific formulas)
        
        • Beginning of subprogramming approach
        
        • Versions include: I - IV, 77, 90, 95, 2003, 2008
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is Lisp?", """
        • Functional programming language - 1950's

        • List processing - program and data represented using lists
                
        • Descendants include: Common Lisp, Scheme, Haskell
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is Algol?", """
        • Algorithmic language - 1950's

        • Procedure-oriented (subprograms) 
        
        • Introduction to idea of methods, block structures, local scope, recursion, syntax description (BNF)
        
        • Not developed by a company
        
        • Descendants include: C, C++, Java
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is Cobol?", """
        • Common Business Oriented Language - IBM, 1960

        • For business applications
        
        • Blamed for Y2K            
    """.trimIndent()
        ),
    )
}