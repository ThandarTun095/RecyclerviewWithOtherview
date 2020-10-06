package com.example.recyclerviewwithotherview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewwithotherview.adapter.ItemAdapter
import com.example.recyclerviewwithotherview.model.Item
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var itemList = ArrayList<Item>()
        itemList.add(Item(R.drawable.list_two, "My Wishlist"))
        itemList.add(Item(R.drawable.box_three, "My Followed Selivers"))
        itemList.add(Item(R.drawable.box_two,"My Purchased Item"))
        itemList.add(Item(R.drawable.cupon, "My Cupons"))
        itemList.add(Item(R.drawable.box_three, "My Cards Wallets"))
        itemList.add(Item(R.drawable.cupon, "Exp Points"))
        itemList.add(Item(R.drawable.list_two, "My Given Feedbacks"))
        itemList.add(Item(R.drawable.list_three, "Searched History"))
        itemList.add(Item(R.drawable.list_two, "Events & Calander"))

        var itemAdapter = ItemAdapter(itemList)
        //itemRecycler.layoutManager = LinearLayoutManager(this)
        //itemRecycler.layoutManager = LinearLayoutManager(this,
        //    LinearLayoutManager.HORIZONTAL, false)

        itemRecycler.layoutManager = GridLayoutManager(this, 3)

        itemRecycler.adapter = itemAdapter
    }
}