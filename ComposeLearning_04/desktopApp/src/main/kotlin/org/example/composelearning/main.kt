package org.example.composelearning

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "ComposeLearning_04",
    ) {
        App()
    }
}