package com.example.primeiro_app.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.primeiro_app.R
import com.example.primeiro_app.models.Musica

class MusicaAdapter(
    private val musicas: List<Musica>
) : RecyclerView.Adapter<MusicaAdapter.MusicaViewHolder>() {

    inner class MusicaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titulo: TextView = itemView.findViewById(R.id.textTitulo)
        val artista: TextView = itemView.findViewById(R.id.textNomeArtista)
        val duracao: TextView = itemView.findViewById(R.id.textDuracao)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_musica, parent, false)
        return MusicaViewHolder(view)
    }

    override fun onBindViewHolder(holder: MusicaViewHolder, position: Int) {
        val musica = musicas[position]
        holder.titulo.text = musica.titulo
        holder.artista.text = musica.artista
        holder.duracao.text = musica.duracao
    }

    override fun getItemCount() : Int {
        return musicas.size
    }
}