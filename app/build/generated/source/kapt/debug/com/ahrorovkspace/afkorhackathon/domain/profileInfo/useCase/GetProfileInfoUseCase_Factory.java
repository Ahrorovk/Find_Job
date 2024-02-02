package com.ahrorovkspace.afkorhackathon.domain.profileInfo.useCase;

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
public final class GetProfileInfoUseCase_Factory implements Factory<GetProfileInfoUseCase> {
  private final Provider<AfkorHackRepository> repositoryProvider;

  public GetProfileInfoUseCase_Factory(Provider<AfkorHackRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetProfileInfoUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetProfileInfoUseCase_Factory create(
      Provider<AfkorHackRepository> repositoryProvider) {
    return new GetProfileInfoUseCase_Factory(repositoryProvider);
  }

  public static GetProfileInfoUseCase newInstance(AfkorHackRepository repository) {
    return new GetProfileInfoUseCase(repository);
  }
}
