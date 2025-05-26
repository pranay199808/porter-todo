package com.example.data.repository

import com.example.data.database.EmployeeTable
import com.example.domain.model.Employee
import com.example.domain.repository.EmployeeRepository
import com.example.exception.DatabaseException
import com.example.util.dbOperation
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.SqlExpressionBuilder.eq
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class EmployeeRepositoryImpl @Inject constructor() : EmployeeRepository {

    override suspend fun getEmployees(offset: Long, limit: Int): List<Employee> = 
        dbOperation(
            operation = { 
                EmployeeTable.selectAll()
                    .orderBy(EmployeeTable.id)
                    .limit(n = limit, offset = offset)
                    .map { it.toEmployee() }
            },
            errorMessage = "Failed to fetch employees with pagination"
        )

    override suspend fun getEmployeeCount(): Long =
        dbOperation(
            operation = {
                EmployeeTable.selectAll().count()
            },
            errorMessage = "Failed to get total employee count"
        )

    override suspend fun getEmployeeById(id: Int): Employee? = 
        dbOperation(
            operation = {
                EmployeeTable.select { EmployeeTable.id eq id }
                    .map { it.toEmployee() }
                    .singleOrNull()
            },
            errorMessage = "Failed to fetch employee with id $id"
        )

    override suspend fun createEmployee(employee: Employee): Employee = 
        dbOperation(
            operation = {
                val insertStatement = EmployeeTable.insert {
                    it[firstName] = employee.firstName
                    it[lastName] = employee.lastName
                    it[email] = employee.email
                    it[department] = employee.department
                    it[position] = employee.position
                    it[salary] = employee.salary
                    it[phoneNumber] = employee.phoneNumber
                    it[dateOfBirth] = employee.dateOfBirth
                    it[startDate] = employee.startDate
                }
                
                insertStatement.resultedValues?.first()?.toEmployee()
                    ?: throw DatabaseException("Failed to create employee")
            },
            errorMessage = "Failed to create employee"
        )

    override suspend fun updateEmployee(id: Int, employee: Employee): Employee = 
        dbOperation(
            operation = {
                val updateCount = EmployeeTable.update({ EmployeeTable.id eq id }) {
                    it[firstName] = employee.firstName
                    it[lastName] = employee.lastName
                    it[email] = employee.email
                    it[department] = employee.department
                    it[position] = employee.position
                    it[salary] = employee.salary
                    it[phoneNumber] = employee.phoneNumber
                    it[dateOfBirth] = employee.dateOfBirth
                    it[startDate] = employee.startDate
                }

                if (updateCount > 0) {
                    EmployeeTable.select { EmployeeTable.id eq id }
                        .map { it.toEmployee() }
                        .singleOrNull() ?: throw DatabaseException("Failed to fetch updated employee")
                } else {
                    throw DatabaseException("Failed to update employee - no rows affected")
                }
            },
            errorMessage = "Failed to update employee with id $id"
        )

    override suspend fun deleteEmployee(id: Int): Boolean = 
        dbOperation(
            operation = {
                val deleteCount = EmployeeTable.deleteWhere { EmployeeTable.id eq id }
                deleteCount > 0
            },
            errorMessage = "Failed to delete employee with id $id"
        )

    override suspend fun findByEmail(email: String): Employee? = 
        dbOperation(
            operation = {
                EmployeeTable.select { EmployeeTable.email eq email }
                    .map { it.toEmployee() }
                    .singleOrNull()
            },
            errorMessage = "Failed to fetch employee with email $email"
        )

    private fun ResultRow.toEmployee() = Employee(
        id = this[EmployeeTable.id],
        firstName = this[EmployeeTable.firstName],
        lastName = this[EmployeeTable.lastName],
        email = this[EmployeeTable.email],
        department = this[EmployeeTable.department],
        position = this[EmployeeTable.position],
        salary = this[EmployeeTable.salary],
        phoneNumber = this[EmployeeTable.phoneNumber],
        dateOfBirth = this[EmployeeTable.dateOfBirth],
        startDate = this[EmployeeTable.startDate]
    )
} 