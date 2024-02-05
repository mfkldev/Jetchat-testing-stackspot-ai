package com.example.compose.jetchat.data.repositories

import com.example.compose.jetchat.data.RetrofitService
import com.example.compose.jetchat.model.AnyFixResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class AnyFixRepository {

    private val retrofit = RetrofitService

    suspend fun findAll() : List<AnyFixResponse> {
        return withContext(Dispatchers.IO) {
           retrofit.provideMovieService().findAll()
        }
    }
}
