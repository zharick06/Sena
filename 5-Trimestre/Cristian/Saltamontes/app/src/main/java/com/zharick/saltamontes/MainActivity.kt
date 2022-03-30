package com.zharick.saltamontes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.zharick.saltamontes.Activitys.AyudaActivity
import com.zharick.saltamontes.Activitys.EstadisticasActivity
import com.zharick.saltamontes.Activitys.ProcesosActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val miBoton1:Button=findViewById(R.id.btnRegistrar)
        val miBoton2:Button=findViewById(R.id.btnEstadisticas)
        val miBoton3:Button=findViewById(R.id.btnAyuda)

        miBoton1.setOnClickListener{onClick(1)}
        miBoton2.setOnClickListener{onClick(2)}
        miBoton3.setOnClickListener{onClick(3)}

    }

    private fun onClick(boton: Int) {
        when (boton){
            1 -> startActivity(Intent(this, ProcesosActivity::class.java))
            2 -> startActivity(Intent(this, EstadisticasActivity::class.java))
            3 -> startActivity(Intent(this, AyudaActivity::class.java))
        }


    }
}