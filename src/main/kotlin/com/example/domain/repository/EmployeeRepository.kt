package com.example.domain.repository

import com.example.domain.model.Employee

interface EmployeeRepository {
    suspend fun getEmployees(offset: Long, limit: Int): List<Employee>
    suspend fun getEmployeeCount(): Long
    suspend fun getEmployeeById(id: Int): Employee?
    suspend fun createEmployee(employee: Employee): Employee
    suspend fun updateEmployee(id: Int, employee: Employee): Employee
    suspend fun deleteEmployee(id: Int): Boolean
    suspend fun findByEmail(email: String): Employee?
} 