package com.example.viewconnect

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//create the adapter class that works with the recycler view adapter and view holder class to set the methods for the recycler view
class ProfileDisplayAdapter(private val profile: List<Display>) : RecyclerView.Adapter<ProfileDisplayAdapter.ProfileDisplayViewHolder>() {

    inner class ProfileDisplayViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onBindViewHolder(holder: ProfileDisplayViewHolder, position: Int) {
        val current = profile[position]
       holder.itemView.apply {

           val viewImage: ImageView = findViewById(R.id.profile_image_iv)
           val viewName: TextView = findViewById(R.id.profile_name_tv)

           viewName.text = current.profileName
           viewImage.setImageResource(current.profilePic)
       }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileDisplayViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.profile_display,parent,false)
        return ProfileDisplayViewHolder(view)
    }

    override fun getItemCount() = profile.size

    }



