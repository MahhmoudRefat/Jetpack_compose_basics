package com.cobra.jetpackcomposebasics

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun nav() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "A") {
        composable(route = "A") { AScreen(navController) } //بنعرف بيه الواجهة بتاعتنا الى هنستخدمها
        composable(route = "B") { BScreen(navController) }
        composable(route = "C") { CScreen(navController) }
    }

}