package com.example.snappdf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import com.example.snappdf.Adapter.CategoryAdapter
import com.example.snappdf.Models.BooksModel
import com.example.snappdf.Utils.SpringScrollHelper
import com.example.snappdf.databinding.ActivityCategoryBinding

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

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        // Enable the Up button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        binding.apply {
            rvCategory.adapter = adapter
//            SpringScrollHelper().attachToRecyclerView(rvCategory)

            val bookList = intent.getSerializableExtra("book_list") as ArrayList<BooksModel>
            bookList.forEach {
                list.add(it)
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
        with(window) {
            sharedElementReenterTransition = null
            sharedElementReturnTransition = null
        }
        binding.rvCategory.transitionName = null
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                // Handle the back arrow click
                onBackPressed()
                return true
            }
            // Handle other menu items if needed
            else -> return super.onOptionsItemSelected(item)
        }
    }


}