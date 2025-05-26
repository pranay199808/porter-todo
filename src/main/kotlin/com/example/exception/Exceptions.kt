package com.example.exception

sealed class AppException(message: String) : Exception(message)

class EmployeeNotFoundException(id: Int) : AppException("Employee with id $id not found")
class DuplicateEmailException(email: String) : AppException("Employee with email $email already exists")
class InvalidEmployeeDataException(message: String) : AppException(message)
class DatabaseException(message: String) : AppException(message) 