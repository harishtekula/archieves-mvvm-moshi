package io.conectedcare.api.services

import io.conectedcare.api.models.ArticlesResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface VigoSmartApi {
    @GET("articles")
    fun getArtciles():Call<ArticlesResponse>

}