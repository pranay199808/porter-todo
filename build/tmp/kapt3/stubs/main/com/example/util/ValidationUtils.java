package com.example.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001%B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bJ \u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/example/util/ValidationUtils;", "", "()V", "EMAIL_REGEX", "Lkotlin/text/Regex;", "NAME_REGEX", "PHONE_REGEX", "calculateAge", "", "dob", "Ljava/time/LocalDate;", "validateAndParseId", "id", "", "validateDate", "", "fieldName", "dateStr", "errors", "Lcom/example/util/ValidationUtils$ValidationErrors;", "validateDateOfBirth", "validateDepartment", "department", "validateEmail", "email", "validateEmployee", "employee", "Lcom/example/domain/model/Employee;", "validateName", "value", "validatePhone", "phone", "validatePosition", "position", "validateSalary", "salary", "", "ValidationErrors", "postgres-demo"})
public final class ValidationUtils {
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.text.Regex EMAIL_REGEX = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.text.Regex NAME_REGEX = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.text.Regex PHONE_REGEX = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.util.ValidationUtils INSTANCE = null;
    
    private ValidationUtils() {
        super();
    }
    
    /**
     * Validates employee data with comprehensive checks
     * @param employee The employee to validate
     * @throws InvalidEmployeeDataException if validation fails
     */
    public final void validateEmployee(@org.jetbrains.annotations.NotNull()
    com.example.domain.model.Employee employee) {
    }
    
    /**
     * Validates and parses an ID
     * @param id The ID to validate
     * @return Parsed integer ID
     * @throws InvalidEmployeeDataException if invalid
     */
    public final int validateAndParseId(@org.jetbrains.annotations.Nullable()
    java.lang.String id) {
        return 0;
    }
    
    private final void validateName(java.lang.String fieldName, java.lang.String value, com.example.util.ValidationUtils.ValidationErrors errors) {
    }
    
    private final void validateEmail(java.lang.String email, com.example.util.ValidationUtils.ValidationErrors errors) {
    }
    
    private final void validateDepartment(java.lang.String department, com.example.util.ValidationUtils.ValidationErrors errors) {
    }
    
    private final void validatePosition(java.lang.String position, com.example.util.ValidationUtils.ValidationErrors errors) {
    }
    
    private final void validateSalary(double salary, com.example.util.ValidationUtils.ValidationErrors errors) {
    }
    
    private final void validatePhone(java.lang.String phone, com.example.util.ValidationUtils.ValidationErrors errors) {
    }
    
    private final void validateDate(java.lang.String fieldName, java.lang.String dateStr, com.example.util.ValidationUtils.ValidationErrors errors) {
    }
    
    private final void validateDateOfBirth(java.lang.String dateStr, com.example.util.ValidationUtils.ValidationErrors errors) {
    }
    
    private final int calculateAge(java.time.LocalDate dob) {
        return 0;
    }
    
    /**
     * Helper class to collect and manage validation errors
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/util/ValidationUtils$ValidationErrors;", "", "()V", "errors", "", "", "add", "", "error", "throwIfHasErrors", "postgres-demo"})
    static final class ValidationErrors {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> errors = null;
        
        public ValidationErrors() {
            super();
        }
        
        public final void add(@org.jetbrains.annotations.NotNull()
        java.lang.String error) {
        }
        
        public final void throwIfHasErrors() {
        }
    }
}