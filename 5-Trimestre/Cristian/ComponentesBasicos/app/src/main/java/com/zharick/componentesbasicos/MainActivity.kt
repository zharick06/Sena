package com.zharick.componentesbasicos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Click(view: View) {
        val nombre:EditText=findViewById(R.id.editTextNomApe)

        val telefono:EditText=findViewById(R.id.editTextTelefono)
        val email:EditText=findViewById(R.id.editTextEmail)
        var chequeado:String=""
        var genero:String= ""
        if (view is RadioButton) {

            val checked = view.isChecked
            when (view.getId()) {
                R.id.RBMasculino ->
                    if (checked) {
                        genero="Masculino"
                    }
                R.id.RBFemenino ->
                    if (checked) {
                        genero="Femenino"
                    }
            }}
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked

            when (view.id) {
                R.id.checkBoxProgramacion -> {
                    if (checked) {chequeado="Programacion"}}
                R.id.checkBoxVideoJ-> {
                    if (checked) {chequeado+="\n Video Juegos" } }
                R.id.checkBoxBaseD-> {
                    if (checked) {chequeado+=",\n Base de Datos" } }
                R.id.checkBoxRedes-> {
                    if (checked) {chequeado+=",\n Redes sociales" } }
            }
        }


        var mensaje: String="Nombre: ${nombre.text.toString()}" +
                "Telefono Celular: ${telefono.text.toString()} " +
                "Coreeo Electronico: ${email.text.toString()}" +
                "Genero: $genero" +
                "Temas de Interes: $chequeado"








        val toggle: ToggleButton = findViewById(R.id.toggleButton)
        toggle.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText( this, mensaje, Toast.LENGTH_SHORT).show()

            }
        }
        Toast.makeText( this, "Contacto Almacenado", Toast.LENGTH_SHORT).show()


    }


}