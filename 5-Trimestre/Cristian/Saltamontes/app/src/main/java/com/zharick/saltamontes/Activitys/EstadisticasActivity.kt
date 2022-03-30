package com.zharick.saltamontes.Activitys

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.zharick.saltamontes.Operaciones
import com.zharick.saltamontes.R

class EstadisticasActivity : AppCompatActivity() {
    var procesados: TextView?=null
    var ganan: TextView?=null
    var pierden: TextView?=null
    var recuperan: TextView?=null
    var lista= Operaciones.listaEstudiantes


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estadisticas)
        iniciarComponentes()



    }

    private fun iniciarComponentes(){

        var cantidadTotal=lista.size
        var cantidadGanados:Int=totalGanadores()
        var cantidadPerdedores:Int=totalPerdedores()
        var cantidadRecuperacion:Int=totalRecuperacion()

        procesados=findViewById(R.id.textCantProcesados)
        ganan=findViewById(R.id.textCantGanan)
        pierden=findViewById(R.id.textCantPierden)
        recuperan=findViewById(R.id.textCantRecuperan)

        procesados?.text= "$cantidadTotal"
        ganan?.text="$cantidadGanados"
        pierden?.text="$cantidadPerdedores"
        recuperan?.text="$cantidadRecuperacion"

    }

    private fun totalRecuperacion(): Int {
        var cantidad=0
        for (est in lista){
            if (est.resultado.equals("Usted perdió el periodo pero puede recuperar")){
                cantidad=+1
            }
        }

        return cantidad
    }

    private fun totalPerdedores(): Int {
        var cantidad=0
        for (est in lista){

            if (est.resultado.equals("Usted perdió el periodo")){
                cantidad=+1
            }
        }

        return cantidad
    }

    private fun totalGanadores(): Int {
        var cantidad=0
        for (est in lista){
            if (est.resultado.equals("Usted ganó el periodo")){
                cantidad=cantidad+1
            }
        }

        return cantidad
    }}
