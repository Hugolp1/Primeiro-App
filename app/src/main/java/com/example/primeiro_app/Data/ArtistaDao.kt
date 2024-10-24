package com.example.primeiro_app.Data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.primeiro_app.models.Artista

@Dao
interface ArtistaDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addArtista(artista: Artista)

    @Update
    fun atualizarArtista(artista: Artista)

    @Delete
    fun deletarArtista(artista: Artista)

    @Query("SELECT * FROM artista_table")
    fun listarArtistas() : LiveData<List<Artista>>

    @Query("SELECT * FROM artista_table ORDER BY nome ASC")
    fun listarArtistasEmOrdem() : LiveData<List<Artista>>

}