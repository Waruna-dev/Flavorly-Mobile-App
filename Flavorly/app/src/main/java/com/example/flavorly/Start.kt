package com.example.flavorly

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Start : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val getStartedButton: Button = findViewById(R.id.btnGetStarted)

        getStartedButton.setOnClickListener {
            val intent = Intent(this, Sign_in::class.java)
            startActivity(intent)
            finish()
        }
    }
}