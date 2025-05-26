package com.example.constants

object ValidationConstants {
    object Regex {
        const val EMAIL_PATTERN = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"
        const val NAME_PATTERN = "^[A-Za-z\\s-']+$"
        const val PHONE_PATTERN = "^\\+?[0-9]{10,15}$"
    }

    object Length {
        const val MIN_NAME_LENGTH = 2
        const val MAX_NAME_LENGTH = 50
        const val MAX_DEPARTMENT_LENGTH = 100
        const val MAX_POSITION_LENGTH = 100
        const val MAX_EMAIL_LENGTH = 100
        const val MAX_PHONE_LENGTH = 20
        const val DATE_LENGTH = 10 // YYYY-MM-DD
    }

    object Numeric {
        const val MIN_SALARY = 0.0
        const val MAX_SALARY = 1_000_000.0
        const val MIN_AGE = 18
        const val MAX_AGE = 100
    }

    object Department {
        val ALLOWED_DEPARTMENTS = setOf(
            "Engineering",
            "Sales",
            "Marketing",
            "HR",
            "Finance",
            "Operations",
            "IT",
            "Customer Support",
            "Legal",
            "Research"
        )
    }
} 