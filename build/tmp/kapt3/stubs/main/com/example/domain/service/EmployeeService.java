package com.example.domain.service;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\r\u001a\u00020\u000eH\u00a6@\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\nJ\u001e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/example/domain/service/EmployeeService;", "", "createEmployee", "Lcom/example/domain/model/Employee;", "employee", "(Lcom/example/domain/model/Employee;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteEmployee", "", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllEmployees", "Lcom/example/domain/model/request/PaginatedResponse;", "pagination", "Lcom/example/domain/model/request/PaginationRequest;", "(Lcom/example/domain/model/request/PaginationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEmployeeById", "updateEmployee", "(ILcom/example/domain/model/Employee;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postgres-demo"})
public abstract interface EmployeeService {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllEmployees(@org.jetbrains.annotations.NotNull()
    com.example.domain.model.request.PaginationRequest pagination, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.domain.model.request.PaginatedResponse<com.example.domain.model.Employee>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getEmployeeById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.domain.model.Employee> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createEmployee(@org.jetbrains.annotations.NotNull()
    com.example.domain.model.Employee employee, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.domain.model.Employee> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateEmployee(int id, @org.jetbrains.annotations.NotNull()
    com.example.domain.model.Employee employee, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.domain.model.Employee> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteEmployee(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}