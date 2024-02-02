package com.ahrorovkspace.afkorhackathon.core.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0096A\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00028\u0000X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/core/util/CommonStateFlow;", "T", "Lkotlinx/coroutines/flow/StateFlow;", "flow", "(Lkotlinx/coroutines/flow/StateFlow;)V", "replayCache", "", "getReplayCache", "()Ljava/util/List;", "value", "getValue", "()Ljava/lang/Object;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CommonStateFlow<T extends java.lang.Object> implements kotlinx.coroutines.flow.StateFlow<T> {
    private final kotlinx.coroutines.flow.StateFlow<T> flow = null;
    
    public CommonStateFlow(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.StateFlow<? extends T> flow) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.FlowCollector<? super T> collector, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<?> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<T> getReplayCache() {
        return null;
    }
    
    @java.lang.Override
    public T getValue() {
        return null;
    }
}