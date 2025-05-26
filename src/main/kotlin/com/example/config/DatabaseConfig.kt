package com.example.config

import com.example.constants.DatabaseConstants.Config
import com.example.data.database.EmployeeTable
import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction

object DatabaseConfig {
    private val dbUrl = System.getenv("DATABASE_URL") ?: "jdbc:postgresql://localhost:5432/${Config.DEFAULT_DATABASE}"
    private val dbUser = System.getenv("DATABASE_USER") ?: "pranay.tajne"
    private val dbPassword = System.getenv("DATABASE_PASSWORD") ?: ""

    fun init() {
        val config = HikariConfig().apply {
            jdbcUrl = dbUrl
            username = dbUser
            password = dbPassword
            maximumPoolSize = Config.MAX_POOL_SIZE
            isAutoCommit = Config.AUTO_COMMIT
            transactionIsolation = Config.TRANSACTION_ISOLATION
            validate()
        }

        val dataSource = HikariDataSource(config)
        Database.connect(dataSource)

        // Create tables
        transaction {
            SchemaUtils.create(EmployeeTable)
        }
    }
} 