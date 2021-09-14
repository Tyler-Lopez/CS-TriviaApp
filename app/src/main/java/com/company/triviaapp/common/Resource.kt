package com.company.triviaapp.common

// Can put this class around any type of object which can be used as our network response
// https://www.youtube.com/watch?v=EF33KmyprEQ 13:00
sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
    class Loading<T>(data: T? = null) : Resource<T>(data)
}