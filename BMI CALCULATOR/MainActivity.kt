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

        val etWeight = findViewById<EditText>(R.id.etWeight)
        val etHeight = findViewById<EditText>(R.id.etHeight)
        val btnCalculateBMI = findViewById<Button>(R.id.btnCalculateBMI)
        val tvBMIResult = findViewById<TextView>(R.id.tvBMIResult)

        btnCalculateBMI.setOnClickListener {
            val weight = etWeight.text.toString().toDoubleOrNull()
            val height = etHeight.text.toString().toDoubleOrNull()

            if(weight != null && height != null && height > 0){
                val bmi = weight / (height * height)
                tvBMIResult.text = "BMI: %.2f".format(bmi)
            } else {
                Toast.makeText(this, "Enter valid height and weight", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
