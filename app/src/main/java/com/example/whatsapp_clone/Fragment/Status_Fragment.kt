package com.example.whatsapp_clone.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapp_clone.R
import com.example.whatsapp_clone.Screen.Home_Screen.Controller.Status_Adapter


class Status_Fragment : Fragment() {

    lateinit var rv_view : RecyclerView

    var chat = arrayOf("WhatsApp Chat 1","WhatsApp Chat 2","WhatsApp Chat 3","WhatsApp Chat 4","WhatsApp Chat 5","WhatsApp Chat 6")

    var time = arrayOf("Today, 10:10 am","Yesterday, 7:05 am","Yesterday, 8:05 am","Yesterday,9:05 am","Yesterday,9:50 am","Yesterday,1:05 am")

    var profile = arrayOf(R.drawable.profile1,R.drawable.profile2,R.drawable.profile3,R.drawable.profile4,R.drawable.profile5,R.drawable.profile6)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.fragment_status, container, false)

        var rv_view = view.findViewById<RecyclerView>(R.id.rv_view)

        var chatname_txt = view.findViewById<TextView>(R.id.chatname_txt)
        var time_txt = view.findViewById<TextView>(R.id.time_txt)
        var profile_img = view.findViewById<ImageView>(R.id.profile_img)


        var adapter = Status_Adapter(activity,chat,time,profile)
        var layoutManager = LinearLayoutManager(activity)

        rv_view.layoutManager = layoutManager
        rv_view.adapter = adapter

        return view

    }

}