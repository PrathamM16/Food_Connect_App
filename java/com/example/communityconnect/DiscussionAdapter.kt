package com.example.communityconnect

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.communityconnect.R

class DiscussionAdapter(private val discussionItems: List<String>) :
    RecyclerView.Adapter<DiscussionAdapter.DiscussionViewHolder>() {

    inner class DiscussionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val discussionTitleTextView: TextView = itemView.findViewById(R.id.textDiscussionItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiscussionViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.discussion_item, parent, false)
        return DiscussionViewHolder(view)
    }

    override fun onBindViewHolder(holder: DiscussionViewHolder, position: Int) {
        val discussionItem = discussionItems[position]
        holder.discussionTitleTextView.text = discussionItem
    }

    override fun getItemCount(): Int {
        return discussionItems.size
    }
}
