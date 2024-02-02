package com.ahrorovkspace.afkorhackathon.di;

import com.ahrorovkspace.afkorhackathon.data.network.remote.AfkorHackApi;
import com.ahrorovkspace.afkorhackathon.domain.AfkorHackRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideAfkorHackRepositoryFactory implements Factory<AfkorHackRepository> {
  private final Provider<AfkorHackApi> apiProvider;

  public AppModule_ProvideAfkorHackRepositoryFactory(Provider<AfkorHackApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public AfkorHackRepository get() {
    return provideAfkorHackRepository(apiProvider.get());
  }

  public static AppModule_ProvideAfkorHackRepositoryFactory create(
      Provider<AfkorHackApi> apiProvider) {
    return new AppModule_ProvideAfkorHackRepositoryFactory(apiProvider);
  }

  public static AfkorHackRepository provideAfkorHackRepository(AfkorHackApi api) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideAfkorHackRepository(api));
  }
}
