package com.ahrorovkspace.afkorhackathon.core.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0096A\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u001e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0000H\u0096\u0001\u00a2\u0006\u0002\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00028\u0000H\u0096A\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\t\u0010 \u001a\u00020\u001eH\u0097\u0001J\u0016\u0010!\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00028\u0000H\u0096\u0001\u00a2\u0006\u0002\u0010\"R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00028\u0000X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006#"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/core/util/CommonMutableStateFlow;", "T", "Lkotlinx/coroutines/flow/MutableStateFlow;", "flow", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "replayCache", "", "getReplayCache", "()Ljava/util/List;", "subscriptionCount", "Lkotlinx/coroutines/flow/StateFlow;", "", "getSubscriptionCount", "()Lkotlinx/coroutines/flow/StateFlow;", "value", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "compareAndSet", "", "expect", "update", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "emit", "", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetReplayCache", "tryEmit", "(Ljava/lang/Object;)Z", "app_debug"})
public final class CommonMutableStateFlow<T extends java.lang.Object> implements kotlinx.coroutines.flow.MutableStateFlow<T> {
    private final kotlinx.coroutines.flow.MutableStateFlow<T> flow = null;
    
    public CommonMutableStateFlow(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.MutableStateFlow<T> flow) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.FlowCollector<? super T> collector, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<?> p1) {
        return null;
    }
    
    @java.lang.Override
    public boolean compareAndSet(T expect, T update) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object emit(T value, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<T> getReplayCache() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getSubscriptionCount() {
        return null;
    }
    
    @java.lang.Override
    public T getValue() {
        return null;
    }
    
    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @java.lang.Override
    public void resetReplayCache() {
    }
    
    @java.lang.Override
    public void setValue(T p0) {
    }
    
    @java.lang.Override
    public boolean tryEmit(T value) {
        return false;
    }
}