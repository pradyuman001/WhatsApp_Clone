package com.example.whatsapp_clone.Screen.Splash_Screen.View

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.whatsapp_clone.R
import com.example.whatsapp_clone.Screen.Home_Screen.View.Home_Screen

class Splash_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        Handler().postDelayed({
            val intent = Intent(this, Home_Screen::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}