package com.ahrorovkspace.afkorhackathon.core.util

import kotlinx.coroutines.flow.MutableStateFlow

 class CommonMutableStateFlow<T>  constructor(
    private val flow: MutableStateFlow<T>
) : MutableStateFlow<T> by flow

fun <T> MutableStateFlow<T>.toCommonMutableStateFlow() = CommonMutableStateFlow(this)
