package com.example.communityconnect

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CommunityKitchenAdapter(private val communityKitchens: List<CommunityKitchen>) :
    RecyclerView.Adapter<CommunityKitchenAdapter.CommunityKitchenViewHolder>() {

    private var itemClickListener: ((CommunityKitchen) -> Unit)? = null

    inner class CommunityKitchenViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nameTextView: TextView = itemView.findViewById(R.id.textViewName)
        private val addressTextView: TextView = itemView.findViewById(R.id.textViewAddress)

        fun bind(communityKitchen: CommunityKitchen) {
            nameTextView.text = communityKitchen.name
            addressTextView.text = communityKitchen.address

            itemView.setOnClickListener {
                itemClickListener?.invoke(communityKitchen)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommunityKitchenViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_comminity_kitchen, parent, false)
        return CommunityKitchenViewHolder(view)
    }

    override fun onBindViewHolder(holder: CommunityKitchenViewHolder, position: Int) {
        val communityKitchen = communityKitchens[position]
        holder.bind(communityKitchen)
    }

    override fun getItemCount(): Int {
        return communityKitchens.size
    }

    fun setOnItemClickListener(listener: (CommunityKitchen) -> Unit) {
        this.itemClickListener = listener
    }
}
