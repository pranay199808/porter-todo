package com.example.util

import org.jetbrains.exposed.sql.transactions.transaction
import org.slf4j.LoggerFactory

private val logger = LoggerFactory.getLogger("DatabaseUtils")

/**
 * Executes a database operation within a transaction and handles exceptions
 * @param operation The database operation to execute
 * @param errorMessage The error message to log if the operation fails
 * @return Result of the operation
 */
fun <T> dbOperation(
    operation: () -> T,
    errorMessage: String
): T {
    return try {
        transaction {
            operation()
        }
    } catch (e: Exception) {
        logger.error("$errorMessage: ${e.message}")
        throw e
    }
} 