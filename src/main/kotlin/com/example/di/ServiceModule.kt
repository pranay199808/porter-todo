package com.example.di

import com.example.domain.service.EmployeeService
import com.example.domain.service.EmployeeServiceImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class ServiceModule {
    @Binds
    @Singleton
    abstract fun bindEmployeeService(
        employeeServiceImpl: EmployeeServiceImpl
    ): EmployeeService
} 