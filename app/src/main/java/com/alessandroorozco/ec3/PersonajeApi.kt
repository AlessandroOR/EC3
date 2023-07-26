package com.alessandroorozco.ec3

import retrofit2.Call
import retrofit2.http.GET

interface PersonajeApi {

    @GET("character")
    fun getTraer(): Call<List<Personaje>>

}