package br.com.aplicativo.appkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform