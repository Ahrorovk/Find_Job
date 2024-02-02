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
public final class ApproveApplicationUseCase_Factory implements Factory<ApproveApplicationUseCase> {
  private final Provider<AfkorHackRepository> repositoryProvider;

  public ApproveApplicationUseCase_Factory(Provider<AfkorHackRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ApproveApplicationUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static ApproveApplicationUseCase_Factory create(
      Provider<AfkorHackRepository> repositoryProvider) {
    return new ApproveApplicationUseCase_Factory(repositoryProvider);
  }

  public static ApproveApplicationUseCase newInstance(AfkorHackRepository repository) {
    return new ApproveApplicationUseCase(repository);
  }
}
