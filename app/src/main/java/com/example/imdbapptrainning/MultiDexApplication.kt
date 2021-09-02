package com.example.imdbapptrainning

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex

open class MultiDexApplication: Application(){
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
}