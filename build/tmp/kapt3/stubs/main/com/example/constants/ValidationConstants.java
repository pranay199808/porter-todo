package com.example.constants;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0007"}, d2 = {"Lcom/example/constants/ValidationConstants;", "", "()V", "Department", "Length", "Numeric", "Regex", "postgres-demo"})
public final class ValidationConstants {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.constants.ValidationConstants INSTANCE = null;
    
    private ValidationConstants() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/constants/ValidationConstants$Department;", "", "()V", "ALLOWED_DEPARTMENTS", "", "", "getALLOWED_DEPARTMENTS", "()Ljava/util/Set;", "postgres-demo"})
    public static final class Department {
        @org.jetbrains.annotations.NotNull()
        private static final java.util.Set<java.lang.String> ALLOWED_DEPARTMENTS = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.example.constants.ValidationConstants.Department INSTANCE = null;
        
        private Department() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<java.lang.String> getALLOWED_DEPARTMENTS() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/constants/ValidationConstants$Length;", "", "()V", "DATE_LENGTH", "", "MAX_DEPARTMENT_LENGTH", "MAX_EMAIL_LENGTH", "MAX_NAME_LENGTH", "MAX_PHONE_LENGTH", "MAX_POSITION_LENGTH", "MIN_NAME_LENGTH", "postgres-demo"})
    public static final class Length {
        public static final int MIN_NAME_LENGTH = 2;
        public static final int MAX_NAME_LENGTH = 50;
        public static final int MAX_DEPARTMENT_LENGTH = 100;
        public static final int MAX_POSITION_LENGTH = 100;
        public static final int MAX_EMAIL_LENGTH = 100;
        public static final int MAX_PHONE_LENGTH = 20;
        public static final int DATE_LENGTH = 10;
        @org.jetbrains.annotations.NotNull()
        public static final com.example.constants.ValidationConstants.Length INSTANCE = null;
        
        private Length() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/constants/ValidationConstants$Numeric;", "", "()V", "MAX_AGE", "", "MAX_SALARY", "", "MIN_AGE", "MIN_SALARY", "postgres-demo"})
    public static final class Numeric {
        public static final double MIN_SALARY = 0.0;
        public static final double MAX_SALARY = 1000000.0;
        public static final int MIN_AGE = 18;
        public static final int MAX_AGE = 100;
        @org.jetbrains.annotations.NotNull()
        public static final com.example.constants.ValidationConstants.Numeric INSTANCE = null;
        
        private Numeric() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/constants/ValidationConstants$Regex;", "", "()V", "EMAIL_PATTERN", "", "NAME_PATTERN", "PHONE_PATTERN", "postgres-demo"})
    public static final class Regex {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String EMAIL_PATTERN = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String NAME_PATTERN = "^[A-Za-z\\s-\']+$";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PHONE_PATTERN = "^\\+?[0-9]{10,15}$";
        @org.jetbrains.annotations.NotNull()
        public static final com.example.constants.ValidationConstants.Regex INSTANCE = null;
        
        private Regex() {
            super();
        }
    }
}