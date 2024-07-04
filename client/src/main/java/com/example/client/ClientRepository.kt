package com.example.client


import io.ktor.client.*
import io.ktor.client.plugins.websocket.WebSockets
import io.ktor.client.plugins.websocket.webSocket
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.websocket.Frame
import io.ktor.websocket.readText
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.flow.MutableStateFlow

class ClientRepository {
    private val client = HttpClient {
        install(WebSockets)
    }

    suspend fun startTracking(ip: String, port: String, frequency: Int) {
        client.webSocket(method = HttpMethod.Get, host = ip, port = port.toInt(), path = "/track") {
            while (true) {
                val frame = incoming.receive()
                if (frame is Frame.Text) {
                    val swipeData = frame.readText()
                    // Обработка данных свайпа
                }
                delay(1000L / frequency)
            }
        }
    }

    suspend fun stopTracking() {
        client.close()
    }
}
