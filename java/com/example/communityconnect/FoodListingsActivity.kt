package com.example.communityconnect

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FoodListingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_listings)

        // Find the RecyclerView from the layout
        val recyclerViewFoodListings = findViewById<RecyclerView>(R.id.recyclerViewFoodListings)

        // Sample food listings data (replace with actual data)
        val foodListings = listOf(
            FoodItem(R.drawable.buger, "Burger", "Delicious burger with cheese and veggies", "2024-03-10"),
            FoodItem(R.drawable.foods, "Salad", "Healthy salad with fresh vegetables", "2024-03-12"),
            FoodItem(R.drawable.pizza, "Pizza", "Tasty pizza with pepperoni and cheese", "2024-03-08") ,
            FoodItem(R.drawable.foods, "Salad", "Healthy salad with fresh vegetables", "2024-03-12"),
            FoodItem(R.drawable.buger, "Burger", "Delicious burger with cheese and veggies", "2024-03-10"),
            FoodItem(R.drawable.pizza, "Pizza", "Tasty pizza with pepperoni and cheese", "2024-03-08")
            // Add more food items as needed
        )

        // Set up the RecyclerView with the FoodListAdapter
        recyclerViewFoodListings.apply {
            layoutManager = GridLayoutManager(this@FoodListingsActivity, 2) // 2 columns
            adapter = FoodListAdapter(this@FoodListingsActivity, foodListings)
        }
    }
}
