package com.onurgunes.databasekotlin.RoomDb

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.RoomDatabase
import com.onurgunes.databasekotlin.Model.KotlinDataClass
import java.util.UUID

interface dbDAO {

     @Insert
     suspend fun insertALL(kotlinDataClass: KotlinDataClass) : List<Long>


    @Query("SELECT * FROM KOTLINDATACLASS WHERE uuid = :idNumber")
    suspend fun getOne(vararg idNumber: IntArray) : List<KotlinDataClass>


    @Query("SELECT * FROM KOTLINDATACLASS")
    suspend fun selectAll () : List<KotlinDataClass>

    @Query("DELETE FROM KotlinDataClass")
    suspend fun deleteALL ()


}