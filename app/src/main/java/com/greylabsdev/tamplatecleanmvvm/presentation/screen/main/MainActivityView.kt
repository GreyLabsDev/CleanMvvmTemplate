package com.greylabsdev.tamplatecleanmvvm.presentation.screen.main

import androidx.lifecycle.Observer
import com.greylabsdev.tamplatecleanmvvm.R
import com.greylabsdev.tamplatecleanmvvm.presentation.base.BaseActivityView
import com.greylabsdev.tamplatecleanmvvm.presentation.base.BaseViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivityView : BaseActivityView(
    layoutResId = R.layout.activity_main
) {

    override val viewModel: BaseViewModel by viewModel<MainViewModel>()

    override fun initViewModelObserving() {
        lifecycle.addObserver(viewModel)
        viewModel.progressState.observe(this, Observer {

        })
    }

}