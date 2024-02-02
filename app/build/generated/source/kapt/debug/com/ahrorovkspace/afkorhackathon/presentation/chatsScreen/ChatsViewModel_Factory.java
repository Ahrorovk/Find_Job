package com.ahrorovkspace.afkorhackathon.presentation.chatsScreen;

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
public final class ChatsViewModel_Factory implements Factory<ChatsViewModel> {
  private final Provider<DataStoreManager> dataStoreManagerProvider;

  public ChatsViewModel_Factory(Provider<DataStoreManager> dataStoreManagerProvider) {
    this.dataStoreManagerProvider = dataStoreManagerProvider;
  }

  @Override
  public ChatsViewModel get() {
    return newInstance(dataStoreManagerProvider.get());
  }

  public static ChatsViewModel_Factory create(Provider<DataStoreManager> dataStoreManagerProvider) {
    return new ChatsViewModel_Factory(dataStoreManagerProvider);
  }

  public static ChatsViewModel newInstance(DataStoreManager dataStoreManager) {
    return new ChatsViewModel(dataStoreManager);
  }
}
