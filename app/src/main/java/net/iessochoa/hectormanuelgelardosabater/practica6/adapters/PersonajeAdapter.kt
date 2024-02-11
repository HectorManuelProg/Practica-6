package net.iessochoa.hectormanuelgelardosabater.practica6.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import net.iessochoa.hectormanuelgelardosabater.practica6.model.Personaje
import net.iessochoa.hectormanuelgelardosabater.practica6.utils.cargaImagen

class PersonajeAdapter (private val listaTareas: List<Personaje>)
    :RecyclerView.Adapter<PersonajeAdapter.PersonajeViewHolder>() {
    inner class PersonajeViewHolder(val binding: ItemPersonajeBinding) :
        RecyclerView.ViewHolder(binding.root) {


    }
    override fun onCreateViewHolder(
        parent: ViewGroup, viewType:
        Int
    ): PersonajeViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(
        holder: PersonajeViewHolder,
        position: Int
    ) {
        cargaImagen(binding.ivAvatar, personaje.image)
        TODO("Not yet implemented")
    }
}

class ItemPersonajeBinding {

}
