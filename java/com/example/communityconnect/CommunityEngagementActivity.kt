package com.example.communityconnect

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CommunityEngagementActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_community_engagement)

        // Initialize RecyclerViews
        val recyclerViewDiscussion = findViewById<RecyclerView>(R.id.recyclerViewDiscussion)
        val recyclerViewVolunteerOpportunities = findViewById<RecyclerView>(R.id.recyclerViewVolunteerOpportunities)

        // Create sample data for discussion forum
        val discussionItems = listOf(
            "Discussion Item 1",
            "Discussion Item 2",
            "Discussion Item 3"
            // Add more discussion items as needed
        )

        // Create sample data for volunteer opportunities
        val volunteerOpportunities = listOf(
            "Volunteer Opportunity 1",
            "Volunteer Opportunity 2",
            "Volunteer Opportunity 3"
            // Add more volunteer opportunities as needed
        )

        // Create adapters for RecyclerViews
        val discussionAdapter = DiscussionAdapter(discussionItems)
        val volunteerOpportunitiesAdapter = VolunteerOpportunitiesAdapter(volunteerOpportunities)

        // Set adapters to RecyclerViews
        recyclerViewDiscussion.adapter = discussionAdapter
        recyclerViewVolunteerOpportunities.adapter = volunteerOpportunitiesAdapter

        // Set layout managers for RecyclerViews
        recyclerViewDiscussion.layoutManager = LinearLayoutManager(this)
        recyclerViewVolunteerOpportunities.layoutManager = LinearLayoutManager(this)
    }
}
