package com.vinayeapps.dependencyinjectionkoin.data.repository

import com.vinayeapps.dependencyinjectionkoin.data.remote.MyApi
import com.vinayeapps.dependencyinjectionkoin.data.repository.MainRepository


/**
 * Created by vinaye on 2024-03-07.
 * Author: Vinay Sebastian
 */
class MainRepositoryImpl(private val api:MyApi): MainRepository
{
    override fun doNetworkCall() {
      api.callApi()
    }
}