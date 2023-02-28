package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val add = findViewById<Button>(R.id.add)
        val sub = findViewById<Button>(R.id.sub)
        val div = findViewById<Button>(R.id.div)
        val mul = findViewById<Button>(R.id.mul)
        val in1 = findViewById<TextInputEditText>(R.id.input1)
        val in2 = findViewById<TextInputEditText>(R.id.input2)
        val tv = findViewById<TextView>(R.id.textView)

        add.setOnClickListener {
          val data1 =  in1.text.toString().toInt()
            val data2 = in2.text.toString().toInt()
            tv.text = (data1+data2).toString()
        }
        sub.setOnClickListener {
            val data1 =  in1.text.toString().toInt()
            val data2 = in2.text.toString().toInt()
            tv.text = (data1-data2).toString()
        }
        mul.setOnClickListener {
            val data1 =  in1.text.toString().toInt()
            val data2 = in2.text.toString().toInt()
            tv.text = (data1*data2).toString()
        }
        div.setOnClickListener {
            val data1 =  in1.text.toString().toInt()
            val data2 = in2.text.toString().toInt()
            tv.text = (data1/data2).toString()
        }
    }
}