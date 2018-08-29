package com.example.priya.daggersample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val songLyrics = Lyrics()
        val songWriter = SongWriter(songLyrics)

        val popSong = PopSong()
        val jazzSong = JazzSong()

        val play = Play(popSong, jazzSong)
        play.startSong()
        play.pauseSong()
        play.stopSong()
    }

}
