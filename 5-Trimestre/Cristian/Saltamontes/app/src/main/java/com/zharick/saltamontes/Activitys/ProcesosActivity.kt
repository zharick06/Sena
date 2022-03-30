package com.zharick.saltamontes.Activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.zharick.saltamontes.Estudiante
import com.zharick.saltamontes.Operaciones
import com.zharick.saltamontes.R
import java.lang.NumberFormatException
import android.content.Intent as Intent


class ProcesosActivity : AppCompatActivity() {
    var campNombre:EditText?=null
    var campDocumento:EditText?=null
    var campEdad:EditText?=null
    var campTelefono:EditText?=null
    var campDireccion:EditText?=null
    var campMateria1:EditText?=null
    var campMateria2:EditText?=null
    var campMateria3:EditText?=null
    var campMateria4:EditText?=null
    var campMateria5:EditText?=null
    var campNota1:EditText?=null
    var campNota2:EditText?=null
    var campNota3:EditText?=null
    var campNota4:EditText?=null
    var campNota5:EditText?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_procesos)
        iniciarComponentes()



    }
    private fun iniciarComponentes(){
        campNombre=findViewById(R.id.Nombre)
        campDocumento=findViewById(R.id.Documento)
        campEdad=findViewById(R.id.Edad)
        campTelefono=findViewById(R.id.Telefono)
        campDireccion=findViewById(R.id.Direccion)
        campMateria1=findViewById(R.id.Materia1)
        campMateria2=findViewById(R.id.Materia2)
        campMateria3=findViewById(R.id.Materia3)
        campMateria4=findViewById(R.id.Materia4)
        campMateria5=findViewById(R.id.Materia5)
        campNota1=findViewById(R.id.Nota1)
        campNota2=findViewById(R.id.Nota2)
        campNota3=findViewById(R.id.Nota3)
        campNota4=findViewById(R.id.Nota4)
        campNota5=findViewById(R.id.Nota5)
        val miBoton: Button = findViewById(R.id.registrar)
        miBoton.setOnClickListener{onClick(1)}



    }


    private fun onClick(Boton: Int) {
        try {
            var est: Estudiante = Estudiante()
            est.documento = campDocumento?.text.toString()
            est.nombre = campNombre?.text.toString()
            est.edad = campEdad?.text.toString().toInt()
            est.telefono = campTelefono?.text.toString()
            est.direccion = campDireccion?.text.toString()

            est.materia1 = campMateria1?.text.toString()
            est.materia2 = campMateria2?.text.toString()
            est.materia3 = campMateria3?.text.toString()
            est.materia4 = campMateria4?.text.toString()
            est.materia5 = campMateria5?.text.toString()

            est.nota1 = campNota1?.text.toString().toDouble()
            est.nota2 = campNota2?.text.toString().toDouble()
            est.nota3 = campNota3?.text.toString().toDouble()
            est.nota4 = campNota4?.text.toString().toDouble()
            est.nota5 = campNota5?.text.toString().toDouble()

            est.promedio = Operaciones.calcularPromedio(est)
            println(est.promedio)
            if (est.documento!="" && est.nombre!="" && est.materia1!="" && est.materia2!="" && est.materia3!="" && est.materia4!="" && est.materia5!="") {
                Operaciones.registrarEstudiante(est)
            }
            Operaciones.imprimirListaEstudiantes()




            if(est.nota1 >5 || est.nota2>5 || est.nota3>5 || est.nota4>5 || est.nota5>5){
                Toast.makeText(this, "Las notas no pueden ser mayores a 5", Toast.LENGTH_LONG).show()
            }else if(est.nota1 <0 || est.nota2<0 || est.nota3<0 || est.nota4<0 || est.nota5<0) {
                Toast.makeText(this, "Las notas no pueden ser negativos", Toast.LENGTH_LONG).show()
            }else if (est.nombre.isNullOrBlank() || est.documento.isNullOrBlank() || est.telefono.isNullOrBlank() || est.direccion.isNullOrBlank() ||
                est.materia1.isNullOrBlank() || est.materia2.isNullOrBlank() || est.materia3.isNullOrBlank() || est.materia4.isNullOrBlank() || est.materia5.isNullOrBlank()){
                Toast.makeText(this, "rellene los campos", Toast.LENGTH_LONG).show()
            }else {
                var mensajes = ""
                if (est.promedio >= 3.5) {
                    mensajes = "Usted ganó el periodo"
                } else if (est.promedio > 2.5 && est.promedio < 3.5) {
                    mensajes = "Usted perdió el periodo pero puede recuperar"
                } else {
                    mensajes = "Usted perdió el periodo"
                }
                est.resultado=mensajes
                when (Boton) {
                    1 -> {
                        val intent = Intent(this, ResgistroActivity::class.java)
                        var miBundle: Bundle = Bundle()
                        miBundle.putString("Nombre", est.nombre)
                        miBundle.putString("Documento", est.documento)

                        miBundle.putInt("Edad", est.edad)
                        miBundle.putString("Telefono", est.telefono)
                        miBundle.putString("Direccion", est.direccion)
                        miBundle.putString("Materia1", est.materia1)
                        miBundle.putString("Materia2", est.materia2)
                        miBundle.putString("Materia3", est.materia3)
                        miBundle.putString("Materia4", est.materia4)
                        miBundle.putString("Materia5", est.materia5)
                        miBundle.putDouble("Nota1", est.nota1)
                        miBundle.putDouble("Nota2", est.nota2)
                        miBundle.putDouble("Nota3", est.nota3)
                        miBundle.putDouble("Nota4", est.nota4)
                        miBundle.putDouble("Nota5", est.nota5)
                        miBundle.putDouble("Promedio", est.promedio)
                        miBundle.putString("Mensaje", mensajes)

                        intent.putExtras(miBundle)
                        startActivity(intent)

                    }
                }
            }
        }catch (e: NumberFormatException){
            Toast.makeText(this, "rellene los campos", Toast.LENGTH_LONG).show()
        }
    }
}



