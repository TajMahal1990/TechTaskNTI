package com.example.server


import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ServerScreen(viewModel: ServerViewModel) {
    var port by remember { mutableStateOf(viewModel.serverPort) }
    var trackData by remember { mutableStateOf(viewModel.trackData) }

    Column(modifier = Modifier.padding(16.dp)) {
        TextField(
            value = port,
            onValueChange = { port = it },
            label = { Text("Server Port") }
        )
        Button(onClick = {
            viewModel.saveConfig(port)
        }) {
            Text("Save Config")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { viewModel.startServer() }) {
            Text("Start Server")
        }
        Button(onClick = { viewModel.stopServer() }) {
            Text("Stop Server")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { viewModel.fullTrack() }) {
            Text("Full Track")
        }
        Canvas(modifier = Modifier.fillMaxSize()) {
            // Отображение трека
        }
    }
}
