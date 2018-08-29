package com.example.priya.daggersample

import android.util.Log
import javax.inject.Inject

class JazzSong @Inject constructor() : Song{

    @Inject
    lateinit var songWriter: SongWriter
    lateinit var songLyrics : Lyrics

    override fun startSong() {
        Log.d(this.javaClass.name,"Started Song")
    }

    override fun stopSong() {
        Log.d(this.javaClass.name,"Stopped Song")
    }

    override fun pauseSong() {
        Log.d(this.javaClass.name,"Paused Song")
    }
}