package com.example.communityconnect

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash) // Set the layout to display the splash screen

        // Delay for 2000 milliseconds (2 seconds) before navigating to the RegistrationActivity
        Handler().postDelayed({
            // Launch RegistrationActivity
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
            finish() // Finish the MainActivity so the user can't go back to it from the RegistrationActivity
        }, 2000)
    }
}
