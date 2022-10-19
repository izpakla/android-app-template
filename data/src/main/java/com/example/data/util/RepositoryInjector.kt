package com.example.data.util

import android.content.Context
import com.example.data.local.DefaultLocalDataSource
import com.example.data.local.db.AppDatabase
import com.example.data.remote.DefaultRemoteDataSource
import com.example.data.remote.api.RestApiConfig
import com.example.data.repository.example.DefaultExampleRepository
import com.example.data.repository.example.ExampleRepository

object RepositoryInjector {

    fun getDefaultExampleRepository(
        context: Context,
        restApiConfig: RestApiConfig = RestApiConfig.loadConfig(context)
    ): ExampleRepository = DefaultExampleRepository(
        DefaultRemoteDataSource(restApiConfig),
        DefaultLocalDataSource(AppDatabase.getInstance(context))
    )

}