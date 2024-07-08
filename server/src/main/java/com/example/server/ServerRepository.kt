package com.example.server

import androidx.compose.ui.window.application



import io.ktor.server.application.install
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.routing.routing
import io.ktor.server.websocket.WebSockets
import io.ktor.server.websocket.webSocket
import io.ktor.websocket.*
import io.ktor.websocket.WebSocketDeflateExtension.Companion.install
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableStateFlow
import java.util.*

class ServerRepository {
    private val server = embeddedServer(Netty, port = 8080) {
        install(WebSockets)
        routing {
            webSocket("/track") {
                for (frame in incoming) {
                    if (frame is Frame.Text) {
                        val receivedText = frame.readText()
                        // Обработка данных свайпа и сохранение в БД
                    }
                }
            }
        }
    }

    fun startServer(port: Int) {
        server.start(wait = true)
    }

    fun stopServer() {
        server.stop(1000, 10000)
    }

    fun getFullTrack(): String {
        // Получение полного трека из БД и возврат в виде строки
        return ""
    }
}
