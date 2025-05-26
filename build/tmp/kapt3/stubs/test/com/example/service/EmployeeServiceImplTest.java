package com.example.service;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u000fH\u0007J\b\u0010\u0011\u001a\u00020\u000fH\u0007J\b\u0010\u0012\u001a\u00020\u000fH\u0007J\b\u0010\u0013\u001a\u00020\u000fH\u0007J\b\u0010\u0014\u001a\u00020\u000fH\u0007J\b\u0010\u0015\u001a\u00020\u000fH\u0007J\b\u0010\u0016\u001a\u00020\u000fH\u0007J\b\u0010\u0017\u001a\u00020\u000fH\u0007J\b\u0010\u0018\u001a\u00020\u000fH\u0007J\b\u0010\u0019\u001a\u00020\u000fH\u0007J\b\u0010\u001a\u001a\u00020\u000fH\u0007J\b\u0010\u001b\u001a\u00020\u000fH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/service/EmployeeServiceImplTest;", "", "()V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "repository", "Lcom/example/domain/repository/EmployeeRepository;", "service", "Lcom/example/domain/service/EmployeeServiceImpl;", "createEmployee", "Lcom/example/domain/model/Employee;", "id", "", "createEmployee successfully creates new employee", "", "createEmployee throws DuplicateEmailException when email exists", "deleteEmployee successfully deletes existing employee", "deleteEmployee throws EmployeeNotFoundException when employee not found", "getAllEmployees returns paginated list of employees", "getAllEmployees with empty repository returns empty paginated response", "getAllEmployees with last page returns partial list", "getEmployeeById returns employee when found", "getEmployeeById throws EmployeeNotFoundException when not found", "setup", "updateEmployee successfully updates existing employee", "updateEmployee throws DuplicateEmailException when email exists for different employee", "updateEmployee throws EmployeeNotFoundException when employee not found", "postgres-demo_test"})
public final class EmployeeServiceImplTest {
    @org.jetbrains.annotations.NotNull()
    private final com.example.domain.repository.EmployeeRepository repository = null;
    private com.example.domain.service.EmployeeServiceImpl service;
    private final org.slf4j.Logger logger = null;
    
    public EmployeeServiceImplTest() {
        super();
    }
    
    @org.junit.jupiter.api.BeforeEach()
    public final void setup() {
    }
    
    private final com.example.domain.model.Employee createEmployee(int id) {
        return null;
    }
}