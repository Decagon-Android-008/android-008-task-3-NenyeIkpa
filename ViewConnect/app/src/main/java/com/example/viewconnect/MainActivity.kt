package com.example.viewconnect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var vpAdapter: ViewPagerAdapter
    lateinit var adapter: ProfileDisplayAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //set conditions for switching theme
        val switch = findViewById<Switch>(R.id.switch1)
        switch.setOnClickListener{
            if(switch.isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }

        }

//        create list for view pager
        val activityList = listOf(
            Activity(R.drawable.kamsi,"It's Kamsi's birthday!"),
            Activity(R.drawable.victor,  "It's Victor's birthday!"),
            Activity(R.drawable.skydive, "It's Imade's birthday!"),
            Activity(R.drawable.image_5, "It's Zara's birthday!"),
            Activity(R.drawable.snowboarding, "It's Tolu's Birthday!")
        )

//        define list for recycler view
        val profileList = listOf(
        Display(R.drawable.image_5,"Chinenye Ikpa"),
        Display(R.drawable.image_2,  "Nkechi Williams"),
        Display(R.drawable.image_1, "Femi Johnson"),
        Display(R.drawable.image_3, "Iyanda Opala"),
        Display(R.drawable.image_7, "Benjamin Enwerem"),
        Display(R.drawable.image_6, "Onyinyechi Donald"),
        Display(R.drawable.image_4, "Xavier White"),
        Display(R.drawable.image_8, "Abass Adisa"),
        Display(R.drawable.image_9, "Johnson Oyesina"),
        Display(R.drawable.image_10, "Peter Akam"),
        Display(R.drawable.image_7, "Abdulrasheed Ilori"),
        Display(R.drawable.image_1, "Money Man"),
        Display(R.drawable.image_9, "Benjamin Obetta"),
        Display(R.drawable.image_10, "Emmanuel Orunimighen"),
        Display(R.drawable.image_8, "Anthony Idoko"),
        Display(R.drawable.image_1, "KufreAbasi Udoh"),
        Display(R.drawable.image_4, "Seun Awonugba"),
        Display(R.drawable.image_7, "Moh'd Quraysh Obaalasiki"),
        Display(R.drawable.image_9, "Samuel Ungede"),
        Display(R.drawable.image_10, "Victor Bamikole")
        )

//        set the the view pager and recycler view adapters to the their respective resource ids
        vpAdapter = ViewPagerAdapter(activityList)
        viewPager.adapter = vpAdapter


        adapter = ProfileDisplayAdapter(profileList)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}