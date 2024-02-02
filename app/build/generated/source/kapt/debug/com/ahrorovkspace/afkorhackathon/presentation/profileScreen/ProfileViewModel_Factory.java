package com.ahrorovkspace.afkorhackathon.presentation.profileScreen;

import com.ahrorovkspace.afkorhackathon.data.local.DataStoreManager;
import com.ahrorovkspace.afkorhackathon.domain.profileInfo.useCase.ChangeProfileInfoUseCase;
import com.ahrorovkspace.afkorhackathon.domain.profileInfo.useCase.GetProfileInfoUseCase;
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
public final class ProfileViewModel_Factory implements Factory<ProfileViewModel> {
  private final Provider<GetProfileInfoUseCase> getProfileInfoUseCaseProvider;

  private final Provider<DataStoreManager> dataStoreManagerProvider;

  private final Provider<RefreshTokenUseCase> refreshTokenUseCaseProvider;

  private final Provider<ChangeProfileInfoUseCase> changeProfileInfoUseCaseProvider;

  public ProfileViewModel_Factory(Provider<GetProfileInfoUseCase> getProfileInfoUseCaseProvider,
      Provider<DataStoreManager> dataStoreManagerProvider,
      Provider<RefreshTokenUseCase> refreshTokenUseCaseProvider,
      Provider<ChangeProfileInfoUseCase> changeProfileInfoUseCaseProvider) {
    this.getProfileInfoUseCaseProvider = getProfileInfoUseCaseProvider;
    this.dataStoreManagerProvider = dataStoreManagerProvider;
    this.refreshTokenUseCaseProvider = refreshTokenUseCaseProvider;
    this.changeProfileInfoUseCaseProvider = changeProfileInfoUseCaseProvider;
  }

  @Override
  public ProfileViewModel get() {
    return newInstance(getProfileInfoUseCaseProvider.get(), dataStoreManagerProvider.get(), refreshTokenUseCaseProvider.get(), changeProfileInfoUseCaseProvider.get());
  }

  public static ProfileViewModel_Factory create(
      Provider<GetProfileInfoUseCase> getProfileInfoUseCaseProvider,
      Provider<DataStoreManager> dataStoreManagerProvider,
      Provider<RefreshTokenUseCase> refreshTokenUseCaseProvider,
      Provider<ChangeProfileInfoUseCase> changeProfileInfoUseCaseProvider) {
    return new ProfileViewModel_Factory(getProfileInfoUseCaseProvider, dataStoreManagerProvider, refreshTokenUseCaseProvider, changeProfileInfoUseCaseProvider);
  }

  public static ProfileViewModel newInstance(GetProfileInfoUseCase getProfileInfoUseCase,
      DataStoreManager dataStoreManager, RefreshTokenUseCase refreshTokenUseCase,
      ChangeProfileInfoUseCase changeProfileInfoUseCase) {
    return new ProfileViewModel(getProfileInfoUseCase, dataStoreManager, refreshTokenUseCase, changeProfileInfoUseCase);
  }
}
