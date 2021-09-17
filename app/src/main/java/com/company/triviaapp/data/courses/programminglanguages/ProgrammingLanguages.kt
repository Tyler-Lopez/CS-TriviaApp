package com.company.triviaapp.data.courses.programminglanguages

import com.company.triviaapp.data.model.QuestionAnswer

class ProgrammingLanguages {
    val chapterOne = listOf(
        QuestionAnswer(
            "What is feature multiplicity?", """
        More than one way to accomplish a operation

        Example: incrementing a integer in Java
    """.trimIndent()
        ),
        QuestionAnswer(
            "What are programming domains?", """
        Places where programming is used
    """.trimIndent()
        ),
        QuestionAnswer(
            "What are Script languages?", """
        Used to write small programs quickly
        
        Perl, MATLAB, R
    """.trimIndent()
        ),
        QuestionAnswer(
            "What are the three most important criteria of language evaluation?", """
        Readability
        
        Writability
        
        Reliability
    """.trimIndent()
        ),
        QuestionAnswer(
            "What are the three less important criteria of language evaluation?", """
        Generality
        
        Portability
        
        Cost
    """.trimIndent()
        ),
        QuestionAnswer(
            "What increases readability?", """
        Simplicity (small # of language features)
        
        Process and data abstraction
        
        Control and block structures
    """.trimIndent()
        ),
        QuestionAnswer(
            "What decreases readability?", """
        Method and operator overloading
        
        Over simplicity (machine code)
    """.trimIndent()
        ),
        QuestionAnswer(
            "What increases writability?", """
        Simplicity (small # of language features)
        
        Process and data abstraction
        
        Control and block structures
        
        Expressivity (ability to express complex structures)
    """.trimIndent()
        ),
        QuestionAnswer(
            "What decreases writability?", """
        Too much expressivity
        
        Extreme simplicity (ex: a language without loops)
    """.trimIndent()
        ),
        QuestionAnswer(
            "What increases reliability?", """
        Type checking at compile time
        
        Exception handling
        
        Readability (easier to find errors)
        
        Writability (less likely to make errors)
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is generality?", """
        When a language can be used to write many types of programs
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is portability?", """
        When a language can be used to write programs that are machine independent
        
        Write once, run anywhere
    """.trimIndent()
        ),
        QuestionAnswer(
            "What are the four language categories?", """
        Procedural
        
        Object Oriented
        
        Functional
        
        Logic
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is operator overloading?", """
        A single operator has more than one meaning

        Example: + is used for both string concatenation and integer addition

        Can lead to reduced readability
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is orthogonality?", """
        Small set of primitive constructs can be combined to build data structures

        From word orthogonal meaning independent of each other

        The more orthogonal a language is the more simple it is, less exceptions
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is aliasing(ale-e-s-ing)?", """
        Having two or more distinct names in a program used to access same memory

        Considered dangerous - decrease reliability

        Two points point to the same variable

        Changing value pointed to by one of the two changes value of other
    """.trimIndent()
        ),
        QuestionAnswer(
            "Define optimization", """
        Techniques compilers do to decrease size and/or increase execution speed
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is the von Neumann(Noyman) Architecture?", """
        Languages designed around called imperative

        Both data & programs stored in same MEMORY

        CPU is separate from memory; instructions piped to CPU

        Program & data fetched, decoded, executed by CPU

        Program languages designed to work around this
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is language translation?", """
        Translating high-level language to machine code
        
        Compiling, interpreting, and hybrid compiling / interpreting
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is procedural programming?", """
        Don't write whole program in one program, divide program into subprograms
        
        Made programs more manageable
        
        AKA imperative
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is functional programming?", """
        Work performed by function calls
        
        AKA applicative languages
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is object oriented programming?", """
        Encapsulation of data and methods
        
        Classes and objects
        
        Inheritance and polymorphism
    """.trimIndent()
        ),
        QuestionAnswer(
            "What are logic programming languages?", """
        Work performed by logic
        
        AKA declarative
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is compiling language translation?", """
        Source code completely translated to machine code
        
        Compiling and executing occur different times
        
        Compile once, run many times
        
        C, C++, Fortran
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is interpreting language translation?", """
        Interpreter translates source code and executes at the same time
        
        Translation occurs everytime program is run
        
        Lisp, Basic
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is hybrid method language translation?", """
        Source code translated to intermediate code (byte code)
        
        Interpreted code may be executed at runtime, line-by-line
        
        Java, Python
    """.trimIndent()
        ),
        QuestionAnswer(
            "What are the three main methods of language translation?", """
        Compiling
        
        Interpreting
        
        Hybrid compiling / interpreting
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is an IDE?", """
        Integrated development environment
        
        Provides package of components: editor, compiler, debugger, libraries
    """.trimIndent()
        ),
        QuestionAnswer(
            "What does it mean for a program to be reliable?", """
        It performs to specification under all conditions
    """.trimIndent()
        ),
        QuestionAnswer(
            "What has been the strongest influence on programming language design?", """
        Computer architecture
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is the name of the category of programming languages whose structure is dictated by the von Neumann computer architecture?",
            """
        Imperative
    """.trimIndent()
        ),
        QuestionAnswer(
            "Which approach to language implementation produces the fastest program execution?", """
        Compiler
    """.trimIndent()
        ),
        QuestionAnswer(
            "Which was the primary application area of computers at the time Fortran was designed?",
            """
        Scientific
    """.trimIndent()
        ),
        QuestionAnswer(
            "Which user group was the target of the first version of BASIC?", """
        Liberal arts students
    """.trimIndent()
        ),
        QuestionAnswer(
            "PL/1 was designed to replace which two languages?", """
        FORTRAN and COBOL
    """.trimIndent()
        ),
        QuestionAnswer(
            "What are two ways the choice of programming language can affect software development cost?",
            """
        Programmer training costs
        
        Writability: more writable = cheaper
        
        Reliability: more reliable, less failures = cheaper
        
        Readability: more readable, less update cost = cheaper
        
        Cost of compiler / debugger if not free
    """.trimIndent()
        ),
        QuestionAnswer(
            "Why do compiled programs typically run faster than interpreted programs?", """
        The process of translating code at run-time adds to the overhead and can cause the program to be slower.
    """.trimIndent()
        ),
    )
    val chapterTwo = listOf(
        QuestionAnswer(
            "What is Plankalkul (plan-kah-kool)?", """
        First "programming language"

        "Programming calculus"
        
        Theoretical language, 40's
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is minimal hardware programming?", """
        Machine code programming

        Punch cards based on light transmission through the holes
        
        40's & 50's
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is FORTRAN?", """
        Procedural & FIRST high-level language
        
        Still used today in science / engineering applications

        Formula Translation System
        
        Beginning of subprogramming approach
        
        50's
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is Lisp?", """
        Functional language
         
        Based on list processing
                
        Descendants include: Common Lisp, Scheme, Haskell
        
        MIT & IBM, John McCarthy, 50's
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is Algol?", """
        Procedural, "Algorithmic" language
        
        FIRST programming language to describe SYNTAX formally
        
        Lost dev support quickly
        
        Descendants include: C, C++, Java
        
        Developed in Europe, 50's
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is COBOL?", """
        Common Business Oriented Language

        For business applications
        
        Blamed for Y2K
        
        IBM, 60's
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is BASIC?", """
        Beginners' All Purpose Symbolic Instruction Code
        
        For teaching basics of programming
        
        Dartmouth, 60's
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is PL/1?", """
        Programming Language 1
        
        Designed to replace FORTRAN & COBOL
        
        IBM, 60's
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is Simula?", """
        First object oriented language
        
        Designed for simulation applications
        
        Norway, 60's
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is Pascal?", """
        For teaching computer science students
        
        Niklaus Wirth, 70's
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is Ada?", """
        Derived from Pascal
        
        Somewhat object-oriented; for embedded systems
        
        Designed with support of the U.S. government, 80's
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is Prolog?", """
        Logic paradigm language
        
        Intended for AI applications
        
        Developed in Europe, 70's
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is SmallTalk?", """
        STRICT, early object-oriented language
        
        Xerox, Alan Kay, 80's
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is C?", """
        Functional language
        
        Bell labs, Dennis Ritchie, 70's
        
        General purpose, widely used
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is C++?", """
        Object oriented, general purpose
        
        Evolved from C and Simula
        
        Contains C
        
        Bell Labs, Bjarne Stroustrup, 80's
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is Java?", """
        Strictly object oriented, general purpose
        
        Evolved from and simpler than C++
        
        Sun Micro Systems, James Gosling, 90's
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is C#?", """
        Object oriented
        
        Widely used, part of .NET
        
        Microsoft, 00's
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is Objective C?", """           
        Used by Apple to develop mobile apps
        
        Object oriented
        
        Developed not by Apple, 80's
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is Perl?", """
        Scripting language related to Unix and C
        
        Considered "mother of all scripting languages"
        
        80's
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is Python?", """
        Started as a scripting language, became general purpose language
        
        Developed by individuals, non-profits, 90's
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is JavaScript, PHP?", """
        Web programming languages
        
        Influenced by C, Perl
        
        Developed by individuals, non-profits, 90's
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is Swift?", """
        Mobile application development language
        
        Developed by Apple, 10's
    """.trimIndent()
        ),
        QuestionAnswer(
            "What two programming languages from the 1960 - 1970 were mainly used for teaching purposes?",
            """
        Pascal and Basic
    """.trimIndent()
        ),
        QuestionAnswer(
            "Name three special purpose programming languages and their domain of applications?",
            """
        Visual Basic - Basic UI
        
        SQL - Database
        
        OpenGL - Graphics
        
        FORTRAN - Science & Engineering
        
        COBOL - Business Applications
    """.trimIndent()
        ),
        QuestionAnswer(
            "In which language is the majority of the UNIX operating system written in?", """
        C
    """.trimIndent()
        ),
        QuestionAnswer(
            "Which two object oriented languages influenced the design of Java?", """
        C++ & Simula
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is the first object oriented programming language?", """
        Simula
    """.trimIndent()
        ),
        QuestionAnswer(
            "When and by who was the markup language HTML developed?", """
        Tim Berners-Lee
        
        90's
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is the difference between a compiler and integrated development environment?", """
        Compiler: transforms source code into a lower-level language
        
        IDE: set of software development tools designed to make coding easier
    """.trimIndent()
        ),
        QuestionAnswer(
            "Name two Java language features that increase the reliability of Java programs", """
        Compile time static type-checking
        
        Exception handling
        
        Try-with-resources
        
        Generics
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
        
        Structures (Structs)
        
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
                int x open square bracket 50 close square bracket
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
            question = "Given an int y = 7, what does int *p = &y; do?",
            answer = """
         p stores, or points to, the memory address location of y
    """.trimIndent(),
            questionTts = "Given an integer variable y = 7, what does int space asterisk p = ampersand y do?",
            answerTts = """
                p will store or point to the memory address location of y
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
                int arr open square bracket 5 close square bracket = { 1, 2, 3, 4, 5 }
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
        No
        
        A pointer cannot be equal to an int, you must instead write int *p = &n
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
        
        C does not have booleans, 1 == true
    """.trimIndent(),
            questionTts = "What does 9 greater than 5 return in C?",
            answerTts = """
                1
                
                C does not have booleans, 1 is the same as true
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
        scanf("% type of input", & name of the pre-initialized variable where data should be stored)
    """.trimIndent(),
            questionTts = "How do you read user input?",
            answerTts = """
                With the method scan f which takes two parameters.
                
                The first parameter is the type of input specified by a percent identifier enclosed in quotations
                
                The second parameter is the name of the pre-initialized variable where the data should be stored, the ampersand symbol must be placed before it if primitive to specify this is a location
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
            question = "What does srand(seed) do?",
            answer = """
        Initializes a random number generator which is automatically used by any call of rand
    """.trimIndent(),
            questionTts = "What does s rand open parenthesis seed int variable do?",
            answerTts = """""".trimIndent()
        ),
        QuestionAnswer(
            question = "What does rand() do?",
            answer = """
        Returns a random number
    """.trimIndent(),
            questionTts = "What does rand empty parentheses do?",
            answerTts = """""".trimIndent()
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
            question = "What happens when you attempt char x = 400?",
            answer = """
            Outside ASCII range
             
            Program does not crash but generates warning
            """.trimIndent(),
            questionTts = "",
            answerTts = """
                400 is outside of the ASCII range
                
                The program would not crash but does generate a warning
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
    )

}