package com.example.primeiro_app.Data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.primeiro_app.models.Musica

@Database(entities = [Musica::class], version = 1, exportSchema = false)
abstract class MusicaDatabase: RoomDatabase() {

    abstract fun musicaDao(): MusicaDao

    companion object{

        @Volatile
        private var INSTANCE: MusicaDatabase? = null

        fun getDatabase(context: Context): MusicaDatabase {
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }

            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MusicaDatabase::class.java,
                    "musica_table"
                ).build()

                INSTANCE = instance
                return instance

            }
        }
    }
}