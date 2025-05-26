package com.example.routes

import com.example.domain.model.request.PaginationRequest
import com.example.domain.model.request.CreateEmployeeRequest
import com.example.domain.model.request.UpdateEmployeeRequest
import com.example.domain.service.EmployeeService
import com.example.exception.InvalidEmployeeDataException
import com.example.util.ResponseUtils
import com.example.util.ValidationUtils
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.slf4j.LoggerFactory

private val logger = LoggerFactory.getLogger("EmployeeRoutes")

fun Route.employeeRoutes(employeeService: EmployeeService) {
    route("/employees") {
        get {
            try {
                val page = call.request.queryParameters["page"]?.toIntOrNull() ?: 1
                val pageSize = call.request.queryParameters["pageSize"]?.toIntOrNull() ?: 10
                
                logger.info("Fetching employees with pagination - page: $page, pageSize: $pageSize")
                
                val paginationRequest = PaginationRequest(page, pageSize)
                paginationRequest.validate()
                
                val paginatedEmployees = employeeService.getAllEmployees(paginationRequest)
                call.respond(
                    HttpStatusCode.OK,
                    ResponseUtils.success(
                        data = paginatedEmployees,
                        message = "Successfully retrieved ${paginatedEmployees.items.size} employees"
                    )
                )
            } catch (e: IllegalArgumentException) {
                logger.warn("Invalid pagination parameters", e)
                call.respond(
                    HttpStatusCode.BadRequest,
                    ResponseUtils.error(e.message ?: "Invalid pagination parameters")
                )
            } catch (e: Exception) {
                logger.error("Failed to get employees", e)
                call.respond(
                    ResponseUtils.mapExceptionToStatus(e),
                    ResponseUtils.error(e.message ?: "Failed to get employees")
                )
            }
        }

        get("/{id}") {
            try {
                val id = ValidationUtils.validateAndParseId(call.parameters["id"])
                logger.info("Fetching employee with ID: $id")
                
                employeeService.getEmployeeById(id)?.let { employee ->
                    call.respond(
                        HttpStatusCode.OK,
                        ResponseUtils.success(employee, "Successfully retrieved employee")
                    )
                } ?: call.respond(
                    HttpStatusCode.NotFound,
                    ResponseUtils.error("Employee not found with id: $id")
                )
            } catch (e: InvalidEmployeeDataException) {
                logger.warn("Invalid employee ID format", e)
                call.respond(
                    HttpStatusCode.BadRequest,
                    ResponseUtils.error(e.message ?: "Invalid employee ID")
                )
            } catch (e: Exception) {
                logger.error("Failed to get employee", e)
                call.respond(
                    ResponseUtils.mapExceptionToStatus(e),
                    ResponseUtils.error(e.message ?: "Failed to get employee")
                )
            }
        }

        post {
            try {
                val request = call.receive<CreateEmployeeRequest>()
                logger.info("Creating new employee: ${request.firstName} ${request.lastName}")
                
                val employee = request.toEmployee()
                ValidationUtils.validateEmployee(employee)
                
                val createdEmployee = employeeService.createEmployee(employee)
                call.respond(
                    HttpStatusCode.Created,
                    ResponseUtils.success(
                        data = createdEmployee,
                        message = "Employee created successfully"
                    )
                )
            } catch (e: InvalidEmployeeDataException) {
                logger.warn("Invalid employee data", e)
                call.respond(
                    HttpStatusCode.BadRequest,
                    ResponseUtils.error(e.message ?: "Invalid employee data")
                )
            } catch (e: ContentTransformationException) {
                logger.warn("Invalid request format", e)
                call.respond(
                    HttpStatusCode.BadRequest,
                    ResponseUtils.error("Invalid request format: ${e.message}")
                )
            } catch (e: Exception) {
                logger.error("Failed to create employee", e)
                call.respond(
                    ResponseUtils.mapExceptionToStatus(e),
                    ResponseUtils.error(e.message ?: "Failed to create employee")
                )
            }
        }

        put("/{id}") {
            try {
                val id = ValidationUtils.validateAndParseId(call.parameters["id"])
                val request = call.receive<UpdateEmployeeRequest>()
                logger.info("Updating employee with ID: $id")
                
                // Get existing employee first
                val existingEmployee = employeeService.getEmployeeById(id)
                val updatedEmployee = request.toEmployee(existingEmployee)
                
                ValidationUtils.validateEmployee(updatedEmployee)
                
                val result = employeeService.updateEmployee(id, updatedEmployee)
                call.respond(
                    HttpStatusCode.OK,
                    ResponseUtils.success(
                        data = result,
                        message = "Employee updated successfully"
                    )
                )
            } catch (e: InvalidEmployeeDataException) {
                logger.warn("Invalid employee data", e)
                call.respond(
                    HttpStatusCode.BadRequest,
                    ResponseUtils.error(e.message ?: "Invalid employee data")
                )
            } catch (e: ContentTransformationException) {
                logger.warn("Invalid request format", e)
                call.respond(
                    HttpStatusCode.BadRequest,
                    ResponseUtils.error("Invalid request format: ${e.message}")
                )
            } catch (e: Exception) {
                logger.error("Failed to update employee", e)
                call.respond(
                    ResponseUtils.mapExceptionToStatus(e),
                    ResponseUtils.error(e.message ?: "Failed to update employee")
                )
            }
        }

        delete("/{id}") {
            try {
                val id = ValidationUtils.validateAndParseId(call.parameters["id"])
                logger.info("Deleting employee with ID: $id")
                
                employeeService.deleteEmployee(id)
                call.respond(
                    HttpStatusCode.OK,
                    ResponseUtils.success(data = null, message = "Employee deleted successfully")
                )
            } catch (e: InvalidEmployeeDataException) {
                logger.warn("Invalid employee ID format", e)
                call.respond(
                    HttpStatusCode.BadRequest,
                    ResponseUtils.error(e.message ?: "Invalid employee ID")
                )
            } catch (e: Exception) {
                logger.error("Failed to delete employee", e)
                call.respond(
                    ResponseUtils.mapExceptionToStatus(e),
                    ResponseUtils.error(e.message ?: "Failed to delete employee")
                )
            }
        }
    }
} 