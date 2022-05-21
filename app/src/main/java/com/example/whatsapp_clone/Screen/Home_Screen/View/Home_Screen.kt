package com.example.whatsapp_clone.Screen.Home_Screen.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.viewpager.widget.ViewPager
import com.example.whatsapp_clone.Fragment.Fragment_Adapter
import com.example.whatsapp_clone.R
import com.google.android.material.tabs.TabLayout

class Home_Screen : AppCompatActivity() {

    lateinit var tab_layout: TabLayout
    lateinit var view_pager: ViewPager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_screen)

        binding()

        tab_layout.addTab(tab_layout.newTab().setText("CHAT"))
        tab_layout.addTab(tab_layout.newTab().setText("STATUS"))
        tab_layout.addTab(tab_layout.newTab().setText("CALLS"))

        var adapter =Fragment_Adapter(this,supportFragmentManager)
        view_pager.adapter = adapter

        view_pager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tab_layout))

        tab_layout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                view_pager.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })


    }

    private fun binding() {

        tab_layout = findViewById<TabLayout>(R.id.tab_layout);
        view_pager = findViewById<ViewPager>(R.id.view_pager);

    }
}