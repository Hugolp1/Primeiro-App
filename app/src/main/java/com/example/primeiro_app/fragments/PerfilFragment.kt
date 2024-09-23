package com.example.primeiro_app.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.primeiro_app.R

class PerfilFragment : Fragment() {

    private var txtNome : String? = null
    private lateinit var txtPerfil : TextView
    private lateinit var btnLogout : Button

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
        txtPerfil = view.findViewById(R.id.txtPerfil)
        txtPerfil.text = txtNome
        val imageViewPerfil = view.findViewById<ImageView>(R.id.imageView4)


        imageViewPerfil.setImageResource(R.drawable.images)

        btnLogout.setOnClickListener{
            activity?.finish()
        }

        return view
    }




}