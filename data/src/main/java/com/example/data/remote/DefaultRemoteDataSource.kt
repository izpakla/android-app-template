package com.example.data.remote

import com.example.data.remote.api.ApiHelper.execute
import com.example.data.remote.api.NetworkResult
import com.example.data.remote.api.RestApiConfig
import com.example.data.remote.api.service.ExampleService
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

internal class DefaultRemoteDataSource(restApiConfig: RestApiConfig) : RemoteDataSource {

    companion object {
        const val CACHE_SIZE: Long = 5 * 1024 * 1024L
    }

    private val exampleService: ExampleService

    init {
        val logger = HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BASIC }
        val client = OkHttpClient.Builder()
            .addInterceptor(logger)
            .cache(Cache(restApiConfig.cacheDir, CACHE_SIZE))
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl(restApiConfig.baseUrl)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        exampleService = retrofit.create(ExampleService::class.java)
    }

    suspend fun example(): NetworkResult<List<String>> = execute {
        exampleService.search("")
    }

}