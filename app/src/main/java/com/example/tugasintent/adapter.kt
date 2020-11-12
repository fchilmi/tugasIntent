package com.example.tugasintent

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class adapter (val jajanItemList: List<data_jajan>, val clickListener: (data_jajan) -> Unit): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_item, parent, false)
        return PartViewHolder(view)
    }

    override fun getItemCount(): Int = jajanItemList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(jajanItemList[position], clickListener)
    }

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(jajan: data_jajan, clickListener: (data_jajan) -> Unit) {
                itemView.namaJajan.text = jajan.namaJajan
                itemView.fotoJajan.setImageResource(jajan.foto)

                itemView.setOnClickListener { clickListener(jajan) }
        }
    }
}
