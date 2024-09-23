package com.example.primeiro_app.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.primeiro_app.R
import com.example.primeiro_app.adapters.ArtistaAdapter
import com.example.primeiro_app.models.Artista

class ListaArtistasFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    private val listaDeArtistas = listOf(
        Artista("Queen", R.drawable.spotify_logo),
        Artista("The Beatles", R.drawable.spotify_logo),
        Artista("Michael Jackson", R.drawable.spotify_logo),
        Artista("Madonna", R.drawable.spotify_logo),
        Artista("Led Zeppelin", R.drawable.spotify_logo),
        Artista("Elvis Presley", R.drawable.spotify_logo),
        Artista("Pink Floyd", R.drawable.spotify_logo),
        Artista("David Bowie", R.drawable.spotify_logo)
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_lista_artistas, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewArtistas)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = ArtistaAdapter(listaDeArtistas)

        return view
    }


}