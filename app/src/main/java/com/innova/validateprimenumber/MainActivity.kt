package com.innova.validateprimenumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.innova.validateprimenumber.extensions.isPrimeNumber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etEnterNumber: EditText = findViewById(R.id.etEnterNumber)
        val btnValidate: Button = findViewById(R.id.btnValidate)
        val tvResult: TextView = findViewById(R.id.tvResult)

        btnValidate.setOnClickListener {
            try {
                val number = etEnterNumber.text.toString().toInt()
                tvResult.text = if (number.isPrimeNumber()) "Es primo"
                else "No es primo"
            } catch (e: Exception) {
                Toast.makeText(this, "Ingrese algun valor", Toast.LENGTH_SHORT).show()
            }
        }

    }
}