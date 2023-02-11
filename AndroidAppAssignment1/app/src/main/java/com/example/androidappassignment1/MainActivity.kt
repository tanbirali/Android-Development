package com.example.androidappassignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonIntent = findViewById<Button>(R.id.Letsgo)

        buttonIntent.setOnClickListener {
            intent = Intent(applicationContext, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}