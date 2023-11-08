package com.example.chplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items1 = mutableListOf<Item>()
        items1.add(Item(R.drawable.img1, "Reddit", "4.1★"))
        items1.add(Item(R.drawable.img2, "Reddit", "4.2★"))
        items1.add(Item(R.drawable.img3, "Reddit", "4.3★"))
        items1.add(Item(R.drawable.img4, "Reddit", "4.4★"))
        items1.add(Item(R.drawable.img5, "Reddit", "4.5★"))

        val items2 = mutableListOf<Item>()
        items2.add(Item(R.drawable.img1, "Reddit", "4.1★"))
        items2.add(Item(R.drawable.img2, "Reddit", "4.2★"))
        items2.add(Item(R.drawable.img3, "Reddit", "4.3★"))
        items2.add(Item(R.drawable.img4, "Reddit", "4.4★"))
        items2.add(Item(R.drawable.img5, "Reddit", "4.5★"))

        val items3 = mutableListOf<Item>()
        items3.add(Item(R.drawable.img1, "Reddit", "4.1★"))
        items3.add(Item(R.drawable.img2, "Reddit", "4.2★"))
        items3.add(Item(R.drawable.img3, "Reddit", "4.3★"))
        items3.add(Item(R.drawable.img4, "Reddit", "4.4★"))
        items3.add(Item(R.drawable.img5, "Reddit", "4.5★"))

        val items4 = mutableListOf<Item>()
        items4.add(Item(R.drawable.img1, "Reddit", "4.1★"))
        items4.add(Item(R.drawable.img2, "Reddit", "4.2★"))
        items4.add(Item(R.drawable.img3, "Reddit", "4.3★"))
        items4.add(Item(R.drawable.img4, "Reddit", "4.4★"))
        items4.add(Item(R.drawable.img5, "Reddit", "4.5★"))

        val items5 = mutableListOf<Item>()
        items5.add(Item(R.drawable.img1, "Reddit", "4.1★"))
        items5.add(Item(R.drawable.img2, "Reddit", "4.2★"))
        items5.add(Item(R.drawable.img3, "Reddit", "4.3★"))
        items5.add(Item(R.drawable.img4, "Reddit", "4.4★"))
        items5.add(Item(R.drawable.img5, "Reddit", "4.5★"))

        val dataset = mutableListOf<Category>()
        dataset.add(Category("Game", items1))
        dataset.add(Category("Nhạc", items2))
        dataset.add(Category("Máy bay", items3))
        dataset.add(Category("Điện thoại", items4))
        dataset.add(Category("Thời trang", items5))
        val categoryAdapter = CategoryAdapter(dataset) //Truyen danh sach vao trong class ItemAdapter
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter= categoryAdapter
        recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )
    }
}