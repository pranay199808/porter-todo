package com.example.constants;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/constants/ErrorMessages;", "", "()V", "BLANK_FIELD", "", "INVALID_AGE", "INVALID_DATE", "INVALID_DEPARTMENT", "INVALID_FORMAT", "INVALID_ID", "INVALID_PHONE", "LENGTH_RANGE", "NUMERIC_RANGE", "postgres-demo"})
public final class ErrorMessages {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BLANK_FIELD = "cannot be blank";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INVALID_FORMAT = "has invalid format";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LENGTH_RANGE = "must be between %d and %d characters";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NUMERIC_RANGE = "must be between %.2f and %.2f";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INVALID_DEPARTMENT = "must be one of: %s";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INVALID_DATE = "must be a valid date in format YYYY-MM-DD";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INVALID_AGE = "employee must be between %d and %d years old";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INVALID_PHONE = "must be a valid phone number (10-15 digits, optional + prefix)";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INVALID_ID = "Invalid ID format: must be a positive integer";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.constants.ErrorMessages INSTANCE = null;
    
    private ErrorMessages() {
        super();
    }
}