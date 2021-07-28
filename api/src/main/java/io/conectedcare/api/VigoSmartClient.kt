package io.conectedcare.api

import io.conectedcare.api.services.VigoSmartApi
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class VigoSmartClient {

    val retroft=Retrofit.Builder()
        .baseUrl("https://conduit.productionready.io/api/")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    val api=retroft.create(VigoSmartApi::class.java)

}