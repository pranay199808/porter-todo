package com.example.data.database

import com.example.constants.DatabaseConstants.Columns
import com.example.constants.DatabaseConstants.Tables
import com.example.constants.ValidationConstants
import org.jetbrains.exposed.sql.Table

object EmployeeTable : Table(Tables.EMPLOYEE) {
    val id = integer(Columns.ID).autoIncrement()
    val firstName = varchar(Columns.FIRST_NAME, ValidationConstants.Length.MAX_NAME_LENGTH)
    val lastName = varchar(Columns.LAST_NAME, ValidationConstants.Length.MAX_NAME_LENGTH)
    val email = varchar(Columns.EMAIL, ValidationConstants.Length.MAX_EMAIL_LENGTH).uniqueIndex()
    val department = varchar(Columns.DEPARTMENT, ValidationConstants.Length.MAX_DEPARTMENT_LENGTH)
    val position = varchar(Columns.POSITION, ValidationConstants.Length.MAX_POSITION_LENGTH)
    val salary = double(Columns.SALARY)
    val phoneNumber = varchar(Columns.PHONE_NUMBER, ValidationConstants.Length.MAX_PHONE_LENGTH).nullable()
    val dateOfBirth = varchar(Columns.DATE_OF_BIRTH, ValidationConstants.Length.DATE_LENGTH).nullable()
    val startDate = varchar(Columns.START_DATE, ValidationConstants.Length.DATE_LENGTH).nullable()

    override val primaryKey = PrimaryKey(id)
} 