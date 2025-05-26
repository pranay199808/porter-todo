package com.example.util

import com.example.data.database.EmployeeTable
import com.example.domain.model.Employee
import org.jetbrains.exposed.sql.ResultRow

/**
 * Extension functions for mapping database rows to domain models
 */
object MappingUtils {
    fun ResultRow.toEmployee() = Employee(
        id = this[EmployeeTable.id],
        firstName = this[EmployeeTable.firstName],
        lastName = this[EmployeeTable.lastName],
        email = this[EmployeeTable.email],
        department = this[EmployeeTable.department],
        salary = this[EmployeeTable.salary],
        position = this[EmployeeTable.position]
    )
} 