package com.example.myapplication

import android.icu.text.CaseMap
import androidx.room.Entity
import androidx.room.PrimaryKey

import  java.util.*

@Entity
data class Crime(@PrimaryKey val id :UUID = UUID.randomUUID(),  var Title: String? = null,
                 var Date: Date = Date(), var isSolved: Boolean = false, var RequiresPolice : Boolean = false,var suspect :String = " "
)
{

    constructor(id: UUID, title: String, date: Date, isSolved:Boolean,requiresPolice:Boolean):this(id){
        this.title = title
        this.date = date
        this.id = id
     this.isSolved=isSolved
      this._requiresPolice = requiresPolice
    }


    fun requiresPolice(): Boolean {
        return _requiresPolice
    }
}