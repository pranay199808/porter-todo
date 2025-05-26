package com.example.constants;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lcom/example/constants/DatabaseConstants;", "", "()V", "Columns", "Config", "Tables", "postgres-demo"})
public final class DatabaseConstants {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.constants.DatabaseConstants INSTANCE = null;
    
    private DatabaseConstants() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/constants/DatabaseConstants$Columns;", "", "()V", "DATE_OF_BIRTH", "", "DEPARTMENT", "EMAIL", "FIRST_NAME", "ID", "LAST_NAME", "PHONE_NUMBER", "POSITION", "SALARY", "START_DATE", "postgres-demo"})
    public static final class Columns {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ID = "id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FIRST_NAME = "first_name";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String LAST_NAME = "last_name";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String EMAIL = "email";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DEPARTMENT = "department";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String POSITION = "position";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SALARY = "salary";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PHONE_NUMBER = "phone_number";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DATE_OF_BIRTH = "date_of_birth";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String START_DATE = "start_date";
        @org.jetbrains.annotations.NotNull()
        public static final com.example.constants.DatabaseConstants.Columns INSTANCE = null;
        
        private Columns() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/constants/DatabaseConstants$Config;", "", "()V", "AUTO_COMMIT", "", "DEFAULT_DATABASE", "", "MAX_POOL_SIZE", "", "TRANSACTION_ISOLATION", "postgres-demo"})
    public static final class Config {
        public static final int MAX_POOL_SIZE = 10;
        public static final boolean AUTO_COMMIT = false;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TRANSACTION_ISOLATION = "TRANSACTION_REPEATABLE_READ";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DEFAULT_DATABASE = "employee_db";
        @org.jetbrains.annotations.NotNull()
        public static final com.example.constants.DatabaseConstants.Config INSTANCE = null;
        
        private Config() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/constants/DatabaseConstants$Tables;", "", "()V", "EMPLOYEE", "", "postgres-demo"})
    public static final class Tables {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String EMPLOYEE = "employees";
        @org.jetbrains.annotations.NotNull()
        public static final com.example.constants.DatabaseConstants.Tables INSTANCE = null;
        
        private Tables() {
            super();
        }
    }
}