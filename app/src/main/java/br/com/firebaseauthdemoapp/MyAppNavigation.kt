package br.com.firebaseauthdemoapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.firebaseauthdemoapp.pages.HomePage
import br.com.firebaseauthdemoapp.pages.LoginPage
import br.com.firebaseauthdemoapp.pages.SignupPage

@Composable
fun MyAppNavigation(modifier: Modifier = Modifier, authViewModel: AuthViewModel) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Routes.loginPage,
        builder = {
            composable(Routes.loginPage) {
                LoginPage(modifier, navController, authViewModel)
            }
            composable(Routes.homePage) {
                HomePage(modifier, navController, authViewModel)
            }
            composable(Routes.SignupPage) {
                SignupPage(modifier, navController, authViewModel)
            }
        })
}