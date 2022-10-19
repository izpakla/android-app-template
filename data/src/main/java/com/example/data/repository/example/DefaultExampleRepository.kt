package com.example.data.repository.example

import com.example.data.local.LocalDataSource
import com.example.data.remote.RemoteDataSource

internal class DefaultExampleRepository(
    private val apiDataSource: RemoteDataSource,
    private val dbDataSource: LocalDataSource
) : ExampleRepository {

}