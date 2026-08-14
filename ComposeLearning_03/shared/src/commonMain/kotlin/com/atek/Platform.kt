package com.atek

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform