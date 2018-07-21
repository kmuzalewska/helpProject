package com.help.android.helpapptication

import android.app.Application

class StoreData : Application() {
    private lateinit var data : MutableList<Place>

    public fun getData(): MutableList<Place>{
        return data
    }

    public fun setData(sendData: MutableList<Place>){
        data = sendData
    }
}