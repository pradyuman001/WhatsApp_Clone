package com.example.whatsapp_clone.Screen.Home_Screen.Controller

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapp_clone.R

class Status_Adapter(
    val activity: FragmentActivity?,
    val chat: Array<String>,
    val time: Array<String>,
    val profile: Array<Int>
) : RecyclerView.Adapter<Status_Adapter.ViewData>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewData {

        val view = LayoutInflater.from(activity).inflate(R.layout.status_item, parent, false)
        return ViewData(view)

    }

    override fun onBindViewHolder(holder: ViewData, position: Int) {
        holder.chatitem.text = chat[position]
        holder.timeitem.text = time[position]
        holder.profileitem.imageAlpha = profile[position]

    }

    override fun getItemCount(): Int {

        return chat.size
    }

    class ViewData(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val chatitem = itemView.findViewById<TextView>(R.id.chatname_txt)
        val timeitem = itemView.findViewById<TextView>(R.id.time_txt)
        val profileitem = itemView.findViewById<ImageView>(R.id.profile_img)
    }

}