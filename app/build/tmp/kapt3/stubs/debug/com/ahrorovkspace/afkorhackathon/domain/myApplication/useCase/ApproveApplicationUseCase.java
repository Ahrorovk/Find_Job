package com.ahrorovkspace.afkorhackathon.domain.myApplication.useCase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/domain/myApplication/useCase/ApproveApplicationUseCase;", "", "repository", "Lcom/ahrorovkspace/afkorhackathon/domain/AfkorHackRepository;", "(Lcom/ahrorovkspace/afkorhackathon/domain/AfkorHackRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ahrorovkspace/afkorhackathon/core/Resource;", "Lcom/ahrorovkspace/afkorhackathon/domain/myApplication/model/ApproveApplicationResp;", "token", "", "approveApp", "Lcom/ahrorovkspace/afkorhackathon/domain/myApplication/model/ApproveApplicationBody;", "app_debug"})
public final class ApproveApplicationUseCase {
    private final com.ahrorovkspace.afkorhackathon.domain.AfkorHackRepository repository = null;
    
    @javax.inject.Inject
    public ApproveApplicationUseCase(@org.jetbrains.annotations.NotNull
    com.ahrorovkspace.afkorhackathon.domain.AfkorHackRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.ahrorovkspace.afkorhackathon.core.Resource<com.ahrorovkspace.afkorhackathon.domain.myApplication.model.ApproveApplicationResp>> invoke(@org.jetbrains.annotations.NotNull
    java.lang.String token, @org.jetbrains.annotations.NotNull
    com.ahrorovkspace.afkorhackathon.domain.myApplication.model.ApproveApplicationBody approveApp) {
        return null;
    }
}