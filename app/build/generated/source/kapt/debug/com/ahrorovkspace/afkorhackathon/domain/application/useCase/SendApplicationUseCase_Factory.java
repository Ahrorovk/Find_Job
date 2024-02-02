package com.ahrorovkspace.afkorhackathon.domain.application.useCase;

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
public final class SendApplicationUseCase_Factory implements Factory<SendApplicationUseCase> {
  private final Provider<AfkorHackRepository> repositoryProvider;

  public SendApplicationUseCase_Factory(Provider<AfkorHackRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public SendApplicationUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static SendApplicationUseCase_Factory create(
      Provider<AfkorHackRepository> repositoryProvider) {
    return new SendApplicationUseCase_Factory(repositoryProvider);
  }

  public static SendApplicationUseCase newInstance(AfkorHackRepository repository) {
    return new SendApplicationUseCase(repository);
  }
}
