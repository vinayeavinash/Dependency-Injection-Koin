package com.vinayeapps.dependencyinjectionkoin.presentation

import androidx.lifecycle.ViewModel
import com.vinayeapps.dependencyinjectionkoin.data.repository.MainRepository



/**
 * Created by vinay on 2024-03-07.
 * Author: Vinay Sebastian
 */
class MainViewModel(private val repository: MainRepository) : ViewModel() {

    fun doNetworkCall() {
        repository.doNetworkCall()
    }
}