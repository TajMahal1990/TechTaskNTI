package com.example.swipeproject.client

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.*
import com.example.client.ClientViewModel
import com.example.swipeproject.ui.theme.SwipeProjectTheme
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : ComponentActivity() {
    private val viewModel: ClientViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SwipeProjectTheme {
                Surface(color = MaterialTheme.colors.background) {
                    ClientScreen(viewModel)
                }
            }
        }
    }
}
