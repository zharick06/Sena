package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciar()
    }
    /**
     * You can edit, run, and share this code.
     * play.kotlinlang.org
     */
    fun iniciar() {
        var a:Int
        var b:Int
        var c:Int

        c=8
        a=2
        b=-2
        c = (a*b)+2
        a = a-2 + b * ( b + 3 )-c
        b = c
        println(c)
    }

}