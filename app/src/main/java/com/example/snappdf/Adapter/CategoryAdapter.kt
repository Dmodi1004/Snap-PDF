package com.example.snappdf.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.snappdf.DetailsActivity
import com.example.snappdf.Utils.loadOnline
import com.example.snappdf.ViewModel.BooksModel
import com.example.snappdf.databinding.ItemCategoryBinding

class CategoryAdapter(val list: ArrayList<BooksModel>, val context: Context) :
    RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    class CategoryViewHolder(private val binding: ItemCategoryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(model: BooksModel, context: Context) {
            binding.apply {
                bookImage.loadOnline(model.image)
                bookTitle.text = model.title
                authorName.text = model.author
                bookDesc.text = model.description

                binding.root.setOnClickListener {
                    Intent().apply {
                        putExtra("book_model", model)
                        setClass(context, DetailsActivity::class.java)
                        context.startActivity(this)
                    }
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(
            ItemCategoryBinding.inflate(
                LayoutInflater.from(context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bind(
            model = list[position], context = context
        )
    }

}