package com.company.triviaapp.datastructures

import QuestionWithAnswer


class DataStructures {
    val chapterOne: List<QuestionWithAnswer> = listOf(
        QuestionWithAnswer(
            "What is a record?", """
        • Data structure that stores subitems with an associated name
        
        • Subitems are called fields
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is an array?", """
        • Data structure that stores ordered list of items
        
        • Each accessed by index
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is a linked list?", """
        • Data structure stores ordered list of items in nodes
        
        • Each node stores data & points to another node
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is a binary tree", """
        • Data structure in which each node stores data and has up to two children
        
        • Children = left & right child
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is a hash table?", """
        • Data structure that stores unordered items
        
        • How? By mapping(hashing) each item to a location in an array
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is a heap?", """
        • Max-heap: node's key is >= node's children keys
        
        • Min-heap: node's key is <= node's children keys
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is a graph?", """
        • Data structure for representing connections
        
        • Consists of vertices connected by edges
        
        • Vertex is a item in a graph
        
        • Edge represents a connection
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is a longest common substring algorithm?", """
        • Determines longest common substring between two strings
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is a binary search?", """
        • Efficient algorithm for searching a list
        
        • Elements must be sorted and accessible
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is a Dijkstra(DYKE-struh) shortest path algorithm?", """
        • Determines the shortest path from a start vertex to each vertex in a graph
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "Is algorithm with a polynomial runtime considered efficient?", """
        • Yes
        
        • O(n²) is OK
        
        • O(2ⁿ) is NOT
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "Need to know a ADTs underlying implementation to analyze runtime efficiency?", """
        • Yes
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "Are ADTs only supported in standard libraries?", """
        • No
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "Is underlying data structure for a list the same in all programming languages?", """
        • No
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is an NP-complete problem?", """
        • No known efficient algorithm exists
        
        • If an efficient algorithm exists for one NP-complete problem, then all can be solved efficiently
        
        • No one has proven an efficient algorithm to solve an NP-complete problem is impossible
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is an abstract data type (ADT)", """
        • Data type for predefined user operations
        
        • Don't need to know implementation to USE
        
        • Underlying data structure has impact on program's execution
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is a list?", """
        • ADT for holding ordered data
        
        • Underlying structure: array, linked list
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is a dynamic array?", """
        • ADT for holding ordered data and allowing indexed access
        
        • Underlying structure: array (NOT LINKED LIST)
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is a stack?", """
        • ADT items are only inserted on or removed from top of stack
        
        • Underlying structure: linked list
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is a queue?", """
        • ADT items are only inserted at end of queue and removed from front of queue
        
        • Underlying structure: linked list
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is a dequeue?", """
        • ADT items are inserted and removed at both front and back
        
        • Underlying structure: linked list
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is a bag?", """
        • ADT for storing items
        
        • Order does not matter and duplicate items are ALLOWED
        
        • Underlying structure: array, linked list
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is a set?", """
        • ADT for storing distinct items
        
        • Underlying structure: binary search tree, hash table
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is a priority queue?", """
        • ADT
        
        • Queue where each item has a priority
        
        • Items with high priority toward front of queue
        
        • Underlying structure: Heap
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is a dictionary (map)?", """
        • ADT that associates, aka maps
        
        • Maps keys with values
        
        • Underlying structure: Hash table, binary search tree
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is algorithm efficiency?", """
        • Measured by algorithm's computational complexity
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is computational complexity?", """
        • Amount of resources used by the algorithm
        
        • Resources include, but not limited to, time and memory
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is runtime complexity?", """
        • Number of constant time operations performed by algorithm of size N
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "Are algorithm's best and worst case scenarios always different?", """
        • No
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is space complexity?", """
        • Number of fixed-size memory units used by the algorithm for an input of size N
        
        • Includes input data and additional memory allocated by the algorithm
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is auxiliary space complexity?", """
        • Space complexity not including input data
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "If a function retrieves all evens from a list: what is the worst case auxiliary space complexity?",
            """
        • S(N) = N + k
        
        • Worst case: all items from the list are returned
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "If a function retrieves all evens from a list: what is the best case auxiliary space complexity?",
            """
        • S(N) = k
        
        • Best case: output size is 0
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "How would you sort an array with Insertion Sort?", """
        • Iterate forward through array, excluding last value
        
        • Nested iteration backward from current + 1 until index 1
        
        • In nest, compare value at "j" with value at "j - 1"
        
        • If smaller, switch the two around
        
        • Average: O(n²) time | O(1) space
    """.trimIndent(), Difficulty.Medium
        ),
        QuestionWithAnswer(
            "How would you sort an array with Bubble Sort?", """
        • Create loop while a boolean is TRUE
        
        • Initialize boolean variable to FALSE
        
        • Iterate forward through array, excluding last value
        
        • Is the current value greater than the current + 1 value?
        
        • Swap them, switch boolean to TRUE
        
        • Average: O(n²) time | O(1) space
    """.trimIndent(), Difficulty.Medium
        ),
        QuestionWithAnswer(
            "How would you sort an array with Selection Sort?", """
        • Make variables to track smallest and active index
        
        • While active index < the last index...
        
        • Make smallest index = active index
        
        • Iterate forward through array starting from active + 1, INCLUDING last value
        
        • If an indices value is < value of smallest index, make it new smallest index
        
        • Swap smallest index value with active index value
        
        • Active index increment 1
        
        • Average: O(n²) time | O(1) space
    """.trimIndent(), Difficulty.Medium
        ),
    )
}