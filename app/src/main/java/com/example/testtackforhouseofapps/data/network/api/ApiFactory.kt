package com.example.testtackforhouseofapps.data.network.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiFactory {

    private const val BASE_URL = "https://jsonplaceholder.typicode.com/"

    fun getApiService(): PostsApiService {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()

        return retrofit.create(PostsApiService::class.java)
    }
}