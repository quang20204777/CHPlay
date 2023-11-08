package com.example.chplay

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CategoryAdapter(private val dataCategory: List<Category>) :
    RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val category: TextView
        val categoryList: RecyclerView
      //  val rightRow: ImageView
        init {
            // Define click listener for the ViewHolder's View
            category = view.findViewById(R.id.category)
            categoryList = view.findViewById(R.id.category_list)
         //   rightRow = view.findViewById(R.id.right_row)

        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.layout_chplay, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element

        viewHolder.categoryList.layoutManager = LinearLayoutManager(
            viewHolder.categoryList.context,
            LinearLayoutManager.HORIZONTAL,
            false
        )
        viewHolder.category.text = dataCategory[position].category
        viewHolder.categoryList.adapter = ItemAdapter(dataCategory[position].items)

    }



    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataCategory.size

}