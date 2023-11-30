package com.example.snappdf

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.snappdf.Adapter.HomeAdapter
import com.example.snappdf.Adapter.LAYOUT_BOD
import com.example.snappdf.ViewModel.BooksModel
import com.example.snappdf.ViewModel.HomeModel
import com.example.snappdf.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val activity = this
    private val list: ArrayList<HomeModel> = ArrayList()
    private val adapter = HomeAdapter(list, activity)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            rvHome.adapter = adapter

            val tempList = ArrayList<BooksModel>()
            val tempModel = BooksModel(
                image = "https://imgs.search.brave.com/14B1ZDgcDf3m9n67U_59Huk5y42swL5lAxGeO2oKszQ/rs:fit:860:0:0/g:ce/aHR0cHM6Ly93YWxs/cGFwZXJjYXZlLmNv/bS93cC93cDY2Njg2/ODUuanBn",
                title = "Rich dad poor dad",
                description = "In this book about reading, author Rohan Joshi shares his passion for reading and provides insights into the benefits of reading. The book offers practical advice on how to develop a reading habit, choose books, and make the most of reading time.",
                author = "Robert",
                bookPDF = "https://css4.pub/2015/icelandic/dictionary.pdf"
            )
            for (i in 1..5) {
                tempList.add(
                    tempModel
                )
            }

            list.add(
                HomeModel(
                    catTitle = null, booksList = null, bod = tempModel, LAYOUT_TYPE = LAYOUT_BOD
                )
            )

            list.add(
                HomeModel(
                    catTitle = "Self Improvement",
                    booksList = tempList
                )
            )
            list.add(
                HomeModel(
                    catTitle = "Financial Books",
                    booksList = tempList
                )
            )

        }

    }
}