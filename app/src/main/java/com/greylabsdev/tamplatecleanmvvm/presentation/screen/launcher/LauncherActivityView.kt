package com.greylabsdev.tamplatecleanmvvm.presentation.screen.launcher

import androidx.lifecycle.Observer
import com.greylabsdev.tamplatecleanmvvm.R
import com.greylabsdev.tamplatecleanmvvm.presentation.base.BaseActivityView
import com.greylabsdev.tamplatecleanmvvm.presentation.base.BaseViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class LauncherActivityView : BaseActivityView(
    layoutResId = R.layout.activity_launcher
) {

    override val viewModel: BaseViewModel by viewModel<LauncherViewModel>()

    override fun initViewModelObserving() {
        lifecycle.addObserver(viewModel)
        viewModel.progressState.observe(this, Observer {

        })
    }

}
