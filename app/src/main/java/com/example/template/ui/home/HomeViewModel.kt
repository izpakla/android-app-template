package com.example.template.ui.home

import androidx.lifecycle.ViewModel
import com.example.core.usecase.example.ExampleUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val exampleUseCase: ExampleUseCase
) : ViewModel()