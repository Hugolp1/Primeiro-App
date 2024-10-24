package com.example.primeiro_app.Data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.primeiro_app.models.Artista
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ArtistaViewModel(application: Application): AndroidViewModel(application) {
    val listaArtistas: LiveData<List<Artista>>
    private val repository: ArtistaRepository

    init {
        val artistaDao = ArtistaDatabase.getDatabase(application).artistaDao()
        repository = ArtistaRepository(artistaDao)
        listaArtistas = repository.readAllData
    }

    fun addArtista(artista: Artista){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addArtista(artista)
        }
    }

    fun updateArtista(artista: Artista){
        viewModelScope.launch(Dispatchers.IO) {
            repository.updateArtista(artista)
        }
    }

    fun deleteArtista(artista: Artista){
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteArtista(artista)
        }
    }

}