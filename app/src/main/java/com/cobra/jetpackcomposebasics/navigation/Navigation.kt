package com.cobra.jetpackcomposebasics

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.cobra.jetpackcomposebasics.navigation.Screens
import com.cobra.jetpackcomposebasics.navigation.letterGraph
import com.cobra.jetpackcomposebasics.navigation.numberGraph


@Composable
fun nav() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screens.NumberRoute.route) {


        numberGraph(navController)
        letterGraph(navController)

    }
}