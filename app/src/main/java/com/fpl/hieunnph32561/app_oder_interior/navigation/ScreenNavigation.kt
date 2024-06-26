package com.fpl.hieunnph32561.app_oder_interior.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.fpl.hieunnph32561.app_oder_interior.ui.screen.Boarding
import com.fpl.hieunnph32561.app_oder_interior.ui.screen.Cart
import com.fpl.hieunnph32561.app_oder_interior.ui.screen.CheckOut
import com.fpl.hieunnph32561.app_oder_interior.ui.screen.Congrats
import com.fpl.hieunnph32561.app_oder_interior.ui.screen.Home
import com.fpl.hieunnph32561.app_oder_interior.ui.screen.Login
import com.fpl.hieunnph32561.app_oder_interior.ui.screen.ProductDetail
import com.fpl.hieunnph32561.app_oder_interior.ui.screen.SignUp

@Composable
fun ScreenNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.Boarding.route,
    ) {
        composable(Screen.Boarding.route) { Boarding(navController) }
        composable(Screen.Login.route) { Login(navController) }
        composable(Screen.SignUp.route) { SignUp(navController) }
        composable(Screen.MyBottombar.route) { MyBottombar(navController) }
        composable(Screen.Home.route) { Home(navController) }
        composable(
            "${Screen.ProductDetail.route}/{productID}",
            arguments = listOf(navArgument("productID") { type = NavType.StringType })
        ) {
            ProductDetail(
                productId = it.arguments?.getString("productID").orEmpty(),
                navController = navController
            )
        }
        composable(Screen.Cart.route) { Cart(navController) }
        composable(Screen.CheckOut.route) { CheckOut(navController) }
        composable(Screen.Congrats.route) { Congrats(navController) }
    }
}