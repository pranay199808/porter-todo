package com.example.domain.service;

import com.example.domain.repository.EmployeeRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class EmployeeServiceImpl_Factory implements Factory<EmployeeServiceImpl> {
  private final Provider<EmployeeRepository> employeeRepositoryProvider;

  public EmployeeServiceImpl_Factory(Provider<EmployeeRepository> employeeRepositoryProvider) {
    this.employeeRepositoryProvider = employeeRepositoryProvider;
  }

  @Override
  public EmployeeServiceImpl get() {
    return newInstance(employeeRepositoryProvider.get());
  }

  public static EmployeeServiceImpl_Factory create(
      Provider<EmployeeRepository> employeeRepositoryProvider) {
    return new EmployeeServiceImpl_Factory(employeeRepositoryProvider);
  }

  public static EmployeeServiceImpl newInstance(EmployeeRepository employeeRepository) {
    return new EmployeeServiceImpl(employeeRepository);
  }
}
