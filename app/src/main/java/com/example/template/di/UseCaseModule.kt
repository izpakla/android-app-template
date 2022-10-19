package com.example.template.di

import android.content.Context
import com.example.core.usecase.example.ExampleUseCase
import com.example.core.util.UseCaseInjector
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Singleton
    @Provides
    fun provideExampleUseCase(
        @ApplicationContext context: Context
    ): ExampleUseCase = UseCaseInjector.getDefaultExampleUseCase(context)

}