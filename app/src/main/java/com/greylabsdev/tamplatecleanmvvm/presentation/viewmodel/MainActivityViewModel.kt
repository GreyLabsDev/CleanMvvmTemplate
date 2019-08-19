package com.greylabsdev.tamplatecleanmvvm.presentation.viewmodel

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.ViewModel
import com.greylabsdev.tamplatecleanmvvm.presentation.base.BaseViewModel
import com.greylabsdev.tamplatecleanmvvm.presentation.base.ProgressState
import io.reactivex.disposables.CompositeDisposable

class MainActivityViewModel() : ViewModel(), BaseViewModel {

    private val disposables = CompositeDisposable()

    var progressState: MutableLiveData<ProgressState> = MutableLiveData();

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun dispose() {
        disposables.dispose()
    }

}