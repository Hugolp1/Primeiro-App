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
            Musica("Stairway to Heaven", "Led Zeppelin", "08:02", R.drawable.spotify_logo),
            Musica("Hotel California", "Eagles", "06:30", R.drawable.spotify_logo),
            Musica("Hey Jude", "The Beatles", "07:11", R.drawable.spotify_logo),
            Musica("Smells Like Teen Spirit", "Nirvana", "05:01", R.drawable.spotify_logo),
            Musica("Sweet Child O' Mine", "Guns N' Roses", "05:56", R.drawable.spotify_logo),
            Musica("Billie Jean", "Michael Jackson", "04:54", R.drawable.spotify_logo),
            Musica("Wonderwall", "Oasis", "04:18", R.drawable.spotify_logo),
            Musica("Purple Haze", "Jimi Hendrix", "02:51", R.drawable.spotify_logo),
            Musica("Thriller", "Michael Jackson", "05:57", R.drawable.spotify_logo),
            Musica("Like a Rolling Stone", "Bob Dylan", "06:13", R.drawable.spotify_logo)
        )

        recyclerView.adapter = MusicaAdapter(minhaListaDeMusicas)
    }
}
