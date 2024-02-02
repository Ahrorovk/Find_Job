package com.ahrorovkspace.afkorhackathon.core.util


import kotlinx.coroutines.flow.Flow

 class CommonFlow<T>  constructor(
    private val flow: Flow<T>
) : Flow<T> by flow

fun <T> Flow<T>.toCommonFlow() = CommonFlow(this)