package com.example.lotto512

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ConstellatoinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constellatoin)

        Toast.makeText(this, "Constellation Activity", Toast.LENGTH_LONG).show()
    }
}