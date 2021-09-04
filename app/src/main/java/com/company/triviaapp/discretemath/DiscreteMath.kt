package com.company.triviaapp.discretemath

class DiscreteMath {
    val chapterOne = listOf(
        Pair(
            "What is a Set?", """
        • A collection of objects
        
        • Do not have to be ordered
        
        • Duplicates are not allowed
    """.trimIndent()
        ),
        Pair(
            "How do you build a Set of all even numbers?", """
        • { n | n is positive even integer }
        
        • { 2n + 2 | n is integer, n >= 0 }
        
        • { 2n | n is integer, n >= 1 } 
    """.trimIndent()
        ),
        Pair(
            "What are objects in a set?", """
        • Elements
        
        • x ∈ A means x is an element of A
        
        • x ∉ A means x is NOT an element of A
    """.trimIndent()
        ),
        Pair(
            "What is an empty set?", """
        • Set with no elements
        
        • Denoted by { } or ϕ
    """.trimIndent()
        ),
        Pair(
            "What makes sets equal?", """
        • Sets are equal if they have the same elements
        
        • Order does not matter
    """.trimIndent()
        ),
        Pair(
            "What are subsets?", """
        • Set A is a subset of B if EVERY element of A is also in B
        
        • Denoted by A ⊆ B
        
        • Empty set is subset of any set
        
        • Any set is subset of itself
    """.trimIndent()
        ),
        Pair(
            "What is size of a set?", """
        • Number of elements
        
        • Size of A denoted by |A|
        
        • Size also called cardinality
        
        • Can be finite and infinite
    """.trimIndent()
        ),
        Pair(
            "What is a power set?", """
        • A power set is a set of all subsets of a set
        
        • Power set of A is denoted by P(A) or 2^A
        
        • If A has n elements, A has 2^n subsets        
    """.trimIndent()
        ),
        Pair(
            "What is a cartesian product?", """
        • For sets A & B: set of all possible ordered pairs 
        
        • Denoted by A ✕ B
        
        • Order matters
           
        • If A has m elements & B has n elements -> A ✕ B has m * n pairs
    """.trimIndent()
        ),
        Pair(
            "What are all set operations?", """
        • Union
        
        • Intersection
        
        • Difference
           
        • Complement
    """.trimIndent()
        ),
        Pair(
            "What is a union of a set?", """
        • Union of sets A and B: set containing elements in either A or B or both
        
        • Union of A and B is denoted by A ∪ B
    """.trimIndent()
        ),
        Pair(
            "What is a intersection of a set?", """
        • Intersection of sets A and B: set containing only elements in both A and B
        
        • Union of A and B is denoted by A ∩ B
        
        • Disjoint: means A ∩ B is empty
    """.trimIndent()
        ),
        Pair(
            "What is a difference of a set?", """
        • Difference of sets A and B: set containing only elements in A and NOT B
        
        • Difference of A and B is denoted by A − B
                
        • Order matters
    """.trimIndent()
        ),
        Pair(
            "What is a complement of a set?", """
        • Complement of sets A: set of all elements not in A
        
        • Complement of A denoted by Aᶜ
                
        • To find complement must know universe
    """.trimIndent()
        ),
        Pair(
            "Write a set containing odd #s from 1 to 9", """
        • { x : 1 ≤ x ≤ 9 and (x % 2) ≠ 0 }
    """.trimIndent()
        ),
        Pair(
            "What is a proper subset?", """
        • Subset of but not equal to

        • Denoted by ⊂ and ⊄
    """.trimIndent()
        ),
        Pair(
            "What is a singleton or unit set?", """
        • Set containing only one element
    """.trimIndent()
        ),
        Pair(
            "What are equivalent sets?", """
        • Sets that share the same size, regardless of elements

        • Example: a set of {1, 2, 6} is equivalent to {16, 17, 22}
    """.trimIndent()
        ),
        Pair(
            "What are overlapping sets?", """
        • Sets that share at least one common element

        • Example: a set of {1, 2, 6} is equivalent to {16, 17, 22}
    """.trimIndent()
        ),
        Pair(
            "What is the Cartesian product of A = {1, 2} and B = {a, b, c}?", """
        • A ✕ B

        • {(1, a), (1, b), (1, c), (2, a), (2, b), (2, c)}
    """.trimIndent()
        ),
        Pair(
            "What set does Z⁺ represent?", """
        • Set of positive integers
        
        • {1, 2, 3, ....}
    """.trimIndent()
        ),
        Pair(
            "What set does Z represent?", """
        • Set of positive and negative integers including 0
        
        • {..., -2, -1, 0, 1, 2, 3, ....}
    """.trimIndent()
        ),
        Pair(
            "What set does N represent?", """
        • Set of natural numbers
        
        • {0, 1, 2, 3, ....}
    """.trimIndent()
        ),
        Pair(
            "What set does Q represent?", """
        • Set of rational numbers
        
        • A rational number is any number that can be written as the ratio of two integers
        
        • { p / q | p ϵ Z, q ϵ Z, q ≠ 0)
    """.trimIndent()
        ),
        Pair(
            "What set does R represent?", """
        • Set of real numbers
        
        • A real number is any number that can take any value on a number line - rational and irrational
        
        • R = { x | x is a real number }
    """.trimIndent()
        ),
        Pair(
            "What is the identity law?", """
        • The intersection of anything with the universe = itself
        
        • A ∩ U = A
        
        • The intersection of anything with the empty set = itself
        
        • A ∪ ϕ = A
    """.trimIndent()
        ),
        Pair(
            "What is the idempotent law?", """
        • The union of anything with itself = itself
        
        • A ∪ A = 0
        
        • The intersection of anything with itself = itself
        
        • A ∩ A = A
    """.trimIndent()
        ),
        Pair(
            "What is the complement law?", """
        • The union of anything and its complement = universe
        
        • A ∪ A^C = U
        
        • The intersection of anything with its complement = empty set, and they are disjoint
        
        • A ∩ A^C = ϕ
    """.trimIndent()
        ),
        Pair(
            "What is the complementation law?", """
        • The complement of a complement is the original set
        
        • (A^C)^C = A
    """.trimIndent()
        ),
        Pair(
            "What is the commutative law?", """
        • The union or intersection of two sets are equal to each other no matter how you order them
        
        • A ∪ B = B ∪ A
    """.trimIndent()
        ),
        Pair(
            "What is the associative law?", """
        • If you take three sets and union them, the order doesn't matter.
        
        • A ∪ (B ∪ C) = (A ∪ B) ∪ C
    """.trimIndent()
        ),
        Pair(
            "What is the distributive law?", """        
        • A ∩ (B ∪ C) = (A ∩ B) ∪ (A ∩ C)
    """.trimIndent()
        ),
        Pair(
            "What is the Demorgan's law?", """
        • Complement the union of two sets = intersection of individual complement sets
        
        • Complement the intersection of two sets = union of individual complement sets
        
        • (A ∪ B)^c = A^c ∩ B^c
    """.trimIndent()
        ),
        Pair(
            "How would you draw a Venn diagram representing the set of vowels in the alphabet?", """
        • Draw a rectangle to indicate the universe set U, representing 26 characters
        
        • Draw a circle within, the circle should contain {a, e, i, o, u}
    """.trimIndent()
        ),
        Pair(
            "How many elements does a power set of a set containing 3 elements have?", """
        • 8
        
        • It is 2 raised to the nth power, 2 * 2 * 2 = 8
    """.trimIndent()
        ),
        Pair(
            "How many elements does a power set of a power set of the empty set have?", """
        • 2
        
        • The power set of the empty set has a size 1, of which the power set of is 2 * 1 = 2
    """.trimIndent()
        ),
        Pair(
            "What does ∨ mean?", """
        • Logical OR
    """.trimIndent()
        ),
        Pair(
            "What does ∧ mean?", """
        • Logical AND
    """.trimIndent()
        ),
        Pair(
            "What set operation is this: { x | x ϵ A ∧ x ∉ B }?", """
        • Difference ( A - B )
        
        • Set containing elements of A which are not elements of B
    """.trimIndent()
        ),
        Pair(
            "What set operation is this: { x | x ∉ A }?", """
        • Complement ( A^C )
        
        • This returns a set of all elements in the universe which are not in A
    """.trimIndent()
        ),
        Pair(
            "What is the difference of A = {1, 3, 5} and B = {1, 2, 3}?", """
        • 5
        
        • 1, 3 are in set B
    """.trimIndent()
        ),
    )
}