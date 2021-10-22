package com.company.triviaapp.data.courses.datastructures

import com.company.triviaapp.data.model.QuestionAnswer

class DataStructures {
    val chapterOne = listOf(
        QuestionAnswer(
            "What is a data structure?", """
        A way of organizing, storing, and performing operations on data
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is a record?", """
        Data structure
         
        Stores subitems, each with an associated name
        
        Subitems are called fields
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is an array?", """
        Data structure
         
        Stores ordered list of items
        
        Each item accessed by index
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is a linked list?", """
        Data structure
         
        Stores ordered list of items in nodes
        
        Each node stores data & points to next node
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is a binary tree", """
        Data structure
         
        Each node stores data and has up to two children
        
        Children = left & right child
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is a hash table?", """
        Data structure
         
        Stores unordered items; fast insertion, deletion & look-up
        
        Uses a dynamic array of linked lists to efficiently story key/value pairs
        
        When inserting a pair, a hash function maps the key to an index
        
        The value and a reference to the key is stored in a linked list
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is a heap?", """
        Data structure
  
        Specialized binary tree
        
        Max-heap: node's key is >= node's children keys
        
        Min-heap: node's key is <= node's children keys
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is a graph?", """
        Data structure 
        
        For representing connections
        
        Consists of vertices connected by edges
        
        Vertex is a item in a graph
        
        Edge represents a connection
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is a binary search?", """
        Efficient algorithm for searching a list
        
        Elements must be sorted and accessible
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is a Dijkstra(DYKE-struh) shortest path algorithm?", """
        Determines the shortest path from a start vertex to each vertex in a graph
    """.trimIndent()
        ),
        QuestionAnswer(
            "Is algorithm with a polynomial runtime considered efficient?", """
        Yes
        
        O(n²) is OK
        
        O(2ⁿ) is NOT
    """.trimIndent()
        ),
        QuestionAnswer(
            "Need to know a ADTs underlying implementation to analyze runtime efficiency?", """
        Yes
    """.trimIndent()
        ),
        QuestionAnswer(
            "Are ADTs only supported in standard libraries?", """
        No
    """.trimIndent()
        ),
        QuestionAnswer(
            "Is underlying data structure for a list the same in all programming languages?", """
        No
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is an NP-complete problem?", """
        No known efficient algorithm exists
        
        If an efficient algorithm exists for one NP-complete problem, all can be solved efficiently
        
        It may be possible to find an efficient solution for an NP-complete problem
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is an abstract data type (ADT)", """
        Data type containing predefined user operations
        
        Don't need to know implementation to USE
        
        Implementation has impact on program's execution
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is a list?", """
        ADT
         
        Holds ordered data
        
        Underlying structure: array, linked list
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is a dynamic array?", """
        ADT
         
        Holds ordered data and allows for indexed access
        
        Underlying structure: array (NOT LINKED LIST)
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is a stack?", """
        ADT 
        
        Items are only inserted on or removed from top of stack
        
        • Underlying structure: linked list
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is a queue?", """
        ADT
        
        Items are only inserted at end of queue and removed from front of queue
        
        Underlying structure: linked list
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is a dequeue?", """
        ADT
        
        Items are inserted and removed at both front and back
        
        Underlying structure: linked list
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is a bag?", """
        ADT
                 
        Order does not matter and duplicate items are ALLOWED
        
        Underlying structure: array, linked list
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is a set?", """
        ADT
         
        Stores distinct items
        
        Underlying structure: binary search tree, hash table
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is a priority queue?", """
        ADT
        
        Queue where each item has a priority
        
        Items with high priority toward front of queue
        
        Underlying structure: Heap
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is a dictionary (map)?", """
        ADT
                 
        Maps(associates) keys with values
        
        Underlying structure: Hash table, binary search tree
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is algorithm efficiency?", """
        Measured by algorithm's computational complexity
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is computational complexity?", """
        Amount of resources used by the algorithm
        
        Resources include time and memory
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is runtime complexity?", """
        Number of constant time operations performed by algorithm of size N
    """.trimIndent()
        ),
        QuestionAnswer(
            "Are algorithm's best and worst case scenarios always different?", """
        No
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is space complexity?", """
        Number of fixed-size memory units used by the algorithm for an input of size N
        
        Includes input data and additional memory allocated by the algorithm
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is auxiliary space complexity?", """
        Space complexity not including input data
    """.trimIndent()
        ),
        QuestionAnswer(
            "If a function retrieves all evens from a list: what is the worst case auxiliary space complexity?",
            """
        S(N) = N + k
        
        Worst case: all items from the list are returned
    """.trimIndent()
        ),
        QuestionAnswer(
            "If a function retrieves all evens from a list: what is the best case auxiliary space complexity?",
            """
        S(N) = k
        
        Best case: output size is 0
    """.trimIndent()
        ),

        )
    val sortingAlgo = listOf(
        QuestionAnswer(
            "How would you sort an array with Insertion Sort?", """
        Iterate forward through array, excluding last value
        
        Nested iteration backward from current + 1 until index 1
        
        In nest, compare value at "j" with value at "j - 1"
        
        If smaller, switch the two around
        
        Average: O(n²) time | O(1) space
    """.trimIndent()
        ),
        QuestionAnswer(
            "How would you sort an array with Bubble Sort?", """
        Create loop while a boolean is TRUE
        
        Initialize boolean variable to FALSE
        
        Iterate forward through array, excluding last value
        
        Is the current value greater than the current + 1 value?
        
        Swap them, switch boolean to TRUE
        
        Average: O(n²) time | O(1) space
    """.trimIndent()
        ),
        QuestionAnswer(
            "How would you sort an array with Selection Sort?", """
        Make variables to track smallest and active index
        
        While active index < the last index...
        
        Make smallest index = active index
        
        Iterate forward through array starting from active + 1, INCLUDING last value
        
        If an indices value is < value of smallest index, make it new smallest index
        
        Swap smallest index value with active index value
        
        Active index increment 1
        
        Average: O(n²) time | O(1) space
    """.trimIndent()
        ),
        QuestionAnswer(
            "Provided the node of a heap, how would you implement a depth-first search?", """ 
            Recursive implementation with a helper function taking an array parameter
            
            For a given node: add it to to the array, then for each child node invoke the recursive function, passing in the array
            
            Return the array
            
        Average: O(v + e) time | O(v) space
    """.trimIndent()
        ),

        )
    val chapterTwo = listOf(
        QuestionAnswer(
            "What is an algorithm?", """
        Sequence of steps for accomplishing a task
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is linear search?", """
        Search algorithm that starts from beginning of a list and checks each element until search key is found or end of list
    """.trimIndent()
        ),
        QuestionAnswer(
            "Given a list of 10 elements and where each comparison takes 2 μs, what is the fastest possible runtime?",
            """
        2 μs 
    """.trimIndent()
        ),
        QuestionAnswer(
            "Given a list of 10 elements and where each comparison takes 2 μs, what is the longest possible runtime?",
            """
        20 μs 
    """.trimIndent()
        ),
        QuestionAnswer(
            "Given an array with 32 elements, how many elements would be searched if the target was less than anything present in the list?",
            """
        5
        
        It would first check index 15, then 7, 3, 1, and 0
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is the formula to calculate the number of binary search searched elements(not steps) when the element is less than any element in the array?",
            """
        [log₂N]
        
        Example: [log₂32] = 5
    """.trimIndent()
        ),
        QuestionAnswer(
            "Is assigning x to y a constant time operation?", """
        True
        
        Assignment of a single, fixed size data value is a constant time operation
    """.trimIndent()
        ),
        QuestionAnswer(
            "Can a loop be a constant time operation?", """
        Yes
        
        A loop with a constant number of iterations is a constant time operation
    """.trimIndent()
        ),
        QuestionAnswer(
            "Is comparison of two fixed size data fields constant time?", """
        Yes
    """.trimIndent()
        ),
        QuestionAnswer(
            "Is copying the contents of a string to a new string constant time?", """
        No
        
        Copying all characters in a string requires operations proportional to size of string
    """.trimIndent()
        ),
        QuestionAnswer(
            "Is string concatenation constant time?", """
        No
        
        More characters must be copied for larger strings
    """.trimIndent()
        ),
        QuestionAnswer(
            "What are upper and lower bounds?", """
        Lower and upper bounds provide general picture of runtime
        
        Worst(upper) and best(lower) case scenario
    """.trimIndent()
        ),
        QuestionAnswer(
            "Consider an algorithm with best case 3N + 6 and worst case 5N² + 7N: which function is a lower bound?",
            """
        3N
        
        Lower bound means best case
    """.trimIndent()
        ),
        QuestionAnswer(
            "Consider an algorithm with best case 3N + 6 and worst case 5N² + 7N: which function is a upper bound?",
            """
        12N²
        
        Why not 5N²? Because 7N is added to it.
        
        5N² + 7N also acceptable
    """.trimIndent()
        ),
        QuestionAnswer(
            "What are asymptotic notation?", """
        Functions that indicate the growth rate of a bounding function
        
        Describe the running time of an algorithm
    """.trimIndent()
        ),
        QuestionAnswer(
            "What are the three types of asymptotic notation?", """
        O (Big-O) | upper bound: worst case
        
        Ω (Omega) | lower bound: best case
        
        Θ (Theta) | upper and lower bound
    """.trimIndent()
        ),
        QuestionAnswer(
            "State the function for O (Big-O) asymptotic notation", """
        For all N ≥ 1, T(N) ≤ c * f(N)
    """.trimIndent()
        ),
        QuestionAnswer(
            "State the function for Ω (Omega) asymptotic notation", """
        For all N ≥ 1, T(N) ≥ c * f(N)
    """.trimIndent()
        ),
        QuestionAnswer(
            "State the function for Θ (Theta) asymptotic notation", """
        T(N) = O(f(N)) and T(N) = Θ(f(N))
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is the Big O notation of 10 * O(N²)?", """
        O(N²)
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is the Big O notation of 10 + O(N²)?", """
        O(N²)
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is the Big O notation of 3N * O(N²)?", """
        O(N³)
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is the Big O notation of 2N³ + O(N²)?", """
        O(N³)
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is the Big O notation of log₂N?", """
        O(log(N))
    """.trimIndent()
        ),
        QuestionAnswer(
            "What runtime complexity does O(N log(N)) have?", """
        Linearithmic
    """.trimIndent()
        ),
        QuestionAnswer(
            "What runtime complexity does O(N + N²) have?", """
        O(N²)
        
        Quadratic
    """.trimIndent()
        ),
        QuestionAnswer(
            "What runtime complexity does linear search have?", """
        O(N)
        
        Linear
    """.trimIndent()
        ),
        QuestionAnswer(
            "What runtime complexity does selection sort have?", """
        O(N²)
        
        Quadratic
    """.trimIndent()
        ),
        QuestionAnswer(
            "Consider code that initializes two variables then runs a while loop with two operations. What is the worst-case function?",
            """
        f(N) = 3N + 3
        
        Constant time: 2 operations execute before the loop + 1 to terminate loop = 3
        
        N: 2 operations are in the loop + 1 for each conditional check = 3N
    """.trimIndent()
        ),
        QuestionAnswer(
            "Given the following code segment: int i = 0; while (i < 5) { i++; } - how many \"steps\" are there?",
            """
        1 step from i = 0
        
        2 * 5 steps from the loop iterating 5 times
        
        1 step from termination of loop
        
        12 steps total
    """.trimIndent()
        ),
        QuestionAnswer(
            "Consider a loop which iterates through an array - how many \"steps\" are there?", """
        1 step from initializing a sum variable
        
        1 step from initializing a iteration variable (i)
        
        3 steps for each length of the array (if check based on length, iteration increment, addition of value to sum)
        
        1 step to terminate the iteration
        
        1 step to return the value
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is T(N)?", """
        Number of "steps" relative to size
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is g(n) + O(f(n))? (g of n plus Big O of f of n)", """
        O(f(n) + g(n))
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is g(n) * O(f(n))? (g of n times Big O of f of n)", """
        O(f(n) * g(n))
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is O(n) * O(n)? (Big O of n times Big O of n)", """
        O(n²)
    """.trimIndent()
        ),
    )

    val chapterThree = listOf(
        QuestionAnswer(
            "What is a recursive algorithm?", """
        Breaks the problem into smaller subprograms and applies an algorithm to solve them
    """.trimIndent()
        ),
        QuestionAnswer(
            "Does a recursive algorithm apply itself to a smaller subproblem in all cases?", """
        No

        In the base case, the recursive algorithm completes without applying itself
    """.trimIndent()
        ),
        QuestionAnswer(
            "Describe the Fibonacci Sequence", """
        Each term is the sum of the previous two terms, except for first two terms which are 0 and 1
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is a recurrence relation?", """
        A function f(N) that is defined in terms of the same function operating on a value less than N
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is a recurrence relation?", """
        A function f(N) that is defined in terms of the same function operating on a value less than N
    """.trimIndent()
        ),
        QuestionAnswer(
            "Is T(N) = N² + 6N + 2 a recurrence relation?", """
        No
        
        T must be present on other side of equation
    """.trimIndent()
        ),
        QuestionAnswer(
            "Is T(N) = 6N + T(N/4) a recurrence relation?", """
        Yes
        
        It has T on the other side of the equation and operates on a value < N
    """.trimIndent()
        ),
        QuestionAnswer(
            "What is a recursion tree?", """
        A visual diagram of an operation done by a recursive function
    """.trimIndent()
        ),
        QuestionAnswer(
            "For recursive function with runtime of T(N) = 7 + T(N-1): how many levels will the recursion tree have?",
            """
        N

        The input size is reduced by 1 each call, N recursive calls are needed
    """.trimIndent()
        ),
        QuestionAnswer(
            "For recursive function with runtime of T(N) = 7 + T(N-1): what is the runtime complexity in O notation?",
            """
        O(N)
    """.trimIndent()
        ),
        QuestionAnswer(
            "For recursive function with runtime of T(N) = N + T(N-1): how many levels will the recursion tree have?",
            """
        N
    """.trimIndent()
        ),
    )

    val hashMap = listOf(
        QuestionAnswer(
            question = "What is a hash table?",
            answer = """
        A data structure which stores unordered items by mapping (or hashing) each item to a location in an array
    """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
        QuestionAnswer(
            question = "What is a key in a hash table?",
            answer = """
        The value which is used to map to an index
    """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
        QuestionAnswer(
            question = "What is a bucket?",
            answer = """
        A hash table array element
    """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
        QuestionAnswer(
            question = "What does a hash function do?",
            answer = """
        Computes a bucket's index from a key
    """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
        QuestionAnswer(
            question = "How does a hash table with linear probing handle collision?",
            answer = """
        Start at the key's mapped bucket then linearly search buckets until an empty one is found
    """.trimIndent(),
            questionTts = "",
            answerTts = ""
        ),
    )
}