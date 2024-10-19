package com.example.primeiro_app.Data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.primeiro_app.models.Musica

@Dao
interface MusicaDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addMusica(musica: Musica)

    @Update
    fun atualizarMusica(musica: Musica)

    @Delete
    fun deletarMusica(musica: Musica)

    @Query("SELECT * FROM musica_table")
    fun listarMusicas() : LiveData<List<Musica>>

    @Query("SELECT * FROM musica_table ORDER BY titulo ASC")
    fun listarMusicasEmOrdem() : LiveData<List<Musica>>

}