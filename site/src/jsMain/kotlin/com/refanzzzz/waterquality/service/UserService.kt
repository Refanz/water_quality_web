package com.refanzzzz.waterquality.service

import com.refanzzzz.waterquality.data.dto.User
import com.refanzzzz.waterquality.data.dto.UserResponse
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*

class UserService(private val client: HttpClient) {

    suspend fun getUsers(): List<User> {
        val userResponse: UserResponse = client.get("users") {
            url {
                parameters.append("page", "2")
            }
        }.body()

        return userResponse.data
    }
}