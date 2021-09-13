package com.company.triviaapp.programminglanguages

class ProgrammingLanguages {
    val chapterOne = listOf(
        Pair(
            "What is feature multiplicity?", """
        More than one way to accomplish a operation

        Example: incrementing a integer in Java
    """.trimIndent()
        ),
        Pair(
            "What are programming domains?", """
        Places where programming is used
    """.trimIndent()
        ),
        Pair(
            "What are Script languages?", """
        Used to write small programs quickly
        
        Perl, MATLAB, R
    """.trimIndent()
        ),
        Pair(
            "What are the three most important criteria of language evaluation?", """
        Readability
        
        Writability
        
        Reliability
    """.trimIndent()
        ),
        Pair(
            "What are the three less important criteria of language evaluation?", """
        Generality
        
        Portability
        
        Cost
    """.trimIndent()
        ),
        Pair(
            "What increases readability?", """
        Simplicity (small # of language features)
        
        Process and data abstraction
        
        Control and block structures
    """.trimIndent()
        ),
        Pair(
            "What decreases readability?", """
        Method and operator overloading
        
        Over simplicity (machine code)
    """.trimIndent()
        ),
        Pair(
            "What increases writability?", """
        Simplicity (small # of language features)
        
        Process and data abstraction
        
        Control and block structures
        
        Expressivity (ability to express complex structures)
    """.trimIndent()
        ),
        Pair(
            "What decreases writability?", """
        Too much expressivity
        
        Extreme simplicity (ex: a language without loops)
    """.trimIndent()
        ),
        Pair(
            "What increases reliability?", """
        Type checking at compile time
        
        Exception handling
        
        Readability (easier to find errors)
        
        Writability (less likely to make errors)
    """.trimIndent()
        ),
        Pair(
            "What is generality?", """
        When a language can be used to write many types of programs
    """.trimIndent()
        ),
        Pair(
            "What is portability?", """
        When a language can be used to write programs that are machine independent
        
        Write once, run anywhere
    """.trimIndent()
        ),
        Pair(
            "What are the four language categories?", """
        Procedural
        
        Object Oriented
        
        Functional
        
        Logic
    """.trimIndent()
        ),
        Pair(
            "What is operator overloading?", """
        A single operator has more than one meaning

        Example: + is used for both string concatenation and integer addition

        Can lead to reduced readability
    """.trimIndent()
        ),
        Pair(
            "What is orthogonality?", """
        Small set of primitive constructs can be combined to build data structures

        From word orthogonal meaning independent of each other

        The more orthogonal a language is the more simple it is, less exceptions
    """.trimIndent()
        ),
        Pair(
            "What is aliasing(ale-e-s-ing)?", """
        Having two or more distinct names in a program used to access same memory

        Considered dangerous - decrease reliability

        Two points point to the same variable

        Changing value pointed to by one of the two changes value of other
    """.trimIndent()
        ),
        Pair(
            "Define optimization", """
        Techniques compilers do to decrease size and/or increase execution speed
    """.trimIndent()
        ),
        Pair(
            "What is the von Neumann(Noyman) Architecture?", """
        Languages designed around called imperative

        Both data & programs stored in same MEMORY

        CPU is separate from memory; instructions piped to CPU

        Program & data fetched, decoded, executed by CPU

        Program languages designed to work around this
    """.trimIndent()
        ),
        Pair(
            "What is language translation?", """
        Translating high-level language to machine code
        
        Compiling, interpreting, and hybrid compiling / interpreting
    """.trimIndent()
        ),
        Pair(
            "What is procedural programming?", """
        Don't write whole program in one program, divide program into subprograms
        
        Made programs more manageable
        
        AKA imperative
    """.trimIndent()
        ),
        Pair(
            "What is functional programming?", """
        Work performed by function calls
        
        AKA applicative languages
    """.trimIndent()
        ),
        Pair(
            "What is object oriented programming?", """
        Encapsulation of data and methods
        
        Classes and objects
        
        Inheritance and polymorphism
    """.trimIndent()
        ),
        Pair(
            "What are logic programming languages?", """
        Work performed by logic
        
        AKA declarative
    """.trimIndent()
        ),
        Pair(
            "What is compiling language translation?", """
        Source code completely translated to machine code
        
        Compiling and executing occur different times
        
        Compile once, run many times
        
        C, C++, Fortran
    """.trimIndent()
        ),
        Pair(
            "What is interpreting language translation?", """
        Interpreter translates source code and executes at the same time
        
        Translation occurs everytime program is run
        
        Lisp, Basic
    """.trimIndent()
        ),
        Pair(
            "What is hybrid method language translation?", """
        Source code translated to intermediate code (byte code)
        
        Interpreted code may be executed at runtime, line-by-line
        
        Java, Python
    """.trimIndent()
        ),
        Pair(
            "What are the three main methods of language translation?", """
        Compiling
        
        Interpreting
        
        Hybrid compiling / interpreting
    """.trimIndent()
        ),
        Pair(
            "What is an IDE?", """
        Integrated development environment
        
        Provides package of components: editor, compiler, debugger, libraries
    """.trimIndent()
        ),
        Pair(
            "What does it mean for a program to be reliable?", """
        It performs to specification under all conditions
    """.trimIndent()
        ),
        Pair(
            "What has been the strongest influence on programming language design?", """
        Computer architecture
    """.trimIndent()
        ),
        Pair(
            "What is the name of the category of programming languages whose structure is dictated by the von Neumann computer architecture?", """
        Imperative
    """.trimIndent()
        ),
        Pair(
            "Which approach to language implementation produces the fastest program execution?", """
        Compiler
    """.trimIndent()
        ),
        Pair(
            "Which was the primary application area of computers at the time Fortran was designed?", """
        Scientific
    """.trimIndent()
        ),
        Pair(
            "Which user group was the target of the first version of BASIC?", """
        Liberal arts students
    """.trimIndent()
        ),
        Pair(
            "PL/1 was designed to replace which two languages?", """
        FORTRAN and COBOL
    """.trimIndent()
        ),
        Pair(
            "What are two ways the choice of programming language can affect software development cost?", """
        Programmer training costs
        
        Writability: more writable = cheaper
        
        Reliability: more reliable, less failures = cheaper
        
        Readability: more readable, less update cost = cheaper
        
        Cost of compiler / debugger if not free
    """.trimIndent()
        ),
        Pair(
            "Why do compiled programs typically run faster than interpreted programs?", """
        The process of translating code at run-time adds to the overhead and can cause the program to be slower.
    """.trimIndent()
        ),
    )
    val chapterTwo = listOf(
        Pair(
            "What is Plankalkul (plan-kah-kool)?", """
        First "programming language"

        "Programming calculus"
        
        Theoretical language, 40's
    """.trimIndent()
        ),
        Pair(
            "What is minimal hardware programming?", """
        Machine code programming

        Punch cards based on light transmission through the holes
        
        40's & 50's
    """.trimIndent()
        ),
        Pair(
            "What is FORTRAN?", """
        Procedural & FIRST high-level language
        
        Still used today in science / engineering applications

        Formula Translation System
        
        Beginning of subprogramming approach
        
        50's
    """.trimIndent()
        ),
        Pair(
            "What is Lisp?", """
        Functional language
         
        Based on list processing
                
        Descendants include: Common Lisp, Scheme, Haskell
        
        MIT & IBM, John McCarthy, 50's
    """.trimIndent()
        ),
        Pair(
            "What is Algol?", """
        Procedural, "Algorithmic" language
        
        FIRST programming language to describe SYNTAX formally
        
        Lost dev support quickly
        
        Descendants include: C, C++, Java
        
        Developed in Europe, 50's
    """.trimIndent()
        ),
        Pair(
            "What is COBOL?", """
        Common Business Oriented Language

        For business applications
        
        Blamed for Y2K
        
        IBM, 60's
    """.trimIndent()
        ),
        Pair(
            "What is BASIC?", """
        Beginners' All Purpose Symbolic Instruction Code
        
        For teaching basics of programming
        
        Dartmouth, 60's
    """.trimIndent()
        ),
        Pair(
            "What is PL/1?", """
        Programming Language 1
        
        Designed to replace FORTRAN & COBOL
        
        IBM, 60's
    """.trimIndent()
        ),
        Pair(
            "What is Simula?", """
        First object oriented language
        
        Designed for simulation applications
        
        Norway, 60's
    """.trimIndent()
        ),
        Pair(
            "What is Pascal?", """
        For teaching computer science students
        
        Niklaus Wirth, 70's
    """.trimIndent()
        ),
        Pair(
            "What is Ada?", """
        Derived from Pascal
        
        Somewhat object-oriented; for embedded systems
        
        Designed with support of the U.S. government, 80's
    """.trimIndent()
        ),
        Pair(
            "What is Prolog?", """
        Logic paradigm language
        
        Intended for AI applications
        
        Developed in Europe, 70's
    """.trimIndent()
        ),
        Pair(
            "What is SmallTalk?", """
        STRICT, early object-oriented language
        
        Xerox, Alan Kay, 80's
    """.trimIndent()
        ),
        Pair(
            "What is C?", """
        Functional language
        
        Bell labs, Dennis Ritchie, 70's
        
        General purpose, widely used
    """.trimIndent()
        ),
        Pair(
            "What is C++?", """
        Object oriented, general purpose
        
        Evolved from C and Simula
        
        Contains C
        
        Bell Labs, Bjarne Stroustrup, 80's
    """.trimIndent()
        ),
        Pair(
            "What is Java?", """
        Strictly object oriented, general purpose
        
        Evolved from and simpler than C++
        
        Sun Micro Systems, James Gosling, 90's
    """.trimIndent()
        ),
        Pair(
            "What is C#?", """
        Object oriented
        
        Widely used, part of .NET
        
        Microsoft, 00's
    """.trimIndent()
        ),
        Pair(
            "What is Objective C?", """           
        Used by Apple to develop mobile apps
        
        Object oriented
        
        Developed not by Apple, 80's
    """.trimIndent()
        ),
        Pair(
            "What is Perl?", """
        Scripting language related to Unix and C
        
        Considered "mother of all scripting languages"
        
        80's
    """.trimIndent()
        ),
        Pair(
            "What is Python?", """
        Started as a scripting language, became general purpose language
        
        Developed by individuals, non-profits, 90's
    """.trimIndent()
        ),
        Pair(
            "What is JavaScript, PHP?", """
        Web programming languages
        
        Influenced by C, Perl
        
        Developed by individuals, non-profits, 90's
    """.trimIndent()
        ),
        Pair(
            "What is Swift?", """
        Mobile application development language
        
        Developed by Apple, 10's
    """.trimIndent()
        ),
        Pair(
            "What two programming languages from the 1960 - 1970 were mainly used for teaching purposes?", """
        Pascal and Basic
    """.trimIndent()
        ),
        Pair(
            "Name three special purpose programming languages and their domain of applications?", """
        Visual Basic - Basic UI
        
        SQL - Database
        
        OpenGL - Graphics
        
        FORTRAN - Science & Engineering
        
        COBOL - Business Applications
    """.trimIndent()
        ),
        Pair(
            "In which language is the majority of the UNIX operating system written in?", """
        C
    """.trimIndent()
        ),
        Pair(
            "Which two object oriented languages influenced the design of Java?", """
        C++ & Simula
    """.trimIndent()
        ),
        Pair(
            "What is the first object oriented programming language?", """
        Simula
    """.trimIndent()
        ),
        Pair(
            "When and by who was the markup language HTML developed?", """
        Tim Berners-Lee
        
        Early 90's
    """.trimIndent()
        ),
        Pair(
            "What is the difference between a compiler and integrated development environment?", """
        Compiler: transforms source code into a lower-level language
        
        IDE: set of software development tools designed to make coding easier
    """.trimIndent()
        ),
        Pair(
            "Name two Java language features that increase the reliability of Java programs", """
        Compile time static type-checking
        
        Exception handling
        
        Try-with-resources
        
        Generics
    """.trimIndent()
        ),

    )

    val chapterThree = listOf(
        Pair(
            "What is the extension of C source files?", """
        .c
    """.trimIndent()
        ),
        Pair(
            "What is the return type of the main function?", """
        int
        
        Returning 0 is seen as a success
    """.trimIndent()
        ),
        Pair(
            "Does the main function require parameters?", """
        No
        
        Unlike Java, C does not require String[] args in the main method / function
        
        main() or main(void) both work
    """.trimIndent()
        ),
        Pair(
            "Does C have public or static keywords?", """
        No
    """.trimIndent()
        ),
        Pair(
            "How do you import printf?", """
        #include <stdio.h>
        
        Including Standard IO header
    """.trimIndent()
        ),
        Pair(
            "How do you print \"Hello World\" and a new line?", """
        printf("Hello World\n");
    """.trimIndent()
        ),
        Pair(
            "Do variables and function identifiers use camelCase?", """
        No
        
        Best practice is all lowercase, with words separated by underscore _
    """.trimIndent()
        ),
        Pair(
            "What does size of types mean?", """
        Size of types is fixed in Java - this is NOT the case in C
        
        You can find out the size of types with: sizeof(int), sizeof(variable) - returns bytes
    """.trimIndent()
        ),
        Pair(
            "How do you declare a integer named my_number?", """
        int my_number;
    """.trimIndent()
        ),
        Pair(
            "Provided an integer variable, my_number, how do you print it preceded by \"My number is: \"", """
        printf("My number is: %i\n", my_number);
        
        %i = integer
    """.trimIndent()
        ),
        Pair(
            "Provided a float variable, my_float, how do you print it preceded by \"My float is: \"", """
        printf("My float is: %f\n", my_float);
        
        %f = float
    """.trimIndent()
        ),
        Pair(
            "What are four categories of types in C?", """
        Numerical
        
        Arrays
        
        Structures (Structs)
        
        Pointers
    """.trimIndent()
        ),
        Pair(
            "What are all of the integer types in C?", """
        char
        
        short
        
        int
        
        long
        
        long long
    """.trimIndent()
        ),
        Pair(
            "What are all of the floating point types in C?", """
        float
        
        double
    """.trimIndent()
        ),
        Pair(
            "How do you declare an array of 50 integers in C?", """
        int x[50];
    """.trimIndent()
        ),
        Pair(
            "When is a struct useful?", """
        When you have a lot of information you want to keep together, like a class in Java
    """.trimIndent()
        ),
        Pair(
            "How would you define a struct for a person?", """
        struct person { char name[50]; int age; int height_in_inches; }
    """.trimIndent()
        ),
        Pair(
            "Provided a defined struct for person, how do you declare two different persons?", """
        struct person person_1
        struct person person_2
    """.trimIndent()
        ),
        Pair(
            "What do pointers do?", """
        Store memory addresses or locations in memory
    """.trimIndent()
        ),
        Pair(
            "What do pointers do?", """
        Store memory addresses or locations in memory
    """.trimIndent()
        ),
        Pair(
            "Given an int y = 7, what does int *p = &y; do?", """
         p stores, or points to, the location of y
         
         Putting & before a variable returns the memory address
    """.trimIndent()
        ),
        Pair(
            "Provided a pointer *p, what are two ways you can print it?", """
         printf("%p", p) - prints the memory address
         
         printf("%i", *p) - prints the int which p points to
    """.trimIndent()
        ),
        Pair(
            "If a pointer *p points at a int variable y, can you change the value of y from *p?", """
         Yes
         
         *p = 14;
    """.trimIndent()
        ),
        Pair(
            "What does it mean to be an unsigned type?", """
        The type cannot be negative, but can store a larger positive number for the same size
    """.trimIndent()
        ),
        Pair(
            "How would you create an array of 1, 2, 3, 4, 5?", """
        int arr[5] = {1, 2, 3, 4, 5}
    """.trimIndent()
        ),
        Pair(
            "Provided an integer variable n, is int *p = n acceptable?", """
        No
        
        A pointer cannot be equal to a integer, you must instead write int *p = &n
    """.trimIndent()
        ),
        Pair(
            "Provided an array variable n, is int *p = n acceptable?", """
        Yes
        
        When creating a pointer to an array, you do not use &
        
        An array is also a location in memory
    """.trimIndent()
        ),
        Pair(
            "How are arrays different from pointers?", """
        Arrays allocate space on definition
        
        The compiler tracks the size of arrays and will not let you access out of their bounds in compile-time
        
        Pointers will crash on run-time upon accessing out of their bounds
    """.trimIndent()
        ),
        Pair(
            "How do you use a while loop?", """
        Same as Java
        
        Initialize a counter variable
        
        Create a loop block with while (counter < target) { }
        
        Increment the counter within the loop block
    """.trimIndent()
        ),
        Pair(
            "How do you use a for loop?", """
        Same as Java BUT you must declare count variable outside of the loop
        
        Modern versions of C does not 
        
        int count;
        for (count = 0; counter < target; counter ++) { }
    """.trimIndent()
        ),
        Pair(
            "What does break mean in a loop?", """
        Exit the loop entirely
    """.trimIndent()
        ),
        Pair(
            "What does continue mean in a loop?", """
        Exit the current iteration of the loop and continue iterations
    """.trimIndent()
        ),
        Pair(
            "What is the commenting syntax in C?", """
        Same as Java
        
        // for single-line
        
        /* */ for multi-line
    """.trimIndent()
        ),
        Pair(
            "Is int weights[3] = { 70, 90, 60 } or int weights[] = { 70, 90, 60 } valid?", """
        Both are valid array initializations
    """.trimIndent()
        ),
        Pair(
            "Given int x; double y, z; what happens if you attempt to assign x to z?", """
        z = x;
        
        Integer x is converted to double
        
        Example: 5 -> 5.0
    """.trimIndent()
        ),
        Pair(
            "Given int x; double y, z; what happens if you attempt to assign z to x?", """
        x = z;
        
        Double z is converted to int with loss of precision
        
        Java would inform you this is a problem, C will NOT
        
        Example: 5.7 -> 5
    """.trimIndent()
        ),
        Pair(
            "What does (9 > 5) return in C?", """
        1
        
        C does not have booleans, 1 == true
    """.trimIndent()
        ),
        Pair(
            "Is 5 considered \"true\" in C?", """
        Yes
        
        Anything that isn't 0 is considered true
    """.trimIndent()
        ),
        Pair(
            "Given int x; double y, z; what happens if you attempt to assign x * z to y?", """
        y = z * x;
        
        Integer x is converted to double, y will 
    """.trimIndent()
        ),
        Pair(
            "How do you explicitly cast a double variable x to int?", """
        (int) x
    """.trimIndent()
        ),
        Pair(
            "What is 9 & 5?", """
        9: 1001
        
        5: 0101
        
        9 & 5 : 0001 = 1
        
        Bitwise AND
    """.trimIndent()
        ),
        Pair(
            "What is 9 | 5?", """
        9: 1001
        
        5: 0101
        
        9 & 5 : 1101 = 13
        
        Bitwise OR
    """.trimIndent()
        ),
        Pair(
            "What is 9 ^ 5?", """
        9: 1001
        
        5: 0101
        
        9 & 5 : 1100 = 12
        
        Bitwise Exclusive OR
    """.trimIndent()
        ),
        Pair(
            "What is ~9?", """
        9: 1001
        
        ~9: 0110 = 6
        
        Bitwise NOT
    """.trimIndent()
        ),
        Pair(
            "What is 9 >> 2?", """
        9: 1001
        
        9 >> 2: 0010 = 2
    """.trimIndent()
        ),
        Pair(
            "What is 9 << 1?", """
        9: 1001
        
        9 << 1: 10010 = 2
        
        Left shifting by 1 bit is == multiplying by 2
    """.trimIndent()
        ),
        Pair(
            "How do strings work in C?", """
        Strings are an array of MUTABLE characters with a null termination
        
        [ 'T', 'e', 'x', 't', 0 ]
        
        ASCII
    """.trimIndent()
        ),
        Pair(
            "How do you declare a string containing \"Hello World\"?", """
        char *str1 = "Hello World"
        
        char str2[] = "Hello World"
    """.trimIndent()
        ),
        Pair(
            "How do you print a string variable my_string using printf?", """
        printf("%s", my_string)
    """.trimIndent()
        ),
        Pair(
            "What is the size (in bytes) of \"Hello!\"?", """
        7
        
        Each char is a byte, then there is an additional null char used to terminate the char array we don't see
        
        [ 'H', 'e', 'l', 'l', 'o', '!', 0 ]
    """.trimIndent()
        ),
        Pair(
            "How would you write a function to return the length of a string?", """
        Input parameter is a char pointer or array
        
        Initialize a counter variable, loop through the pointer or array with the counter
        
        Stop when a 0 is found, return int
    """.trimIndent()
        ),
        Pair(
            "Does C have boolean data types?", """
        No
        
        Use 1 or 0 to indicate true or false
    """.trimIndent()
        ),
        Pair(
            "What does .h mean?", """
        Header file
    """.trimIndent()
        ),
        Pair(
            "Given char name[20] = \"John\", what happens if you attempt to access name[500]?", """
        Unlike Java, the problem will likely not crash
        
        It will access whatever byte of memory is at that location
    """.trimIndent()
        ),
        Pair(
            "Given char name[20] = \"John\", what happens if you attempt to assign name[500]?", """
        Unlike Java, the problem will likely not crash
        
        It will assign whatever that byte is at that location in memory to whatever you assign it to
        
        "C will let you scribble all over memory until you really break something"
    """.trimIndent()
        ),
        Pair(
            "How do you format print a int, double, character, and character array?", """
        int: %d
        
        double: %f
        
        char: %c
        
        char[]: %s
    """.trimIndent()
        ),
        Pair(
            "How do you format input a int, double, character, and character array?", """
        int: %d
        
        double: %lf
        
        char: %c
        
        char[]: %s
    """.trimIndent()
        ),
        Pair(
            "How do you read user input?", """
        scanf("% type of input", & name of the pre-initialized variable where data should be stored)
    """.trimIndent()
        ),
        Pair(
            "Of %d, %lf, %c, and %s, which of these will skip white spaces when reading inputs?", """
        %d, %lf, and %s will skip white spaces when reading inputs
        
        %c will not
    """.trimIndent()
        ),
    )
}