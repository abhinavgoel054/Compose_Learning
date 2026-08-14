package com.atek.composelearning

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform