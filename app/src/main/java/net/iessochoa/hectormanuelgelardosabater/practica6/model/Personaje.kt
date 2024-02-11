package net.iessochoa.hectormanuelgelardosabater.practica6.model

import java.util.Date

data class Personaje(
    val created: Date,
    val gender: String,
    val id: Int,
    val image: String,
    val name: String,
    val species: String,
    val status: String,
    val type: String,
    /*val episode: List<String>,
    val location: Location,
    val origin: Origin,
    val url: String*/
)