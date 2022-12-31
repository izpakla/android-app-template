package rs.rocketbyte.core.util

import android.content.Context
import rs.rocketbyte.core.usecase.DefaultUseCase
import rs.rocketbyte.core.usecase.UseCase
import rs.rocketbyte.data.util.RepositoryInjector

object UseCaseInjector {

    fun getUseCase(context: Context): UseCase {
        return DefaultUseCase(RepositoryInjector.getRepository(context))
    }

}