package com.example.priya.daggersample

class SongWriter(var lyrics: Lyrics){

    init {
        this.lyrics = Lyrics()
    }
}