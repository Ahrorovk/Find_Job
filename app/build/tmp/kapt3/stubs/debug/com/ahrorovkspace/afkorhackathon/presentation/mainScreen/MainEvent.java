package com.ahrorovkspace.afkorhackathon.presentation.mainScreen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\f\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u00a8\u0006\u001b"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent;", "", "()V", "Clean", "GetCompanies", "GetVacancies", "GoToApplication", "GoToAuthorization", "GoToMyApplication", "GoToRegistration", "GoToSettings", "Logout", "OnGetCompaniesRespStateChange", "OnGetVacanciesRespStateChange", "OnSearchProjectChange", "Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent$Clean;", "Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent$GetCompanies;", "Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent$GetVacancies;", "Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent$GoToApplication;", "Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent$GoToAuthorization;", "Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent$GoToMyApplication;", "Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent$GoToRegistration;", "Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent$GoToSettings;", "Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent$Logout;", "Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent$OnGetCompaniesRespStateChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent$OnGetVacanciesRespStateChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent$OnSearchProjectChange;", "app_debug"})
public abstract class MainEvent {
    
    private MainEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent$OnGetVacanciesRespStateChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent;", "state", "Lcom/ahrorovkspace/afkorhackathon/core/states/GetVacancyRespState;", "(Lcom/ahrorovkspace/afkorhackathon/core/states/GetVacancyRespState;)V", "getState", "()Lcom/ahrorovkspace/afkorhackathon/core/states/GetVacancyRespState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class OnGetVacanciesRespStateChange extends com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainEvent {
        @org.jetbrains.annotations.NotNull
        private final com.ahrorovkspace.afkorhackathon.core.states.GetVacancyRespState state = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainEvent.OnGetVacanciesRespStateChange copy(@org.jetbrains.annotations.NotNull
        com.ahrorovkspace.afkorhackathon.core.states.GetVacancyRespState state) {
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
        
        public OnGetVacanciesRespStateChange(@org.jetbrains.annotations.NotNull
        com.ahrorovkspace.afkorhackathon.core.states.GetVacancyRespState state) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.core.states.GetVacancyRespState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.core.states.GetVacancyRespState getState() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent$OnGetCompaniesRespStateChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent;", "state", "Lcom/ahrorovkspace/afkorhackathon/core/states/GetCompaniesRespState;", "(Lcom/ahrorovkspace/afkorhackathon/core/states/GetCompaniesRespState;)V", "getState", "()Lcom/ahrorovkspace/afkorhackathon/core/states/GetCompaniesRespState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class OnGetCompaniesRespStateChange extends com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainEvent {
        @org.jetbrains.annotations.NotNull
        private final com.ahrorovkspace.afkorhackathon.core.states.GetCompaniesRespState state = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainEvent.OnGetCompaniesRespStateChange copy(@org.jetbrains.annotations.NotNull
        com.ahrorovkspace.afkorhackathon.core.states.GetCompaniesRespState state) {
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
        
        public OnGetCompaniesRespStateChange(@org.jetbrains.annotations.NotNull
        com.ahrorovkspace.afkorhackathon.core.states.GetCompaniesRespState state) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.core.states.GetCompaniesRespState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.core.states.GetCompaniesRespState getState() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent$OnSearchProjectChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent;", "state", "", "(Ljava/lang/String;)V", "getState", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class OnSearchProjectChange extends com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String state = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainEvent.OnSearchProjectChange copy(@org.jetbrains.annotations.NotNull
        java.lang.String state) {
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
        
        public OnSearchProjectChange(@org.jetbrains.annotations.NotNull
        java.lang.String state) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getState() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent$GoToApplication;", "Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent;", "id", "", "(I)V", "getId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class GoToApplication extends com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainEvent {
        private final int id = 0;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainEvent.GoToApplication copy(int id) {
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
        
        public GoToApplication(int id) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getId() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent$GetCompanies;", "Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent;", "()V", "app_debug"})
    public static final class GetCompanies extends com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainEvent.GetCompanies INSTANCE = null;
        
        private GetCompanies() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent$GoToMyApplication;", "Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent;", "()V", "app_debug"})
    public static final class GoToMyApplication extends com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainEvent.GoToMyApplication INSTANCE = null;
        
        private GoToMyApplication() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent$GoToAuthorization;", "Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent;", "()V", "app_debug"})
    public static final class GoToAuthorization extends com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainEvent.GoToAuthorization INSTANCE = null;
        
        private GoToAuthorization() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent$GetVacancies;", "Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent;", "()V", "app_debug"})
    public static final class GetVacancies extends com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainEvent.GetVacancies INSTANCE = null;
        
        private GetVacancies() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent$GoToRegistration;", "Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent;", "()V", "app_debug"})
    public static final class GoToRegistration extends com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainEvent.GoToRegistration INSTANCE = null;
        
        private GoToRegistration() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent$GoToSettings;", "Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent;", "()V", "app_debug"})
    public static final class GoToSettings extends com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainEvent.GoToSettings INSTANCE = null;
        
        private GoToSettings() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent$Logout;", "Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent;", "()V", "app_debug"})
    public static final class Logout extends com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainEvent.Logout INSTANCE = null;
        
        private Logout() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent$Clean;", "Lcom/ahrorovkspace/afkorhackathon/presentation/mainScreen/MainEvent;", "()V", "app_debug"})
    public static final class Clean extends com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.ahrorovkspace.afkorhackathon.presentation.mainScreen.MainEvent.Clean INSTANCE = null;
        
        private Clean() {
            super();
        }
    }
}