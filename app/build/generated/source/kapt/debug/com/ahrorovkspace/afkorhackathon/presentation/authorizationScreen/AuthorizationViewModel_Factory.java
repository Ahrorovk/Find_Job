package com.ahrorovkspace.afkorhackathon.presentation.authorizationScreen;

import com.ahrorovkspace.afkorhackathon.data.local.DataStoreManager;
import com.ahrorovkspace.afkorhackathon.domain.authorization.useCase.AuthorizationUseCase;
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
public final class AuthorizationViewModel_Factory implements Factory<AuthorizationViewModel> {
  private final Provider<AuthorizationUseCase> authorizationUseCaseProvider;

  private final Provider<DataStoreManager> dataStoreManagerProvider;

  public AuthorizationViewModel_Factory(Provider<AuthorizationUseCase> authorizationUseCaseProvider,
      Provider<DataStoreManager> dataStoreManagerProvider) {
    this.authorizationUseCaseProvider = authorizationUseCaseProvider;
    this.dataStoreManagerProvider = dataStoreManagerProvider;
  }

  @Override
  public AuthorizationViewModel get() {
    return newInstance(authorizationUseCaseProvider.get(), dataStoreManagerProvider.get());
  }

  public static AuthorizationViewModel_Factory create(
      Provider<AuthorizationUseCase> authorizationUseCaseProvider,
      Provider<DataStoreManager> dataStoreManagerProvider) {
    return new AuthorizationViewModel_Factory(authorizationUseCaseProvider, dataStoreManagerProvider);
  }

  public static AuthorizationViewModel newInstance(AuthorizationUseCase authorizationUseCase,
      DataStoreManager dataStoreManager) {
    return new AuthorizationViewModel(authorizationUseCase, dataStoreManager);
  }
}
