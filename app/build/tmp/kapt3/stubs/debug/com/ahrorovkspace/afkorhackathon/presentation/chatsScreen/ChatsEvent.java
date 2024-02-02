package com.ahrorovkspace.afkorhackathon.presentation.chatsScreen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\nB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/chatsScreen/ChatsEvent;", "", "()V", "Clean", "GoToAuthorization", "GoToMyApplication", "GoToProfile", "GoToRegistration", "GoToSettings", "Logout", "OnChatsUserNameToNavChange", "Lcom/ahrorovkspace/afkorhackathon/presentation/chatsScreen/ChatsEvent$Clean;", "Lcom/ahrorovkspace/afkorhackathon/presentation/chatsScreen/ChatsEvent$GoToAuthorization;", "Lcom/ahrorovkspace/afkorhackathon/presentation/chatsScreen/ChatsEvent$GoToMyApplication;", "Lcom/ahrorovkspace/afkorhackathon/presentation/chatsScreen/ChatsEvent$GoToProfile;", "Lcom/ahrorovkspace/afkorhackathon/presentation/chatsScreen/ChatsEvent$GoToRegistration;", "Lcom/ahrorovkspace/afkorhackathon/presentation/chatsScreen/ChatsEvent$GoToSettings;", "Lcom/ahrorovkspace/afkorhackathon/presentation/chatsScreen/ChatsEvent$Logout;", "Lcom/ahrorovkspace/afkorhackathon/presentation/chatsScreen/ChatsEvent$OnChatsUserNameToNavChange;", "app_debug"})
public abstract class ChatsEvent {
    
    private ChatsEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/chatsScreen/ChatsEvent$OnChatsUserNameToNavChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/chatsScreen/ChatsEvent;", "user", "", "(Ljava/lang/String;)V", "getUser", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class OnChatsUserNameToNavChange extends com.ahrorovkspace.afkorhackathon.presentation.chatsScreen.ChatsEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String user = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.presentation.chatsScreen.ChatsEvent.OnChatsUserNameToNavChange copy(@org.jetbrains.annotations.NotNull
        java.lang.String user) {
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
        
        public OnChatsUserNameToNavChange(@org.jetbrains.annotations.NotNull
        java.lang.String user) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getUser() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/chatsScreen/ChatsEvent$GoToProfile;", "Lcom/ahrorovkspace/afkorhackathon/presentation/chatsScreen/ChatsEvent;", "()V", "app_debug"})
    public static final class GoToProfile extends com.ahrorovkspace.afkorhackathon.presentation.chatsScreen.ChatsEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.ahrorovkspace.afkorhackathon.presentation.chatsScreen.ChatsEvent.GoToProfile INSTANCE = null;
        
        private GoToProfile() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/chatsScreen/ChatsEvent$GoToMyApplication;", "Lcom/ahrorovkspace/afkorhackathon/presentation/chatsScreen/ChatsEvent;", "()V", "app_debug"})
    public static final class GoToMyApplication extends com.ahrorovkspace.afkorhackathon.presentation.chatsScreen.ChatsEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.ahrorovkspace.afkorhackathon.presentation.chatsScreen.ChatsEvent.GoToMyApplication INSTANCE = null;
        
        private GoToMyApplication() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/chatsScreen/ChatsEvent$GoToAuthorization;", "Lcom/ahrorovkspace/afkorhackathon/presentation/chatsScreen/ChatsEvent;", "()V", "app_debug"})
    public static final class GoToAuthorization extends com.ahrorovkspace.afkorhackathon.presentation.chatsScreen.ChatsEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.ahrorovkspace.afkorhackathon.presentation.chatsScreen.ChatsEvent.GoToAuthorization INSTANCE = null;
        
        private GoToAuthorization() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/chatsScreen/ChatsEvent$GoToRegistration;", "Lcom/ahrorovkspace/afkorhackathon/presentation/chatsScreen/ChatsEvent;", "()V", "app_debug"})
    public static final class GoToRegistration extends com.ahrorovkspace.afkorhackathon.presentation.chatsScreen.ChatsEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.ahrorovkspace.afkorhackathon.presentation.chatsScreen.ChatsEvent.GoToRegistration INSTANCE = null;
        
        private GoToRegistration() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/chatsScreen/ChatsEvent$GoToSettings;", "Lcom/ahrorovkspace/afkorhackathon/presentation/chatsScreen/ChatsEvent;", "()V", "app_debug"})
    public static final class GoToSettings extends com.ahrorovkspace.afkorhackathon.presentation.chatsScreen.ChatsEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.ahrorovkspace.afkorhackathon.presentation.chatsScreen.ChatsEvent.GoToSettings INSTANCE = null;
        
        private GoToSettings() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/chatsScreen/ChatsEvent$Logout;", "Lcom/ahrorovkspace/afkorhackathon/presentation/chatsScreen/ChatsEvent;", "()V", "app_debug"})
    public static final class Logout extends com.ahrorovkspace.afkorhackathon.presentation.chatsScreen.ChatsEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.ahrorovkspace.afkorhackathon.presentation.chatsScreen.ChatsEvent.Logout INSTANCE = null;
        
        private Logout() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/chatsScreen/ChatsEvent$Clean;", "Lcom/ahrorovkspace/afkorhackathon/presentation/chatsScreen/ChatsEvent;", "()V", "app_debug"})
    public static final class Clean extends com.ahrorovkspace.afkorhackathon.presentation.chatsScreen.ChatsEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.ahrorovkspace.afkorhackathon.presentation.chatsScreen.ChatsEvent.Clean INSTANCE = null;
        
        private Clean() {
            super();
        }
    }
}