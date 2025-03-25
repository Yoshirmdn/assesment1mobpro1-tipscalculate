package com.rioramdani0034.tipscalculate.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rioramdani0034.tipscalculate.ui.screen.AboutScreen
import com.rioramdani0034.tipscalculate.ui.screen.MainScreen

@Composable
fun SetupNavGraph(navcontroller: NavHostController = rememberNavController()) {
    NavHost(
        navController = navcontroller,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            MainScreen(navcontroller)
        }
        composable(Screen.About.route) {
            AboutScreen(navcontroller)
        }
    }
}