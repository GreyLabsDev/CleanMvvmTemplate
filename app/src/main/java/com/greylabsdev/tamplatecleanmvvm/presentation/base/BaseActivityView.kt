package com.greylabsdev.tamplatecleanmvvm.presentation.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel

abstract class BaseActivityView(
    @LayoutRes private val layoutResId: Int
): AppCompatActivity() {

    protected abstract val viewModel: BaseViewModel

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(layoutResId)

        initViews()
        initListeners()
        initViewModelObserving()
    }

    protected open fun initViews() {}
    protected open fun initListeners() {}
    protected abstract fun initViewModelObserving()

    protected open fun showLoading(isShow: Boolean) {}
    protected open fun showError(errorMessage: String) {}
    protected open fun showPlaceholder(isShow: Boolean, titleText: String? = null) {}
}