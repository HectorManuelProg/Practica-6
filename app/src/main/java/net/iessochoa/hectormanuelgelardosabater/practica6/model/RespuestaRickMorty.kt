package net.iessochoa.hectormanuelgelardosabater.practica6.model

import com.google.gson.annotations.SerializedName

data class RespuestaRickMorty(
    val info: Info,
    // Nombre original del Json
    @SerializedName("Results")
    val listaPersonajes: List<Personaje>
)