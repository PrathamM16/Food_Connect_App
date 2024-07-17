package com.example.communityconnect

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val btnRegister = findViewById<Button>(R.id.buttonRegister)
        btnRegister.setOnClickListener {
            // Retrieve user input
            val nameInput = findViewById<EditText>(R.id.editTextName)
            val locationInput = findViewById<EditText>(R.id.editTextLocation)
            val contactInfoInput = findViewById<EditText>(R.id.editTextContactInfo)

            val name = nameInput.text.toString().trim()
            val location = locationInput.text.toString().trim()
            val contactInfo = contactInfoInput.text.toString().trim()

            // Validate user input
            if (name.isEmpty() || location.isEmpty() || contactInfo.isEmpty()) {
                // Show error message if any field is empty
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Create user object
            val user = User(name, location, contactInfo)

            // Pass user object to the next activity (dashboard)
            val intent = Intent(this@RegistrationActivity, DashboardActivity::class.java)
            intent.putExtra("user", user)
            startActivity(intent)
        }
    }
}
