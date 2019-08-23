package com.greylabsdev.tamplatecleanmvvm.presentation.screen.main

import androidx.lifecycle.Observer
import com.greylabsdev.tamplatecleanmvvm.R
import com.greylabsdev.tamplatecleanmvvm.presentation.base.BaseActivityView
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivityView : BaseActivityView(
    layoutResId = R.layout.activity_main
) {

    private val viewModel: MainViewModel by viewModel()

    override fun initViewModelObserving() {
        lifecycle.addObserver(viewModel)
        viewModel.progressState.observe(this, Observer {

        })
    }

}