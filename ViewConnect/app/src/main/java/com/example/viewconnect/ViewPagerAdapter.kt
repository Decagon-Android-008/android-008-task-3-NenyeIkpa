package com.example.viewconnect

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter(private val activities: List<Activity>) :
RecyclerView.Adapter<ViewPagerAdapter.ViewPagerHolder>(){

    inner class ViewPagerHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_pager2,parent,false)
        return ViewPagerHolder(view)
    }

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
        val current = activities[position]
        holder.itemView.apply {

            val viewPhoto: ImageView = findViewById(R.id.image_view)
            val viewText: TextView = findViewById(R.id.text_view)

            viewText.text = current.textView
            viewPhoto.setImageResource(current.imageView)
        }
    }

    override fun getItemCount(): Int {
        return activities.size
    }
}