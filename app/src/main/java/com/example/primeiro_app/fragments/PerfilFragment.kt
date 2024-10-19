package com.example.primeiro_app.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.primeiro_app.Data.MusicaViewModel
import com.example.primeiro_app.R
import com.example.primeiro_app.models.Musica
import com.google.android.material.textfield.TextInputEditText

class PerfilFragment : Fragment() {

    lateinit var musicaViewModel: MusicaViewModel

    private var txtNome : String? = null
    private lateinit var txtPerfil : TextView
    private lateinit var btnLogout : Button
    private lateinit var btnAdicionarMusica : Button
    private lateinit var txtInputMusica : TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        txtNome = arguments?.getString("nome")
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_perfil, container, false)

        btnLogout = view.findViewById<Button>(R.id.btnLogout)
        btnAdicionarMusica = view.findViewById<Button>(R.id.btnAdicionarMusica)
        txtPerfil = view.findViewById(R.id.txtPerfil)
        txtInputMusica = view.findViewById(R.id.txtInputMusica)
        txtPerfil.text = txtNome
        val imageViewPerfil = view.findViewById<ImageView>(R.id.imageView4)

        musicaViewModel = ViewModelProvider(this).get(MusicaViewModel::class.java)


        imageViewPerfil.setImageResource(R.drawable.images)

        btnAdicionarMusica.setOnClickListener {
            musicaViewModel.addMusica(Musica(0, "$txtInputMusica", "artista 1", "02:30", "R.drawable.spotify_logo"))

        }

        btnLogout.setOnClickListener{
            activity?.finish()
        }

        return view
    }




}