package com.example.client


import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ClientScreen(viewModel: ClientViewModel) {
    var ip by remember { mutableStateOf(viewModel.serverIp) }
    var port by remember { mutableStateOf(viewModel.serverPort) }
    var frequency by remember { mutableStateOf(viewModel.frequency.toString()) }

    Column(modifier = Modifier.padding(16.dp)) {
        TextField(
            value = ip,
            onValueChange = { ip = it },
            label = { Text("Server IP") }
        )
        TextField(
            value = port,
            onValueChange = { port = it },
            label = { Text("Server Port") }
        )
        TextField(
            value = frequency,
            onValueChange = { frequency = it },
            label = { Text("Frequency") }
        )
        Button(onClick = {
            viewModel.saveConfig(ip, port, frequency.toInt())
        }) {
            Text("Save Config")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { viewModel.startTracking() }) {
            Text("Start")
        }
        Button(onClick = { viewModel.stopTracking() }) {
            Text("Stop")
        }
    }
}
