package com.rioramdani0034.tipscalculate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.rioramdani0034.tipscalculate.ui.screen.MainScreen
import com.rioramdani0034.tipscalculate.ui.theme.TipscalculateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TipscalculateTheme {
                    MainScreen()
            }
        }
    }
}
