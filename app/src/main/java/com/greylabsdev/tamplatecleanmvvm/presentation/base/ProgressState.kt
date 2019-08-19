package com.greylabsdev.tamplatecleanmvvm.presentation.base

sealed class ProgressState {
    class Done: ProgressState()
    class Loading: ProgressState()
    class Error(errorMessage: String): ProgressState()
}