package com.example.gesturedetector

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.*

class MainActivity : AppCompatActivity() {

    lateinit var display: TextView
    var value = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display = findViewById(R.id.tvDisplay)
    }

    fun onDigit(view: View) {
        val btn = view as Button
        value += btn.text
        display.text = value
    }

    fun onOperator(view: View) {
        val btn = view as Button
        value += " ${btn.text} "
        display.text = value
    }

    fun onClear(view: View) {
        value = ""
        display.text = "0"
    }

    fun onEqual(view: View) {
        try {
            val parts = value.split(" ")
            val a = parts[0].toDouble()
            val op = parts[1]
            val b = parts[2].toDouble()

            val result = when(op) {
                "+" -> a + b
                "-" -> a - b
                "*" -> a * b
                "/" -> a / b
                else -> 0.0
            }

            display.text = result.toString()
            value = result.toString()

        } catch (e: Exception) {
            display.text = "Error"
        }
    }

    fun onScientific(view: View) {
        val btn = view as Button
        val num = value.toDouble()

        val result = when(btn.text.toString()) {
            "sin" -> sin(Math.toRadians(num))
            "√" -> sqrt(num)
            else -> num
        }

        display.text = result.toString()
        value = result.toString()
    }
}