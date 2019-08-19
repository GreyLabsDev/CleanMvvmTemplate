package com.greylabsdev.tamplatecleanmvvm.presentation.base

interface BaseView {
    fun initViews()
    fun initListeners()
    fun initViewModelObserving()

    fun showLoading(isShow: Boolean)
    fun showError(errorMessage: String)
    fun showPlaceholder(isShow: Boolean, titleText: String? = null)
}