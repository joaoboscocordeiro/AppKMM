package br.com.aplicativo.appkmm

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.cancel

class IOSPlatform: Platform {
    override val name: String = "Alô iOS Franks!"
}

actual fun getPlatform(): Platform = IOSPlatform()

actual abstract class BaseSharedViewModel {

    actual val scope: CoroutineScope = MainScope()

    protected actual open fun onCleared() {

    }

    fun clear() {
        onCleared()
        scope.cancel()
    }
}