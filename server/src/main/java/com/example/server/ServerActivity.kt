package com.example.server


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.*

class ServerActivity : ComponentActivity() {
 //   private val viewModel: ServerViewModel by viewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
      //      SwipeProjectTheme {
                Surface(color = MaterialTheme.colors.background) {
         //           ServerScreen(viewModel)
                }
            }
        }
    }
}
