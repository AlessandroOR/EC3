package com.alessandroorozco.ec3

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetroPersonaje {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://www.theboysapi.com/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val PersonajeApi = retrofit.create(PersonajeApi::class.java)
}