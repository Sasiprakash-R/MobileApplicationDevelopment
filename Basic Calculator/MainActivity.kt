package com.example.gesturedetector


import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val n1 = findViewById<EditText>(R.id.etNum1)
        val n2 = findViewById<EditText>(R.id.etNum2)
        val result = findViewById<TextView>(R.id.tvResult)

        fun getNumbers(): Pair<Double, Double> {
            val a = n1.text.toString().toDoubleOrNull() ?: 0.0
            val b = n2.text.toString().toDoubleOrNull() ?: 0.0
            return Pair(a, b)
        }

        findViewById<Button>(R.id.btnAdd).setOnClickListener {
            val (a, b) = getNumbers()
            result.text = "Result: ${a + b}"
        }

        findViewById<Button>(R.id.btnSub).setOnClickListener {
            val (a, b) = getNumbers()
            result.text = "Result: ${a - b}"
        }

        findViewById<Button>(R.id.btnMul).setOnClickListener {
            val (a, b) = getNumbers()
            result.text = "Result: ${a * b}"
        }

        findViewById<Button>(R.id.btnDiv).setOnClickListener {
            val (a, b) = getNumbers()
            result.text = "Result: ${a / b}"
        }
    }
}