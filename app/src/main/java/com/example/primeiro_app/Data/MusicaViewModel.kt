package com.example.primeiro_app.Data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.primeiro_app.models.Musica
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MusicaViewModel(application: Application): AndroidViewModel(application) {
    val listaMusicas: LiveData<List<Musica>>
    private val repository: MusicaRepository

    init {
        val musicaDao = MusicaDatabase.getDatabase(application).musicaDao()
        repository = MusicaRepository(musicaDao)
        listaMusicas = repository.readAllData
    }

    fun addMusica(musica: Musica){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addMusica(musica)
        }
    }

    fun updateMusica(musica: Musica){
        viewModelScope.launch(Dispatchers.IO) {
            repository.updateMusica(musica)
        }
    }

    fun deleteMusica(musica: Musica){
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteMusica(musica)
        }
    }

}