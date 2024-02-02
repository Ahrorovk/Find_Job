package com.ahrorovkspace.afkorhackathon.presentation.authorizationScreen;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0016"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/authorizationScreen/AuthorizationViewModel;", "Landroidx/lifecycle/ViewModel;", "authorizationUseCase", "Lcom/ahrorovkspace/afkorhackathon/domain/authorization/useCase/AuthorizationUseCase;", "dataStoreManager", "Lcom/ahrorovkspace/afkorhackathon/data/local/DataStoreManager;", "(Lcom/ahrorovkspace/afkorhackathon/domain/authorization/useCase/AuthorizationUseCase;Lcom/ahrorovkspace/afkorhackathon/data/local/DataStoreManager;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ahrorovkspace/afkorhackathon/presentation/authorizationScreen/AuthorizationState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "authorization", "", "username", "", "password", "onEvent", "event", "Lcom/ahrorovkspace/afkorhackathon/presentation/authorizationScreen/AuthorizationEvent;", "app_debug"})
public final class AuthorizationViewModel extends androidx.lifecycle.ViewModel {
    private final com.ahrorovkspace.afkorhackathon.domain.authorization.useCase.AuthorizationUseCase authorizationUseCase = null;
    private final com.ahrorovkspace.afkorhackathon.data.local.DataStoreManager dataStoreManager = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.ahrorovkspace.afkorhackathon.presentation.authorizationScreen.AuthorizationState> _state = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.ahrorovkspace.afkorhackathon.presentation.authorizationScreen.AuthorizationState> state = null;
    
    @javax.inject.Inject
    public AuthorizationViewModel(@org.jetbrains.annotations.NotNull
    com.ahrorovkspace.afkorhackathon.domain.authorization.useCase.AuthorizationUseCase authorizationUseCase, @org.jetbrains.annotations.NotNull
    com.ahrorovkspace.afkorhackathon.data.local.DataStoreManager dataStoreManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.ahrorovkspace.afkorhackathon.presentation.authorizationScreen.AuthorizationState> getState() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.ahrorovkspace.afkorhackathon.presentation.authorizationScreen.AuthorizationEvent event) {
    }
    
    public final void authorization(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
    }
}