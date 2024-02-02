package com.ahrorovkspace.afkorhackathon.domain.authorization.useCase;

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
public final class AuthorizationUseCase_Factory implements Factory<AuthorizationUseCase> {
  private final Provider<AfkorHackRepository> repositoryProvider;

  public AuthorizationUseCase_Factory(Provider<AfkorHackRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public AuthorizationUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static AuthorizationUseCase_Factory create(
      Provider<AfkorHackRepository> repositoryProvider) {
    return new AuthorizationUseCase_Factory(repositoryProvider);
  }

  public static AuthorizationUseCase newInstance(AfkorHackRepository repository) {
    return new AuthorizationUseCase(repository);
  }
}
