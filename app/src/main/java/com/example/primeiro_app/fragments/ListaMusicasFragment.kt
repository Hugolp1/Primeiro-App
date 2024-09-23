package com.example.primeiro_app.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.primeiro_app.R
import com.example.primeiro_app.adapters.MusicaAdapter
import com.example.primeiro_app.models.Musica

class ListaMusicasFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_lista_musicas, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)

        val minhaListaDeMusicas = listOf(
            Musica("Bohemian Rhapsody", "Queen", "05:55", R.drawable.spotify_logo),
            Musica("Imagine", "John Lennon", "03:07", R.drawable.spotify_logo),
            Musica("Stairway to Heaven", "Led Zeppelin", "08:02", R.drawable.spotify_logo)
        )

        recyclerView.adapter = MusicaAdapter(minhaListaDeMusicas)
    }
}
