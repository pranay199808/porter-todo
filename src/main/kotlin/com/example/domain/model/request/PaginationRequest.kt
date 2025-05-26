package com.example.domain.model.request

import kotlinx.serialization.Serializable

@Serializable
data class PaginationRequest(
    val page: Int = 1,
    val pageSize: Int = 10
) {
    fun validate() {
        require(page > 0) { "Page number must be greater than 0" }
        require(pageSize in 1..100) { "Page size must be between 1 and 100" }
    }

    fun offset(): Long = ((page - 1) * pageSize).toLong()
    fun limit(): Int = pageSize
}

@Serializable
data class PaginatedResponse<T>(
    val items: List<T>,
    val total: Long,
    val page: Int,
    val pageSize: Int,
    val totalPages: Int
) 