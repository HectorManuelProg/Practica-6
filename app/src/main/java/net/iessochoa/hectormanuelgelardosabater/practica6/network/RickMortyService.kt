package net.iessochoa.hectormanuelgelardosabater.practica6.network

import net.iessochoa.hectormanuelgelardosabater.practica6.model.RespuestaRickMorty
//import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url
import retrofit2.Response

interface RickMortyService {
//Llamada con parámetros al endpoint "character"
//En nuestro caso tenemos un parámetro que es el número de la página
    //Esta es la opción que utilizaremos
    @GET("character")
    suspend fun listaPersonajes(
        @Query("page") page:Int
    ): Response<RespuestaRickMorty>
    //Llamada al servicio sin parámetros
    @GET("character")
    suspend fun listaPersonajes():Response<RespuestaRickMorty>
    //Llamada al servicio directamente con la uri
    @GET
    suspend fun listaPersonajes(
        @Url
        siguientes:String):Response<RespuestaRickMorty>
}