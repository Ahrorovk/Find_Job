package com.ahrorovkspace.afkorhackathon.presentation.mainScreen;

import com.ahrorovkspace.afkorhackathon.data.local.DataStoreManager;
import com.ahrorovkspace.afkorhackathon.domain.companyById.useCase.GetCompanyByIdUseCase;
import com.ahrorovkspace.afkorhackathon.domain.main.useCase.GetVacanciesUseCase;
import com.ahrorovkspace.afkorhackathon.domain.refreshToken.useCase.RefreshTokenUseCase;
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
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<DataStoreManager> dataStoreManagerProvider;

  private final Provider<GetVacanciesUseCase> getVacanciesUseCaseProvider;

  private final Provider<RefreshTokenUseCase> refreshTokenUseCaseProvider;

  private final Provider<GetCompanyByIdUseCase> getCompanyByIdUseCaseProvider;

  public MainViewModel_Factory(Provider<DataStoreManager> dataStoreManagerProvider,
      Provider<GetVacanciesUseCase> getVacanciesUseCaseProvider,
      Provider<RefreshTokenUseCase> refreshTokenUseCaseProvider,
      Provider<GetCompanyByIdUseCase> getCompanyByIdUseCaseProvider) {
    this.dataStoreManagerProvider = dataStoreManagerProvider;
    this.getVacanciesUseCaseProvider = getVacanciesUseCaseProvider;
    this.refreshTokenUseCaseProvider = refreshTokenUseCaseProvider;
    this.getCompanyByIdUseCaseProvider = getCompanyByIdUseCaseProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(dataStoreManagerProvider.get(), getVacanciesUseCaseProvider.get(), refreshTokenUseCaseProvider.get(), getCompanyByIdUseCaseProvider.get());
  }

  public static MainViewModel_Factory create(Provider<DataStoreManager> dataStoreManagerProvider,
      Provider<GetVacanciesUseCase> getVacanciesUseCaseProvider,
      Provider<RefreshTokenUseCase> refreshTokenUseCaseProvider,
      Provider<GetCompanyByIdUseCase> getCompanyByIdUseCaseProvider) {
    return new MainViewModel_Factory(dataStoreManagerProvider, getVacanciesUseCaseProvider, refreshTokenUseCaseProvider, getCompanyByIdUseCaseProvider);
  }

  public static MainViewModel newInstance(DataStoreManager dataStoreManager,
      GetVacanciesUseCase getVacanciesUseCase, RefreshTokenUseCase refreshTokenUseCase,
      GetCompanyByIdUseCase getCompanyByIdUseCase) {
    return new MainViewModel(dataStoreManager, getVacanciesUseCase, refreshTokenUseCase, getCompanyByIdUseCase);
  }
}
