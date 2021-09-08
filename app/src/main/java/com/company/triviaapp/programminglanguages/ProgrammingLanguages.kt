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
        
        Process Abstraction (subprograms)
        
        Data Abstraction (user defined data)
        
        Control and block structures
    """.trimIndent()
        ),
        Pair(
            "What decreases readability?", """
        Method and operator overloading
        
        Over simplicity - machine code
    """.trimIndent()
        ),
        Pair(
            "What increases writability?", """
        Simplicity (small # of language features)
        
        Process Abstraction (subprograms)
        
        Data Abstraction (user defined data)
        
        Control and block structures
        
        Expressivity (ability to express ideas - recursion, inheritance, etc)
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
        Don't write whole program in one program
        
        Divide program into subprograms, then put them together
        
        Makes programs more manageable
        
        AKA imperative
    """.trimIndent()
        ),
        Pair(
            "What is functional programming?", """
        Work performed by function calls
        
        Use of recursion
        
        AKA applicative
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
            "What is compiling?", """
        Source code translated to machine code
        
        Compiling and executing occur different times
        
        Compile once run many times
        
        C, C++, Fortran
    """.trimIndent()
        ),
        Pair(
            "What is interpreting?", """
        Interpreter decodes instructions in source program and executes
        
        Compiling and executing occur same time
        
        Translation occurs everytime program is run
        
        Lisp, Basic, Perl
    """.trimIndent()
        ),
        Pair(
            "What is hybrid method?", """
        Compiler compiles code into intermediate code (byte code)
        
        Interpreter interprets intermediate code
        
        Java, Python, JavaScript
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
    )
    val chapterTwo = listOf(
        Pair(
            "What is Plankalkul (plan-kah-kool)?", """
        First "programming language"

        "Programming calculus"
        
        Theoretical language, 1945
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
            "What is Fortran?", """
        First high-level language BUT statement-oriented

        Formula Translation System (like scientific formulas)
        
        Beginning of subprogramming approach
    """.trimIndent()
        ),
        Pair(
            "What is Lisp?", """
        Functional language        
         
        List processing - program and data represented using lists
                
        Descendants include: Common Lisp, Scheme, Haskell
    """.trimIndent()
        ),
        Pair(
            "What is Algol?", """
        Algorithmic language
        
        Not developed by a company, lost support quickly
        
        Descendants include: C, C++, Java
    """.trimIndent()
        ),
        Pair(
            "What is Cobol?", """
        Common Business Oriented Language - IBM, 1960

        For business applications
        
        Blamed for Y2K
    """.trimIndent()
        ),
        Pair(
            "What is Basic?", """
        Beginning All Purpose Symbolic Instruction Code
        
        For teaching basics of programming
    """.trimIndent()
        ),
        Pair(
            "What is PL/1?", """
        Programming Language 1
    """.trimIndent()
        ),
        Pair(
            "What is Simula?", """
        First object oriented language
    """.trimIndent()
        ),
        Pair(
            "What is Pascal?", """
        For teaching computer science students in 70's
    """.trimIndent()
        ),
        Pair(
            "What is Ada?", """
        Derived from Pascal
    """.trimIndent()
        ),
        Pair(
            "What is SmallTalk?", """
        Early object-oriented language
        
        STRICT ENFORCEMENT
    """.trimIndent()
        ),
        Pair(
            "What is C?", """
        Bell labs, 1972
        
        Not object-oriented at all
        
        General purpose, widely used
    """.trimIndent()
        ),
        Pair(
            "What is C++?", """
        Bell labs, 1985
        
        Object oriented
        
        Widely used
    """.trimIndent()
        ),
        Pair(
            "What is Java?", """
        Sun Micro Systems, 1994
        
        Object oriented
        
        Widely used
    """.trimIndent()
        ),
        Pair(
            "What is C#?", """
        Microsoft, 2002
        
        Object oriented
        
        Widely used, part of .NET
    """.trimIndent()
        ),
        Pair(
            "What is Objective C?", """
        Used by Apple to develop mobile apps
        
        Apple did not develop it - Steve Jobs brought it from another company
        
        Object oriented
    """.trimIndent()
        ),
        Pair(
            "What is Perl?", """
        Scripting language
        
        Considered "mother of all scripting languages"
    """.trimIndent()
        ),
        Pair(
            "What is Python?", """
        Started as a scripting language, became general purpose language
        
        Many applications
    """.trimIndent()
        ),
        Pair(
            "What is JavaScript, PHP?", """
        Web programming languages, not really general purpose
        
        Many applications
    """.trimIndent()
        ),
        Pair(
            "What is Swift?", """
        Mobile application development language
        
        Used and developed by Apple to develop iOS
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
        Same as Java
        
        for (int count = 0; counter < target; counter ++) { }
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
    )
}