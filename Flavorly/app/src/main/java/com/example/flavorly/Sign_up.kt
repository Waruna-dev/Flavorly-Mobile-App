package com.example.flavorly

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class Sign_up : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btnSignup: Button = findViewById(R.id.btnsign_Up)

        btnSignup.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val tvMessage: TextView = findViewById(R.id.tvSignIn)
        tvMessage.setOnClickListener {
            val intent = Intent(this, Sign_in::class.java)
            startActivity(intent)
        }

    }
}