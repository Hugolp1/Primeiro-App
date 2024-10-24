package com.example.primeiro_app.Data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.primeiro_app.models.Artista

@Database(entities = [Artista::class], version = 1, exportSchema = false)
abstract class ArtistaDatabase: RoomDatabase() {

    abstract fun artistaDao(): ArtistaDao

    companion object{

        @Volatile
        private var INSTANCE: ArtistaDatabase? = null

        fun getDatabase(context: Context): ArtistaDatabase {
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }

            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ArtistaDatabase::class.java,
                    "artista_table"
                ).build()

                INSTANCE = instance
                return instance

            }
        }
    }
}