package com.example.recyclerviewwithotherview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithotherview.R
import com.example.recyclerviewwithotherview.model.Item
import kotlinx.android.synthetic.main.item_activity.view.*

class ItemAdapter(var itemList : ArrayList<Item>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: Item){
            itemView.imgRec.setImageResource(item.image)
            itemView.txtName.text = item.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_activity, parent, false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int = itemList.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(itemList[position])
    }


}