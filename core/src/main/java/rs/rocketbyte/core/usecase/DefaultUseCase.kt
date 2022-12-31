package rs.rocketbyte.core.usecase

import rs.rocketbyte.data.repository.Repository


internal class DefaultUseCase(
    private val repository: Repository
) : UseCase