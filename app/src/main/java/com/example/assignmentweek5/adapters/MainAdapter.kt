package com.example.assignmentweek5.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.assignmentweek5.fragments.FirstFragment
import com.example.assignmentweek5.fragments.SecondFragment

class MainAdapter (fragmentManager: FragmentManager, lifeCycle: Lifecycle) :
    FragmentStateAdapter (fragmentManager,lifeCycle) {

    //returns the number of pages
    override fun getItemCount(): Int {
        return 2
    }

    //returns the fragments to display the page
    override fun createFragment(position: Int): Fragment {
        when (position){
            0 -> FirstFragment()
            1 -> SecondFragment()
        }
        return FirstFragment()

    }
}
