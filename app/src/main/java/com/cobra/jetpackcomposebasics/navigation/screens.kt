package com.cobra.jetpackcomposebasics.navigation

sealed class Screens(val route : String){
    object AScreenRoute : Screens(route = "A")
    object BScreenRoute : Screens(route = "B")
    object OneScreenRoute : Screens(route = "On")
    object TwoScreenRoute : Screens(route = "Two")
    object LetterRoute : Screens(route = "Letter")
    object NumberRoute : Screens(route = "Number")

}
