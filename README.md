# Postgres Demo with Ktor

A Kotlin-based REST API demonstration using Ktor framework with PostgreSQL integration, featuring Exposed ORM, Dagger for dependency injection, and comprehensive testing setup.

## Tech Stack

- **Framework**: Ktor 2.3.7
- **Language**: Kotlin 1.9.22
- **Database**: PostgreSQL with Exposed ORM
- **Connection Pooling**: HikariCP
- **Dependency Injection**: Dagger 2
- **Testing**: JUnit 5, MockK
- **Build Tool**: Gradle with Kotlin DSL
- **Serialization**: kotlinx.serialization

## Prerequisites

- JDK 11 or higher
- PostgreSQL 15.x or higher
- Gradle 8.x

## Database Setup

1. Start PostgreSQL service
2. Create a new database:
```sql
CREATE DATABASE postgres_demo;
```

3. Create the employee table:
```sql
CREATE TABLE IF NOT EXISTS employee (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    department VARCHAR(255) NOT NULL,
    position VARCHAR(255) NOT NULL,
    salary DOUBLE PRECISION NOT NULL,
    phone_number VARCHAR(20),
    date_of_birth VARCHAR(10),
    start_date VARCHAR(10)
);
```

## Project Configuration

### Database Configuration

Update `application.conf` in `src/main/resources`:
```hocon
database {
    driverClassName = "org.postgresql.Driver"
    jdbcURL = "jdbc:postgresql://localhost:5432/postgres_demo"
    username = "your_username"
    password = "your_password"
}
```

## Project Structure

```
src/
├── main/
│   ├── kotlin/
│   │   └── com/
│   │       └── example/
│   │           ├── Application.kt
│   │           ├── config/
│   │           ├── constants/
│   │           │   └── DatabaseConstants.kt
│   │           ├── data/
│   │           │   └── database/
│   │           │       └── EmployeeTable.kt
│   │           ├── di/
│   │           ├── domain/
│   │           │   ├── model/
│   │           │   │   └── request/
│   │           │   │       ├── CreateEmployeeRequest.kt
│   │           │   │       ├── UpdateEmployeeRequest.kt
│   │           │   │       └── PaginationRequest.kt
│   │           │   └── service/
│   │           │       └── EmployeeService.kt
│   │           ├── exception/
│   │           ├── routes/
│   │           │   └── EmployeeRoutes.kt
│   │           └── util/
│   │               ├── ResponseUtils.kt
│   │               └── ValidationUtils.kt
│   └── resources/
│       └── application.conf
└── test/
    └── kotlin/
        └── com/
            └── example/
                └── tests/
```

## API Documentation

### Employee Endpoints

#### Get All Employees
```http
GET /employees?page=1&pageSize=10
```
Response:
```json
{
    "success": true,
    "data": {
        "items": [
            {
                "id": 1,
                "firstName": "John",
                "lastName": "Doe",
                "email": "john.doe@example.com",
                "department": "Engineering",
                "position": "Senior Developer",
                "salary": 85000.00,
                "phoneNumber": "+1234567890",
                "dateOfBirth": "1990-01-01",
                "startDate": "2024-01-15"
            }
        ],
        "page": 1,
        "pageSize": 10,
        "total": 1
    },
    "message": "Successfully retrieved 1 employees"
}
```

#### Get Employee by ID
```http
GET /employees/{id}
```

#### Create Employee
```http
POST /employees
```
Request body:
```json
{
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com",
    "department": "Engineering",
    "position": "Senior Developer",
    "salary": 85000.00,
    "phoneNumber": "+1234567890",
    "dateOfBirth": "1990-01-01",
    "startDate": "2024-01-15"
}
```

#### Update Employee
```http
PUT /employees/{id}
```
Request body: Same as Create Employee

#### Delete Employee
```http
DELETE /employees/{id}
```

### Error Responses
```json
{
    "success": false,
    "message": "Error message here"
}
```

## Dependencies

Key dependencies and their versions:
```kotlin
ktor_version = "2.3.7"
kotlin_version = "1.9.22"
exposed_version = "0.41.1"
postgresql_version = "42.5.1"
hikari_version = "5.0.1"
dagger_version = "2.48"
mockk_version = "1.13.8"
junit_version = "5.10.0"
```

## Development Guidelines

1. **Database Operations**
   - Use Exposed transactions for database operations
   - Implement repository pattern for data access
   - Use connection pooling for better performance

2. **Dependency Injection**
   - Use Dagger for dependency management
   - Create modules for different components
   - Follow constructor injection pattern

3. **Testing**
   - Write unit tests for services and repositories
   - Use MockK for mocking dependencies
   - Create integration tests for API endpoints

4. **Validation**
   - All employee data is validated before processing
   - Email format must be valid
   - Required fields cannot be empty
   - Dates should be in the correct format (YYYY-MM-DD)

## Common Issues and Solutions

1. **Database Connection Issues**
   - Verify PostgreSQL is running
   - Check database credentials
   - Ensure database exists and is accessible

2. **Dependency Injection**
   - Run `./gradlew clean build` after modifying Dagger components
   - Check for circular dependencies
   - Verify module provisions

3. **Testing**
   - Use test-specific configuration
   - Clean database state between tests
   - Mock external dependencies

## Contributing

1. Fork the repository
2. Create your feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## License

This project is licensed under the MIT License. 