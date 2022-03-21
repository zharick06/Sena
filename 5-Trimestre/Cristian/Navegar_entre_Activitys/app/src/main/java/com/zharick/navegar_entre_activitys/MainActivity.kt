package com.zharick.navegar_entre_activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    var campoTexto:EditText?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        campoTexto=findViewById(R.id.editTextNombre)

        val miBoton: Button =findViewById(R.id.buttonIngresar)
        miBoton.setOnClickListener{onClick( 1)}


    }

    private fun onClick(boton: Int) {
        when(boton){

            1 ->{
                val intent=Intent(this, ActivityMensaje::class.java)
                val miBundle:Bundle= Bundle()
                miBundle.putString("Nombre",campoTexto!!.text.toString())
                intent.putExtras(miBundle)
                startActivity(intent)
            }
        }




    }
}