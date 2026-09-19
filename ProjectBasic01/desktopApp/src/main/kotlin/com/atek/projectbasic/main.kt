package com.atek.projectbasic

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "ProjectBasic01",
    ) {
        App()
    }
}