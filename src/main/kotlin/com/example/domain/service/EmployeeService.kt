package com.example.domain.service

import com.example.domain.model.Employee
import com.example.domain.model.request.PaginatedResponse
import com.example.domain.model.request.PaginationRequest

interface EmployeeService {
    suspend fun getAllEmployees(pagination: PaginationRequest): PaginatedResponse<Employee>
    suspend fun getEmployeeById(id: Int): Employee
    suspend fun createEmployee(employee: Employee): Employee
    suspend fun updateEmployee(id: Int, employee: Employee): Employee
    suspend fun deleteEmployee(id: Int)
} 