package com.ahrorovkspace.afkorhackathon.presentation.myApplicationScreen;

import com.ahrorovkspace.afkorhackathon.data.local.DataStoreManager;
import com.ahrorovkspace.afkorhackathon.domain.myApplication.useCase.ApproveApplicationUseCase;
import com.ahrorovkspace.afkorhackathon.domain.myApplication.useCase.GetMyApplicationUseCase;
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
public final class MyApplicationViewModel_Factory implements Factory<MyApplicationViewModel> {
  private final Provider<DataStoreManager> dataStoreManagerProvider;

  private final Provider<GetMyApplicationUseCase> getMyApplicationUseCaseProvider;

  private final Provider<RefreshTokenUseCase> refreshTokenUseCaseProvider;

  private final Provider<ApproveApplicationUseCase> approveApplicationUseCaseProvider;

  public MyApplicationViewModel_Factory(Provider<DataStoreManager> dataStoreManagerProvider,
      Provider<GetMyApplicationUseCase> getMyApplicationUseCaseProvider,
      Provider<RefreshTokenUseCase> refreshTokenUseCaseProvider,
      Provider<ApproveApplicationUseCase> approveApplicationUseCaseProvider) {
    this.dataStoreManagerProvider = dataStoreManagerProvider;
    this.getMyApplicationUseCaseProvider = getMyApplicationUseCaseProvider;
    this.refreshTokenUseCaseProvider = refreshTokenUseCaseProvider;
    this.approveApplicationUseCaseProvider = approveApplicationUseCaseProvider;
  }

  @Override
  public MyApplicationViewModel get() {
    return newInstance(dataStoreManagerProvider.get(), getMyApplicationUseCaseProvider.get(), refreshTokenUseCaseProvider.get(), approveApplicationUseCaseProvider.get());
  }

  public static MyApplicationViewModel_Factory create(
      Provider<DataStoreManager> dataStoreManagerProvider,
      Provider<GetMyApplicationUseCase> getMyApplicationUseCaseProvider,
      Provider<RefreshTokenUseCase> refreshTokenUseCaseProvider,
      Provider<ApproveApplicationUseCase> approveApplicationUseCaseProvider) {
    return new MyApplicationViewModel_Factory(dataStoreManagerProvider, getMyApplicationUseCaseProvider, refreshTokenUseCaseProvider, approveApplicationUseCaseProvider);
  }

  public static MyApplicationViewModel newInstance(DataStoreManager dataStoreManager,
      GetMyApplicationUseCase getMyApplicationUseCase, RefreshTokenUseCase refreshTokenUseCase,
      ApproveApplicationUseCase approveApplicationUseCase) {
    return new MyApplicationViewModel(dataStoreManager, getMyApplicationUseCase, refreshTokenUseCase, approveApplicationUseCase);
  }
}
