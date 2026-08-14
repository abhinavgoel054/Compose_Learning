package org.example.composelearning

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform