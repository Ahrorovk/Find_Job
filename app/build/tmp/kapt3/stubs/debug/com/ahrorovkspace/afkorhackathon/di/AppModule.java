package com.ahrorovkspace.afkorhackathon.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J\u0012\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\f"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/di/AppModule;", "", "()V", "provideAfkorHackApi", "Lcom/ahrorovkspace/afkorhackathon/data/network/remote/AfkorHackApi;", "provideAfkorHackRepository", "Lcom/ahrorovkspace/afkorhackathon/domain/AfkorHackRepository;", "api", "provideSessionManager", "Lcom/ahrorovkspace/afkorhackathon/data/local/DataStoreManager;", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.ahrorovkspace.afkorhackathon.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.ahrorovkspace.afkorhackathon.data.network.remote.AfkorHackApi provideAfkorHackApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.ahrorovkspace.afkorhackathon.domain.AfkorHackRepository provideAfkorHackRepository(@org.jetbrains.annotations.NotNull
    com.ahrorovkspace.afkorhackathon.data.network.remote.AfkorHackApi api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.ahrorovkspace.afkorhackathon.data.local.DataStoreManager provideSessionManager(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
}