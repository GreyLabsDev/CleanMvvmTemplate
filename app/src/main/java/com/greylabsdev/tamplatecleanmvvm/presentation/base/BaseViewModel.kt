package com.greylabsdev.tamplatecleanmvvm.presentation.base

import androidx.lifecycle.*
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class BaseViewModel: ViewModel(), LifecycleObserver {

    private val disposables = CompositeDisposable()

    var progressState: MutableLiveData<ProgressState> = MutableLiveData();

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun dispose() {
        disposables.dispose()
    }

    protected fun addDisposable(disposable: Disposable) {
        disposables.add(disposable)
    }

}