package com.example.communityconnect

data class FoodListing(
    val name: String,
    val description: String,
    val quantity: String,
    val expiryDate: String,
    val imageResourceId: Int // Resource ID of the food image
)
