package com.example.di

import com.example.domain.service.EmployeeService
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RepositoryModule::class, ServiceModule::class])
interface AppComponent {
    fun employeeService(): EmployeeService

    @Component.Factory
    interface Factory {
        fun create(): AppComponent
    }
} 