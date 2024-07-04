package com.example.client

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ClientViewModel : ViewModel() {
    private val clientRepository = ClientRepository()

    var serverIp by mutableStateOf("")
    var serverPort by mutableStateOf("")
    var frequency by mutableStateOf(0)

    fun saveConfig(ip: String, port: String, freq: Int) {
        serverIp = ip
        serverPort = port
        frequency = freq
    }

    fun startTracking() {
        viewModelScope.launch {
            clientRepository.startTracking(serverIp, serverPort, frequency)
        }
    }

    fun stopTracking() {
        viewModelScope.launch {
            clientRepository.stopTracking()
        }
    }
}
