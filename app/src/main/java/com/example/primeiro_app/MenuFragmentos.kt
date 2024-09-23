package com.example.primeiro_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.primeiro_app.fragments.ListaArtistasFragment
import com.example.primeiro_app.fragments.ListaMusicasFragment
import com.example.primeiro_app.fragments.PerfilFragment

class MenuFragmentos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu_fragmentos)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets



        }

        if(savedInstanceState == null)
        {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView3, ListaMusicasFragment())
                .commit()
        }

        val bundle = intent.extras
        var nomePessoa = bundle?.getString("nomePessoa") ?: "sem nome"
        val fragmento = PerfilFragment()

        val bundle2 = bundleOf("nome" to nomePessoa)

        fragmento.arguments = bundle2


        findViewById<Button>(R.id.btnMusicas).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView3, ListaMusicasFragment())
                .addToBackStack(null)
                .commit()
        }

        findViewById<Button>(R.id.btnPerfil).setOnClickListener {

            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView3, fragmento)
                .addToBackStack(null)
                .commit()
        }

        findViewById<Button>(R.id.btnArtistas).setOnClickListener {

            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView3, ListaArtistasFragment())
                .addToBackStack(null)
                .commit()
        }


    }
}