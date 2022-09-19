package com.example.assignmentweek5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.example.assignmentweek5.adapters.MainAdapter


class MainActivity : AppCompatActivity() {
    private lateinit var tabLayout : TabLayout
    private lateinit var viewPager2: ViewPager2


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

           tabLayout = findViewById(R.id.tabLayoutID)
           viewPager2 = findViewById(R.id.viewPagerID)

                  //link the viewpager to the MainAdapter
           viewPager2.adapter = MainAdapter(supportFragmentManager, lifecycle)

                //link the Tabs to the viewpager
        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            when (position) {
                0 -> tab.text = "FirstPage"
                1 -> tab.text = "SecondPage"
            }
        }.attach()
    }
}