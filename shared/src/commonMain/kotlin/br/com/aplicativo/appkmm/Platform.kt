package br.com.aplicativo.appkmm

import kotlinx.coroutines.CoroutineScope

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

expect abstract class BaseSharedViewModel() {
    val scopo: CoroutineScope
    protected fun onCleared()
}