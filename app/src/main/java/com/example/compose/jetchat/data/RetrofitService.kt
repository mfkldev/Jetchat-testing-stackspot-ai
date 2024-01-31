package com.example.compose.jetchat.data

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitService {
    private var retrofitInstance: Retrofit? = null
    private var movieService: MovieService? = null
    private var okhttpClient: OkHttpClient? = null

    fun retrofitProvider(): Retrofit {

        if (retrofitInstance == null) {
            retrofitInstance = Retrofit.Builder()
                .baseUrl("http://192.168.0.239:8080/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(provideOkHttpClient())
                .build()
        }

        return retrofitInstance!!
    }

    fun provideMovieService() : MovieService {

        if (movieService == null) {
            movieService = retrofitProvider().create(MovieService::class.java)
        }

        return movieService!!
    }

    private fun provideOkHttpClient(): OkHttpClient {

        if (okhttpClient == null) {
            okhttpClient = OkHttpClient.Builder()
                .addInterceptor(provideHttpLoggingInterceptor())
                .build()
        }

        return okhttpClient!!
    }

    private fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().apply {
            setLevel(HttpLoggingInterceptor.Level.BODY)
        }
    }
}
