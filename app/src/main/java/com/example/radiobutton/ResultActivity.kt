package com.example.radiobutton

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity : AppCompatActivity() {

    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)
        init()
    }

    @SuppressLint("SetTextI18n")
    fun init(){
        val resultTV: TextView = findViewById(R.id.resultTV)
        count = intent.getIntExtra("key", count)

        when(count) {
            500 -> resultTV.text = "Отлично! Вы заработали $count очков!"
            400 -> resultTV.text = "Хорошо! Вы заработали $count очков!"
            300 -> resultTV.text = "Удовлетворительно! Вы заработали $count очков!"
            200 -> resultTV.text = "Неудовлетворительно! Вы заработали $count очков!"
            100 -> resultTV.text = "Плохо! Вы заработали $count очков!"
            0 -> resultTV.text = "Неприемлемо! Вы заработали $count очков!"
        }
    }
}