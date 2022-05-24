package com.example.whatsapp_clone.Screen.Home_Screen.View

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import androidx.core.content.res.ComplexColorCompat.inflate
import androidx.viewpager.widget.ViewPager
import com.example.whatsapp_clone.Fragment.Fragment_Adapter
import com.example.whatsapp_clone.R
import com.example.whatsapp_clone.databinding.HomeScreenBinding
import com.google.android.material.tabs.TabLayout

class Home_Screen : AppCompatActivity() {


    lateinit var binding: HomeScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HomeScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("CHAT"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("STATUS"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("CALLS"))

        var adapter = Fragment_Adapter(this, supportFragmentManager)
        binding.viewPager.adapter = adapter

        binding.viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(binding.tabLayout))

        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                binding.viewPager.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })


    }


}