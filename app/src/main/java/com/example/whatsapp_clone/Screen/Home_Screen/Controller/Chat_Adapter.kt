package com.example.whatsapp_clone.Screen.Home_Screen.Controller

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapp_clone.R

class Chat_Adapter(
    val activity: FragmentActivity?,
    val data: Array<String>,
    val message: Array<String>,
    val time: Array<String>,
    val profile: Array<Int>
) :
    RecyclerView.Adapter<Chat_Adapter.ViewData>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewData {

        val view = LayoutInflater.from(activity).inflate(R.layout.chat_item, parent, false)
        return ViewData(view)

    }

    override fun onBindViewHolder(holder: ViewData, position: Int) {
        holder.chatitem.text = data[position]
        holder.messageitem.text = message[position]
        holder.timeitem.text = time[position]
        holder.profileitem.imageAlpha = profile[position]

    }

    override fun getItemCount(): Int {

        return data.size
    }

    class ViewData(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val chatitem = itemView.findViewById<TextView>(R.id.chatname_txt)
        val messageitem = itemView.findViewById<TextView>(R.id.message_txt)
        val timeitem = itemView.findViewById<TextView>(R.id.time_txt)
        val profileitem = itemView.findViewById<ImageView>(R.id.profile_img)
    }


}