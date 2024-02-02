package com.ahrorovkspace.afkorhackathon.di;

import com.ahrorovkspace.afkorhackathon.data.network.remote.AfkorHackApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class AppModule_ProvideAfkorHackApiFactory implements Factory<AfkorHackApi> {
  @Override
  public AfkorHackApi get() {
    return provideAfkorHackApi();
  }

  public static AppModule_ProvideAfkorHackApiFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AfkorHackApi provideAfkorHackApi() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideAfkorHackApi());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideAfkorHackApiFactory INSTANCE = new AppModule_ProvideAfkorHackApiFactory();
  }
}
