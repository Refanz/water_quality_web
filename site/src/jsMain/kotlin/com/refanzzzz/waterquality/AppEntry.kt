package com.refanzzzz.waterquality

import androidx.compose.runtime.*
import com.refanzzzz.waterquality.di.appModule
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.core.KobwebApp
import com.varabyte.kobweb.silk.SilkApp
import org.koin.core.context.startKoin

@App
@Composable
fun AppEntry(content: @Composable () -> Unit) {

    startKoin {
        modules(appModule)
    }

    SilkApp {
        KobwebApp {
            content()
        }
    }
}
