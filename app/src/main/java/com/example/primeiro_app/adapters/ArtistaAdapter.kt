package com.example.primeiro_app.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.primeiro_app.R
import com.example.primeiro_app.models.Artista

class ArtistaAdapter(private val listaArtistas: List<Artista>) :
    RecyclerView.Adapter<ArtistaAdapter.ArtistaViewHolder>() {

    class ArtistaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nomeArtista: TextView = itemView.findViewById(R.id.textViewNomeArtista)
        val imagemArtista: ImageView = itemView.findViewById(R.id.imageViewArtista)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistaViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_artistas, parent, false)
        return ArtistaViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ArtistaViewHolder, position: Int) {
        val artista = listaArtistas[position]
        holder.nomeArtista.text = artista.nome
        holder.imagemArtista.setImageResource(artista.imagemResId)
    }

    override fun getItemCount() = listaArtistas.size
}
