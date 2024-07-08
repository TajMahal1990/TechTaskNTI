package com.example.server

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ServerViewModel : ViewModel() {
    private val serverRepository = ServerRepository()

    var serverPort by mutableStateOf("8080")
    var trackData by mutableStateOf("")

    fun saveConfig(port: String) {
        serverPort = port
    }

    fun startServer() {
        viewModelScope.launch {
            serverRepository.startServer(serverPort.toInt())
        }
    }

    fun stopServer() {
        viewModelScope.launch {
            serverRepository.stopServer()
        }
    }

    fun fullTrack() {
        viewModelScope.launch {
            trackData = serverRepository.getFullTrack()
        }
    }




}
