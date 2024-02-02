package com.ahrorovkspace.afkorhackathon.presentation.registratrionScreen;

import com.ahrorovkspace.afkorhackathon.data.local.DataStoreManager;
import com.ahrorovkspace.afkorhackathon.domain.registration.useCase.RegistrationUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RegistrationViewModel_Factory implements Factory<RegistrationViewModel> {
  private final Provider<RegistrationUseCase> registrationUseCaseProvider;

  private final Provider<DataStoreManager> dataStoreManagerProvider;

  public RegistrationViewModel_Factory(Provider<RegistrationUseCase> registrationUseCaseProvider,
      Provider<DataStoreManager> dataStoreManagerProvider) {
    this.registrationUseCaseProvider = registrationUseCaseProvider;
    this.dataStoreManagerProvider = dataStoreManagerProvider;
  }

  @Override
  public RegistrationViewModel get() {
    return newInstance(registrationUseCaseProvider.get(), dataStoreManagerProvider.get());
  }

  public static RegistrationViewModel_Factory create(
      Provider<RegistrationUseCase> registrationUseCaseProvider,
      Provider<DataStoreManager> dataStoreManagerProvider) {
    return new RegistrationViewModel_Factory(registrationUseCaseProvider, dataStoreManagerProvider);
  }

  public static RegistrationViewModel newInstance(RegistrationUseCase registrationUseCase,
      DataStoreManager dataStoreManager) {
    return new RegistrationViewModel(registrationUseCase, dataStoreManager);
  }
}
