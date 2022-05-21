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
import com.example.whatsapp_clone.Screen.Home_Screen.Controller.Call_Adapter

class Calls_Fragment : Fragment() {

    lateinit var rv_view : RecyclerView

    var chat = arrayOf("WhatsApp Chat 1","WhatsApp Chat 2","WhatsApp Chat 3","WhatsApp Chat 4","WhatsApp Chat 5","WhatsApp Chat 6",
        "WhatsApp Chat 7","WhatsApp Chat 8","WhatsApp Chat 9","WhatsApp Chat 10","WhatsApp Chat 11","WhatsApp Chat 12",)

    var time = arrayOf("Today, 10:10 am","Yesterday, 12:10 am","18/05/2022, 10:50 pm","17/05/2022, 1:10 am","16/05/2022, 12:12 am","15/05/2022, 5:10 pm",
        "14/05/2022, 10:01 pm","13/05/2022, 10:10 am","12/05/2022, 10:10 am","11/05/2022, 10:10 am","10/05/2022, 10:10 am","9/05/2022, 10:10 am",)

    var profile = arrayOf(R.drawable.profile1,R.drawable.profile2,R.drawable.profile3,R.drawable.profile4,R.drawable.profile5,R.drawable.profile6,
        R.drawable.profile7,R.drawable.profile8,R.drawable.profile9,R.drawable.profile10,R.drawable.profile11,R.drawable.profile12,)


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_calls, container, false)

        var rv_view = view.findViewById<RecyclerView>(R.id.rv_view)

        var chatname_txt = view.findViewById<TextView>(R.id.chatname_txt)
        var time_txt = view.findViewById<TextView>(R.id.time_txt)
        var profile_img = view.findViewById<ImageView>(R.id.profile_img)

        var adapter = Call_Adapter(activity,chat,time,profile)
        var layoutManager = LinearLayoutManager(activity)

        rv_view.layoutManager = layoutManager
        rv_view.adapter = adapter

        return view
    }


}