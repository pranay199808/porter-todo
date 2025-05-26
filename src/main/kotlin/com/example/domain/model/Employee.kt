package com.example.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Employee(
    val id: Int = 0,
    val firstName: String,
    val lastName: String,
    val email: String,
    val department: String,
    val position: String,
    val salary: Double,
    val phoneNumber: String? = null,
    val dateOfBirth: String? = null,
    val startDate: String? = null
) 