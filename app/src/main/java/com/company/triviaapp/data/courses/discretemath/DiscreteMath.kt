package com.company.triviaapp.data.courses.discretemath

import com.company.triviaapp.data.model.QuestionAnswer

class DiscreteMath {
    val sets = listOf(
        Pair(
            "What is a Set?", """
        A collection of objects
        
        Do not have to be ordered
        
        Duplicates are not allowed
    """.trimIndent()
        ),
        Pair(
            "How do you build a Set of all even numbers?", """
        { n | n is positive even integer }
        
        { 2n + 2 | n is integer, n >= 0 }
        
        { 2n | n is integer, n >= 1 } 
    """.trimIndent()
        ),
        Pair(
            "What are objects in a set?", """
        Elements
        
        x ∈ A means x is an element of A
        
        x ∉ A means x is NOT an element of A
    """.trimIndent()
        ),
        Pair(
            "What is an empty set?", """
        Set with no elements
        
        Denoted by { } or ϕ
    """.trimIndent()
        ),
        Pair(
            "What makes sets equal?", """
        Sets are equal if they have the same elements
        
        Order does not matter
    """.trimIndent()
        ),
        Pair(
            "What are subsets?", """
        Set A is a subset of B if EVERY element of A is also in B
        
        Denoted by A ⊆ B
        
        Empty set is subset of any set
        
        Any set is subset of itself
    """.trimIndent()
        ),
        Pair(
            "What is size of a set?", """
        Number of elements
        
        Size of A denoted by |A|
        
        AKA cardinality
        
        Can be finite or infinite
    """.trimIndent()
        ),
        Pair(
            "What is a power set?", """
        Set of all subsets of a set
        
        Power set of A is denoted by P(A) or 2ᴬ
        
        If A has n elements, A has 2ⁿ subsets        
    """.trimIndent()
        ),
        Pair(
            "What is a cartesian product?", """
        For sets A & B: set of all possible ordered pairs 
        
        Denoted by A ✕ B
        
        Order matters
           
        If A has m elements & B has n elements -> A ✕ B has m * n pairs
    """.trimIndent()
        ),
        Pair(
            "What are all set operations?", """
        Union
        
        Intersection
        
        Difference
           
        Complement
    """.trimIndent()
        ),
        Pair(
            "What is a union of a set?", """
        Union of sets A and B: set containing elements in either A or B or both
        
        Union of A and B is denoted by A ∪ B
    """.trimIndent()
        ),
        Pair(
            "What is a intersection of a set?", """
        Intersection of sets A and B: set containing only elements in both A and B
        
        Union of A and B is denoted by A ∩ B
        
        Disjoint: means A ∩ B is empty
    """.trimIndent()
        ),
        Pair(
            "What is a difference of a set?", """
        Difference of sets A and B: set containing only elements in A and NOT B
        
        Difference of A and B is denoted by A − B
                
        Order matters
    """.trimIndent()
        ),
        Pair(
            "What is a complement of a set?", """
        Complement of sets A: set of all elements not in A
        
        Complement of A denoted by Aᶜ
                
        To find complement must know universe
    """.trimIndent()
        ),
        Pair(
            "Write a set containing odd #s from 1 to 9", """
        { x : 1 ≤ x ≤ 9 and (x % 2) ≠ 0 }
    """.trimIndent()
        ),
        Pair(
            "What is a proper subset?", """
        Subset of BUT not equal to

        Denoted by ⊂ and ⊄
    """.trimIndent()
        ),
        Pair(
            "What is a singleton or unit set?", """
        Set containing only one element
    """.trimIndent()
        ),
        Pair(
            "What are equivalent sets?", """
        Sets that share the same size, regardless of elements

        Example: a set of {1, 2, 6} is equivalent to {16, 17, 22}
    """.trimIndent()
        ),
        Pair(
            "What are overlapping sets?", """
        Sets that share at least one common element

        Example: a set of {1, 2, 6} is equivalent to {16, 17, 22}
    """.trimIndent()
        ),
        Pair(
            "What is the Cartesian product of A = {1, 2} and B = {a, b, c}?", """
        A ✕ B

        {(1, a), (1, b), (1, c), (2, a), (2, b), (2, c)}
    """.trimIndent()
        ),
        Pair(
            "What set does Z⁺ represent?", """
        Set of positive integers
        
        {1, 2, 3, ....}
    """.trimIndent()
        ),
        Pair(
            "Is 0 ∈ Z⁺ true?", """
        No
        
        Z⁺ represents the set {1, 2, 3, ....}
        
        Does not include 0
    """.trimIndent()
        ),
        Pair(
            "Is 5 ∈ R⁺ true?", """
        Yes
        
        R⁺ represents all positive real numbers
    """.trimIndent()
        ),
        Pair(
            "Is 0 ∈ Q true?", """
        Yes
        
        Q represents all rational numbers
        
        0 = 0 / 1
    """.trimIndent()
        ),
        Pair(
            "What set does Z represent?", """
        Set of positive and negative integers including 0
        
        {..., -2, -1, 0, 1, 2, 3, ....}
    """.trimIndent()
        ),
        Pair(
            "What set does N represent?", """
        Set of natural numbers
        
        {0, 1, 2, 3, ....}
    """.trimIndent()
        ),
        Pair(
            "What set does Q represent?", """
        Set of rational numbers
        
        A rational number is any number that can be written as the ratio of two integers
        
        { p / q | p ϵ Z, q ϵ Z, q ≠ 0)
    """.trimIndent()
        ),
        Pair(
            "What set does R represent?", """
        Set of real numbers
        
        A real number is any number that can take any value on a number line - rational and irrational
        
        R = { x | x is a real number }
    """.trimIndent()
        ),
        Pair(
            "What is the Set Identity Law?", """
        Intersection of anything with the universe = itself
        
        A ∩ U = A
        
        Intersection of anything with the empty set = itself
        
        A ∪ ϕ = A
    """.trimIndent()
        ),
        Pair(
            "What is the Set Domination Law?", """
        Union of anything with the universe = universe
        
        A ∪ U = U
        
        Intersection of anything with the empty set = empty set
        
        A ∩ ϕ = ϕ
    """.trimIndent()
        ),
        Pair(
            "What is the Set Idempotent(Id-emp-oh-tent) Law?", """
        Union of anything with itself = itself
        
        A ∪ A = 0
        
        Intersection of anything with itself = itself
        
        A ∩ A = A
    """.trimIndent()
        ),
        Pair(
            "What is the Set Complement Law?", """
        Union of anything and its complement = universe
        
        A ∪ Aᶜ = U
        
        The intersection of anything with its complement = empty set, and they are disjoint
        
        A ∩ Aᶜ = ϕ
    """.trimIndent()
        ),
        Pair(
            "What is the Set Complementation Law?", """
        The complement of a complement is the original set
        
        (Aᶜ)ᶜ = A
    """.trimIndent()
        ),
        Pair(
            "What is the Set Commutative Law?", """
        The union or intersection of two sets are equal to each other no matter how you order them
        
        A ∪ B = B ∪ A
    """.trimIndent()
        ),
        Pair(
            "What is the Set Associative Law?", """
        If you take three sets and union them, the order doesn't matter
        
        A ∪ (B ∪ C) = (A ∪ B) ∪ C
    """.trimIndent()
        ),
        Pair(
            "What is the Set Distributive Law?", """    
        Distributing the intersection over a union of sets is the same as intersecting each then taking the union        
                    
        A ∩ (B ∪ C) = (A ∩ B) ∪ (A ∩ C)
        
        Same the other way around
        
        A ∪ (B ∩ C) = (A ∪ B) ∩ (A ∪ C)
    """.trimIndent()
        ),
        Pair(
            "What are the Set De Morgan's Law?", """
        Complementing the union of two sets = intersecting the individually complemented sets
        
        (A ∪ B)ᶜ = Aᶜ ∩ Bᶜ
        
        Same the other way around
        
        (A ∩ B)ᶜ = Aᶜ ∪ Bᶜ
    """.trimIndent()
        ),
        Pair(
            "What is the Set Absorption Law?", """
        Taking the union of A with the intersection of A and B results in A
        
        A ∪ (A ∩ B) = A
        
        Same the other way around
        
        A ∩ (A ∪ B) = A
    """.trimIndent()
        ),
        Pair(
            "How would you draw a Venn diagram representing the set of vowels in the alphabet?", """
        Draw a rectangle to indicate the universe set U, representing 26 characters
        
        Draw a circle within, the circle should contain {a, e, i, o, u}
    """.trimIndent()
        ),
        Pair(
            "How many elements does a power set of a set containing 3 elements have?", """
        8
        
        It is 2 raised to the nth power, 2 * 2 * 2 = 8
    """.trimIndent()
        ),
        Pair(
            "What set does {(n, n + 1) | n ∈ Z⁺} create? [Set of ordered pair of n and n + 1 where n is an element of Z+]", """
        {(1, 2), (2, 3), (3, 4), ...}
    """.trimIndent()
        ),
        Pair(
            "What set does {2n | n ∈ Z} create? [Set of 2n where n is an element of Z]", """
        {..., -4, -2, 0, 2, 4, ...}
    """.trimIndent()
        ),
        Pair(
            "How many elements does a power set of a power set of the empty set have?", """
        2
        
        The power set of the empty set has a size 1, of which the power set of is 2 * 1 = 2
    """.trimIndent()
        ),
        Pair(
            "Is 5 ϵ ϕ?", """
        No
        
        No item is an element of the empty set
    """.trimIndent()
        ),
        Pair(
            "What set operation is this: { x | x ϵ A ∧ x ∉ B }?", """
        Difference ( A - B )
        
        Set containing elements of A which are not elements of B
    """.trimIndent()
        ),
        Pair(
            "What set operation is this: { x | x ∉ A }?", """
        Complement of A ( Aᶜ )
        
        This returns a set of all elements in the universe which are not in A
    """.trimIndent()
        ),
        Pair(
            "What is the difference of A = {1, 3, 5} and B = {1, 2, 3}?", """
        5
        
        1, 3 are in set B
    """.trimIndent()
        ),
        Pair(
            "Write { 1, 8, 27, 64, 125, ... } in set builder notation", """
        A = { x³ | x ∈ Z⁺ }
        
        x cubed such that x is an element of all positive integers
    """.trimIndent()
        ),
        Pair(
            "Write { 0, 3, 6, 9, 12, ..., 300 } in set builder notation", """
        A = { 3x | 0 ≤ x ≤ 100 }
        
        3x such that x is greater than or equal to 0 and less than or equal to 100
    """.trimIndent()
        ),
        Pair(
            "Write { 4, 7, 10, 13, 16, ... } in set builder notation", """
        A = { 4 + 3x | x ∈ N }
        
        3x such that x is an element of the set of natural numbers
    """.trimIndent()
        ),
        Pair(
            "Write { (1, 1), (2, 2), (3, 3), (4, 4) ... } in set builder notation", """
        A = { (x, x) | x ∈ Z⁺ }
        
        Ordered pair of (x, x) such that x is an element of the set of positive integers
    """.trimIndent()
        ),
        Pair(
            "Describe (A ∪ B) ∩ C as a Ven diagram", """
        3 circles inside of a rectangle box
        
        Anywhere in which A and B overlap into C is shaded as that is the union of A and B and where it overlaps with C is the intersection
    """.trimIndent()
        ),
        Pair(
            "Describe (A - B) - C as a Ven diagram", """
        3 circles inside of a rectangle box
        
        Only the area where A is not overlapped by B or C is shaded
    """.trimIndent()
        ),
        Pair(
            "Provided a universal set of { x | 0 < x < 11 }, how would A = { 3, 8, 6 } be represented as a bit string?", """
        0010010100
    """.trimIndent()
        ),
        Pair(
            "Provided a universal set of { x | 0 < x < 11 }, how would B = { 1, 5, 6, 8, 9 } be represented as a bit string?", """
        1000110110
    """.trimIndent()
        ),
        Pair(
            "What does it mean to perform an OR on two bit strings?", """
        Two bit strings are bit string representations of sets - this means to union them
        
        101 + 010 = 111
    """.trimIndent()
        ),
        Pair(
            "What does it mean to perform an AND on two bit strings?", """
        Two bit strings are bit string representations of sets - this means to intersect them
        
        101 + 010 = 000
    """.trimIndent()
        ),
    )

    val functions = listOf(
        Pair("If a function gives the output for any given input, what does the inverse do?",
            """
           Gives the input for any output
        """.trimIndent()),
        Pair("How would you find the inverse of f(x) = 1 / x?",
            """
           Let f(x) = y
           
           y = 1 / x | Solve for x
           
           xy = 1
           
           x = 1 / y
           
           f⁻¹(x) = 1 / x
        """.trimIndent()),
        Pair("How would you find the inverse of f(x) = 2x - 4?",
            """
           Let f(x) = y
           
           y = 2x - 4 | Solve for x
           
           y + 4 = 2x
           
           (y + 4) / 2 = x
           
           f⁻¹(x) = (x + 4) / 2
        """.trimIndent()),
        Pair("How would you find the inverse of f(x) = 2x?",
            """
           Let f(x) = y
           
           y = 2x | Solve for x
           
           y / 2 = x
           
           f⁻¹(x) = x / 2
        """.trimIndent()),
        Pair("How would you find the inverse of f(x) = 4x + 5?",
            """
           Let f(x) = y
           
           y = 4x + 5 | Solve for x
           
           (y - 5) / 4  = x
           
           f⁻¹(x) = (x - 5) / 4
        """.trimIndent()),
        Pair("What is the domain of the function f:A → B?",
            """
           In f:A → B, A is the domain
        """.trimIndent()),

        Pair("What is the codomain of the function f:A → B?",
            """
           In f:A → B, B is the codomain
        """.trimIndent()),
        Pair("Describe f(a) = b",
            """
           b is the unique element of B assigned by function f to the element a of A
        """.trimIndent()),
        Pair("In f(a) = b, what is the image of a?",
            """
           b is the image of a
        """.trimIndent()),
        Pair("In f(a) = b, what is the pre-image of b?",
            """
           a is the pre-image of b
        """.trimIndent()),
        Pair("What is range?",
            """
           Subset of the codomain, set of values the function actually outputs
        """.trimIndent()),
        Pair("What is the range of f: {a, b, c, d} → {1, 2, 3, 4, 5} defined by f(a) = 1, f(b) = 2, f(c) = 5, f(d) = 2?",
            """
           { 1, 2, 5 }
           
           Subset of the codomain, set of values the function actually outputs
        """.trimIndent()),
        Pair("In the Java method, int floor(float real) { }, what are the domain and codomain?",
            """
           Domain: set of real numbers as floats
           
           Codomain: set of integers
        """.trimIndent()),
        Pair("What does it mean for a function to be one-to-one?",
            """
           Two inputs of the domain may not map to the same element of the codomain
           
           A one-to-one function is AKA injection
        """.trimIndent()),
        Pair("What is wrong with A = { 1, 2, 3 }, B = { a, b, c, d }; f(1) = b, f(2) = c?", """
            There is no mapping for f(3); f is not a function.
        """.trimIndent()),
        Pair("Does every input in the domain of a function need an output?", """
            Yes
        """.trimIndent()),
        Pair("Provided A = { a, b, c }, B = { 1, 2, 3, 4 }; f(a) = 2, f(b) = 2, f(c) = 3, what is the range?", """
            { 2, 3 }
        """.trimIndent()),
        Pair("Provided A = { a, b }, B = { 1, 2 }; f(a) = 2, f(b) = 1, what is the image of a?", """
             2
        """.trimIndent()),
        Pair("Provided A = { a, b }, B = { 1, 2 }; f(a) = 2, f(b) = 1, what is the pre-image of 1?", """
             b
        """.trimIndent()),
        Pair("What is the range?", """
            Not all elements of the codomain are "used"
            
            The range is which elements are actually being "used"
        """.trimIndent()),
        Pair("Given function f = { (y, a), (y, b) }, what is wrong?", """
        This is not a function, it is just a subset of ordered pairs

        Each element of a domain must be mapped to only one element of the target

        (y, a) ∈ f and (y, b) ∈ f means this is not a function
    """.trimIndent()),
        Pair("Given A = { a, b } and X = { 1, 2 } where f = { (a, 1), (b, 2) }: what is the target of f?", """
        The target is the codomain set, { 1, 2 }
    """.trimIndent()),
        Pair("Given A = { a, b } and X = { 1, 2 } where f = { (a, 1), (b, 1) }: what is the target of f?", """
        The target is the codomain set, { 1, 2 }
    """.trimIndent()),
        Pair("Given A = { a, b } and X = { 1, 2 } where f = { (a, 1), (b, 1) }: what is the range of f?", """
        The range is the set of elements of the codomain which the function maps elements to

        { 1 }
    """.trimIndent()),
        Pair("What does it mean for a function to be well-defined?", """
        The domain and target of f must be specified such that the function produces well-defined values for all of the domain

        Example: f(x) = 1 / (x-1) is not well-defined because if x = 1 there is no output
    """.trimIndent()),
        Pair("What does the floor function do?", """
        Maps a real number to the nearest integer in the downward direction
    """.trimIndent()),
        Pair("What does the ceiling function do?", """
        Maps a real number to the nearest integer in the upward direction
    """.trimIndent()),
        Pair("What is, and provide an example of, an algebraic function?", """
        Functions that are defined using algebraic formulas

        One example: f: Z ⇾ Z, f(n) = n²
    """.trimIndent()),
        Pair("Is p: R ⇾ R, p(x) = √x a function?", """
        No, the function is not well-defined

        The square root of a negative number is imaginary
    """.trimIndent()),
        Pair("Provided an algebraic function definition, and where the domain is equal to the codomain, what is a trick you can use to determine if the function is one-to-one?", """
        f(x) = f(y)
        
        Does f(x) = f(y) reduce to x = y? It is one-to-one
    """.trimIndent()),
        Pair("Provided an algebraic function definition, and where the domain is equal to the codomain, what is a trick you can use to determine if it is onto?", """
        Example: f(x) = 2x + 1
        
        f(x) = y
        
        2x + 1 = y
        
        x = y - 1 / 2
        
        Since you can find what x is, the function is onto
    """.trimIndent()),
        Pair("How do you determine if a function is onto?", """
        Look at the codomain
        
        Is all of the codomain mapped to? If so, it is onto
        
        When the codomain = the range, the function is onto
        
        AKA surjective
    """.trimIndent()),
        Pair("What does it mean for a function to be bijection?", """
        One-to-one AND onto
        
        AKA one-to-one correspondence
    """.trimIndent()),
        Pair("What functions can be inversed?", """
        Functions which are bijections
        
        AKA both one-to-one and onto
        
        AKA one-to-one correspondence
    """.trimIndent()),
        Pair("What is the notation for an inverse function for f?", """
        f⁻¹        
    """.trimIndent()),
        Pair("What is the inverse of the bijection function f: Z → Z, f(x) = x + 3?", """
        x = f⁻¹(x) + 3
        
        x - 3 = f⁻¹
        
        f⁻¹(x) = x - 3
    """.trimIndent()),
        Pair("What are 4 ways to represent functions?", """
        Explicit statement | f(A) = 1, f(B) = 2
           
        Algebraic Formula | f(x) = x²
        
        Computer Program
        
        Relation | A ✕ B - can be a function if the first value is not mapped to multiple values
    """.trimIndent()),
        Pair("In f: A → B, f(1) = B, f(2) = B what is the image and preimage?", """
        Image: B is the image of 1 under f  - B is also the image of 2 under f
        
        Preimage: { 1, 3 } is the preimage of B under f
    """.trimIndent()),
        Pair("For f: X → Y, f(A) = 1, f(B) = 1, f(C) = 1, f(D) = 2, what is the preimage of 2?", """
        { D } is the preimage of 2
    """.trimIndent()),
        Pair("For f: X → Y, f(A) = 1, f(B) = 1, f(C) = 1, f(D) = 2, what is the image of A?", """
        { 1 } is the image of A
    """.trimIndent()),
        Pair("What does injective mean?", """
        Another name for one-to-one function, a function where each value in the range corresponds to no more than one element in the domain
    """.trimIndent()),
        Pair("What does surjective mean?", """
        Another name for onto function, a function where every element in the codomain maps to at least one element in the domain
    """.trimIndent()),
        Pair("What does bijective mean?", """
        Another name for a function which is both one-to-one (injective) and onto (surjective)
    """.trimIndent()),
        Pair("Is f: Z → Z, f(x) = x² either one-to-one or onto?", """
        It is not one-to-one, because a negative and positive integer will output the same value    
            
        It is not onto, because this will never output a negative number
    """.trimIndent()),
        Pair("Given f(x) = x + 3 and g(x) = x² - 2 what is f ∘ g(1)?", """
        f(1² - 2)
        
        f(-1)
        
        -1 + 3
        
        2
    """.trimIndent()),
        Pair("Given f(x) = x + 3 and g(x) = x² - 2 what is f ∘ g(x)?", """
        g(x) = f(x² - 2)
        
        f(x² - 2 + 3)
        
        f(x² + 1)
    """.trimIndent()),
        Pair("Given f(x) = x + 3 and g(x) = x² - 2 what is g ∘ f(1)?", """
        g(1 + 3) = (1 + 3)² - 2
        
        g(4) = 4² - 2
        
        g(4) = 14
    """.trimIndent()),
        Pair("Given f(x) = x + 3 and g(x) = x² - 2 what is g ∘ f(x)?", """
        g(x + 3) = (x + 3)² - 2
        
        g(x + 3) = x² + 6x + 9 - 2
        
        g(x + 3) = x² + 6x + 7
    """.trimIndent()),
        Pair("Given f: S → T and g: T → U what is g(f(s))?", """
        g(f(s)) is the composition of functions g and f
        
        g ∘ f
    """.trimIndent()),
        Pair("In f: S → T ?", """
        The domain of one function must be the same as the codomain of another function
    """.trimIndent()),
        Pair("Given two functions, f and g, are f ∘ g and g ∘ f the same?", """
        Not often; the order in which functions are applied is important
    """.trimIndent()),
        Pair("Given f: R⁺ → R⁺, f(x) = x³ and g: R⁺ → R⁺, g(x) = x + 2: what is (f ∘ g)(x)?", """
        f(g(x))
        
        f((x + 2))
         
        (x + 2)³  
    """.trimIndent()),
        Pair("Given f: R⁺ → R⁺, f(x) = x³ and g: R⁺ → R⁺, g(x) = x + 2: what is (g ∘ f)(x)?", """
        g(f(x))
        
        g((x³))
         
        x³ + 2
    """.trimIndent()),
        Pair("Given f(n) = 3n + 1, g(n) = n², and h(n) = 2ⁿ: what is (f ∘ g)(2)?", """
        f(g(2))
        
        f(4)
        
        13
    """.trimIndent()),
        Pair("Given f(n) = 3n + 1, g(n) = n², and h(n) = 2ⁿ: what is (g ∘ h)(3)?", """
        g(h(3))
        
        g(8)
        
        64
    """.trimIndent()),
        Pair("Given f(n) = 3n + 1, g(n) = n², and h(n) = 2ⁿ: what is (f ∘ g ∘ h)(0)?", """
        f(g(h(0)))
        
        f(g(1))
        
        f(1)
        
        4
    """.trimIndent()),
        Pair("Given f(n) = 3n + 1, g(n) = n², and h(n) = 2ⁿ: what is (f ∘ f⁻¹)(17)?", """
        (f⁻¹ ∘ f)(a) = a
        
        17
    """.trimIndent()),
        Pair("Given f(n) = 2ⁿ and g(n) = n / 6: what is (f ∘ g)(0)?", """
        1
    """.trimIndent()),
    )

    val logic = listOf(
        Pair("What does ∧ mean?",
        """
           Logical AND 
           
           Conjunction
        """.trimIndent()),
        Pair("What does ∨ mean?",
            """
           Logical OR
           
           Inclusive
           
           Disjunction
        """.trimIndent()),
        Pair("What does ¬ mean?",
            """
           Logical negation
        """.trimIndent()),
        Pair("Describe how to create a truth table for (A ∨ B) ∧ B",
            """
           Create four columns: A, B, A ∨ B, (A ∨ B) ∧ B
           
           Create four rows of all possibilities of when A and B can be true or false
           
           Evaluate (A ∨ B) then evaluate that by ∧ B
        """.trimIndent()),
        Pair("What does ~ mean?",
            """
           Not
           
           Example: If A = T, ~A = F
        """.trimIndent()),
        Pair("What does it mean if two statements have the same truth table?",
            """
           They are logically equivalent
        """.trimIndent()),
        Pair("What does A ⇒ B mean?",
            """
           If A then B
           
           Returns true or false by asserting when A is true, B should also be true
           
           If A is false, returns true anyway because of the implication
        """.trimIndent()),
        Pair("What does A ⇔ B mean?",
            """
           If A then B AND if B then A
           
           Returns true or false, true means A and B are logically equivalent
           
           A if and only if B
        """.trimIndent()),
        Pair("What is the Logic Identity Law?",
            """
           p ∧ T (true) ⇔ p
           
           p ∨ F (false) ⇔ p
        """.trimIndent()),
        Pair("What is the Logic Domination Law?",
            """
           p ∨ T (true) ⇔ T
           
           p ∧ F (false) ⇔ F
           
           It doesn't matter what p is
        """.trimIndent()),
        Pair("What is the Logic Double Negation Law?",
            """
           ¬¬p ⇔ p 
        """.trimIndent()),
        Pair("What is the Logic DeMorgan's Law?",
            """
           ¬(p ∧ q) ⇔ ¬p ∨ ¬q 
           
           Not p AND q is = to not p OR not q
           
           Distribute the negation sign to the statements and flip the connective
        """.trimIndent()),
        Pair("What is the Logic Distributive Law?",
            """
           p ∧ (q ∨ r) ⇔ (p ∧ q) ∨ (p ∧ r)
           
           p ∨ (q ∧ r) ⇔ (p ∨ q) ∧ (p ∨ r)
        """.trimIndent()),
        Pair("What is the Logic Absorption Law?",
            """
           p ∧ (p ∨ q) ⇔ p
           
           p ∨ (p ∧ q) ⇔ p
        """.trimIndent()),
        Pair("What is the Logic Commutativity Law?",
            """
           p ∧ q ⇔ q ∧ p
           
           p ∨ q ⇔ q ∨ p
        """.trimIndent()),
        Pair("What is the Logic Associativity Law?",
            """
           p ∧ (q ∧ r)  ⇔ (p ∧ q) ∧ r
           
           This only works if they both the same connective, otherwise distributive
        """.trimIndent()),
        Pair("What is the Logic Inverse Law?",
            """
           p ∧ ¬p ⇔ F
           
           p ∨ ¬p ⇔ T
        """.trimIndent()),
        Pair("What is the Logic Conditional Law?",
            """
           p ⇒ q ⇔ ¬p ∨ q
           
           p ⇒ q is true when p is false and when p and q are true 
        """.trimIndent()),
        Pair("What does ¬(¬p ∧ ¬q) reduce to?",
            """
           ¬¬p ∨ ¬¬q | DeMorgan's
           
           p ∨ q | Double Negation
        """.trimIndent()),
        Pair("What does ¬¬p ∨ ((p ∨ F) ∧ ¬¬q) reduce to? F = false",
            """
           p ∨ ((p ∨ F) ∧ q) | Double Negation x2
           
           p ∨ (p ∧ q) | Identity
           
           p | Absorption
        """.trimIndent()),
        Pair("What does (p ∨ F) ∧ (q v T) reduce to?",
            """
           p ∧ (q v T) | Identity
           
           p ∧ T | Domination
           
           p | Identity
        """.trimIndent()),
    )
    val relations = listOf(
        Pair("What is a binary relation from A to B?", """
            Subset of their Cartesian Product, A × B
            
            Set R of ordered pairs
            
            Relation denoted by (a, b) ∈ R or a R b
            
            When (a, b) ∈ R, a is related to b by R
        """.trimIndent()),
        Pair("Is a relation a function?", """
            Yes
        """.trimIndent()),
        Pair("What is the domain of a relation?", """
            The set of a ∈ A such that there is a b ∈ B with (a, b) ∈ R 
            
            Relation denoted by (a, b) ∈ R
        """.trimIndent()),
        Pair("What is the domain of a relation?", """
            The set of a ∈ A such that there is a b ∈ B with (a, b) ∈ R 
            
            Relation denoted by (a, b) ∈ R
        """.trimIndent()),


    )
    val sequences = listOf(
        QuestionAnswer(
            "What is an informal definition of sequence?",
        """
            A list of numbers that follow a well-defined rule
        """.trimIndent()),
        QuestionAnswer(
            "What is a mathematical definition of a sequence?",
            """
            A function from Z⁺ (set of positive integers) to R (set of real numbers)
        """.trimIndent()),
        QuestionAnswer(
            "What are each number in a sequence referred to as?",
            """
            Terms
        """.trimIndent()),
        QuestionAnswer(
            "What does it mean to represent a sequence by terms?",
            """
            Sequence is written explicitly; may not be obvious in some cases
            
            Example: 1, 3, 5, 7 . . .
        """.trimIndent()),
        QuestionAnswer(
            "What does it mean to represent a sequence by formula?",
            """
            Formula is used to describe how to determine each value given n
            
            Must include the range of n values
            
            Example: aₙ = 2n - 1 for n = 1, 2, 3 . . .
        """.trimIndent()),
        QuestionAnswer(
            "How would you express the sequence 0, 3, 8, 15, 24, 35 . . . by formula?",
            """
            aₙ = n² - 1 for n = 1, 2, 3 . . .
        """.trimIndent()),
        QuestionAnswer(
            "What is one potential issue with attempting to represent a sequence by formula?",
            """
            It may be difficult to find the formula
        """.trimIndent()),
        QuestionAnswer(
            "What does it mean to represent a sequence by recurrence relation?",
            """
            Writing aₙ in respect to other terms
            
            Any values that cannot be found by relation must be explicitly defined

            Example: aₙ = aₙ₋₁ + 2 for n ≥ 2, a₁ = 1
        """.trimIndent()),
    )
}