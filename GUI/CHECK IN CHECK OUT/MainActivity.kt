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

        var count = 0
        val tvCount = findViewById<TextView>(R.id.tvCount)
        val btnCheckIn = findViewById<Button>(R.id.btnCheckIn)
        val btnCheckOut = findViewById<Button>(R.id.btnCheckOut)

        btnCheckIn.setOnClickListener {
            count++
            tvCount.text = "Count: $count"
        }

        btnCheckOut.setOnClickListener {
            if(count > 0) count--
            tvCount.text = "Count: $count"
        }
    }
}
