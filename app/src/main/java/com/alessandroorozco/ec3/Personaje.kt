package com.alessandroorozco.ec3

import com.alessandroorozco.ec3.Personajes.Affiliation
import com.alessandroorozco.ec3.Personajes.Family
import com.alessandroorozco.ec3.Personajes.FirstSeen
import com.alessandroorozco.ec3.Personajes.LastSeen

data class Personaje(
    val affiliation: List<Affiliation>,
    val citizenship: String,
    val families: List<Family>,
    val id: Int,
    val image: String,

)