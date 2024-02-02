package com.ahrorovkspace.afkorhackathon.domain.myApplication.useCase;

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
public final class GetMyApplicationUseCase_Factory implements Factory<GetMyApplicationUseCase> {
  private final Provider<AfkorHackRepository> repositoryProvider;

  public GetMyApplicationUseCase_Factory(Provider<AfkorHackRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetMyApplicationUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetMyApplicationUseCase_Factory create(
      Provider<AfkorHackRepository> repositoryProvider) {
    return new GetMyApplicationUseCase_Factory(repositoryProvider);
  }

  public static GetMyApplicationUseCase newInstance(AfkorHackRepository repository) {
    return new GetMyApplicationUseCase(repository);
  }
}
