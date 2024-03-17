package com.vinayeapps.dependencyinjectionkoin.data.repository

import com.vinayeapps.dependencyinjectionkoin.data.remote.MyApi



/**
 * Created by vinaye on 2024-03-07.
 * Author: Vinay Sebastian
 */

/**
 * This class defines api implementation
 */

class MainRepositoryImpl(private val api:MyApi): MainRepository
{
    override fun doNetworkCall() {
      api.callApi()
    }
}