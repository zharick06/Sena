package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.InputDevice
import androidx.cardview.widget.CardView
import android.view.View
import android.content.Context
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.fragment.app.Fragment
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_sum:Button = findViewById(R.id.button_sum)

        btn_sum.setOnClickListener {
            showInfo()
            hideKeyboard()
        }

    }

    override fun onStart() {
        super.onStart()
    }

    fun showInfo() {
        val cardMessage = findViewById<CardView>(R.id.cardMessage)
        goneCardMessage(cardMessage)
        val location:EditText = findViewById(R.id.location)
        val phone:EditText = findViewById(R.id.phone)
        val email:EditText = findViewById(R.id.email)
        val document:EditText = findViewById(R.id.document)
        val age:EditText = findViewById(R.id.age)
        val textMessage = findViewById<TextView>(R.id.cardText)

        val result = calcResultAge(age.text.toString().toInt())
        var message = """Ubicaion: ${location.text.toString()}
Telefono: ${phone.text.toString()}
Email: ${email.text.toString()} 
Documento: ${document.text.toString()}

Segun la edad ingresada el usuario es ${result}"""
        textMessage.text = message
        cardMessage.setVisibility(View.VISIBLE);
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    fun calcResultAge(age:Int): String {
        val result = when(age) {
            in 0..15 -> "Infante"
            in 15..18 -> "Adolecente"
            in 18..65 -> "Adulto"
            else -> "Adulto mayor"
        }
        return result
    }

    fun goneCardMessage(card:CardView) {
        card.setOnClickListener {
            card.setVisibility(View.GONE)
        }
    }

    fun AppCompatActivity.hideKeyboard() {
        val view = this.currentFocus
        if (view != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)
    }

    fun Fragment.hideKeyboard() {
        val activity = this.activity
        if (activity is AppCompatActivity) {
            activity.hideKeyboard()
        }
    }
}