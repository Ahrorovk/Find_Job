package com.ahrorovkspace.afkorhackathon.presentation.authorizationScreen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/authorizationScreen/AuthorizationEvent;", "", "()V", "Authorization", "GoToMainScreen", "GoToSignUp", "OnAuthorizationStateChange", "OnLoginChange", "OnPasswordChange", "Lcom/ahrorovkspace/afkorhackathon/presentation/authorizationScreen/AuthorizationEvent$Authorization;", "Lcom/ahrorovkspace/afkorhackathon/presentation/authorizationScreen/AuthorizationEvent$GoToMainScreen;", "Lcom/ahrorovkspace/afkorhackathon/presentation/authorizationScreen/AuthorizationEvent$GoToSignUp;", "Lcom/ahrorovkspace/afkorhackathon/presentation/authorizationScreen/AuthorizationEvent$OnAuthorizationStateChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/authorizationScreen/AuthorizationEvent$OnLoginChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/authorizationScreen/AuthorizationEvent$OnPasswordChange;", "app_debug"})
public abstract class AuthorizationEvent {
    
    private AuthorizationEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/authorizationScreen/AuthorizationEvent$OnLoginChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/authorizationScreen/AuthorizationEvent;", "login", "", "(Ljava/lang/String;)V", "getLogin", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class OnLoginChange extends com.ahrorovkspace.afkorhackathon.presentation.authorizationScreen.AuthorizationEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String login = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.presentation.authorizationScreen.AuthorizationEvent.OnLoginChange copy(@org.jetbrains.annotations.NotNull
        java.lang.String login) {
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
        
        public OnLoginChange(@org.jetbrains.annotations.NotNull
        java.lang.String login) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getLogin() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/authorizationScreen/AuthorizationEvent$OnPasswordChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/authorizationScreen/AuthorizationEvent;", "password", "", "(Ljava/lang/String;)V", "getPassword", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class OnPasswordChange extends com.ahrorovkspace.afkorhackathon.presentation.authorizationScreen.AuthorizationEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String password = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.presentation.authorizationScreen.AuthorizationEvent.OnPasswordChange copy(@org.jetbrains.annotations.NotNull
        java.lang.String password) {
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
        
        public OnPasswordChange(@org.jetbrains.annotations.NotNull
        java.lang.String password) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getPassword() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/authorizationScreen/AuthorizationEvent$OnAuthorizationStateChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/authorizationScreen/AuthorizationEvent;", "state", "Lcom/ahrorovkspace/afkorhackathon/core/states/AuthorizationRespState;", "(Lcom/ahrorovkspace/afkorhackathon/core/states/AuthorizationRespState;)V", "getState", "()Lcom/ahrorovkspace/afkorhackathon/core/states/AuthorizationRespState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class OnAuthorizationStateChange extends com.ahrorovkspace.afkorhackathon.presentation.authorizationScreen.AuthorizationEvent {
        @org.jetbrains.annotations.NotNull
        private final com.ahrorovkspace.afkorhackathon.core.states.AuthorizationRespState state = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.presentation.authorizationScreen.AuthorizationEvent.OnAuthorizationStateChange copy(@org.jetbrains.annotations.NotNull
        com.ahrorovkspace.afkorhackathon.core.states.AuthorizationRespState state) {
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
        
        public OnAuthorizationStateChange(@org.jetbrains.annotations.NotNull
        com.ahrorovkspace.afkorhackathon.core.states.AuthorizationRespState state) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.core.states.AuthorizationRespState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.core.states.AuthorizationRespState getState() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/authorizationScreen/AuthorizationEvent$Authorization;", "Lcom/ahrorovkspace/afkorhackathon/presentation/authorizationScreen/AuthorizationEvent;", "()V", "app_debug"})
    public static final class Authorization extends com.ahrorovkspace.afkorhackathon.presentation.authorizationScreen.AuthorizationEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.ahrorovkspace.afkorhackathon.presentation.authorizationScreen.AuthorizationEvent.Authorization INSTANCE = null;
        
        private Authorization() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/authorizationScreen/AuthorizationEvent$GoToMainScreen;", "Lcom/ahrorovkspace/afkorhackathon/presentation/authorizationScreen/AuthorizationEvent;", "()V", "app_debug"})
    public static final class GoToMainScreen extends com.ahrorovkspace.afkorhackathon.presentation.authorizationScreen.AuthorizationEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.ahrorovkspace.afkorhackathon.presentation.authorizationScreen.AuthorizationEvent.GoToMainScreen INSTANCE = null;
        
        private GoToMainScreen() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/authorizationScreen/AuthorizationEvent$GoToSignUp;", "Lcom/ahrorovkspace/afkorhackathon/presentation/authorizationScreen/AuthorizationEvent;", "()V", "app_debug"})
    public static final class GoToSignUp extends com.ahrorovkspace.afkorhackathon.presentation.authorizationScreen.AuthorizationEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.ahrorovkspace.afkorhackathon.presentation.authorizationScreen.AuthorizationEvent.GoToSignUp INSTANCE = null;
        
        private GoToSignUp() {
            super();
        }
    }
}