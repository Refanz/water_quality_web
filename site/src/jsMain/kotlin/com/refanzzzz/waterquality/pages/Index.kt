package com.refanzzzz.waterquality.pages

import Contact
import Features
import NavBar
import androidx.compose.runtime.Composable
import com.refanzzzz.waterquality.components.sections.landingpage.Footer
import com.refanzzzz.waterquality.components.sections.landingpage.Hero
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page

@Page
@Composable
fun HomePage() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        NavBar()
        Hero()
        Features()
        Contact()
        Footer()
    }
}

