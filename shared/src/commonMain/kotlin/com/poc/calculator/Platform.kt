package com.poc.calculator

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform