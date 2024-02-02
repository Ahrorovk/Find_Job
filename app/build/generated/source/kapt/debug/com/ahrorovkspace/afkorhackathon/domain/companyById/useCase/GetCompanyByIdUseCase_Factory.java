package com.ahrorovkspace.afkorhackathon.domain.companyById.useCase;

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
public final class GetCompanyByIdUseCase_Factory implements Factory<GetCompanyByIdUseCase> {
  private final Provider<AfkorHackRepository> repositoryProvider;

  public GetCompanyByIdUseCase_Factory(Provider<AfkorHackRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetCompanyByIdUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetCompanyByIdUseCase_Factory create(
      Provider<AfkorHackRepository> repositoryProvider) {
    return new GetCompanyByIdUseCase_Factory(repositoryProvider);
  }

  public static GetCompanyByIdUseCase newInstance(AfkorHackRepository repository) {
    return new GetCompanyByIdUseCase(repository);
  }
}
