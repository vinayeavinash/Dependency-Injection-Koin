package com.vinayeapps.dependencyinjectionkoin.data.remote

import retrofit2.http.GET


/**
 * Created by vinaye on 2024-03-10.
 * Author: Vinay Sebastian
 */
interface MyApi {
    @GET("my/endpoint")
    fun callApi()
}