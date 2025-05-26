package com.example.service

import com.example.domain.model.Employee
import com.example.domain.model.request.PaginationRequest
import com.example.domain.repository.EmployeeRepository
import com.example.domain.service.EmployeeServiceImpl
import com.example.exception.DuplicateEmailException
import com.example.exception.EmployeeNotFoundException
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.slf4j.LoggerFactory
import kotlin.test.assertEquals

class EmployeeServiceImplTest {
    private val repository: EmployeeRepository = mockk()
    private lateinit var service: EmployeeServiceImpl
    private val logger = LoggerFactory.getLogger(EmployeeServiceImplTest::class.java)

    @BeforeEach
    fun setup() {
        service = EmployeeServiceImpl(repository)
    }

    @Test
    fun `getAllEmployees returns paginated list of employees`() = runBlocking {
        logger.info("Starting test: getAllEmployees returns paginated list of employees")
        
        // Arrange
        val page = 2
        val pageSize = 5
        val totalEmployees = 12L
        val paginationRequest = PaginationRequest(page = page, pageSize = pageSize)
        
        val employees = listOf(
            createEmployee(6),
            createEmployee(7),
            createEmployee(8),
            createEmployee(9),
            createEmployee(10)
        )
        logger.debug("Created test employees for page $page: {}", employees)
        
        coEvery { repository.getEmployeeCount() } returns totalEmployees
        coEvery { repository.getEmployees(offset = 5L, limit = 5) } returns employees

        // Act
        logger.debug("Executing getAllEmployees with pagination: page=$page, pageSize=$pageSize")
        val result = service.getAllEmployees(paginationRequest)

        // Assert
        logger.debug("Verifying results")
        assertEquals(employees, result.items)
        assertEquals(totalEmployees, result.total)
        assertEquals(page, result.page)
        assertEquals(pageSize, result.pageSize)
        assertEquals(3, result.totalPages) // ceil(12/5) = 3 pages
        
        coVerify { 
            repository.getEmployeeCount()
            repository.getEmployees(offset = 5L, limit = 5)
        }
        logger.info("Test completed successfully")
    }

    @Test
    fun `getAllEmployees with empty repository returns empty paginated response`() = runBlocking {
        logger.info("Starting test: getAllEmployees with empty repository")
        
        // Arrange
        val paginationRequest = PaginationRequest(page = 1, pageSize = 10)
        
        coEvery { repository.getEmployeeCount() } returns 0L
        coEvery { repository.getEmployees(offset = 0L, limit = 10) } returns emptyList()

        // Act
        logger.debug("Executing getAllEmployees with pagination")
        val result = service.getAllEmployees(paginationRequest)

        // Assert
        logger.debug("Verifying results")
        assertEquals(emptyList(), result.items)
        assertEquals(0L, result.total)
        assertEquals(1, result.page)
        assertEquals(10, result.pageSize)
        assertEquals(0, result.totalPages)
        
        coVerify { 
            repository.getEmployeeCount()
            repository.getEmployees(offset = 0L, limit = 10)
        }
        logger.info("Test completed successfully")
    }

    @Test
    fun `getAllEmployees with last page returns partial list`() = runBlocking {
        logger.info("Starting test: getAllEmployees with last page")
        
        // Arrange
        val page = 3
        val pageSize = 5
        val totalEmployees = 11L
        val paginationRequest = PaginationRequest(page = page, pageSize = pageSize)
        
        val employees = listOf(
            createEmployee(11)
        )
        logger.debug("Created test employees for last page: {}", employees)
        
        coEvery { repository.getEmployeeCount() } returns totalEmployees
        coEvery { repository.getEmployees(offset = 10L, limit = 5) } returns employees

        // Act
        logger.debug("Executing getAllEmployees for last page")
        val result = service.getAllEmployees(paginationRequest)

        // Assert
        logger.debug("Verifying results")
        assertEquals(employees, result.items)
        assertEquals(totalEmployees, result.total)
        assertEquals(page, result.page)
        assertEquals(pageSize, result.pageSize)
        assertEquals(3, result.totalPages) // ceil(11/5) = 3 pages
        
        coVerify { 
            repository.getEmployeeCount()
            repository.getEmployees(offset = 10L, limit = 5)
        }
        logger.info("Test completed successfully")
    }

    @Test
    fun `getEmployeeById returns employee when found`() = runBlocking {
        // Arrange
        val id = 1
        val employee = createEmployee(id)
        coEvery { repository.getEmployeeById(id) } returns employee

        // Act
        val result = service.getEmployeeById(id)

        // Assert
        assertEquals(employee, result)
        coVerify { repository.getEmployeeById(id) }
    }

    @Test
    fun `getEmployeeById throws EmployeeNotFoundException when not found`() = runBlocking {
        // Arrange
        val id = 999
        coEvery { repository.getEmployeeById(id) } returns null

        // Act & Assert
        assertThrows<EmployeeNotFoundException> {
            service.getEmployeeById(id)
        }
        coVerify { repository.getEmployeeById(id) }
    }

    @Test
    fun `createEmployee successfully creates new employee`() = runBlocking {
        // Arrange
        val newEmployee = createEmployee(0) // ID will be assigned by DB
        val createdEmployee = createEmployee(1) // DB assigned ID
        coEvery { repository.findByEmail(newEmployee.email) } returns null
        coEvery { repository.createEmployee(newEmployee) } returns createdEmployee

        // Act
        val result = service.createEmployee(newEmployee)

        // Assert
        assertEquals(createdEmployee, result)
        coVerify { 
            repository.findByEmail(newEmployee.email)
            repository.createEmployee(newEmployee)
        }
    }

    @Test
    fun `createEmployee throws DuplicateEmailException when email exists`() = runBlocking {
        // Arrange
        val existingEmployee = createEmployee(1)
        val newEmployee = createEmployee(0).copy(email = existingEmployee.email)
        coEvery { repository.findByEmail(newEmployee.email) } returns existingEmployee

        // Act & Assert
        assertThrows<DuplicateEmailException> {
            service.createEmployee(newEmployee)
        }
        coVerify { repository.findByEmail(newEmployee.email) }
    }

    @Test
    fun `updateEmployee successfully updates existing employee`() = runBlocking {
        // Arrange
        val id = 1
        val existingEmployee = createEmployee(id)
        val updateData = existingEmployee.copy(position = "Senior Developer", salary = 85000.0)
        val updatedEmployee = updateData.copy() // Simulating DB update

        coEvery { repository.getEmployeeById(id) } returns existingEmployee
        coEvery { repository.findByEmail(updateData.email) } returns existingEmployee
        coEvery { repository.updateEmployee(id, updateData) } returns updatedEmployee

        // Act
        val result = service.updateEmployee(id, updateData)

        // Assert
        assertEquals(updatedEmployee, result)
        coVerify { 
            repository.getEmployeeById(id)
            repository.findByEmail(updateData.email)
            repository.updateEmployee(id, updateData)
        }
    }

    @Test
    fun `updateEmployee throws EmployeeNotFoundException when employee not found`() = runBlocking {
        // Arrange
        val id = 999
        val updateData = createEmployee(id)
        coEvery { repository.getEmployeeById(id) } returns null

        // Act & Assert
        assertThrows<EmployeeNotFoundException> {
            service.updateEmployee(id, updateData)
        }
        coVerify { repository.getEmployeeById(id) }
    }

    @Test
    fun `updateEmployee throws DuplicateEmailException when email exists for different employee`() = runBlocking {
        // Arrange
        val id = 1
        val existingEmployee = createEmployee(id)
        val otherEmployee = createEmployee(2)
        val updateData = existingEmployee.copy(email = otherEmployee.email)

        coEvery { repository.getEmployeeById(id) } returns existingEmployee
        coEvery { repository.findByEmail(updateData.email) } returns otherEmployee

        // Act & Assert
        assertThrows<DuplicateEmailException> {
            service.updateEmployee(id, updateData)
        }
        coVerify { 
            repository.getEmployeeById(id)
            repository.findByEmail(updateData.email)
        }
    }

    @Test
    fun `deleteEmployee successfully deletes existing employee`() = runBlocking {
        // Arrange
        val id = 1
        coEvery { repository.deleteEmployee(id) } returns true

        // Act
        service.deleteEmployee(id)

        // Assert
        coVerify { repository.deleteEmployee(id) }
    }

    @Test
    fun `deleteEmployee throws EmployeeNotFoundException when employee not found`() = runBlocking {
        // Arrange
        val id = 999
        coEvery { repository.deleteEmployee(id) } returns false

        // Act & Assert
        assertThrows<EmployeeNotFoundException> {
            service.deleteEmployee(id)
        }
        coVerify { repository.deleteEmployee(id) }
    }

    private fun createEmployee(id: Int) = Employee(
        id = id,
        firstName = "First$id",
        lastName = "Last$id",
        email = "employee$id@example.com",
        department = "Department$id",
        position = "Position$id",
        salary = 50000.0 + id * 1000,
        phoneNumber = "+1-234-567-${id.toString().padStart(4, '0')}",
        dateOfBirth = "1990-01-$id",
        startDate = "2023-01-$id"
    )
} 