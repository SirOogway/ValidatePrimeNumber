package com.innova.validateprimenumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etEnterNumber: EditText = findViewById(R.id.etEnterNumber)
        val btnValidate: Button = findViewById(R.id.btnValidate)

        btnValidate.setOnClickListener {
            val number: Int = etEnterNumber.text.toString().toInt()

            if (isPrimeNumber(number)) println("Es primo")
            else println("No es primo")

        }
    }

    fun isPrimeNumber(number: Int): Boolean {
        val dividers: Int = Math.floorDiv(number, 2)
//print(dividers)
//    if (dividers >= 2) {
        for (divider in 2..dividers) {
            if (number % divider == 0) return false
        }
//    }
        return true
    }

}