package com.example.core.util

import android.content.Context
import com.example.core.usecase.example.DefaultExampleUseCase
import com.example.core.usecase.example.ExampleUseCase
import com.example.data.util.RepositoryInjector

object UseCaseInjector {

    fun getDefaultExampleUseCase(context: Context): ExampleUseCase {
        return DefaultExampleUseCase(RepositoryInjector.getDefaultExampleRepository(context))
    }

}