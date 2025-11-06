package com.example.tugasnavigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tugasnavigation.view.Formulir
import com.example.tugasnavigation.view.TampilData
import com.example.tugasnavigation.view.WelcomeScreen

enum class Navigasi {
WelcomeScreen,
TampilData,
Formulir
}

@Composable
fun Navigasiku() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "welcome"
    ) {
        composable("welcome") { WelcomeScreen(navController) }
        composable("listPeserta") { TampilData(navController) }
        composable("formulir") { Formulir(navController) }
    }
}
