package com.example.di;

import com.example.data.repository.EmployeeRepositoryImpl;
import com.example.data.repository.EmployeeRepositoryImpl_Factory;
import com.example.domain.service.EmployeeService;
import com.example.domain.service.EmployeeServiceImpl;
import com.example.domain.service.EmployeeServiceImpl_Factory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;
import javax.annotation.processing.Generated;

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
public final class DaggerAppComponent {
  private DaggerAppComponent() {
  }

  public static AppComponent.Factory factory() {
    return new Factory();
  }

  public static AppComponent create() {
    return new Factory().create();
  }

  private static final class Factory implements AppComponent.Factory {
    @Override
    public AppComponent create() {
      return new AppComponentImpl();
    }
  }

  private static final class AppComponentImpl implements AppComponent {
    private final AppComponentImpl appComponentImpl = this;

    private Provider<EmployeeRepositoryImpl> employeeRepositoryImplProvider;

    private Provider<EmployeeServiceImpl> employeeServiceImplProvider;

    private AppComponentImpl() {

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.employeeRepositoryImplProvider = DoubleCheck.provider(EmployeeRepositoryImpl_Factory.create());
      this.employeeServiceImplProvider = DoubleCheck.provider(EmployeeServiceImpl_Factory.create(((Provider) employeeRepositoryImplProvider)));
    }

    @Override
    public EmployeeService employeeService() {
      return employeeServiceImplProvider.get();
    }
  }
}
