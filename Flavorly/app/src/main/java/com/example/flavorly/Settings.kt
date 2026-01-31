package com.example.flavorly

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_settings)

        val backButton: ImageView = findViewById(R.id.set_back)

        backButton.setOnClickListener {
            finish()
        }

        val logoutButton: Button = findViewById(R.id.log_out)

        logoutButton.setOnClickListener {
            val intent = Intent(this, Sign_in::class.java)
            startActivity(intent)
            finish()
        }
    }
}