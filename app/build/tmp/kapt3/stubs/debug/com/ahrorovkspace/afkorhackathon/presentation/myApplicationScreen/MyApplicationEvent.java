package com.ahrorovkspace.afkorhackathon.presentation.myApplicationScreen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/myApplicationScreen/MyApplicationEvent;", "", "()V", "GetMyApplication", "OnApplicationStateChange", "OnGetMyApplicationChange", "OnSelectedResultsChange", "Lcom/ahrorovkspace/afkorhackathon/presentation/myApplicationScreen/MyApplicationEvent$GetMyApplication;", "Lcom/ahrorovkspace/afkorhackathon/presentation/myApplicationScreen/MyApplicationEvent$OnApplicationStateChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/myApplicationScreen/MyApplicationEvent$OnGetMyApplicationChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/myApplicationScreen/MyApplicationEvent$OnSelectedResultsChange;", "app_debug"})
public abstract class MyApplicationEvent {
    
    private MyApplicationEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/myApplicationScreen/MyApplicationEvent$OnGetMyApplicationChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/myApplicationScreen/MyApplicationEvent;", "state", "Lcom/ahrorovkspace/afkorhackathon/core/states/GetMyApplicationRespState;", "(Lcom/ahrorovkspace/afkorhackathon/core/states/GetMyApplicationRespState;)V", "getState", "()Lcom/ahrorovkspace/afkorhackathon/core/states/GetMyApplicationRespState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class OnGetMyApplicationChange extends com.ahrorovkspace.afkorhackathon.presentation.myApplicationScreen.MyApplicationEvent {
        @org.jetbrains.annotations.NotNull
        private final com.ahrorovkspace.afkorhackathon.core.states.GetMyApplicationRespState state = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.presentation.myApplicationScreen.MyApplicationEvent.OnGetMyApplicationChange copy(@org.jetbrains.annotations.NotNull
        com.ahrorovkspace.afkorhackathon.core.states.GetMyApplicationRespState state) {
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
        
        public OnGetMyApplicationChange(@org.jetbrains.annotations.NotNull
        com.ahrorovkspace.afkorhackathon.core.states.GetMyApplicationRespState state) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.core.states.GetMyApplicationRespState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.core.states.GetMyApplicationRespState getState() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/myApplicationScreen/MyApplicationEvent$GetMyApplication;", "Lcom/ahrorovkspace/afkorhackathon/presentation/myApplicationScreen/MyApplicationEvent;", "()V", "app_debug"})
    public static final class GetMyApplication extends com.ahrorovkspace.afkorhackathon.presentation.myApplicationScreen.MyApplicationEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.ahrorovkspace.afkorhackathon.presentation.myApplicationScreen.MyApplicationEvent.GetMyApplication INSTANCE = null;
        
        private GetMyApplication() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/myApplicationScreen/MyApplicationEvent$OnApplicationStateChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/myApplicationScreen/MyApplicationEvent;", "state", "", "(Z)V", "getState", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class OnApplicationStateChange extends com.ahrorovkspace.afkorhackathon.presentation.myApplicationScreen.MyApplicationEvent {
        private final boolean state = false;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.presentation.myApplicationScreen.MyApplicationEvent.OnApplicationStateChange copy(boolean state) {
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
        
        public OnApplicationStateChange(boolean state) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean getState() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/presentation/myApplicationScreen/MyApplicationEvent$OnSelectedResultsChange;", "Lcom/ahrorovkspace/afkorhackathon/presentation/myApplicationScreen/MyApplicationEvent;", "selected", "", "Lcom/ahrorovkspace/afkorhackathon/domain/myApplication/model/GetMyApplicationRespItem;", "(Ljava/util/List;)V", "getSelected", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class OnSelectedResultsChange extends com.ahrorovkspace.afkorhackathon.presentation.myApplicationScreen.MyApplicationEvent {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.ahrorovkspace.afkorhackathon.domain.myApplication.model.GetMyApplicationRespItem> selected = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.ahrorovkspace.afkorhackathon.presentation.myApplicationScreen.MyApplicationEvent.OnSelectedResultsChange copy(@org.jetbrains.annotations.NotNull
        java.util.List<com.ahrorovkspace.afkorhackathon.domain.myApplication.model.GetMyApplicationRespItem> selected) {
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
        
        public OnSelectedResultsChange(@org.jetbrains.annotations.NotNull
        java.util.List<com.ahrorovkspace.afkorhackathon.domain.myApplication.model.GetMyApplicationRespItem> selected) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.ahrorovkspace.afkorhackathon.domain.myApplication.model.GetMyApplicationRespItem> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.ahrorovkspace.afkorhackathon.domain.myApplication.model.GetMyApplicationRespItem> getSelected() {
            return null;
        }
    }
}