package com.refanzzzz.waterquality.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserResponse(
    val page: Int = 0,

    @SerialName("per_page")
    val perPage: Int = 0,

    val total: Int = 0,

    @SerialName("total_pages")
    val totalPages: Int = 0,

    val data: List<User> = emptyList(),
    val support: Support? = null
)

@Serializable
data class User(
    val id: Int,
    val email: String,

    @SerialName("first_name")
    val firstName: String,

    @SerialName("last_name")
    val lastName: String,

    val avatar: String
)

@Serializable
data class Support(
    val url: String,
    val text: String
)
