package com.ahrorovkspace.afkorhackathon.domain.profileInfo.useCase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004Jq\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/domain/profileInfo/useCase/ChangeProfileInfoUseCase;", "", "repository", "Lcom/ahrorovkspace/afkorhackathon/domain/AfkorHackRepository;", "(Lcom/ahrorovkspace/afkorhackathon/domain/AfkorHackRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ahrorovkspace/afkorhackathon/core/Resource;", "Lcom/ahrorovkspace/afkorhackathon/domain/profileInfo/model/ChangeProfileInfoResp;", "token", "", "avatar", "Lokhttp3/MultipartBody$Part;", "resume", "fullname", "Lokhttp3/RequestBody;", "about", "worktimeStart", "worktimeEnd", "isVerified", "location", "speciality", "company", "app_debug"})
public final class ChangeProfileInfoUseCase {
    private final com.ahrorovkspace.afkorhackathon.domain.AfkorHackRepository repository = null;
    
    @javax.inject.Inject
    public ChangeProfileInfoUseCase(@org.jetbrains.annotations.NotNull
    com.ahrorovkspace.afkorhackathon.domain.AfkorHackRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.ahrorovkspace.afkorhackathon.core.Resource<com.ahrorovkspace.afkorhackathon.domain.profileInfo.model.ChangeProfileInfoResp>> invoke(@org.jetbrains.annotations.NotNull
    java.lang.String token, @org.jetbrains.annotations.Nullable
    okhttp3.MultipartBody.Part avatar, @org.jetbrains.annotations.Nullable
    okhttp3.MultipartBody.Part resume, @org.jetbrains.annotations.NotNull
    okhttp3.RequestBody fullname, @org.jetbrains.annotations.NotNull
    okhttp3.RequestBody about, @org.jetbrains.annotations.NotNull
    okhttp3.RequestBody worktimeStart, @org.jetbrains.annotations.NotNull
    okhttp3.RequestBody worktimeEnd, @org.jetbrains.annotations.NotNull
    okhttp3.RequestBody isVerified, @org.jetbrains.annotations.NotNull
    okhttp3.RequestBody location, @org.jetbrains.annotations.NotNull
    okhttp3.RequestBody speciality, @org.jetbrains.annotations.NotNull
    okhttp3.RequestBody company) {
        return null;
    }
}