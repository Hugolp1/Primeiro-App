package com.example.primeiro_app.models

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "musica_table")
data class Musica(
    @PrimaryKey(autoGenerate = true) // autoincrement
    val id: Int,
    val titulo: String,
    val artista: String,
    val duracao: String,
    val imagem: String
): Parcelable

