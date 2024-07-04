package com.example.server

package com.example.swipeproject.server

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class ServerActivity : ComponentActivity() {
    private val viewModel: ServerViewModel by viewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SwipeProjectTheme {
                Surface(color = MaterialTheme.colors.background) {
                    ServerScreen(viewModel)
                }
            }
        }
    }
}
