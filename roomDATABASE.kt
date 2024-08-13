package com.onurgunes.databasekotlin.RoomDb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


import kotlin.concurrent.Volatile

@Database(entities =  [roomDATABASE::class], version = 1)
abstract class roomDATABASE : RoomDatabase (){
    abstract fun  roomDAO () : dbDAO


    companion object {

        @Volatile
        private var instance : roomDATABASE? = null

        private val lock =  Any()

        operator fun invoke (context: Context) = instance ?: synchronized(lock){
            instance ?: createDataBase(context).also {
                instance = it
            }

        }

        private fun createDataBase (context: Context) = Room.databaseBuilder(
            context.applicationContext,
            roomDATABASE::class.java,
            "besindatabase").build()


    }

}


