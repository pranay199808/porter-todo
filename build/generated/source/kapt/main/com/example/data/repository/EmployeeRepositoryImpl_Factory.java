package com.example.data.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class EmployeeRepositoryImpl_Factory implements Factory<EmployeeRepositoryImpl> {
  @Override
  public EmployeeRepositoryImpl get() {
    return newInstance();
  }

  public static EmployeeRepositoryImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static EmployeeRepositoryImpl newInstance() {
    return new EmployeeRepositoryImpl();
  }

  private static final class InstanceHolder {
    private static final EmployeeRepositoryImpl_Factory INSTANCE = new EmployeeRepositoryImpl_Factory();
  }
}
