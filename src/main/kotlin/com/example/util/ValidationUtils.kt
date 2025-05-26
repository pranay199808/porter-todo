package com.example.util

import com.example.constants.ErrorMessages
import com.example.constants.ValidationConstants
import com.example.domain.model.Employee
import com.example.exception.InvalidEmployeeDataException
import java.time.LocalDate
import java.time.format.DateTimeParseException

object ValidationUtils {
    private val EMAIL_REGEX = ValidationConstants.Regex.EMAIL_PATTERN.toRegex()
    private val NAME_REGEX = ValidationConstants.Regex.NAME_PATTERN.toRegex()
    private val PHONE_REGEX = ValidationConstants.Regex.PHONE_PATTERN.toRegex()

    /**
     * Validates employee data with comprehensive checks
     * @param employee The employee to validate
     * @throws InvalidEmployeeDataException if validation fails
     */
    fun validateEmployee(employee: Employee) {
        val errors = ValidationErrors()

        // Basic validations
        validateName("First name", employee.firstName, errors)
        validateName("Last name", employee.lastName, errors)
        validateEmail(employee.email, errors)
        validateDepartment(employee.department, errors)
        validatePosition(employee.position, errors)
        validateSalary(employee.salary, errors)

        // Optional validations if fields are present
        employee.phoneNumber?.let { validatePhone(it, errors) }
        employee.dateOfBirth?.let { validateDateOfBirth(it, errors) }
        employee.startDate?.let { validateDate("Start date", it, errors) }

        errors.throwIfHasErrors()
    }

    /**
     * Validates and parses an ID
     * @param id The ID to validate
     * @return Parsed integer ID
     * @throws InvalidEmployeeDataException if invalid
     */
    fun validateAndParseId(id: String?): Int {
        return id?.toIntOrNull()?.takeIf { it > 0 }
            ?: throw InvalidEmployeeDataException(ErrorMessages.INVALID_ID)
    }

    private fun validateName(fieldName: String, value: String, errors: ValidationErrors) {
        when {
            value.isBlank() -> 
                errors.add("$fieldName ${ErrorMessages.BLANK_FIELD}")
            value.length !in ValidationConstants.Length.MIN_NAME_LENGTH..ValidationConstants.Length.MAX_NAME_LENGTH ->
                errors.add("$fieldName ${ErrorMessages.LENGTH_RANGE.format(
                    ValidationConstants.Length.MIN_NAME_LENGTH,
                    ValidationConstants.Length.MAX_NAME_LENGTH
                )}")
            !value.matches(NAME_REGEX) ->
                errors.add("$fieldName ${ErrorMessages.INVALID_FORMAT}")
        }
    }

    private fun validateEmail(email: String, errors: ValidationErrors) {
        when {
            email.isBlank() ->
                errors.add("Email ${ErrorMessages.BLANK_FIELD}")
            !email.matches(EMAIL_REGEX) ->
                errors.add("Email ${ErrorMessages.INVALID_FORMAT}")
        }
    }

    private fun validateDepartment(department: String, errors: ValidationErrors) {
        when {
            department.isBlank() ->
                errors.add("Department ${ErrorMessages.BLANK_FIELD}")
            department.length > ValidationConstants.Length.MAX_DEPARTMENT_LENGTH ->
                errors.add("Department must not exceed ${ValidationConstants.Length.MAX_DEPARTMENT_LENGTH} characters")
            !ValidationConstants.Department.ALLOWED_DEPARTMENTS.contains(department) ->
                errors.add("Department ${ErrorMessages.INVALID_DEPARTMENT.format(
                    ValidationConstants.Department.ALLOWED_DEPARTMENTS.joinToString(", ")
                )}")
        }
    }

    private fun validatePosition(position: String, errors: ValidationErrors) {
        when {
            position.isBlank() ->
                errors.add("Position ${ErrorMessages.BLANK_FIELD}")
            position.length > ValidationConstants.Length.MAX_POSITION_LENGTH ->
                errors.add("Position must not exceed ${ValidationConstants.Length.MAX_POSITION_LENGTH} characters")
        }
    }

    private fun validateSalary(salary: Double, errors: ValidationErrors) {
        when {
            salary <= ValidationConstants.Numeric.MIN_SALARY ->
                errors.add("Salary must be greater than ${ValidationConstants.Numeric.MIN_SALARY}")
            salary > ValidationConstants.Numeric.MAX_SALARY ->
                errors.add("Salary ${ErrorMessages.NUMERIC_RANGE.format(
                    ValidationConstants.Numeric.MIN_SALARY,
                    ValidationConstants.Numeric.MAX_SALARY
                )}")
        }
    }

    private fun validatePhone(phone: String, errors: ValidationErrors) {
        if (!phone.matches(PHONE_REGEX)) {
            errors.add("Phone number ${ErrorMessages.INVALID_PHONE}")
        }
    }

    private fun validateDate(fieldName: String, dateStr: String, errors: ValidationErrors) {
        try {
            LocalDate.parse(dateStr)
        } catch (e: DateTimeParseException) {
            errors.add("$fieldName ${ErrorMessages.INVALID_DATE}")
        }
    }

    private fun validateDateOfBirth(dateStr: String, errors: ValidationErrors) {
        try {
            val dob = LocalDate.parse(dateStr)
            val age = calculateAge(dob)
            if (age !in ValidationConstants.Numeric.MIN_AGE..ValidationConstants.Numeric.MAX_AGE) {
                errors.add("Age ${ErrorMessages.INVALID_AGE.format(
                    ValidationConstants.Numeric.MIN_AGE,
                    ValidationConstants.Numeric.MAX_AGE
                )}")
            }
        } catch (e: DateTimeParseException) {
            errors.add("Date of birth ${ErrorMessages.INVALID_DATE}")
        }
    }

    private fun calculateAge(dob: LocalDate): Int {
        return LocalDate.now().year - dob.year
    }

    /**
     * Helper class to collect and manage validation errors
     */
    private class ValidationErrors {
        private val errors = mutableListOf<String>()

        fun add(error: String) {
            errors.add(error)
        }

        fun throwIfHasErrors() {
            if (errors.isNotEmpty()) {
                throw InvalidEmployeeDataException(errors.joinToString("; "))
            }
        }
    }
} 