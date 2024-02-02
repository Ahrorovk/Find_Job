package com.ahrorovkspace.afkorhackathon.core.states;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003J)\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001b"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/core/states/RegistrationRespState;", "", "isLoading", "", "response", "Lcom/ahrorovkspace/afkorhackathon/domain/registration/model/RegistrationResp;", "error", "", "(ZLcom/ahrorovkspace/afkorhackathon/domain/registration/model/RegistrationResp;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "()Z", "setLoading", "(Z)V", "getResponse", "()Lcom/ahrorovkspace/afkorhackathon/domain/registration/model/RegistrationResp;", "setResponse", "(Lcom/ahrorovkspace/afkorhackathon/domain/registration/model/RegistrationResp;)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class RegistrationRespState {
    private boolean isLoading;
    @org.jetbrains.annotations.Nullable
    private com.ahrorovkspace.afkorhackathon.domain.registration.model.RegistrationResp response;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String error = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.ahrorovkspace.afkorhackathon.core.states.RegistrationRespState copy(boolean isLoading, @org.jetbrains.annotations.Nullable
    com.ahrorovkspace.afkorhackathon.domain.registration.model.RegistrationResp response, @org.jetbrains.annotations.NotNull
    java.lang.String error) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public RegistrationRespState() {
        super();
    }
    
    public RegistrationRespState(boolean isLoading, @org.jetbrains.annotations.Nullable
    com.ahrorovkspace.afkorhackathon.domain.registration.model.RegistrationResp response, @org.jetbrains.annotations.NotNull
    java.lang.String error) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final void setLoading(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.ahrorovkspace.afkorhackathon.domain.registration.model.RegistrationResp component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.ahrorovkspace.afkorhackathon.domain.registration.model.RegistrationResp getResponse() {
        return null;
    }
    
    public final void setResponse(@org.jetbrains.annotations.Nullable
    com.ahrorovkspace.afkorhackathon.domain.registration.model.RegistrationResp p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getError() {
        return null;
    }
}