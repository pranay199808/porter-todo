package com.example.domain.service;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0096@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0010J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@\u00a2\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0010J\u001e\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0096@\u00a2\u0006\u0002\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/domain/service/EmployeeServiceImpl;", "Lcom/example/domain/service/EmployeeService;", "employeeRepository", "Lcom/example/domain/repository/EmployeeRepository;", "(Lcom/example/domain/repository/EmployeeRepository;)V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "createEmployee", "Lcom/example/domain/model/Employee;", "employee", "(Lcom/example/domain/model/Employee;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteEmployee", "", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllEmployees", "Lcom/example/domain/model/request/PaginatedResponse;", "pagination", "Lcom/example/domain/model/request/PaginationRequest;", "(Lcom/example/domain/model/request/PaginationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEmployeeById", "updateEmployee", "(ILcom/example/domain/model/Employee;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postgres-demo"})
public final class EmployeeServiceImpl implements com.example.domain.service.EmployeeService {
    @org.jetbrains.annotations.NotNull()
    private final com.example.domain.repository.EmployeeRepository employeeRepository = null;
    private final org.slf4j.Logger logger = null;
    
    @javax.inject.Inject()
    public EmployeeServiceImpl(@org.jetbrains.annotations.NotNull()
    com.example.domain.repository.EmployeeRepository employeeRepository) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getAllEmployees(@org.jetbrains.annotations.NotNull()
    com.example.domain.model.request.PaginationRequest pagination, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.domain.model.request.PaginatedResponse<com.example.domain.model.Employee>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getEmployeeById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.domain.model.Employee> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object createEmployee(@org.jetbrains.annotations.NotNull()
    com.example.domain.model.Employee employee, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.domain.model.Employee> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateEmployee(int id, @org.jetbrains.annotations.NotNull()
    com.example.domain.model.Employee employee, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.domain.model.Employee> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteEmployee(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}