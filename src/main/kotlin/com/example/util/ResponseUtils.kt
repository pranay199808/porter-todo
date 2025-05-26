package com.example.util

import io.ktor.http.*
import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse<T>(
    val status: String,
    val data: T? = null,
    val message: String? = null
)

object ResponseUtils {
    /**
     * Creates a success response
     * @param data The data to include in the response
     * @param message Optional success message
     */
    fun <T> success(data: T, message: String? = null): ApiResponse<T> {
        return ApiResponse(
            status = "success",
            data = data,
            message = message
        )
    }

    /**
     * Creates an error response
     * @param message The error message
     */
    fun error(message: String): ApiResponse<Nothing> {
        return ApiResponse(
            status = "error",
            message = message
        )
    }

    /**
     * Maps common exceptions to appropriate HTTP status codes
     * @param throwable The exception to map
     * @return Appropriate HTTP status code
     */
    fun mapExceptionToStatus(throwable: Throwable): HttpStatusCode {
        return when (throwable) {
            is IllegalArgumentException -> HttpStatusCode.BadRequest
            is NoSuchElementException -> HttpStatusCode.NotFound
            is SecurityException -> HttpStatusCode.Forbidden
            else -> HttpStatusCode.InternalServerError
        }
    }
} 