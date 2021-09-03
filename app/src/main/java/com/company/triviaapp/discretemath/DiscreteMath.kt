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
            "What makes sets equal?", """
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
        QuestionWithAnswer(
            "What is a cartesian product?", """
        • For sets A & B: set of all possible ordered pairs 
        
        • Denoted by A ✕ B
        
        • Order matters
           
        • If A has m elements & B has n elements -> A ✕ B has m * n pairs
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What are all set operations?", """
        • Union
        
        • Intersection
        
        • Difference
           
        • Complement
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is a union of a set?", """
        • Union of sets A and B: set containing elements in either A or B or both
        
        • Union of A and B is denoted by A ∪ B
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is a intersection of a set?", """
        • Intersection of sets A and B: set containing only elements in both A and B
        
        • Union of A and B is denoted by A ∩ B
        
        • Disjoint: means A ∩ B is empty
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is a difference of a set?", """
        • Difference of sets A and B: set containing only elements in A and NOT B
        
        • Difference of A and B is denoted by A − B
                
        • Order matters
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is a complement of a set?", """
        • Complement of sets A: set of all elements not in A
        
        • Complement of A denoted by Aᶜ
                
        • To find complement must know universe
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "Write a set containing odd #s from 1 to 9", """
        • { x : 1 ≤ x ≤ 9 and (x % 2) ≠ 0 }
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is a proper subset?", """
        • Subset of but not equal to

        • Denoted by ⊂ and ⊄
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is a singleton or unit set?", """
        • Set containing only one element
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What are equivalent sets?", """
        • Sets that share the same size, regardless of elements

        • Example: a set of {1, 2, 6} is equivalent to {16, 17, 22}
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What are overlapping sets?", """
        • Sets that share at least one common element

        • Example: a set of {1, 2, 6} is equivalent to {16, 17, 22}
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is the Cartesian product of A = {1, 2} and B = {a, b, c}?", """
        • A ✕ B

        • {(1, a), (1, b), (1, c), (2, a), (2, b), (2, c)}
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What set does Z^+ represent?", """
        • Set of positive integers
        
        • {1, 2, 3, ....}
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What set does N represent?", """
        • Set of natural numbers
        
        • {0, 1, 2, 3, ....}
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is the identity law?", """
        • The intersection of anything with the universe = itself
        
        • A ∩ U = A
        
        • The intersection of anything with the empty set = itself
        
        • A ∪ ϕ = A
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is the idempotent law?", """
        • The union of anything with itself = itself
        
        • A ∪ A = 0
        
        • The intersection of anything with itself = itself
        
        • A ∩ A = A
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is the complement law?", """
        • The union of anything and its complement = universe
        
        • A ∪ A^C = U
        
        • The intersection of anything with its complement = empty set, and they are disjoint
        
        • A ∩ A^C = ϕ
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is the complementation law?", """
        • The complement of a complement is the original set
        
        • (A^C)^C = A
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is the commutative law?", """
        • The union or intersection of two sets are equal to each other no matter how you order them
        
        • A ∪ B = B ∪ A
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is the associative law?", """
        • If you take three sets and union them, the order doesn't matter.
        
        • A ∪ (B ∪ C) = (A ∪ B) ∪ C
        

    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is the distributive law?", """        
        • A ∩ (B ∪ C) = (A ∩ B) ∪ (A ∩ C)
    """.trimIndent()
        ),
        QuestionWithAnswer(
            "What is the Demorgan's law?", """
        • Complement the union of two sets = intersection of individual complement sets
        
        • Complement the intersection of two sets = union of individual complement sets
        
        • (A ∪ B)^c = A^c ∩ B^c
    """.trimIndent()
        ),

    )
}