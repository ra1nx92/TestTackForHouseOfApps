package com.example.testtackforhouseofapps.di

import com.example.testtackforhouseofapps.data.network.api.ApiFactory
import com.example.testtackforhouseofapps.data.network.api.PostsApiService
import org.koin.dsl.module

val screenModule = module {
    fun provideApi():PostsApiService{
        return ApiFactory.getApiService()
    }

    single<PostsApiService> { provideApi() }
}