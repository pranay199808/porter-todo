package com.example.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\rH\u00a6@\u00a2\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0010\u001a\u00020\u0011H\u00a6@\u00a2\u0006\u0002\u0010\u0012J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\u0017J\u001e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/example/domain/repository/EmployeeRepository;", "", "createEmployee", "Lcom/example/domain/model/Employee;", "employee", "(Lcom/example/domain/model/Employee;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteEmployee", "", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findByEmail", "email", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEmployeeById", "getEmployeeCount", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEmployees", "", "offset", "limit", "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateEmployee", "(ILcom/example/domain/model/Employee;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postgres-demo"})
public abstract interface EmployeeRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getEmployees(long offset, int limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.domain.model.Employee>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getEmployeeCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
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
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object findByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.domain.model.Employee> $completion);
}