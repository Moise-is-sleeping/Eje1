package com.moise.eje1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var screen : TextView
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        screen = findViewById(R.id.screen)
        var counter = 0
        button.setOnClickListener {
            counter+=1
            when(counter){
                1 -> screen.text = "Has hecho click una vez!"
                2 -> screen.text = "Has hecho click dos veces!"
                3,4,5 -> screen.text = "Has hecho click $counter veces!"
                6,7,8,9 -> screen.text = "Has hecho click varias vece $counter !"
            }
            if (counter > 10){
                button.isEnabled = false
                val toast = Toast.makeText(this,"Te has pasado de puslsaciones",Toast.LENGTH_SHORT)
                toast.show()

            }
        }

    }
}