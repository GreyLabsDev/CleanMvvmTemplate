package com.greylabsdev.tamplatecleanmvvm.presentation.screen.launcher

import androidx.lifecycle.Observer
import com.greylabsdev.tamplatecleanmvvm.R
import com.greylabsdev.tamplatecleanmvvm.presentation.base.BaseActivityView
import org.koin.android.ext.android.inject

class LauncherActivityView : BaseActivityView(
    layoutResId = R.layout.activity_launcher
) {

    private val viewModel: LauncherViewModel by inject()

    override fun initViewModelObserving() {
        lifecycle.addObserver(viewModel)
        viewModel.progressState.observe(this, Observer {

        })
    }

}
