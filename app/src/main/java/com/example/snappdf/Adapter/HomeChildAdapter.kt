package com.example.snappdf.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.snappdf.DetailsActivity
import com.example.snappdf.Utils.loadOnline
import com.example.snappdf.ViewModel.BooksModel
import com.example.snappdf.databinding.ItemBookBinding

class HomeChildAdapter(val list: ArrayList<BooksModel>, val context: Context) :
    RecyclerView.Adapter<HomeChildAdapter.ChildViewHolder>() {

    class ChildViewHolder(val binding: ItemBookBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(model: BooksModel, context: Context) {
            binding.apply {
                model.apply {
                    imageView.loadOnline(image)
                    cardView.setOnClickListener {
                        Intent().apply {
                            putExtra("book_model", model)
                            setClass(context, DetailsActivity::class.java)
                            context.startActivity(this)
                        }
                    }
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder {
        return ChildViewHolder(ItemBookBinding.inflate(LayoutInflater.from(context), parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {
        val model = list[position]
        holder.bind(model, context)
    }

}