package io.conectedcare.api

import io.conectedcare.api.models.ArticlesResponse
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import retrofit2.Response

class VigoSmartClientTest {


    private val vigoSmartClient=VigoSmartClient()

    @Test
    fun `GET_ARTICLES`(){
        val articles=vigoSmartClient.api.getArtciles().execute()
            assertNotNull(articles.body()?.articles)
    }
}