package com.ahrorovkspace.afkorhackathon.presentation.applicationScreen;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u0018H\u0002J\u0016\u0010\u001c\u001a\u00020\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u001eH\u0002R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001f"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/applicationScreen/BottomSheetApplicationViewModel;", "Landroidx/lifecycle/ViewModel;", "dataStoreManager", "Lcom/ahrorovkspace/afkorhackathon/data/local/DataStoreManager;", "sendApplicationUseCase", "Lcom/ahrorovkspace/afkorhackathon/domain/application/useCase/SendApplicationUseCase;", "refreshTokenUseCase", "Lcom/ahrorovkspace/afkorhackathon/domain/refreshToken/useCase/RefreshTokenUseCase;", "(Lcom/ahrorovkspace/afkorhackathon/data/local/DataStoreManager;Lcom/ahrorovkspace/afkorhackathon/domain/application/useCase/SendApplicationUseCase;Lcom/ahrorovkspace/afkorhackathon/domain/refreshToken/useCase/RefreshTokenUseCase;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ahrorovkspace/afkorhackathon/presentation/applicationScreen/BottomSheetApplicationState;", "channel", "Lkotlinx/coroutines/channels/Channel;", "Lcom/ahrorovkspace/afkorhackathon/core/BottomSheetApplyOneTimeEvent;", "flow", "Lkotlinx/coroutines/flow/Flow;", "getFlow", "()Lkotlinx/coroutines/flow/Flow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "onEvent", "", "event", "Lcom/ahrorovkspace/afkorhackathon/presentation/applicationScreen/BottomSheetApplicationEvent;", "postApplication", "refreshToken", "refreshFun", "Lkotlin/Function0;", "app_debug"})
public final class BottomSheetApplicationViewModel extends androidx.lifecycle.ViewModel {
    private final com.ahrorovkspace.afkorhackathon.data.local.DataStoreManager dataStoreManager = null;
    private final com.ahrorovkspace.afkorhackathon.domain.application.useCase.SendApplicationUseCase sendApplicationUseCase = null;
    private final com.ahrorovkspace.afkorhackathon.domain.refreshToken.useCase.RefreshTokenUseCase refreshTokenUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.ahrorovkspace.afkorhackathon.presentation.applicationScreen.BottomSheetApplicationState> _state = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.ahrorovkspace.afkorhackathon.presentation.applicationScreen.BottomSheetApplicationState> state = null;
    private final kotlinx.coroutines.channels.Channel<com.ahrorovkspace.afkorhackathon.core.BottomSheetApplyOneTimeEvent> channel = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<com.ahrorovkspace.afkorhackathon.core.BottomSheetApplyOneTimeEvent> flow = null;
    
    @javax.inject.Inject
    public BottomSheetApplicationViewModel(@org.jetbrains.annotations.NotNull
    com.ahrorovkspace.afkorhackathon.data.local.DataStoreManager dataStoreManager, @org.jetbrains.annotations.NotNull
    com.ahrorovkspace.afkorhackathon.domain.application.useCase.SendApplicationUseCase sendApplicationUseCase, @org.jetbrains.annotations.NotNull
    com.ahrorovkspace.afkorhackathon.domain.refreshToken.useCase.RefreshTokenUseCase refreshTokenUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.ahrorovkspace.afkorhackathon.presentation.applicationScreen.BottomSheetApplicationState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.ahrorovkspace.afkorhackathon.core.BottomSheetApplyOneTimeEvent> getFlow() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.ahrorovkspace.afkorhackathon.presentation.applicationScreen.BottomSheetApplicationEvent event) {
    }
    
    private final void postApplication() {
    }
    
    private final void refreshToken(kotlin.jvm.functions.Function0<kotlin.Unit> refreshFun) {
    }
}