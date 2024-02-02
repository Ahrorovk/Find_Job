package com.ahrorovkspace.afkorhackathon.app.navigation;

import com.ahrorovkspace.afkorhackathon.data.local.DataStoreManager;
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
public final class NavigationViewModel_Factory implements Factory<NavigationViewModel> {
  private final Provider<DataStoreManager> dataStoreManagerProvider;

  public NavigationViewModel_Factory(Provider<DataStoreManager> dataStoreManagerProvider) {
    this.dataStoreManagerProvider = dataStoreManagerProvider;
  }

  @Override
  public NavigationViewModel get() {
    return newInstance(dataStoreManagerProvider.get());
  }

  public static NavigationViewModel_Factory create(
      Provider<DataStoreManager> dataStoreManagerProvider) {
    return new NavigationViewModel_Factory(dataStoreManagerProvider);
  }

  public static NavigationViewModel newInstance(DataStoreManager dataStoreManager) {
    return new NavigationViewModel(dataStoreManager);
  }
}
