package com.company.triviaapp.programminglanguages

class ProgrammingLanguages {
    val chapterOne = listOf(
        Pair(
            "What is feature multiplicity?", """
        • More than one way to accomplish a operation

        • Example: incrementing a integer in Java
    """.trimIndent()
        ),
        Pair(
            "What are programming domains?", """
        • Places where programming is used
    """.trimIndent()
        ),
        Pair(
            "What are Script languages?", """
        • Used to write small programs quickly
        
        • Pert, MATLAB, R
    """.trimIndent()
        ),
        Pair(
            "What are the three most important criteria of language evaluation?", """
        • Readability
        
        • Writability
        
        • Reliability
    """.trimIndent()
        ),
        Pair(
            "What are the three less important criteria of language evaluation?", """
        • Generality
        
        • Portability
        
        • Cost
    """.trimIndent()
        ),
        Pair(
            "What increases readability?", """
        • Simplicity (small # of language features)
        
        • Process Abstraction (subprograms)
        
        • Data Abstraction (user defined data)
        
        • Control and block structures
    """.trimIndent()
        ),
        Pair(
            "What decreases readability?", """
        • Method and operator overloading
        
        • Over simplicity - machine code
    """.trimIndent()
        ),
        Pair(
            "What increases writability?", """
        • Simplicity (small # of language features)
        
        • Process Abstraction (subprograms)
        
        • Data Abstraction (user defined data)
        
        • Control and block structures
        
        • Expressivity (ability to express ideas - recursion, inheritance, etc)
    """.trimIndent()
        ),
        Pair(
            "What decreases writability?", """
        • Too much expressivity
        
        • Extreme simplicity (ex: a language without loops)
    """.trimIndent()
        ),
        Pair(
            "What increases reliability?", """
        • Type checking at compile time
        
        • Exception handling
        
        • Readability (easier to find errors)
        
        • Writability (less likely to make errors)
    """.trimIndent()
        ),
        Pair(
            "What is generality?", """
        • When a language can be used to write many types of programs
    """.trimIndent()
        ),
        Pair(
            "What is portability?", """
        • When a language can be used to write programs that are machine independent
        
        • Write once, run anywhere
    """.trimIndent()
        ),
        Pair(
            "What are the four language categories?", """
        • Procedural
        
        • Object Oriented
        
        • Functional
        
        • Logic
    """.trimIndent()
        ),
        Pair(
            "What is operator overloading?", """
        • A single operator has more than one meaning

        • Example: + is used for both string concatenation and integer addition 

        • Can lead to reduced readability
    """.trimIndent()
        ),
        Pair(
            "What is orthogonality?", """
        • Small set of primitive constructs can be combined to build data structures

        • From word orthogonal meaning independent of each other

        • The more orthogonal a language is the more simple it is, less exceptions
    """.trimIndent()
        ),
        Pair(
            "What is aliasing(ale-e-s-ing)?", """
        • Having two or more distinct names in a program used to access same memory

        • Considered dangerous - decrease reliability

        • Two points point to the same variable

        • Changing value pointed to by one of the two changes value of other
    """.trimIndent()
        ),
        Pair(
            "Define optimization", """
        • Techniques compilers do to decrease size and/or increase execution speed
    """.trimIndent()
        ),
        Pair(
            "What is the von Neumann(Noyman) Architecture?", """
        • Languages designed around called imperative

        • Both data & programs stored in same MEMORY

        • CPU is separate from memory; instructions piped to CPU

        • Program & data fetched, decoded, executed by CPU 

        • Program languages designed to work around this
    """.trimIndent()
        ),
        Pair(
            "What is language translation?", """
        • Translating high-level language to machine code
        
        • Compiling, interpreting, and hybrid compiling / interpreting
    """.trimIndent()
        ),
        Pair(
            "What is procedural programming?", """
        • Don't write whole program in one program
        
        • Divide program into subprograms, then put them together
        
        • Makes programs more manageable        
        
        • AKA imperative
    """.trimIndent()
        ),
        Pair(
            "What is functional programming?", """
        • Work performed by function calls
        
        • Use of recursion
        
        • AKA applicative      
    """.trimIndent()
        ),
        Pair(
            "What is object oriented programming?", """
        • Encapsulation of data and methods
        
        • Classes and objects
        
        • Inheritance and polymorphism       
    """.trimIndent()
        ),
        Pair(
            "What are logic programming languages?", """
        • Work performed by logic
        
        • AKA declarative 
    """.trimIndent()
        ),
        Pair(
            "What is compiling?", """
        • Source code translated to machine code
        
        • Compiling and executing occur different times
        
        • Compile once run many times
        
        • C, C++, Fortran
    """.trimIndent()
        ),
        Pair(
            "What is interpreting?", """
        • Interpreter decodes instructions in source program and executes
        
        • Compiling and executing occur same time
        
        • Translation occurs everytime program is run
        
        • Lisp, Basic, Perl
    """.trimIndent()
        ),
        Pair(
            "What is hybrid method?", """
        • Compiler compiles code into intermediate code (byte code)
        
        • Interpreter interprets intermediate code
        
        • Java, Python, JavaScript
    """.trimIndent()
        ),
        Pair(
            "What are the three main methods of language translation?", """
        • Compiling
        
        • Interpreting
        
        • Hybrid compiling / interpreting
    """.trimIndent()
        ),
        Pair(
            "What is an IDE?", """
        • Integrated development environment
        
        • Provides package of components: editor, compiler, debugger, libraries
    """.trimIndent()
        ),
    )
    val chapterTwo = listOf(
        Pair(
            "What is Plankalkul (plan-kah-kool)?", """
        • First "programming language"

        • "Programming calculus"
        
        • Theoretical language, 1945
    """.trimIndent()
        ),
        Pair(
            "What is minimal hardware programming?", """
        • Machine code programming

        • Punch cards based on light transmission through the holes
        
        • 40's & 50's
    """.trimIndent()
        ),
        Pair(
            "What is Fortran?", """
        • First high-level language BUT statement-oriented

        • Formula Translation System (like scientific formulas)
        
        • Beginning of subprogramming approach
        
        • Versions include: I - IV, 77, 90, 95, 2003, 2008
    """.trimIndent()
        ),
        Pair(
            "What is Lisp?", """
        • Functional programming language - 1950's

        • List processing - program and data represented using lists
                
        • Descendants include: Common Lisp, Scheme, Haskell
    """.trimIndent()
        ),
        Pair(
            "What is Algol?", """
        • Algorithmic language - 1950's

        • Procedure-oriented (subprograms) 
        
        • Introduction to idea of methods, block structures, local scope, recursion, syntax description (BNF)
        
        • Not developed by a company
        
        • Descendants include: C, C++, Java
    """.trimIndent()
        ),
        Pair(
            "What is Cobol?", """
        • Common Business Oriented Language - IBM, 1960

        • For business applications
        
        • Blamed for Y2K            
    """.trimIndent()
        ),
        Pair(
            "What is Basic?", """
        • Beginning All Purpose Symbolic Instruction Code         
    """.trimIndent()
        ),
    )
}