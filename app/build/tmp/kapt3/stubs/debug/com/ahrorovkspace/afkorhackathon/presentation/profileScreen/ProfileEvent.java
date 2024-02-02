package com.ahrorovkspace.afkorhackathon.presentation.profileScreen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000e\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u000e\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u00a8\u0006\u001f"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent;", "", "()V", "GetProfileInfo", "OnChangeProfileInfoRespState", "OnDescriptionChange", "OnEmailChange", "OnFirstNameChange", "OnGetProfileInfoRespState", "OnPhoneChange", "OnSelectImageUriChange", "OnSelectPdfUriChange", "OnSpecialityChange", "OnUsernameChange", "OnWorkTimeEndChange", "OnWorkTimeStartChange", "SaveChanges", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent$GetProfileInfo;", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent$OnChangeProfileInfoRespState;", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent$OnDescriptionChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent$OnEmailChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent$OnFirstNameChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent$OnGetProfileInfoRespState;", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent$OnPhoneChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent$OnSelectImageUriChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent$OnSelectPdfUriChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent$OnSpecialityChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent$OnUsernameChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent$OnWorkTimeEndChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent$OnWorkTimeStartChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent$SaveChanges;", "app_debug"})
public abstract class ProfileEvent {
    
    private ProfileEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent$OnUsernameChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent;", "state", "", "(Ljava/lang/String;)V", "getState", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class OnUsernameChange extends com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String state = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent.OnUsernameChange copy(@org.jetbrains.annotations.NotNull
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
        
        public OnUsernameChange(@org.jetbrains.annotations.NotNull
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent$OnFirstNameChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent;", "state", "", "(Ljava/lang/String;)V", "getState", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class OnFirstNameChange extends com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String state = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent.OnFirstNameChange copy(@org.jetbrains.annotations.NotNull
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
        
        public OnFirstNameChange(@org.jetbrains.annotations.NotNull
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent$OnSpecialityChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent;", "state", "", "(Ljava/lang/String;)V", "getState", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class OnSpecialityChange extends com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String state = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent.OnSpecialityChange copy(@org.jetbrains.annotations.NotNull
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
        
        public OnSpecialityChange(@org.jetbrains.annotations.NotNull
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent$OnEmailChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent;", "state", "", "(Ljava/lang/String;)V", "getState", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class OnEmailChange extends com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String state = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent.OnEmailChange copy(@org.jetbrains.annotations.NotNull
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
        
        public OnEmailChange(@org.jetbrains.annotations.NotNull
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent$OnWorkTimeStartChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent;", "state", "", "(Ljava/lang/String;)V", "getState", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class OnWorkTimeStartChange extends com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String state = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent.OnWorkTimeStartChange copy(@org.jetbrains.annotations.NotNull
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
        
        public OnWorkTimeStartChange(@org.jetbrains.annotations.NotNull
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent$OnWorkTimeEndChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent;", "state", "", "(Ljava/lang/String;)V", "getState", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class OnWorkTimeEndChange extends com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String state = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent.OnWorkTimeEndChange copy(@org.jetbrains.annotations.NotNull
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
        
        public OnWorkTimeEndChange(@org.jetbrains.annotations.NotNull
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent$OnPhoneChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent;", "state", "", "(Ljava/lang/String;)V", "getState", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class OnPhoneChange extends com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String state = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent.OnPhoneChange copy(@org.jetbrains.annotations.NotNull
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
        
        public OnPhoneChange(@org.jetbrains.annotations.NotNull
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent$OnDescriptionChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent;", "state", "", "(Ljava/lang/String;)V", "getState", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class OnDescriptionChange extends com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String state = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent.OnDescriptionChange copy(@org.jetbrains.annotations.NotNull
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
        
        public OnDescriptionChange(@org.jetbrains.annotations.NotNull
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent$OnGetProfileInfoRespState;", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent;", "state", "Lcom/ahrorovkspace/afkorhackathon/core/states/GetProfileInfoRespState;", "(Lcom/ahrorovkspace/afkorhackathon/core/states/GetProfileInfoRespState;)V", "getState", "()Lcom/ahrorovkspace/afkorhackathon/core/states/GetProfileInfoRespState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class OnGetProfileInfoRespState extends com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent {
        @org.jetbrains.annotations.NotNull
        private final com.ahrorovkspace.afkorhackathon.core.states.GetProfileInfoRespState state = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent.OnGetProfileInfoRespState copy(@org.jetbrains.annotations.NotNull
        com.ahrorovkspace.afkorhackathon.core.states.GetProfileInfoRespState state) {
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
        
        public OnGetProfileInfoRespState(@org.jetbrains.annotations.NotNull
        com.ahrorovkspace.afkorhackathon.core.states.GetProfileInfoRespState state) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.core.states.GetProfileInfoRespState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.core.states.GetProfileInfoRespState getState() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent$OnChangeProfileInfoRespState;", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent;", "state", "Lcom/ahrorovkspace/afkorhackathon/core/states/ChangeProfileInfoRespState;", "(Lcom/ahrorovkspace/afkorhackathon/core/states/ChangeProfileInfoRespState;)V", "getState", "()Lcom/ahrorovkspace/afkorhackathon/core/states/ChangeProfileInfoRespState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class OnChangeProfileInfoRespState extends com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent {
        @org.jetbrains.annotations.NotNull
        private final com.ahrorovkspace.afkorhackathon.core.states.ChangeProfileInfoRespState state = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent.OnChangeProfileInfoRespState copy(@org.jetbrains.annotations.NotNull
        com.ahrorovkspace.afkorhackathon.core.states.ChangeProfileInfoRespState state) {
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
        
        public OnChangeProfileInfoRespState(@org.jetbrains.annotations.NotNull
        com.ahrorovkspace.afkorhackathon.core.states.ChangeProfileInfoRespState state) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.core.states.ChangeProfileInfoRespState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.core.states.ChangeProfileInfoRespState getState() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent$OnSelectImageUriChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent;", "uri", "Landroid/net/Uri;", "(Landroid/net/Uri;)V", "getUri", "()Landroid/net/Uri;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class OnSelectImageUriChange extends com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent {
        @org.jetbrains.annotations.Nullable
        private final android.net.Uri uri = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent.OnSelectImageUriChange copy(@org.jetbrains.annotations.Nullable
        android.net.Uri uri) {
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
        
        public OnSelectImageUriChange(@org.jetbrains.annotations.Nullable
        android.net.Uri uri) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final android.net.Uri component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final android.net.Uri getUri() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent$OnSelectPdfUriChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent;", "uri", "Landroid/net/Uri;", "(Landroid/net/Uri;)V", "getUri", "()Landroid/net/Uri;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class OnSelectPdfUriChange extends com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent {
        @org.jetbrains.annotations.Nullable
        private final android.net.Uri uri = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent.OnSelectPdfUriChange copy(@org.jetbrains.annotations.Nullable
        android.net.Uri uri) {
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
        
        public OnSelectPdfUriChange(@org.jetbrains.annotations.Nullable
        android.net.Uri uri) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final android.net.Uri component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final android.net.Uri getUri() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent$SaveChanges;", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class SaveChanges extends com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent {
        @org.jetbrains.annotations.NotNull
        private final android.content.Context context = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent.SaveChanges copy(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
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
        
        public SaveChanges(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.content.Context component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.content.Context getContext() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent$GetProfileInfo;", "Lcom/ahrorovkspace/afkorhackathon/presentation/profileScreen/ProfileEvent;", "()V", "app_debug"})
    public static final class GetProfileInfo extends com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.ahrorovkspace.afkorhackathon.presentation.profileScreen.ProfileEvent.GetProfileInfo INSTANCE = null;
        
        private GetProfileInfo() {
            super();
        }
    }
}