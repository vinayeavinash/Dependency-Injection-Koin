package com.vinayeapps.dependencyinjectionkoin.presentation

import androidx.lifecycle.ViewModel
import com.vinayeapps.dependencyinjectionkoin.data.MainRepositoryImpl


/**
 * Created by vinay on 2024-03-07.
 * Author: Vinay Sebastian
 */
class MainViewModel : ViewModel() {
    private val repository = MainRepositoryImpl()
    fun doNetworkCall() {
        repository.doNetworkCall()
    }
}