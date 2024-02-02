package com.ahrorovkspace.afkorhackathon.data.network.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0083\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u00142\b\b\u0001\u0010\u0017\u001a\u00020\u00142\b\b\u0001\u0010\u0018\u001a\u00020\u00142\b\b\u0001\u0010\u0019\u001a\u00020\u00142\b\b\u0001\u0010\u001a\u001a\u00020\u00142\b\b\u0001\u0010\u001b\u001a\u00020\u0014H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u001b\u0010 \u001a\u00020!2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u001b\u0010\"\u001a\u00020#2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ%\u0010$\u001a\u00020%2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010&\u001a\u00020\'H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u001b\u0010)\u001a\u00020*2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u001b\u0010+\u001a\u00020,2\b\b\u0001\u0010-\u001a\u00020.H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\u001b\u00100\u001a\u0002012\b\b\u0001\u00102\u001a\u000203H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00104J%\u00105\u001a\u0002062\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u00107\u001a\u000208H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00109\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006:"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/data/network/remote/AfkorHackApi;", "", "approveApplications", "Lcom/ahrorovkspace/afkorhackathon/domain/myApplication/model/ApproveApplicationResp;", "token", "", "approveApp", "Lcom/ahrorovkspace/afkorhackathon/domain/myApplication/model/ApproveApplicationBody;", "(Ljava/lang/String;Lcom/ahrorovkspace/afkorhackathon/domain/myApplication/model/ApproveApplicationBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "authorization", "Lcom/ahrorovkspace/afkorhackathon/domain/authorization/model/AuthorizationResp;", "authBody", "Lcom/ahrorovkspace/afkorhackathon/domain/authorization/model/AuthorizationBody;", "(Lcom/ahrorovkspace/afkorhackathon/domain/authorization/model/AuthorizationBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changeProfileInfo", "Lcom/ahrorovkspace/afkorhackathon/domain/profileInfo/model/ChangeProfileInfoResp;", "avatar", "Lokhttp3/MultipartBody$Part;", "resume", "fullname", "Lokhttp3/RequestBody;", "about", "worktimeStart", "worktimeEnd", "isVerified", "location", "speciality", "company", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCompanyById", "Lcom/ahrorovkspace/afkorhackathon/domain/companyById/model/GetCompaniesResp;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyApplication", "Lcom/ahrorovkspace/afkorhackathon/domain/myApplication/model/GetMyApplicationResp;", "getProfileInfo", "Lcom/ahrorovkspace/afkorhackathon/domain/profileInfo/model/GetProfileInfoResp;", "getProjectByCategories", "Lcom/ahrorovkspace/afkorhackathon/domain/main/model/project/GetProjectByCategoriesResp;", "projectBody", "Lcom/ahrorovkspace/afkorhackathon/domain/main/model/project/GetProjectByCategoriesBody;", "(Ljava/lang/String;Lcom/ahrorovkspace/afkorhackathon/domain/main/model/project/GetProjectByCategoriesBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVacancies", "Lcom/ahrorovkspace/afkorhackathon/domain/main/model/categories/GetVacancyResp;", "refreshToken", "Lcom/ahrorovkspace/afkorhackathon/domain/refreshToken/model/RefreshTokenResp;", "refreshTokenBody", "Lcom/ahrorovkspace/afkorhackathon/domain/refreshToken/model/RefreshTokenBody;", "(Lcom/ahrorovkspace/afkorhackathon/domain/refreshToken/model/RefreshTokenBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registration", "Lcom/ahrorovkspace/afkorhackathon/domain/registration/model/RegistrationResp;", "regBody", "Lcom/ahrorovkspace/afkorhackathon/domain/registration/model/RegistrationBody;", "(Lcom/ahrorovkspace/afkorhackathon/domain/registration/model/RegistrationBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendApplication", "Lcom/ahrorovkspace/afkorhackathon/domain/application/model/PostApplicationResp;", "postApp", "Lcom/ahrorovkspace/afkorhackathon/domain/application/model/PostApplicationBody;", "(Ljava/lang/String;Lcom/ahrorovkspace/afkorhackathon/domain/application/model/PostApplicationBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface AfkorHackApi {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "account/login/")
    public abstract java.lang.Object authorization(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.ahrorovkspace.afkorhackathon.domain.authorization.model.AuthorizationBody authBody, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ahrorovkspace.afkorhackathon.domain.authorization.model.AuthorizationResp> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "account/register/")
    public abstract java.lang.Object registration(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.ahrorovkspace.afkorhackathon.domain.registration.model.RegistrationBody regBody, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ahrorovkspace.afkorhackathon.domain.registration.model.RegistrationResp> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "vacancies/send-application")
    public abstract java.lang.Object sendApplication(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.ahrorovkspace.afkorhackathon.domain.application.model.PostApplicationBody postApp, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ahrorovkspace.afkorhackathon.domain.application.model.PostApplicationResp> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "account/token/refresh/")
    public abstract java.lang.Object refreshToken(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.ahrorovkspace.afkorhackathon.domain.refreshToken.model.RefreshTokenBody refreshTokenBody, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ahrorovkspace.afkorhackathon.domain.refreshToken.model.RefreshTokenResp> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "vacancies/applications")
    public abstract java.lang.Object approveApplications(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.ahrorovkspace.afkorhackathon.domain.myApplication.model.ApproveApplicationBody approveApp, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ahrorovkspace.afkorhackathon.domain.myApplication.model.ApproveApplicationResp> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.PUT(value = "account/clients/profile/")
    @retrofit2.http.Multipart
    public abstract java.lang.Object changeProfileInfo(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Part
    okhttp3.MultipartBody.Part avatar, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Part
    okhttp3.MultipartBody.Part resume, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Part(value = "fullname")
    okhttp3.RequestBody fullname, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Part(value = "about")
    okhttp3.RequestBody about, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Part(value = "worktime_start")
    okhttp3.RequestBody worktimeStart, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Part(value = "worktime_end")
    okhttp3.RequestBody worktimeEnd, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Part(value = "is_verified")
    okhttp3.RequestBody isVerified, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Part(value = "location")
    okhttp3.RequestBody location, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Part(value = "speciality")
    okhttp3.RequestBody speciality, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Part(value = "company")
    okhttp3.RequestBody company, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ahrorovkspace.afkorhackathon.domain.profileInfo.model.ChangeProfileInfoResp> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "account/clients/profile/")
    public abstract java.lang.Object getProfileInfo(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ahrorovkspace.afkorhackathon.domain.profileInfo.model.GetProfileInfoResp> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "handbook/companies/")
    public abstract java.lang.Object getCompanyById(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ahrorovkspace.afkorhackathon.domain.companyById.model.GetCompaniesResp> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "vacancies/applications")
    public abstract java.lang.Object getMyApplication(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ahrorovkspace.afkorhackathon.domain.myApplication.model.GetMyApplicationResp> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "vacancies/")
    public abstract java.lang.Object getVacancies(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ahrorovkspace.afkorhackathon.domain.main.model.categories.GetVacancyResp> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "handbook/categories/projects/")
    public abstract java.lang.Object getProjectByCategories(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.ahrorovkspace.afkorhackathon.domain.main.model.project.GetProjectByCategoriesBody projectBody, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.ahrorovkspace.afkorhackathon.domain.main.model.project.GetProjectByCategoriesResp> continuation);
}