package com.example.communityconnect

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        // Initialize buttons
        val buttonFoodListings = findViewById<Button>(R.id.buttonFoodListings)
        val buttonRequestSystem = findViewById<Button>(R.id.buttonRequestSystem)
        val buttonPickupDelivery = findViewById<Button>(R.id.buttonPickupDelivery)
        val buttonCommunityKitchen = findViewById<Button>(R.id.buttonCommunityKitchen)
        val buttonDonationOption = findViewById<Button>(R.id.buttonDonationOption)
        val buttonMessagingNotifications = findViewById<Button>(R.id.buttonMessagingNotifications)
        val buttonCommunityEngagement = findViewById<Button>(R.id.buttonCommunityEngagement)


        // Set click listeners for buttons
        buttonFoodListings.setOnClickListener {
            // Start FoodListingsActivity or implement functionality for Food Listings button
            val intent = Intent(this, FoodListingsActivity::class.java)
            startActivity(intent)
        }

        buttonRequestSystem.setOnClickListener {
            // Start RequestSystemActivity or implement functionality for Request System button
            val intent = Intent(this, RequestSystemActivity::class.java)
            startActivity(intent)
        }

        buttonPickupDelivery.setOnClickListener {
            // Start PickupDeliveryActivity or implement functionality for Pickup and Delivery button
            val intent = Intent(this, PickupDeliveryActivity::class.java)
            startActivity(intent)
        }

        buttonCommunityKitchen.setOnClickListener {
            // Start CommunityKitchenActivity or implement functionality for Community Kitchen button
            val intent = Intent(this, CommunityKitchenActivity::class.java)
            startActivity(intent)
        }

        buttonDonationOption.setOnClickListener {
            // Start DonationOptionActivity or implement functionality for Donation Option button
            val intent = Intent(this, DonationOptionActivity::class.java)
            startActivity(intent)
        }

        buttonMessagingNotifications.setOnClickListener {
            // Start MessagingNotificationsActivity or implement functionality for Messaging and Notifications button
            val intent = Intent(this, MessagingNotificationActivity::class.java)
            startActivity(intent)
        }

        buttonCommunityEngagement.setOnClickListener {
            // Start CommunityEngagementActivity or implement functionality for Community Engagement button
            val intent = Intent(this, CommunityEngagementActivity::class.java)
            startActivity(intent)
        }



    }
}
