package com.example.whatsapp_clone.Fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.whatsapp_clone.Screen.Home_Screen.View.Home_Screen

class Fragment_Adapter(home_screen: Home_Screen, supportFragmentManager: FragmentManager) :
FragmentPagerAdapter(supportFragmentManager) {

    override fun getCount(): Int {

        return  3;

    }

    override fun getItem(position: Int): Fragment {

        return  when (position){

            0 -> Chat_Fragment()
            1 -> Status_Fragment()

            else -> Calls_Fragment()

        }

    }
}