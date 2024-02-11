package net.iessochoa.hectormanuelgelardosabater.practica6.utils

import android.widget.ImageView
import com.bumptech.glide.Glide
import net.iessochoa.hectormanuelgelardosabater.practica6.R

fun cargaImagen(ivImagen: ImageView, uri:String) {
    Glide
        .with(ivImagen.getContext())
//url de la imagen
        .load(uri)
//centramos la imagen
// .centerCrop()
//mientras se carga la imagen que imagen queremos mostrar
//crea los iconos de placeholder y error
        .placeholder(android.R.drawable.stat_sys_download_done)
//Imagen que mostramos si hay error
        .error(android.R.drawable.stat_notify_error)
//donde colocamos la imagen
        .into(ivImagen);
}