package com.example.priya.daggersample

import javax.inject.Inject

class Play @Inject constructor(var popSong: PopSong, var jazzSong: JazzSong){

    fun startSong(){
        popSong.startSong()
        jazzSong.startSong()

    }
    fun pauseSong() {
        popSong.pauseSong()
        jazzSong.pauseSong()
    }

    fun stopSong(){
        popSong.stopSong()
        jazzSong.stopSong()
    }


}