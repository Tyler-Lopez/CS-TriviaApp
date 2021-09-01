package com.company.triviaapp.discretemath

import QuestionWithAnswer

class DiscreteMath {

    val chapterOne: List<QuestionWithAnswer> = listOf(
        QuestionWithAnswer(
            "What is a Set?", """
        • A collection of objects
        
        • Do not have to be ordered
        
        • Duplicates are not allowed
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "How do you build a Set of all even numbers?", """
        • { n | n is positive even integer }
        
        • { 2n + 2 | n is integer, n >= 0 }
        
        • { 2n | n is integer, n >= 1 } 
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What are objects in a set?", """
        • Elements
        
        • x ∈ A means x is an element of A
        
        • x ∉ A means x is NOT an element of A
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is an empty set?", """
        • Set with no elements
        
        • Denoted by { } or ϕ
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is makes sets equal?", """
        • Sets are equal if they have the same elements
        
        • Order does not matter
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What are subsets?", """
        • Set A is a subset of B if EVERY element of A is also in B
        
        • Denoted by A ⊆ B
        
        • Empty set is subset of any set
        
        • Any set is subset of itself
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is size of a set?", """
        • Number of elements
        
        • Size of A denoted by |A|
        
        • Size also called cardinality
        
        • Can be finite and infinite
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is a power set?", """
        • A power set is a set of all subsets of a set
        
        • Power set of A is denoted by P(A) or 2^A
        
        • If A has n elements, A has 2^n subsets        
    """.trimIndent()
        ),
    )
}