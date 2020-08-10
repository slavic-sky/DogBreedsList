package com.example.dogbreedslist.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.dogbreedslist.data.BreedConverter
import com.example.dogbreedslist.data.network.dto.Breed

/**
 * The Room database for this app
 */
@Database(entities = [Breed::class],
        version = 1, exportSchema = false)
@TypeConverters(BreedConverter::class)
abstract class BreedsDatabase : RoomDatabase() {

    abstract fun breedDao(): BreedDao

    companion object {

        // For Singleton instantiation
        @Volatile
        private var instance: BreedsDatabase? = null

        fun getInstance(context: Context): BreedsDatabase {
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context).also { instance = it }
            }
        }

        private fun buildDatabase(context: Context): BreedsDatabase {
            return Room.databaseBuilder(context, BreedsDatabase::class.java, "dogbreeds-db")
                    .build()
        }
    }
}