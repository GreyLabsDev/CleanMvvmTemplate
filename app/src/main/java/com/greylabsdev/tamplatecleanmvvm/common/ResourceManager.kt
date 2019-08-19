package com.greylabsdev.tamplatecleanmvvm.common

import android.content.Context

class ResourceManager(private val context: Context) {

    fun getString(id: Int): String {
        return context.resources.getString(id)
    }

}