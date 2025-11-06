package com.example.tugasnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.tugasnavigation.ui.theme.TugasNavigationTheme
import com.example.tugasnavigation.Navigasiku

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TugasNavigationTheme {
                Navigasiku() // panggil composable navigasi utama
            }
        }
    }
}
