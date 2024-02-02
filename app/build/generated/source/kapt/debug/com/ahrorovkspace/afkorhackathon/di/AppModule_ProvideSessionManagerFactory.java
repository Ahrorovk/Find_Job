package com.ahrorovkspace.afkorhackathon.di;

import android.content.Context;
import com.ahrorovkspace.afkorhackathon.data.local.DataStoreManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideSessionManagerFactory implements Factory<DataStoreManager> {
  private final Provider<Context> contextProvider;

  public AppModule_ProvideSessionManagerFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public DataStoreManager get() {
    return provideSessionManager(contextProvider.get());
  }

  public static AppModule_ProvideSessionManagerFactory create(Provider<Context> contextProvider) {
    return new AppModule_ProvideSessionManagerFactory(contextProvider);
  }

  public static DataStoreManager provideSessionManager(Context context) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideSessionManager(context));
  }
}
