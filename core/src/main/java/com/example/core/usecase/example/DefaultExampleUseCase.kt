package com.example.core.usecase.example

import com.example.data.repository.example.ExampleRepository

internal class DefaultExampleUseCase(
    private val exampleRepository: ExampleRepository
) : ExampleUseCase {

}