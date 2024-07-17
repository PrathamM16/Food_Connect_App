package com.example.communityconnect

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CommunityKitchenListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_community_kitchen_list)

        // Step 1: Fetch community kitchens data from a server or database
        val communityKitchens = fetchCommunityKitchensData()

        // Step 2: Create a RecyclerView to display the list of community kitchens
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewCommunityKitchens)

        // Step 3: Create an adapter for the RecyclerView
        val adapter = CommunityKitchenAdapter(communityKitchens)

        // Step 4: Set the adapter to the RecyclerView
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Step 5: Handle item click events to perform actions when a community kitchen is selected
        adapter.setOnItemClickListener { communityKitchen ->
            // Handle click event for the selected community kitchen
            // For example, display a toast message with the selected community kitchen name
            showToast("Selected: ${communityKitchen.name}")
        }
    }

    // Function to fetch community kitchens data (Replace this with actual data fetching logic)
    private fun fetchCommunityKitchensData(): List<CommunityKitchen> {
        // Sample data for demonstration (Replace with actual data fetching logic)
        return listOf(
            CommunityKitchen("Kitchen 1", "Address 1"),
            CommunityKitchen("Kitchen 2", "Address 2"),
            CommunityKitchen("Kitchen 3", "Address 3")
            // Add more community kitchens as needed
        )
    }

    // Function to display toast message
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
