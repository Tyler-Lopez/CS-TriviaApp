package com.company.triviaapp.datastructures

class DataStructures {
    val chapterOne = listOf(
        Pair(
            "What is a record?", """
        • Data structure that stores subitems with an associated name
        
        • Subitems are called fields
    """.trimIndent()
        ),
        Pair(
            "What is an array?", """
        • Data structure that stores ordered list of items
        
        • Each accessed by index
    """.trimIndent()
        ),
        Pair(
            "What is a linked list?", """
        • Data structure stores ordered list of items in nodes
        
        • Each node stores data & points to another node
    """.trimIndent()
        ),
        Pair(
            "What is a binary tree", """
        • Data structure in which each node stores data and has up to two children
        
        • Children = left & right child
    """.trimIndent()
        ),
        Pair(
            "What is a hash table?", """
        • Data structure that stores unordered items
        
        • How? By mapping(hashing) each item to a location in an array
    """.trimIndent()
        ),
        Pair(
            "What is a heap?", """
        • Max-heap: node's key is >= node's children keys
        
        • Min-heap: node's key is <= node's children keys
    """.trimIndent()
        ),
        Pair(
            "What is a graph?", """
        • Data structure for representing connections
        
        • Consists of vertices connected by edges
        
        • Vertex is a item in a graph
        
        • Edge represents a connection
    """.trimIndent()
        ),
        Pair(
            "What is a longest common substring algorithm?", """
        • Determines longest common substring between two strings
    """.trimIndent()
        ),
        Pair(
            "What is a binary search?", """
        • Efficient algorithm for searching a list
        
        • Elements must be sorted and accessible
    """.trimIndent()
        ),
        Pair(
            "What is a Dijkstra(DYKE-struh) shortest path algorithm?", """
        • Determines the shortest path from a start vertex to each vertex in a graph
    """.trimIndent()
        ),
        Pair(
            "Is algorithm with a polynomial runtime considered efficient?", """
        • Yes
        
        • O(n²) is OK
        
        • O(2ⁿ) is NOT
    """.trimIndent()
        ),
        Pair(
            "Need to know a ADTs underlying implementation to analyze runtime efficiency?", """
        • Yes
    """.trimIndent()
        ),
        Pair(
            "Are ADTs only supported in standard libraries?", """
        • No
    """.trimIndent()
        ),
        Pair(
            "Is underlying data structure for a list the same in all programming languages?", """
        • No
    """.trimIndent()
        ),
        Pair(
            "What is an NP-complete problem?", """
        • No known efficient algorithm exists
        
        • If an efficient algorithm exists for one NP-complete problem, then all can be solved efficiently
        
        • No one has proven an efficient algorithm to solve an NP-complete problem is impossible
    """.trimIndent()
        ),
        Pair(
            "What is an abstract data type (ADT)", """
        • Data type for predefined user operations
        
        • Don't need to know implementation to USE
        
        • Underlying data structure has impact on program's execution
    """.trimIndent()
        ),
        Pair(
            "What is a list?", """
        • ADT for holding ordered data
        
        • Underlying structure: array, linked list
    """.trimIndent()
        ),
        Pair(
            "What is a dynamic array?", """
        • ADT for holding ordered data and allowing indexed access
        
        • Underlying structure: array (NOT LINKED LIST)
    """.trimIndent()
        ),
        Pair(
            "What is a stack?", """
        • ADT items are only inserted on or removed from top of stack
        
        • Underlying structure: linked list
    """.trimIndent()
        ),
        Pair(
            "What is a queue?", """
        • ADT items are only inserted at end of queue and removed from front of queue
        
        • Underlying structure: linked list
    """.trimIndent()
        ),
        Pair(
            "What is a dequeue?", """
        • ADT items are inserted and removed at both front and back
        
        • Underlying structure: linked list
    """.trimIndent()
        ),
        Pair(
            "What is a bag?", """
        • ADT for storing items
        
        • Order does not matter and duplicate items are ALLOWED
        
        • Underlying structure: array, linked list
    """.trimIndent()
        ),
        Pair(
            "What is a set?", """
        • ADT for storing distinct items
        
        • Underlying structure: binary search tree, hash table
    """.trimIndent()
        ),
        Pair(
            "What is a priority queue?", """
        • ADT
        
        • Queue where each item has a priority
        
        • Items with high priority toward front of queue
        
        • Underlying structure: Heap
    """.trimIndent()
        ),
        Pair(
            "What is a dictionary (map)?", """
        • ADT that associates, aka maps
        
        • Maps keys with values
        
        • Underlying structure: Hash table, binary search tree
    """.trimIndent()
        ),
        Pair(
            "What is algorithm efficiency?", """
        • Measured by algorithm's computational complexity
    """.trimIndent()
        ),
        Pair(
            "What is computational complexity?", """
        • Amount of resources used by the algorithm
        
        • Resources include, but not limited to, time and memory
    """.trimIndent()
        ),
        Pair(
            "What is runtime complexity?", """
        • Number of constant time operations performed by algorithm of size N
    """.trimIndent()
        ),
        Pair(
            "Are algorithm's best and worst case scenarios always different?", """
        • No
    """.trimIndent()
        ),
        Pair(
            "What is space complexity?", """
        • Number of fixed-size memory units used by the algorithm for an input of size N
        
        • Includes input data and additional memory allocated by the algorithm
    """.trimIndent()
        ),
        Pair(
            "What is auxiliary space complexity?", """
        • Space complexity not including input data
    """.trimIndent()
        ),
        Pair(
            "If a function retrieves all evens from a list: what is the worst case auxiliary space complexity?",
            """
        • S(N) = N + k
        
        • Worst case: all items from the list are returned
    """.trimIndent()
        ),
        Pair(
            "If a function retrieves all evens from a list: what is the best case auxiliary space complexity?",
            """
        • S(N) = k
        
        • Best case: output size is 0
    """.trimIndent()
        ),
        Pair(
            "How would you sort an array with Insertion Sort?", """
        • Iterate forward through array, excluding last value
        
        • Nested iteration backward from current + 1 until index 1
        
        • In nest, compare value at "j" with value at "j - 1"
        
        • If smaller, switch the two around
        
        • Average: O(n²) time | O(1) space
    """.trimIndent()
        ),
        Pair(
            "How would you sort an array with Bubble Sort?", """
        • Create loop while a boolean is TRUE
        
        • Initialize boolean variable to FALSE
        
        • Iterate forward through array, excluding last value
        
        • Is the current value greater than the current + 1 value?
        
        • Swap them, switch boolean to TRUE
        
        • Average: O(n²) time | O(1) space
    """.trimIndent()
        ),
        Pair(
            "How would you sort an array with Selection Sort?", """
        • Make variables to track smallest and active index
        
        • While active index < the last index...
        
        • Make smallest index = active index
        
        • Iterate forward through array starting from active + 1, INCLUDING last value
        
        • If an indices value is < value of smallest index, make it new smallest index
        
        • Swap smallest index value with active index value
        
        • Active index increment 1
        
        • Average: O(n²) time | O(1) space
    """.trimIndent()
        ),
    )
    val chapterTwo = listOf(
        Pair(
            "What is an algorithm?", """
        • Sequence of steps for accomplishing a task
    """.trimIndent()
        ),
        Pair(
            "What is linear search?", """
        • Search algorithm that starts from beginning of a list and checks each element until search key is found or end of list
    """.trimIndent()
        ),
        Pair(
            "Given a list of 10 elements and where each comparison takes 2 μs, what is the fastest possible runtime?", """
        • 2 μs 
    """.trimIndent()
        ),
        Pair(
            "Given a list of 10 elements and where each comparison takes 2 μs, what is the longest possible runtime?", """
        • 20 μs 
    """.trimIndent()
        ),
        Pair(
            "Given an array with 32 elements, how many elements would be searched if the target was less than anything present in the list?", """
        • 5
        
        • It would first check index 15, then 7, 3, 1, and 0
    """.trimIndent()
        ),
        Pair(
            "What is the formula to calculate the number of binary search searched elements(not steps) when the element is less than any element in the array?", """
        • [log₂N]
        
        • Example: [log₂32] = 5
    """.trimIndent()
        ),
        Pair(
            "Assigning x to y(x = y) is a constant time operation", """
        • True
        
        • Assignment of a single, fixed size data value is a constant time operation
    """.trimIndent()
        ),
        Pair(
            "Can a list be a constant time operation?", """
        • Yes
        
        • A loop with a constant number of iterations is a constant time operation
    """.trimIndent()
        ),
        Pair(
            "Is comparison of two fixed size data fields constant time?", """
        • Yes
    """.trimIndent()
        ),
        Pair(
            "Is copying the contents of a string to a new string constant time?", """
        • No
        
        • Copying all characters in a string would require more operations for longer strings
    """.trimIndent()
        ),
        Pair(
            "Is string concatenation constant time?", """
        • No
        
        • More characters must be copied for larger strings
    """.trimIndent()
        ),
        Pair(
            "What are upper and lower bounds?", """
        • Lower and upper bounds provide general picture of runtime
        
        • Worst(upper) and best(lower) case scenario
    """.trimIndent()
        ),
        Pair(
            "Consider algorithm with best case 3N + 6 and worst case 5N² + 7N, what function is a lower bound?", """
        • 3N
        
        • Lower bound means best case
    """.trimIndent()
        ),
        Pair(
            "Consider algorithm with best case 3N + 6 and worst case 5N² + 7N, what function is a upper bound?", """
        • 12N²
        
        • Why not 5N²? Because 7N is added to it.
        
        • 5N² + 7N also acceptable
    """.trimIndent()
        ),
        Pair(
            "What are asymptotic notation?", """
        • Functions that indicate only the growth rate of a bounding function
    """.trimIndent()
        ),
        Pair(
            "What are the three types of asymptotic notation?", """
        • O (Big-O) | upper bound | worst case
        
        • Ω (Omega) | lower bound | best case
        
        • Θ (Theta) | upper and lower bound
    """.trimIndent()
        ),
        Pair(
            "State the function for O (Big-O) asymptotic notation", """
        • For all N ≥ 1, T(N) ≤ c * f(N)
    """.trimIndent()
        ),
        Pair(
            "State the function for Ω (Omega) asymptotic notation", """
        • For all N ≥ 1, T(N) ≥ c * f(N)
    """.trimIndent()
        ),
        Pair(
            "State the function for Θ (Theta) asymptotic notation", """
        • T(N) = O(f(N)) and T(N)=Ω(f(N))
    """.trimIndent()
        ),
        Pair(
            "What is the Big O notation of 10 * O(N²)?", """
        • O(N²)
    """.trimIndent()
        ),
        Pair(
            "What is the Big O notation of 10 + O(N²)?", """
        • O(N²)
    """.trimIndent()
        ),
        Pair(
            "What is the Big O notation of 3N + O(N²)?", """
        • O(N³)
    """.trimIndent()
        ),
        Pair(
            "What is the Big O notation of 2N³ + O(N²)?", """
        • O(N³)
    """.trimIndent()
        ),
        Pair(
            "What is the Big O notation of log₂N?", """
        • O(log(N))
    """.trimIndent()
        ),
        Pair(
            "What runtime complexity does O(N log(N)) have?", """
        • Linearithmic
    """.trimIndent()
        ),
        Pair(
            "What runtime complexity does O(N + N²) have?", """
        • O(N²)
        
        • Quadratic
    """.trimIndent()
        ),
        Pair(
            "What runtime complexity does linear search have?", """
        • O(N)
        
        • Linearithmic
    """.trimIndent()
        ),
        Pair(
            "What runtime complexity does selection sort have?", """
        • O(N²)
        
        • Quadratic
    """.trimIndent()
        ),
        Pair(
            "Consider code that initializes a count and sum variable then runes a while loop with two operations. What is the worst-case function?", """
        • f(N) = 3N + 3
        
        • 2 operations execute before the loop + 1 after loop terminates = 3
        
        • 2 operations are in the loop + 1 for each condition = 3N
    """.trimIndent()
        ),
    )

    val chapterThree = listOf(
        Pair(
    "What is a recursive algorithm?", """
        • Algorithm that breaks the problem into smaller subprograms and applies an algorithm to solve them
    """.trimIndent()
    ),
    Pair(
    "Does a recursive algorithm apply itself to a smaller subproblem in all cases?", """
        • No

        • In the base case, the recursive algorithm completes without applying itself
    """.trimIndent()
    ),
    Pair(
    "Describe the Fibonacci Sequence", """
        • Each term is the sum of the previous two terms, except for first two terms which are 0 and 1
    """.trimIndent()
    ),
    Pair(
    "What is a recurrence relation?", """
        • A function f(N) that is defined in terms of the same function operating on a value less than N
    """.trimIndent()
    ),
    Pair(
    "What is a recurrence relation?", """
        • A function f(N) that is defined in terms of the same function operating on a value less than N
    """.trimIndent()
    ),
    Pair(
    "Is T(N) = N² + 6N + 2 a recurrence relation?", """
        • No, T must be present on other side of equation
    """.trimIndent()
    ),
    Pair(
    "Is T(N) = 6N + T(N/4) a recurrence relation?", """
        • Yes, because it has T on the other side of the equation and operates on a value < N
    """.trimIndent()
    ),
    Pair(
    "What is a recursion tree?", """
        • A visual diagram of an operation done by a recursive function
    """.trimIndent()
    ),
    Pair(
    "For recursive function with runtime of T(N) = 7 + T(N-1): how many levels will the recursion tree have?", """
        • N

        • The input size is reduced by 1 each call, N recursive calls are needed
    """.trimIndent()
    ),
    Pair(
    "For recursive function with runtime of T(N) = 7 + T(N-1): what is the runtime complexity in O notation?", """
        • O(N)
    """.trimIndent()
    ),
    Pair(
    "For recursive function with runtime of T(N) = N + T(N-1): how many levels will the recursion tree have?", """
        • N
    """.trimIndent()
    ),
    )
}