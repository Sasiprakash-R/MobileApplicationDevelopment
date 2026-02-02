package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etTemp = findViewById<EditText>(R.id.etTemp)
        val btnToCelsius = findViewById<Button>(R.id.btnToCelsius)
        val btnToFahrenheit = findViewById<Button>(R.id.btnToFahrenheit)
        val tvTempResult = findViewById<TextView>(R.id.tvTempResult)

        btnToCelsius.setOnClickListener {
            val tempF = etTemp.text.toString().toDoubleOrNull()
            if(tempF != null){
                val c = (tempF - 32) * 5 / 9
                tvTempResult.text = "Result: %.2f °C".format(c)
            }
        }

        btnToFahrenheit.setOnClickListener {
            val tempC = etTemp.text.toString().toDoubleOrNull()
            if(tempC != null){
                val f = (tempC * 9 / 5) + 32
                tvTempResult.text = "Result: %.2f °F".format(f)
            }
        }

    }
}
