package com.vinayeapps.dependencyinjectionkoin.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin


/**
 * Created by vinay on 2024-03-17.
 * Author: Vinay Sebastian
 */

/**
 * This  class help to initialize Koin in our project
 */
class MyApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        /**
         * start koin with relevant modules
         */
        startKoin(){
            // optional
            androidLogger()
            androidContext(this@MyApplication)
            modules(appModule)
        }
    }
}