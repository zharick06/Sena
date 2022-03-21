package com.zharick.layoutkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.zharick.layoutkotlin.actividades.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniciarComponentes()
    }

    private fun iniciarComponentes() {
        var btnlinear: Button = findViewById(R.id.LinearLayout)
        var btnyable: Button = findViewById(R.id.TableLayout)
        var btngrid: Button = findViewById(R.id.GridLayout)
        var btnrelative: Button = findViewById(R.id.RelativeLayout)
        var btnframe: Button = findViewById(R.id.FrameLayout)
        var btnscroll: Button = findViewById(R.id.ScrollLayout)
        var btnejemplo: Button = findViewById(R.id.Ejemplo)

        btnlinear.setOnClickListener { onClick( 1) }
        btnyable.setOnClickListener { onClick(2) }
        btngrid.setOnClickListener { onClick( 3) }
        btnrelative.setOnClickListener { onClick( 4) }
        btnframe.setOnClickListener { onClick( 5) }
        btnscroll.setOnClickListener { onClick( 6) }
        btnejemplo.setOnClickListener { onClick( 7) }
    }
     private fun onClick(numBoton: Int){
         when(numBoton){
             1 -> startActivity(Intent(this, LinearActivity::class.java))
             2 -> startActivity(Intent(this, TableActivity::class.java))
             3 -> startActivity(Intent(this, GridActivity::class.java))
             4 -> startActivity(Intent( this, RelativeActivity::class.java))
             5 -> startActivity(Intent( this, FrameActivity::class.java))
             6 -> startActivity(Intent( this,ScrollActivity::class.java))
             7 -> startActivity(Intent(this,EjemploActivity::class.java))

        }




    }
}