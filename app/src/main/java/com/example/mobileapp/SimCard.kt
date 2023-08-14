package com.example.mobileapp

import android.util.Log


class SimCard(private val serviceProvider: ServiceProvider) {

init {
    Log.i("TAGY","Sim Card Created")
}
    fun connectToNetwork(){
        serviceProvider.getServiceProvider()
    }


}