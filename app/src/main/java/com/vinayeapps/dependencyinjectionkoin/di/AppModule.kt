package com.vinayeapps.dependencyinjectionkoin.di

import com.vinayeapps.dependencyinjectionkoin.data.remote.MyApi
import com.vinayeapps.dependencyinjectionkoin.data.repository.MainRepository
import com.vinayeapps.dependencyinjectionkoin.data.repository.MainRepositoryImpl
import com.vinayeapps.dependencyinjectionkoin.presentation.MainViewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


/**
 * Created by vinay on 2024-03-10.
 * Author: Vinay Sebastian
 */

/**
 * This AppModule defines various dependencies required for this project ->
 * RetrofitInstance,MainRepository,MainViewModel
 */

val appModule = module {
    single {
        Retrofit.Builder().baseUrl("https://.google.com")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(MyApi::class.java)
    }
    single<MainRepository> {
        MainRepositoryImpl(get())
    }
    single {
        MainViewModel(get())
    }
}