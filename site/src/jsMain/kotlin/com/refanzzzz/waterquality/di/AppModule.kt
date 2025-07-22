package com.refanzzzz.waterquality.di


import com.refanzzzz.waterquality.data.network.HttpClientFactory
import com.refanzzzz.waterquality.service.UserService
import org.koin.dsl.module

val appModule = module {
    single {
        HttpClientFactory.createClient()
    }
    single {
        UserService(get())
    }
}