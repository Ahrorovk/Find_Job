package com.ahrorovkspace.afkorhackathon.presentation.profileScreen;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u001cH\u0002R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001d"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "getProfileInfoUseCase", "Lcom/ahrorovkspace/afkorhackathon/domain/profileInfo/useCase/GetProfileInfoUseCase;", "dataStoreManager", "Lcom/ahrorovkspace/afkorhackathon/data/local/DataStoreManager;", "refreshTokenUseCase", "Lcom/ahrorovkspace/afkorhackathon/domain/refreshToken/useCase/RefreshTokenUseCase;", "changeProfileInfoUseCase", "Lcom/ahrorovkspace/afkorhackathon/domain/profileInfo/useCase/ChangeProfileInfoUseCase;", "(Lcom/ahrorovkspace/afkorhackathon/domain/profileInfo/useCase/GetProfileInfoUseCase;Lcom/ahrorovkspace/afkorhackathon/data/local/DataStoreManager;Lcom/ahrorovkspace/afkorhackathon/domain/refreshToken/useCase/RefreshTokenUseCase;Lcom/ahrorovkspace/afkorhackathon/domain/profileInfo/useCase/ChangeProfileInfoUseCase;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "changeProfileInfo", "", "context", "Landroid/content/Context;", "getProfileInfo", "onEvent", "event", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent;", "refreshToken", "refreshFun", "Lkotlin/Function0;", "app_debug"})
public final class ProfileViewModel extends androidx.lifecycle.ViewModel {
    private final com.ahrorovkspace.afkorhackathon.domain.profileInfo.useCase.GetProfileInfoUseCase getProfileInfoUseCase = null;
    private final com.ahrorovkspace.afkorhackathon.data.local.DataStoreManager dataStoreManager = null;
    private final com.ahrorovkspace.afkorhackathon.domain.refreshToken.useCase.RefreshTokenUseCase refreshTokenUseCase = null;
    private final com.ahrorovkspace.afkorhackathon.domain.profileInfo.useCase.ChangeProfileInfoUseCase changeProfileInfoUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileState> _state = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileState> state = null;
    
    @javax.inject.Inject
    public ProfileViewModel(@org.jetbrains.annotations.NotNull
    com.ahrorovkspace.afkorhackathon.domain.profileInfo.useCase.GetProfileInfoUseCase getProfileInfoUseCase, @org.jetbrains.annotations.NotNull
    com.ahrorovkspace.afkorhackathon.data.local.DataStoreManager dataStoreManager, @org.jetbrains.annotations.NotNull
    com.ahrorovkspace.afkorhackathon.domain.refreshToken.useCase.RefreshTokenUseCase refreshTokenUseCase, @org.jetbrains.annotations.NotNull
    com.ahrorovkspace.afkorhackathon.domain.profileInfo.useCase.ChangeProfileInfoUseCase changeProfileInfoUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileState> getState() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent event) {
    }
    
    private final void getProfileInfo() {
    }
    
    private final void changeProfileInfo(android.content.Context context) {
    }
    
    private final void refreshToken(kotlin.jvm.functions.Function0<kotlin.Unit> refreshFun) {
    }
}