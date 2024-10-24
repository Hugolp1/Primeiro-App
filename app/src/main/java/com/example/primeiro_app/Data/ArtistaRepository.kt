package com.example.primeiro_app.Data

import androidx.lifecycle.LiveData
import com.example.primeiro_app.models.Artista

class ArtistaRepository(private val artistaDao: ArtistaDao) {
    val readAllData: LiveData<List<Artista>> = artistaDao.listarArtistasEmOrdem()

    suspend fun addArtista(artista: Artista){
        artistaDao.addArtista(artista)
    }

    suspend fun updateArtista(artista: Artista){
        artistaDao.atualizarArtista(artista)
    }

    suspend fun deleteArtista(artista: Artista){
        artistaDao.deletarArtista(artista)
    }
}