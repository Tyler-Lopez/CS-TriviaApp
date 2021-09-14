package com.company.triviaapp.domain

/*

I'm not sure if these two functions (increment / decrement) should be here or not...

 */

fun safeIncrement(lastIndex: Int, currentIndex: Int): Int {
    return when (currentIndex) {
        lastIndex -> 0
        else -> currentIndex + 1
    }
}

fun safeDecrement(lastIndex: Int, currentIndex: Int): Int {
    return when (currentIndex) {
        0 -> lastIndex
        else -> currentIndex - 1
    }
}