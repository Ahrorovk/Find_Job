package com.ahrorovkspace.afkorhackathon.domain.registration.useCase;

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
public final class RegistrationUseCase_Factory implements Factory<RegistrationUseCase> {
  private final Provider<AfkorHackRepository> repositoryProvider;

  public RegistrationUseCase_Factory(Provider<AfkorHackRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public RegistrationUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static RegistrationUseCase_Factory create(
      Provider<AfkorHackRepository> repositoryProvider) {
    return new RegistrationUseCase_Factory(repositoryProvider);
  }

  public static RegistrationUseCase newInstance(AfkorHackRepository repository) {
    return new RegistrationUseCase(repository);
  }
}
