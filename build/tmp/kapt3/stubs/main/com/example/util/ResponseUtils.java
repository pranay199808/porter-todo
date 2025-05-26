package com.example.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ+\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000e\u001a\u0002H\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/example/util/ResponseUtils;", "", "()V", "error", "Lcom/example/util/ApiResponse;", "", "message", "", "mapExceptionToStatus", "Lio/ktor/http/HttpStatusCode;", "throwable", "", "success", "T", "data", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/example/util/ApiResponse;", "postgres-demo"})
public final class ResponseUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.util.ResponseUtils INSTANCE = null;
    
    private ResponseUtils() {
        super();
    }
    
    /**
     * Creates a success response
     * @param data The data to include in the response
     * @param message Optional success message
     */
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>com.example.util.ApiResponse<T> success(T data, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
        return null;
    }
    
    /**
     * Creates an error response
     * @param message The error message
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.util.ApiResponse error(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
        return null;
    }
    
    /**
     * Maps common exceptions to appropriate HTTP status codes
     * @param throwable The exception to map
     * @return Appropriate HTTP status code
     */
    @org.jetbrains.annotations.NotNull()
    public final io.ktor.http.HttpStatusCode mapExceptionToStatus(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
        return null;
    }
}