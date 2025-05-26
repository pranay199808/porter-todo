package com.example.domain.service

import com.example.domain.model.Employee
import com.example.domain.model.request.PaginatedResponse
import com.example.domain.model.request.PaginationRequest
import com.example.domain.repository.EmployeeRepository
import com.example.exception.DuplicateEmailException
import com.example.exception.EmployeeNotFoundException
import org.slf4j.LoggerFactory
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.math.ceil

@Singleton
class EmployeeServiceImpl @Inject constructor(
    private val employeeRepository: EmployeeRepository
) : EmployeeService {
    private val logger = LoggerFactory.getLogger(EmployeeServiceImpl::class.java)

    override suspend fun getAllEmployees(pagination: PaginationRequest): PaginatedResponse<Employee> {
        logger.info("Fetching employees with pagination: page={}, pageSize={}", pagination.page, pagination.pageSize)
        
        val total = employeeRepository.getEmployeeCount()
        val employees = employeeRepository.getEmployees(pagination.offset(), pagination.limit())
        val totalPages = ceil(total.toDouble() / pagination.pageSize).toInt()
        
        logger.debug("Found {} employees (page {} of {})", employees.size, pagination.page, totalPages)
        
        return PaginatedResponse(
            items = employees,
            total = total,
            page = pagination.page,
            pageSize = pagination.pageSize,
            totalPages = totalPages
        )
    }

    override suspend fun getEmployeeById(id: Int): Employee {
        logger.info("Fetching employee with id: {}", id)
        return employeeRepository.getEmployeeById(id)
            ?.also { logger.debug("Found employee: {}", it) }
            ?: throw EmployeeNotFoundException(id).also {
                logger.error("Employee not found with id: {}", id)
            }
    }

    override suspend fun createEmployee(employee: Employee): Employee {
        logger.info("Creating new employee: {}", employee)
        employeeRepository.findByEmail(employee.email)?.let {
            logger.error("Attempt to create employee with existing email: {}", employee.email)
            throw DuplicateEmailException(employee.email)
        }
        return employeeRepository.createEmployee(employee).also {
            logger.info("Successfully created employee with id: {}", it.id)
        }
    }

    override suspend fun updateEmployee(id: Int, employee: Employee): Employee {
        logger.info("Updating employee with id: {}, new data: {}", id, employee)
        // Check if employee exists
        employeeRepository.getEmployeeById(id)
            ?: throw EmployeeNotFoundException(id).also {
                logger.error("Attempt to update non-existent employee with id: {}", id)
            }

        // Check if email is already taken by another employee
        employeeRepository.findByEmail(employee.email)?.let {
            if (it.id != id) {
                logger.error("Attempt to update employee with existing email: {}", employee.email)
                throw DuplicateEmailException(employee.email)
            }
        }

        return employeeRepository.updateEmployee(id, employee).also {
            logger.info("Successfully updated employee with id: {}", id)
        }
    }

    override suspend fun deleteEmployee(id: Int) {
        logger.info("Deleting employee with id: {}", id)
        if (!employeeRepository.deleteEmployee(id)) {
            logger.error("Failed to delete employee with id: {}", id)
            throw EmployeeNotFoundException(id)
        }
        logger.info("Successfully deleted employee with id: {}", id)
    }
} 