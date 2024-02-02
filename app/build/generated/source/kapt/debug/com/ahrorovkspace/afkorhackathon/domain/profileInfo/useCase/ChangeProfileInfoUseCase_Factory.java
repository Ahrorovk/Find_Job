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
public final class ChangeProfileInfoUseCase_Factory implements Factory<ChangeProfileInfoUseCase> {
  private final Provider<AfkorHackRepository> repositoryProvider;

  public ChangeProfileInfoUseCase_Factory(Provider<AfkorHackRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ChangeProfileInfoUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static ChangeProfileInfoUseCase_Factory create(
      Provider<AfkorHackRepository> repositoryProvider) {
    return new ChangeProfileInfoUseCase_Factory(repositoryProvider);
  }

  public static ChangeProfileInfoUseCase newInstance(AfkorHackRepository repository) {
    return new ChangeProfileInfoUseCase(repository);
  }
}
