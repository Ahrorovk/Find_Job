package com.ahrorovkspace.afkorhackathon.domain.refreshToken.useCase;

import com.ahrorovkspace.afkorhackathon.domain.AfkorHackRepository;
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
public final class RefreshTokenUseCase_Factory implements Factory<RefreshTokenUseCase> {
  private final Provider<AfkorHackRepository> repositoryProvider;

  public RefreshTokenUseCase_Factory(Provider<AfkorHackRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public RefreshTokenUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static RefreshTokenUseCase_Factory create(
      Provider<AfkorHackRepository> repositoryProvider) {
    return new RefreshTokenUseCase_Factory(repositoryProvider);
  }

  public static RefreshTokenUseCase newInstance(AfkorHackRepository repository) {
    return new RefreshTokenUseCase(repository);
  }
}
