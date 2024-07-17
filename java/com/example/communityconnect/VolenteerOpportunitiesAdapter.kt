// VolunteerOpportunitiesAdapter.kt
package com.example.communityconnect

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.communityconnect.R

class VolunteerOpportunitiesAdapter(private val opportunities: List<String>) :
    RecyclerView.Adapter<VolunteerOpportunitiesAdapter.OpportunityViewHolder>() {

    inner class OpportunityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val opportunityTitle: TextView = itemView.findViewById(R.id.textVolunteerOpportunity)
        // Add other views for opportunity details
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OpportunityViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.volunteer_opportunity_item, parent, false)
        return OpportunityViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: OpportunityViewHolder, position: Int) {
        val opportunity = opportunities[position]
        holder.opportunityTitle.text = opportunity
        // Bind other opportunity details here
    }

    override fun getItemCount(): Int {
        return opportunities.size
    }
}

