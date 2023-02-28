package com.example.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class SecondScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)

        val his = findViewById<CardView>(R.id.history)
        val mes = findViewById<CardView>(R.id.message)
        his.setOnClickListener{
            val intent = Intent(applicationContext, HistoryOfValentineDay::class.java)
            startActivity(intent)
        }

        mes.setOnClickListener{
            val intent = Intent(applicationContext, Messageforyou::class.java)
            startActivity(intent)
        }
    }
}