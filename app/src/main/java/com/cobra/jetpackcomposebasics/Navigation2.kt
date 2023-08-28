package com.cobra.jetpackcomposebasics

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun nav2() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable(route = "home") { FirstScreen(navController) } //بنعرف بيه الواجهة بتاعتنا الى هنستخدمها
        composable(route = "second?name={name}&age={age}", arguments = listOf(
            navArgument(name = "name") {
            type =
                NavType.StringType
                nullable=true
        }, navArgument(name = "age") {
            type =
                NavType.IntType
                defaultValue = 0
        }
        )) { backstackEntry ->
            SecondScreen(
                myname = backstackEntry.arguments?.getString("name"),
                myage = backstackEntry.arguments?.getInt("age").toString()
            )
        } //بنعرف بيه الواجهة بتاعتنا الى هنستخدمها

    }

}