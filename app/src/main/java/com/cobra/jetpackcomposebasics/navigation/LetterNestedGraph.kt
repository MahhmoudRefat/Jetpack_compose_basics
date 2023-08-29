package com.cobra.jetpackcomposebasics.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.cobra.jetpackcomposebasics.AScreen
import com.cobra.jetpackcomposebasics.BScreen

fun NavGraphBuilder.letterGraph(navController:NavController){
    navigation(startDestination = Screens.AScreenRoute.route, route = Screens.LetterRoute.route){
        composable(route = Screens.AScreenRoute.route) { AScreen(navController) } //بنعرف بيه الواجهة بتاعتنا الى هنستخدمها
        composable(route = Screens.BScreenRoute.route) { BScreen(navController) }
    }
}