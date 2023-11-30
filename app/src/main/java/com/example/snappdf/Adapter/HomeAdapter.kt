package com.example.snappdf.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.snappdf.CategoryActivity
import com.example.snappdf.Utils.loadOnline
import com.example.snappdf.ViewModel.BooksModel
import com.example.snappdf.ViewModel.HomeModel
import com.example.snappdf.databinding.ItemBodBinding
import com.example.snappdf.databinding.ItemHomeBinding

const val LAYOUT_HOME = 0
const val LAYOUT_BOD = 1

class HomeAdapter(val list: ArrayList<HomeModel>, val context: Context) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class HomeItemViewHolder(val binding: ItemHomeBinding) : RecyclerView.ViewHolder(binding.root) {

        val viewPool = RecyclerView.RecycledViewPool()

        fun bind(model: HomeModel, context: Context) {
            binding.apply {
                model.apply {
                    categoryTitle.text = catTitle

                    seeAllBtn.setOnClickListener {
                        val intent = Intent()
                        intent.putExtra("book_list", booksList)
                        intent.setClass(context, CategoryActivity::class.java)
                        context.startActivity(intent)
                    }
                    if (booksList != null) {
                        childRvBooks.setupChildRv(booksList, context)
                    }
                }
            }
        }

        private fun RecyclerView.setupChildRv(list: ArrayList<BooksModel>, context: Context){
            val adapter = HomeChildAdapter(list, context)
            this.adapter = adapter
            setRecycledViewPool(viewPool)
        }

    }

    class BODItemViewHolder(val binding: ItemBodBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(model: HomeModel, context: Context) {

            binding.apply {
                model.bod?.apply {
                    imageView.loadOnline(image)

                    readBookBtn.setOnClickListener {

                    }

                }
            }

        }
    }

    override fun getItemViewType(position: Int): Int {
        val model = list[position]
        return when (model.LAYOUT_TYPE) {
            LAYOUT_HOME -> LAYOUT_HOME
            else -> LAYOUT_BOD
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            LAYOUT_HOME -> {
                HomeItemViewHolder(
                    ItemHomeBinding.inflate(
                        LayoutInflater.from(context),
                        parent,
                        false
                    )
                )
            }

            else -> {
                BODItemViewHolder(
                    ItemBodBinding.inflate(
                        LayoutInflater.from(context),
                        parent,
                        false
                    )
                )
            }
        }
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val model = list[position]

        when (model.LAYOUT_TYPE) {
            LAYOUT_HOME -> {
                (holder as HomeItemViewHolder).bind(model, context)
            }

            else -> {
                (holder as BODItemViewHolder).bind(model, context)
            }
        }

    }

}