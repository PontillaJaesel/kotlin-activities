package com.example.loginformpractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        if (getSupportActionBar() != null) {
            getSupportActionBar()!!.setTitle("New User Registration")
        }
    }
}
