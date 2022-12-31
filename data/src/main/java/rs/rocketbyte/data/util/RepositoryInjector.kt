package rs.rocketbyte.data.util

import android.content.Context
import rs.rocketbyte.data.local.DefaultLocalDataSource
import rs.rocketbyte.data.local.db.AppDatabase
import rs.rocketbyte.data.remote.DefaultRemoteDataSource
import rs.rocketbyte.data.remote.api.RestApiConfig
import rs.rocketbyte.data.repository.DefaultRepository
import rs.rocketbyte.data.repository.Repository

object RepositoryInjector {

    fun getRepository(
        context: Context,
        restApiConfig: RestApiConfig = RestApiConfig.loadConfig(context)
    ): Repository = DefaultRepository(
        DefaultRemoteDataSource(restApiConfig),
        DefaultLocalDataSource(AppDatabase.getInstance(context))
    )

}