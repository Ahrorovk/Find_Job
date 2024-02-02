package com.ahrorovkspace.afkorhackathon.presentation.applicationScreen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/applicationScreen/BottomSheetApplicationEvent;", "", "()V", "Apply", "GoToMain", "OnDescriptionChange", "OnPostBottomSheetApplicationRespState", "OnProjectIdChange", "OnStatusOfResumeChange", "Lcom/ahrorovkspace/afkorhackathon/presentation/applicationScreen/BottomSheetApplicationEvent$Apply;", "Lcom/ahrorovkspace/afkorhackathon/presentation/applicationScreen/BottomSheetApplicationEvent$GoToMain;", "Lcom/ahrorovkspace/afkorhackathon/presentation/applicationScreen/BottomSheetApplicationEvent$OnDescriptionChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/applicationScreen/BottomSheetApplicationEvent$OnPostBottomSheetApplicationRespState;", "Lcom/ahrorovkspace/afkorhackathon/presentation/applicationScreen/BottomSheetApplicationEvent$OnProjectIdChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/applicationScreen/BottomSheetApplicationEvent$OnStatusOfResumeChange;", "app_debug"})
public abstract class BottomSheetApplicationEvent {
    
    private BottomSheetApplicationEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/applicationScreen/BottomSheetApplicationEvent$OnDescriptionChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/applicationScreen/BottomSheetApplicationEvent;", "state", "", "(Ljava/lang/String;)V", "getState", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class OnDescriptionChange extends com.ahrorovkspace.afkorhackathon.presentation.applicationScreen.BottomSheetApplicationEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String state = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.presentation.applicationScreen.BottomSheetApplicationEvent.OnDescriptionChange copy(@org.jetbrains.annotations.NotNull
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/applicationScreen/BottomSheetApplicationEvent$OnProjectIdChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/applicationScreen/BottomSheetApplicationEvent;", "id", "", "(I)V", "getId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class OnProjectIdChange extends com.ahrorovkspace.afkorhackathon.presentation.applicationScreen.BottomSheetApplicationEvent {
        private final int id = 0;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.presentation.applicationScreen.BottomSheetApplicationEvent.OnProjectIdChange copy(int id) {
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
        
        public OnProjectIdChange(int id) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getId() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/applicationScreen/BottomSheetApplicationEvent$OnStatusOfResumeChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/applicationScreen/BottomSheetApplicationEvent;", "status", "", "(Z)V", "getStatus", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class OnStatusOfResumeChange extends com.ahrorovkspace.afkorhackathon.presentation.applicationScreen.BottomSheetApplicationEvent {
        private final boolean status = false;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.presentation.applicationScreen.BottomSheetApplicationEvent.OnStatusOfResumeChange copy(boolean status) {
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
        
        public OnStatusOfResumeChange(boolean status) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean getStatus() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/applicationScreen/BottomSheetApplicationEvent$OnPostBottomSheetApplicationRespState;", "Lcom/ahrorovkspace/afkorhackathon/presentation/applicationScreen/BottomSheetApplicationEvent;", "state", "Lcom/ahrorovkspace/afkorhackathon/core/states/PostApplicationRespState;", "(Lcom/ahrorovkspace/afkorhackathon/core/states/PostApplicationRespState;)V", "getState", "()Lcom/ahrorovkspace/afkorhackathon/core/states/PostApplicationRespState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class OnPostBottomSheetApplicationRespState extends com.ahrorovkspace.afkorhackathon.presentation.applicationScreen.BottomSheetApplicationEvent {
        @org.jetbrains.annotations.NotNull
        private final com.ahrorovkspace.afkorhackathon.core.states.PostApplicationRespState state = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.presentation.applicationScreen.BottomSheetApplicationEvent.OnPostBottomSheetApplicationRespState copy(@org.jetbrains.annotations.NotNull
        com.ahrorovkspace.afkorhackathon.core.states.PostApplicationRespState state) {
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
        
        public OnPostBottomSheetApplicationRespState(@org.jetbrains.annotations.NotNull
        com.ahrorovkspace.afkorhackathon.core.states.PostApplicationRespState state) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.core.states.PostApplicationRespState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.core.states.PostApplicationRespState getState() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/applicationScreen/BottomSheetApplicationEvent$Apply;", "Lcom/ahrorovkspace/afkorhackathon/presentation/applicationScreen/BottomSheetApplicationEvent;", "()V", "app_debug"})
    public static final class Apply extends com.ahrorovkspace.afkorhackathon.presentation.applicationScreen.BottomSheetApplicationEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.ahrorovkspace.afkorhackathon.presentation.applicationScreen.BottomSheetApplicationEvent.Apply INSTANCE = null;
        
        private Apply() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/applicationScreen/BottomSheetApplicationEvent$GoToMain;", "Lcom/ahrorovkspace/afkorhackathon/presentation/applicationScreen/BottomSheetApplicationEvent;", "()V", "app_debug"})
    public static final class GoToMain extends com.ahrorovkspace.afkorhackathon.presentation.applicationScreen.BottomSheetApplicationEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.ahrorovkspace.afkorhackathon.presentation.applicationScreen.BottomSheetApplicationEvent.GoToMain INSTANCE = null;
        
        private GoToMain() {
            super();
        }
    }
}