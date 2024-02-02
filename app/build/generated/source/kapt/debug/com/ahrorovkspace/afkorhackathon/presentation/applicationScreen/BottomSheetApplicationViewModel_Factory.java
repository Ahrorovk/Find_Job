package com.ahrorovkspace.afkorhackathon.presentation.applicationScreen;

import com.ahrorovkspace.afkorhackathon.data.local.DataStoreManager;
import com.ahrorovkspace.afkorhackathon.domain.application.useCase.SendApplicationUseCase;
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
public final class BottomSheetApplicationViewModel_Factory implements Factory<BottomSheetApplicationViewModel> {
  private final Provider<DataStoreManager> dataStoreManagerProvider;

  private final Provider<SendApplicationUseCase> sendApplicationUseCaseProvider;

  private final Provider<RefreshTokenUseCase> refreshTokenUseCaseProvider;

  public BottomSheetApplicationViewModel_Factory(
      Provider<DataStoreManager> dataStoreManagerProvider,
      Provider<SendApplicationUseCase> sendApplicationUseCaseProvider,
      Provider<RefreshTokenUseCase> refreshTokenUseCaseProvider) {
    this.dataStoreManagerProvider = dataStoreManagerProvider;
    this.sendApplicationUseCaseProvider = sendApplicationUseCaseProvider;
    this.refreshTokenUseCaseProvider = refreshTokenUseCaseProvider;
  }

  @Override
  public BottomSheetApplicationViewModel get() {
    return newInstance(dataStoreManagerProvider.get(), sendApplicationUseCaseProvider.get(), refreshTokenUseCaseProvider.get());
  }

  public static BottomSheetApplicationViewModel_Factory create(
      Provider<DataStoreManager> dataStoreManagerProvider,
      Provider<SendApplicationUseCase> sendApplicationUseCaseProvider,
      Provider<RefreshTokenUseCase> refreshTokenUseCaseProvider) {
    return new BottomSheetApplicationViewModel_Factory(dataStoreManagerProvider, sendApplicationUseCaseProvider, refreshTokenUseCaseProvider);
  }

  public static BottomSheetApplicationViewModel newInstance(DataStoreManager dataStoreManager,
      SendApplicationUseCase sendApplicationUseCase, RefreshTokenUseCase refreshTokenUseCase) {
    return new BottomSheetApplicationViewModel(dataStoreManager, sendApplicationUseCase, refreshTokenUseCase);
  }
}
