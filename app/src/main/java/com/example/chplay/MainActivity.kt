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
        items1.add(Item(R.drawable.img2, "Reddit", "3.2★"))
        items1.add(Item(R.drawable.img3, "Reddit", "4.3★"))
        items1.add(Item(R.drawable.img4, "Reddit", "2.4★"))
        items1.add(Item(R.drawable.img5, "Reddit", "1.5★"))

        val items2 = mutableListOf<Item>()
        items2.add(Item(R.drawable.img6, "Reddit", "4.5★"))
        items2.add(Item(R.drawable.img7, "Reddit", "4.7★"))
        items2.add(Item(R.drawable.img8, "Reddit", "4.3★"))
        items2.add(Item(R.drawable.img9, "Reddit", "4.1★"))
        items2.add(Item(R.drawable.img10, "Reddit", "4.6★"))

        val items3 = mutableListOf<Item>()
        items3.add(Item(R.drawable.img11, "Reddit", "4.2★"))
        items3.add(Item(R.drawable.img12, "Reddit", "4.1★"))
        items3.add(Item(R.drawable.img13, "Reddit", "3.3★"))
        items3.add(Item(R.drawable.img14, "Reddit", "4.4★"))
        items3.add(Item(R.drawable.img15, "Reddit", "3.5★"))

        val items4 = mutableListOf<Item>()
        items4.add(Item(R.drawable.img16, "Reddit", "3.1★"))
        items4.add(Item(R.drawable.img17, "Reddit", "2.2★"))
        items4.add(Item(R.drawable.img18, "Reddit", "4.3★"))
        items4.add(Item(R.drawable.img19, "Reddit", "3.4★"))
        items4.add(Item(R.drawable.img20, "Reddit", "2.5★"))

        val items5 = mutableListOf<Item>()
        items5.add(Item(R.drawable.img21, "Reddit", "3.1★"))
        items5.add(Item(R.drawable.img22, "Reddit", "2.2★"))
        items5.add(Item(R.drawable.img1, "Reddit", "4.3★"))
        items5.add(Item(R.drawable.img2, "Reddit", "3.4★"))
        items5.add(Item(R.drawable.img3, "Reddit", "4.5★"))

        val items6 = mutableListOf<Item>()
        items6.add(Item(R.drawable.img4, "Reddit", "4.1★"))
        items6.add(Item(R.drawable.img5, "Reddit", "4.2★"))
        items6.add(Item(R.drawable.img6, "Reddit", "4.3★"))
        items6.add(Item(R.drawable.img7, "Reddit", "4.4★"))
        items6.add(Item(R.drawable.img8, "Reddit", "4.5★"))

        val items7 = mutableListOf<Item>()
        items7.add(Item(R.drawable.img9, "Reddit", "4.1★"))
        items7.add(Item(R.drawable.img10, "Reddit", "4.2★"))
        items7.add(Item(R.drawable.img11, "Reddit", "4.3★"))
        items7.add(Item(R.drawable.img22, "Reddit", "4.4★"))
        items7.add(Item(R.drawable.img13, "Reddit", "4.5★"))

        val items8 = mutableListOf<Item>()
        items8.add(Item(R.drawable.img14, "Reddit", "4.1★"))
        items8.add(Item(R.drawable.img15, "Reddit", "4.2★"))
        items8.add(Item(R.drawable.img16, "Reddit", "4.3★"))
        items8.add(Item(R.drawable.img17, "Reddit", "4.4★"))
        items8.add(Item(R.drawable.img18, "Reddit", "4.5★"))

        val items9 = mutableListOf<Item>()
        items9.add(Item(R.drawable.img19, "Reddit", "4.1★"))
        items9.add(Item(R.drawable.img20, "Reddit", "4.2★"))
        items9.add(Item(R.drawable.img21, "Reddit", "4.3★"))
        items9.add(Item(R.drawable.img22, "Reddit", "4.4★"))
        items9.add(Item(R.drawable.img1, "Reddit", "4.5★"))

        val dataset = mutableListOf<Category>()
        dataset.add(Category("Game", items1))
        dataset.add(Category("Nhạc", items2))
        dataset.add(Category("Máy bay", items3))
        dataset.add(Category("Điện thoại", items4))
        dataset.add(Category("Thời trang", items5))
        dataset.add(Category("Đời sống", items6))
        dataset.add(Category("Dịch vụ", items7))
        dataset.add(Category("Tiện ích", items8))
        dataset.add(Category("Học tập", items9))



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