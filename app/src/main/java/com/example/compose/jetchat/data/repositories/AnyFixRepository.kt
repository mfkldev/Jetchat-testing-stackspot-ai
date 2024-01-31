package com.example.compose.jetchat.data.repositories

import com.example.compose.jetchat.data.RetrofitService
import com.example.compose.jetchat.model.AnyFixResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.withContext

class AnyFixRepository {

    private val retrofit = RetrofitService

    suspend fun findAll() : Flow<List<AnyFixResponse>> {
        return withContext(Dispatchers.IO) {
            flow{
                emit(retrofit.provideMovieService().findAll())
            }
        }
    }
}
