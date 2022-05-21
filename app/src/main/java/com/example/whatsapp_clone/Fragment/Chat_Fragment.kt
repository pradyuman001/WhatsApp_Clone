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
import com.example.whatsapp_clone.Screen.Home_Screen.Controller.Chat_Adapter


class Chat_Fragment : Fragment() {

    lateinit var rv_view : RecyclerView
    var chat = arrayOf("WhatsApp Chat 1","WhatsApp Chat 2","WhatsApp Chat 3","WhatsApp Chat 4","WhatsApp Chat 5","WhatsApp Chat 6",
                        "WhatsApp Chat 7","WhatsApp Chat 8","WhatsApp Chat 9","WhatsApp Chat 10","WhatsApp Chat 11","WhatsApp Chat 12",)

    var message = arrayOf("Its Sample Text 1 ","Its Sample Text 2 ","Its Sample Text 3 ","Its Sample Text 4 ","Its Sample Text 5 ","Its Sample Text 6 ",
                          "Its Sample Text 7 ","Its Sample Text 8 ","Its Sample Text 9 ","Its Sample Text 10 ","Its Sample Text 11 ","Its Sample Text 12 ",)

    var time = arrayOf("Today","Yesterday","18/05/2022","17/05/2022","16/05/2022","15/05/2022",
                       "14/05/2022","13/05/2022","12/05/2022","11/05/2022","10/05/2022","9/05/2022",)

    var profile = arrayOf(R.drawable.profile1,R.drawable.profile2,R.drawable.profile3,R.drawable.profile4,R.drawable.profile5,R.drawable.profile6,
                          R.drawable.profile7,R.drawable.profile8,R.drawable.profile9,R.drawable.profile10,R.drawable.profile11,R.drawable.profile12,)



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.fragment_chat, container, false)

        var rv_view = view.findViewById<RecyclerView>(R.id.rv_view)

        var chatname_txt = view.findViewById<TextView>(R.id.chatname_txt)
        var message_txt = view.findViewById<TextView>(R.id.message_txt)
        var time_txt = view.findViewById<TextView>(R.id.time_txt)
        var profile_img = view.findViewById<ImageView>(R.id.profile_img)

        var adapter = Chat_Adapter(activity,chat,message,time,profile)
        var layoutManager = LinearLayoutManager(activity)

        rv_view.layoutManager = layoutManager
        rv_view.adapter = adapter

        return view


    }


}