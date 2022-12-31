package rs.rocketbyte.data.repository

import rs.rocketbyte.data.local.LocalDataSource
import rs.rocketbyte.data.remote.RemoteDataSource


internal class DefaultRepository(
    private val apiDataSource: RemoteDataSource,
    private val dbDataSource: LocalDataSource
) : Repository {

}