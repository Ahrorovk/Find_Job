package com.ahrorovkspace.afkorhackathon.app.navigation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/app/navigation/NavigationViewModel;", "Landroidx/lifecycle/ViewModel;", "dataStoreManager", "Lcom/ahrorovkspace/afkorhackathon/data/local/DataStoreManager;", "(Lcom/ahrorovkspace/afkorhackathon/data/local/DataStoreManager;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ahrorovkspace/afkorhackathon/app/navigation/NavigationState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "onEvent", "", "event", "Lcom/ahrorovkspace/afkorhackathon/app/navigation/NavigationEvent;", "app_debug"})
public final class NavigationViewModel extends androidx.lifecycle.ViewModel {
    private final com.ahrorovkspace.afkorhackathon.data.local.DataStoreManager dataStoreManager = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.ahrorovkspace.afkorhackathon.app.navigation.NavigationState> _state = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.ahrorovkspace.afkorhackathon.app.navigation.NavigationState> state = null;
    
    @javax.inject.Inject
    public NavigationViewModel(@org.jetbrains.annotations.NotNull
    com.ahrorovkspace.afkorhackathon.data.local.DataStoreManager dataStoreManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.ahrorovkspace.afkorhackathon.app.navigation.NavigationState> getState() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.ahrorovkspace.afkorhackathon.app.navigation.NavigationEvent event) {
    }
}