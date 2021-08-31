package com.company.triviaapp

val questionBank = mapOf(
    "What is a Record?" to "A record is the data structure that stores subitems, often called fields, with a name associated with each subitem.",
    "What is an Array?" to "An array is a data structure that stores an ordered list of items, where each item is directly accessible by a positional index.",
    "What is a Linked List?" to "A linked list is a data structure that stores an ordered list of items in nodes, where each node stores data and has a pointer to the next node.",
    "What is a Binary Tree?" to "A binary tree is a data structure in which each node stores data and has up to two children, known as a left child and a right child.",
    "What is a Hash Table?" to "A hash table is a data structure that stores unordered items by mapping (or hashing) each item to a location in an array.",
    "What is a Heap?" to "A max-heap is a tree that maintains the simple property that a node's key is greater than or equal to the node's childrens' keys. A min-heap is a tree that maintains the simple property that a node's key is less than or equal to the node's childrens' keys.",
    "What is a Graph?" to "A graph is a data structure for representing connections among items, and consists of vertices connected by edges. A vertex represents an item in a graph. An edge represents a connection between two vertices in a graph."
)

fun retrieveRandomQuestion():Pair<String, String> {
    return Pair("What is a Record?", "A record is the data structure that stores subitems, often called fields, with a name associated with each subitem.")
}