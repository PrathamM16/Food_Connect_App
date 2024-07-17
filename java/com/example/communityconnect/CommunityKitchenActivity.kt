package com.example.communityconnect


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CommunityKitchenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_community_kitchen)

        val buttonFindKitchens = findViewById<Button>(R.id.buttonFindKitchens)
        buttonFindKitchens.setOnClickListener {
            // Implement the logic to find nearby community kitchens
            // For example, navigate to a list of community kitchens activity
            startActivity(Intent(this, CommunityKitchenListActivity::class.java))
        }
    }
}
