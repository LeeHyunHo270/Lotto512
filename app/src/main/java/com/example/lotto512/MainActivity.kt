package com.example.lotto512

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var intent: Intent
        var CV2 = findViewById<CardView>(R.id.CV2)

        CV2.setOnClickListener {
            startActivity(Intent(this@MainActivity,ConstellationActivity::class.java))
        }

    }
}