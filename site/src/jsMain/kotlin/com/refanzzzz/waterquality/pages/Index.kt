package com.refanzzzz.waterquality.pages

import androidx.compose.runtime.*
import com.refanzzzz.waterquality.components.sections.landingpage.Hero
import com.refanzzzz.waterquality.components.sections.landingpage.NavBar
import com.refanzzzz.waterquality.data.dto.User
import com.refanzzzz.waterquality.service.UserService
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.overflow
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*
import org.koin.compose.koinInject

@Page
@Composable
fun HomePage() {

    val userService = koinInject<UserService>()
    var users by remember { mutableStateOf<List<User>>(emptyList()) }
    var isLoading by remember { mutableStateOf(true) }

    LaunchedEffect(Unit) {
        users = userService.getUsers()
        isLoading = false
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .overflow(
                    Overflow.Hidden
                ),
            verticalArrangement = Arrangement.Top
        ) {
            NavBar()
            Column(
                modifier = Modifier
                    .margin(top = 100.px)
            ) {
                H1 {
                    Text("Daftar User")
                }

                if (isLoading) {
                    P { Text("Loading...") }
                } else {
                    Ul {
                        users.map {
                            Li {
                                Text(it.firstName)
                            }
                        }
                    }
                }
            }
            Hero()
            Footer()
        }
    }
}
