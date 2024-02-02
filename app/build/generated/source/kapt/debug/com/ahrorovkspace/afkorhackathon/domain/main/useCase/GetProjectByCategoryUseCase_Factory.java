package com.ahrorovkspace.afkorhackathon.domain.main.useCase;

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
public final class GetProjectByCategoryUseCase_Factory implements Factory<GetProjectByCategoryUseCase> {
  private final Provider<AfkorHackRepository> repositoryProvider;

  public GetProjectByCategoryUseCase_Factory(Provider<AfkorHackRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetProjectByCategoryUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetProjectByCategoryUseCase_Factory create(
      Provider<AfkorHackRepository> repositoryProvider) {
    return new GetProjectByCategoryUseCase_Factory(repositoryProvider);
  }

  public static GetProjectByCategoryUseCase newInstance(AfkorHackRepository repository) {
    return new GetProjectByCategoryUseCase(repository);
  }
}
