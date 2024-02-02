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
public final class GetVacanciesUseCase_Factory implements Factory<GetVacanciesUseCase> {
  private final Provider<AfkorHackRepository> repositoryProvider;

  public GetVacanciesUseCase_Factory(Provider<AfkorHackRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetVacanciesUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetVacanciesUseCase_Factory create(
      Provider<AfkorHackRepository> repositoryProvider) {
    return new GetVacanciesUseCase_Factory(repositoryProvider);
  }

  public static GetVacanciesUseCase newInstance(AfkorHackRepository repository) {
    return new GetVacanciesUseCase(repository);
  }
}
