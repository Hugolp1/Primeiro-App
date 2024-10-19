package com.example.primeiro_app.Data

import androidx.lifecycle.LiveData
import com.example.primeiro_app.models.Musica

class MusicaRepository(private val musicaDao: MusicaDao) {
    val readAllData: LiveData<List<Musica>> = musicaDao.listarMusicasEmOrdem()

    suspend fun addMusica(musica: Musica){
        musicaDao.addMusica(musica)
    }

    suspend fun updateMusica(musica: Musica){
        musicaDao.atualizarMusica(musica)
    }

    suspend fun deleteMusica(musica: Musica){
        musicaDao.deletarMusica(musica)
    }

}