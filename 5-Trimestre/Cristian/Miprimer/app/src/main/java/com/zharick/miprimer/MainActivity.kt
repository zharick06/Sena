package com.zharick.miprimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val miBoton:Button =findViewById(R.id.buttonIngresar)
        miBoton.setOnClickListener{OnClick()}


    }
    private fun OnClick(){

        val documento:EditText=findViewById(R.id.editTextDocumento)
        val nombre:EditText =findViewById(R.id.editTextNombre)
        val direccion:EditText=findViewById(R.id.editTextDireccion)
        val email:EditText=findViewById(R.id.editTextEmail)
        val telefono:EditText=findViewById(R.id.editTextDireccion)
        val edad:EditText=findViewById(R.id.editTextEdad)
        var result=(CalcularEdad(edad.text.toString().toInt()))
        var mensaje="""Bienvenido ${nombre.text.toString()}
            | Documento es: ${documento.text.toString()}
            | Direccion es: ${direccion.text.toString()}
            | E-mail es: ${email.text.toString()}
            | Telefono es: ${telefono.text.toString()}
            | Edad es: ${edad.text.toString()} y usted es $result
        """.trimMargin()


        var contenedor:TextView=findViewById(R.id.textContenedor)
        contenedor.text= mensaje

        Toast.makeText( this, "Usted es: ${result} ", Toast.LENGTH_LONG).show()

    }
    fun CalcularEdad(edad:Int):String{
        val result = when(edad) {
            in 0..15 -> "Infante"
            in 15..18 -> "Adolecente"
            in 18..65 -> "Adulto"
            else -> "Adulto mayor"
        }
        return result
    }

}