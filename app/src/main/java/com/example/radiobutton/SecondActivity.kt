package com.example.radiobutton

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    private var count = 0

    private lateinit var textViewTV: TextView
    private lateinit var radioButton1: RadioButton
    private lateinit var radioButton2: RadioButton
    private lateinit var radioButton3: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        init()
    }

    @SuppressLint("SetTextI18n")
    private fun init(){
        textViewTV = findViewById(R.id.textViewTV)

        radioButton1 = findViewById(R.id.radioButton1)
        radioButton2= findViewById(R.id.radioButton2)
        radioButton3 = findViewById(R.id.radioButton3)

        count = intent.getIntExtra("key", count)

        val buttonBT1: Button = findViewById(R.id.buttonBT)
        buttonBT1.setOnClickListener{
            if(radioButton3.isChecked) count += 100

            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("key", count)
            startActivity(intent)
        }
    }




}