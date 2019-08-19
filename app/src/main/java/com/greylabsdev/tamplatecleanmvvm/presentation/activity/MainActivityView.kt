package com.greylabsdev.tamplatecleanmvvm.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.greylabsdev.tamplatecleanmvvm.R
import com.greylabsdev.tamplatecleanmvvm.presentation.base.BaseView
import com.greylabsdev.tamplatecleanmvvm.presentation.viewmodel.MainActivityViewModel
import org.koin.android.ext.android.inject

class MainActivityView : AppCompatActivity(), BaseView {

    val viewModel: MainActivityViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun initViews() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initListeners() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initViewModelObserving() {
        viewModel.progressState.observe(this, Observer {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        })
    }


    override fun showLoading(isShow: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showError(errorMessage: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showPlaceholder(isShow: Boolean, titleText: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
