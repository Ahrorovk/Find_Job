package com.ahrorovkspace.afkorhackathon.presentation.mainScreen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003JK\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020#H\u00d6\u0001J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006%"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainState;", "", "searchState", "", "vacanciesRespState", "Lcom/ahrorovkspace/afkorhackathon/core/states/GetVacancyRespState;", "companiesRespState", "Lcom/ahrorovkspace/afkorhackathon/core/states/GetCompaniesRespState;", "companies", "", "Lcom/ahrorovkspace/afkorhackathon/domain/companyById/model/GetCompaniesResp;", "refreshToken", "accessToken", "(Ljava/lang/String;Lcom/ahrorovkspace/afkorhackathon/core/states/GetVacancyRespState;Lcom/ahrorovkspace/afkorhackathon/core/states/GetCompaniesRespState;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getCompanies", "()Ljava/util/List;", "getCompaniesRespState", "()Lcom/ahrorovkspace/afkorhackathon/core/states/GetCompaniesRespState;", "getRefreshToken", "getSearchState", "getVacanciesRespState", "()Lcom/ahrorovkspace/afkorhackathon/core/states/GetVacancyRespState;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class MainState {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String searchState = null;
    @org.jetbrains.annotations.NotNull
    private final com.ahrorovkspace.afkorhackathon.core.states.GetVacancyRespState vacanciesRespState = null;
    @org.jetbrains.annotations.NotNull
    private final com.ahrorovkspace.afkorhackathon.core.states.GetCompaniesRespState companiesRespState = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.ahrorovkspace.afkorhackathon.domain.companyById.model.GetCompaniesResp> companies = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String refreshToken = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String accessToken = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainState copy(@org.jetbrains.annotations.NotNull
    java.lang.String searchState, @org.jetbrains.annotations.NotNull
    com.ahrorovkspace.afkorhackathon.core.states.GetVacancyRespState vacanciesRespState, @org.jetbrains.annotations.NotNull
    com.ahrorovkspace.afkorhackathon.core.states.GetCompaniesRespState companiesRespState, @org.jetbrains.annotations.NotNull
    java.util.List<com.ahrorovkspace.afkorhackathon.domain.companyById.model.GetCompaniesResp> companies, @org.jetbrains.annotations.NotNull
    java.lang.String refreshToken, @org.jetbrains.annotations.NotNull
    java.lang.String accessToken) {
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
    
    public MainState() {
        super();
    }
    
    public MainState(@org.jetbrains.annotations.NotNull
    java.lang.String searchState, @org.jetbrains.annotations.NotNull
    com.ahrorovkspace.afkorhackathon.core.states.GetVacancyRespState vacanciesRespState, @org.jetbrains.annotations.NotNull
    com.ahrorovkspace.afkorhackathon.core.states.GetCompaniesRespState companiesRespState, @org.jetbrains.annotations.NotNull
    java.util.List<com.ahrorovkspace.afkorhackathon.domain.companyById.model.GetCompaniesResp> companies, @org.jetbrains.annotations.NotNull
    java.lang.String refreshToken, @org.jetbrains.annotations.NotNull
    java.lang.String accessToken) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSearchState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ahrorovkspace.afkorhackathon.core.states.GetVacancyRespState component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ahrorovkspace.afkorhackathon.core.states.GetVacancyRespState getVacanciesRespState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ahrorovkspace.afkorhackathon.core.states.GetCompaniesRespState component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ahrorovkspace.afkorhackathon.core.states.GetCompaniesRespState getCompaniesRespState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.ahrorovkspace.afkorhackathon.domain.companyById.model.GetCompaniesResp> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.ahrorovkspace.afkorhackathon.domain.companyById.model.GetCompaniesResp> getCompanies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRefreshToken() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAccessToken() {
        return null;
    }
}