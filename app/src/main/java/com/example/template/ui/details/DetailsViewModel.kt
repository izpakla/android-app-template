package com.example.template.ui.details

import androidx.lifecycle.ViewModel
import com.example.core.usecase.example.ExampleUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(
    private val exampleUseCase: ExampleUseCase
) : ViewModel()