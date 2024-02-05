package com.example.compose.jetchat.data

import com.example.compose.jetchat.model.AnyFixResponse
import retrofit2.http.GET

interface MovieService {

    @GET("movies")
    suspend fun findAll() : List<AnyFixResponse>
}
