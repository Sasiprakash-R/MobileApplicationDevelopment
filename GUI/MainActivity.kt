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

        val tvWelcome = findViewById<TextView>(R.id.tvWelcome)
        val etInput = findViewById<EditText>(R.id.etInput)
        val btnClick = findViewById<Button>(R.id.btnClick)

        btnClick.setOnClickListener {
            val inputText = etInput.text.toString().trim()

            if (inputText.isEmpty()) {
                Toast.makeText(this, "Type something to display", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, inputText, Toast.LENGTH_LONG).show()
            }
        }


    }
}
