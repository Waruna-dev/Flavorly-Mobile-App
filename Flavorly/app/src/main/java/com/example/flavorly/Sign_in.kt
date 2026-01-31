package com.example.flavorly

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView


class Sign_in : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val sign_InButton: Button = findViewById(R.id.btnsign_In)
        val textView: TextView = findViewById(R.id.tvSignUp)

        sign_InButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        textView.setOnClickListener {
            val intent = Intent(this, Sign_up::class.java)
            startActivity(intent)
            finish()
        }

    }
}