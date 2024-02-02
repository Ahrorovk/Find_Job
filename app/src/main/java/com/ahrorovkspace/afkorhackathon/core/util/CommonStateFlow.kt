package com.ahrorovkspace.afkorhackathon.core.util

import kotlinx.coroutines.flow.StateFlow

class CommonStateFlow<T> constructor(
    private val flow: StateFlow<T>
) : StateFlow<T> by flow

fun <T> StateFlow<T>.toCommonStateFlow() = CommonStateFlow(this)
