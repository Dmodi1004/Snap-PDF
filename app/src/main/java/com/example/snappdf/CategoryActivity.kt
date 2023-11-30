package com.example.snappdf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.snappdf.Adapter.CategoryAdapter
import com.example.snappdf.ViewModel.BooksModel
import com.example.snappdf.databinding.ActivityCategoryBinding
import com.example.snappdf.databinding.ActivityMainBinding

class CategoryActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityCategoryBinding.inflate(layoutInflater)
    }

    private val activity = this
    private val list = ArrayList<BooksModel>()
    private val adapter = CategoryAdapter(list, activity)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.apply {
            rvCategory.adapter = adapter

            val bookList = intent.getSerializableExtra("book_list") as ArrayList<BooksModel>
            bookList.forEach {
                list.add(it)
            }
        }

    }
}