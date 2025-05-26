package com.example.constants

object DatabaseConstants {
    object Tables {
        const val EMPLOYEE = "employees"
    }

    object Columns {
        const val ID = "id"
        const val FIRST_NAME = "first_name"
        const val LAST_NAME = "last_name"
        const val EMAIL = "email"
        const val DEPARTMENT = "department"
        const val POSITION = "position"
        const val SALARY = "salary"
        const val PHONE_NUMBER = "phone_number"
        const val DATE_OF_BIRTH = "date_of_birth"
        const val START_DATE = "start_date"
    }

    object Config {
        const val MAX_POOL_SIZE = 10
        const val AUTO_COMMIT = false
        const val TRANSACTION_ISOLATION = "TRANSACTION_REPEATABLE_READ"
        const val DEFAULT_DATABASE = "employee_db"
    }
} 