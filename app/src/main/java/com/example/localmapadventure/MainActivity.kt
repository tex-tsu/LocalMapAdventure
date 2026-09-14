package com.example.localmapadventure

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.localmapadventure.ui.MapScreen
import com.example.localmapadventure.ui.WelcomeScreen
import com.example.localmapadventure.ui.theme.LocalMapAdventureTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LocalMapAdventureTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    var showWelcome by remember { mutableStateOf(true) }

                    if (showWelcome) {
                        WelcomeScreen(
                            onStartClick = { showWelcome = false }
                        )
                    } else {
                        MapScreen()
                    }
                }
            }
        }
    }
}