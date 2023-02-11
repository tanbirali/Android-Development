package com.example.androidappassignment1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val btnCallus = findViewById<Button>(R.id.btncall)
        val btnAndroid = findViewById<CardView>(R.id.Android)
        val btnWeb = findViewById<CardView>(R.id.Web)
        val btniOS= findViewById<CardView>(R.id.iOS)
        val btnMl = findViewById<CardView>(R.id.MachineLearning)

        btnCallus.setOnClickListener {
            intent = Intent(Intent.ACTION_CALL)
            intent.data = Uri.parse("9614268684")
            startActivity(intent)
        }

        btnAndroid.setOnClickListener{
            intent = Intent()
        }
    }
}