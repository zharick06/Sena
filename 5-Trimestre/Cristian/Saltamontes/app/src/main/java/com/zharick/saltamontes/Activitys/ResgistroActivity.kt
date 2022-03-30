package com.zharick.saltamontes.Activitys

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.zharick.saltamontes.R

class ResgistroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resgistro)


        val campoNombre: TextView = findViewById(R.id.mostrarNombre)
        val campoDocumento: TextView= findViewById(R.id.mostrarDocumento)
        val campoEdad: TextView= findViewById(R.id.mostrarEdad)
        val campoTelefono: TextView= findViewById(R.id.mostrarTelefono)
        val campoDireccion: TextView= findViewById(R.id.mostrarDireccion)
        val campoMateria1: TextView= findViewById(R.id.mostrarMateria1)
        val campoMateria2: TextView= findViewById(R.id.mostrarMateria2)
        val campoMateria3: TextView= findViewById(R.id.mostrarMateria3)
        val campoMateria4: TextView= findViewById(R.id.mostrarMateria4)
        val campoMateria5: TextView= findViewById(R.id.mostrarMateria5)
        val campoNota1: TextView= findViewById(R.id.mostrarNota1)
        val campoNota2: TextView= findViewById(R.id.mostrarNota2)
        val campoNota3: TextView= findViewById(R.id.mostrarNota3)
        val campoNota4: TextView= findViewById(R.id.mostrarNota4)
        val campoNota5: TextView= findViewById(R.id.mostrarNota5)
        val campoPromedio: TextView= findViewById(R.id.mostrarPromedio)
        val campoResultado: TextView= findViewById(R.id.mostrarResultado)


        var miBundle: Bundle? = this.intent.extras
        if(miBundle != null){
            campoNombre.text="Nombre: ${miBundle.getString("Nombre")} "
            campoDocumento.text="Documento: ${miBundle.getString("Documento")} "
            campoEdad.text="Edad: ${miBundle.getInt("Edad")} "
            campoTelefono.text="Telefono: ${miBundle.getInt("Telefono")} "
            campoDireccion.text="Direccion: ${miBundle.getString("Direccion")} "
            campoMateria1.text="${miBundle.getString("Materia1")} "
            campoMateria2.text="${miBundle.getString("Materia2")} "
            campoMateria3.text="${miBundle.getString("Materia3")} "
            campoMateria4.text="${miBundle.getString("Materia4")} "
            campoMateria5.text="${miBundle.getString("Materia5")} "
            campoNota1.text="${miBundle.getDouble("Nota1")} "
            campoNota2.text="${miBundle.getDouble("Nota2")} "
            campoNota3.text="${miBundle.getDouble("Nota3")} "
            campoNota4.text="${miBundle.getDouble("Nota4")} "
            campoNota5.text="${miBundle.getDouble("Nota5")} "
            campoPromedio.text="Promedio: ${miBundle.getDouble("Promedio")} "
            campoResultado.text="Resultado Final: ${miBundle.getString("Mensaje")} "
        }else{
            Toast.makeText(this, "Los datos están vacios", Toast.LENGTH_LONG).show()
        }


    }
}
