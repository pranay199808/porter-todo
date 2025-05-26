package com.example.domain.model.request

import com.example.domain.model.Employee
import kotlinx.serialization.Serializable

@Serializable
data class CreateEmployeeRequest(
    val firstName: String,
    val lastName: String,
    val email: String,
    val department: String,
    val position: String,
    val salary: Double,
    val phoneNumber: String? = null,
    val dateOfBirth: String? = null,
    val startDate: String? = null
) {
    fun toEmployee() = Employee(
        firstName = firstName,
        lastName = lastName,
        email = email,
        department = department,
        position = position,
        salary = salary,
        phoneNumber = phoneNumber,
        dateOfBirth = dateOfBirth,
        startDate = startDate
    )
}

@Serializable
data class UpdateEmployeeRequest(
    val firstName: String? = null,
    val lastName: String? = null,
    val email: String? = null,
    val department: String? = null,
    val position: String? = null,
    val salary: Double? = null,
    val phoneNumber: String? = null,
    val dateOfBirth: String? = null,
    val startDate: String? = null
) {
    fun toEmployee(existingEmployee: Employee) = Employee(
        id = existingEmployee.id,
        firstName = firstName ?: existingEmployee.firstName,
        lastName = lastName ?: existingEmployee.lastName,
        email = email ?: existingEmployee.email,
        department = department ?: existingEmployee.department,
        position = position ?: existingEmployee.position,
        salary = salary ?: existingEmployee.salary,
        phoneNumber = phoneNumber ?: existingEmployee.phoneNumber,
        dateOfBirth = dateOfBirth ?: existingEmployee.dateOfBirth,
        startDate = startDate ?: existingEmployee.startDate
    )
} 