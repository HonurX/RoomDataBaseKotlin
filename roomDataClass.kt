package com.onurgunes.databasekotlin.RoomDb

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class roomDataClass (
    @ColumnInfo(name =  "ISIM")
    val isim : String,

    @ColumnInfo(name = "SOYISIM")
    val soyisim : String,

    @ColumnInfo(name = "DOGUMTARIHI")
    val dogumtarihi : String,

    @ColumnInfo(name = "ADRES")
    val adres : String,

){
    @PrimaryKey(autoGenerate = true)
    var uuid : Int = 0
}