package com.cobra.jetpackcomposebasics.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.cobra.jetpackcomposebasics.OneScreen
import com.cobra.jetpackcomposebasics.TwoScreen

fun NavGraphBuilder.numberGraph(navController: NavController){
    navigation(startDestination = Screens.OneScreenRoute.route, route = Screens.NumberRoute.route) {

        composable(route = Screens.OneScreenRoute.route) { OneScreen(navController) }
        composable(route = Screens.TwoScreenRoute.route) { TwoScreen(navController) }
    }
}