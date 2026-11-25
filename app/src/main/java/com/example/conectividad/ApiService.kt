package com.example.conectividad

import kotlinx.serialization.Serializable
import retrofit2.http.GET

@Serializable
data class User(
    val id: Int,
    val name: String,
    val email: String,
    val phone: String = ""
)

interface ApiService {
    @GET("users")
    suspend fun getUsers(): List<User>
}