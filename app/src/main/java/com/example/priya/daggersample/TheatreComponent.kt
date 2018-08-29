package com.example.priya.daggersample

import dagger.Component

@Component
interface TheatreComponent{
    fun getPlay() : Play
}