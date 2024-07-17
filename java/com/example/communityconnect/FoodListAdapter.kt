package com.example.communityconnect

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodListAdapter(private val context: Context, private val foodList: List<FoodItem>) :
    RecyclerView.Adapter<FoodListAdapter.FoodViewHolder>() {

    inner class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageFood: ImageView = itemView.findViewById(R.id.imageFood)
        val textFoodName: TextView = itemView.findViewById(R.id.textFoodName)
        val textDescription: TextView = itemView.findViewById(R.id.textDescription)
        val textExpiryDate: TextView = itemView.findViewById(R.id.textExpiryDate)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.list_item_food, parent, false)
        return FoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val foodItem = foodList[position]

        // Set the food image
        holder.imageFood.setImageResource(foodItem.imageResourceId)

        // Set other food details
        holder.textFoodName.text = foodItem.name
        holder.textDescription.text = foodItem.description
        holder.textExpiryDate.text = foodItem.expiryDate
    }

    override fun getItemCount(): Int {
        return foodList.size
    }
}
