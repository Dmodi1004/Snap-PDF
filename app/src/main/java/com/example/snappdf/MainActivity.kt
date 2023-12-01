package com.example.snappdf

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.snappdf.Adapter.HomeAdapter
import com.example.snappdf.Adapter.LAYOUT_BOD
import com.example.snappdf.Repository.MainRepo
import com.example.snappdf.Utils.MyResponses
import com.example.snappdf.View.MainViewModel
import com.example.snappdf.View.MainViewModelFactory
import com.example.snappdf.ViewModel.BooksModel
import com.example.snappdf.ViewModel.HomeModel
import com.example.snappdf.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val activity = this
    private val list: ArrayList<HomeModel> = ArrayList()
    private val adapter = HomeAdapter(list, activity)

    private val repo = MainRepo(activity)
    private val viewModel by lazy {
        ViewModelProvider(activity, MainViewModelFactory(repo))[MainViewModel::class.java]
    }

    private val TAG = "Main Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            rvHome.adapter = adapter

            viewModel.getHomeData()
            handleHomeBackend()

            /*val tempModel = BooksModel(
                image = "https://imgs.search.brave.com/14B1ZDgcDf3m9n67U_59Huk5y42swL5lAxGeO2oKszQ/rs:fit:860:0:0/g:ce/aHR0cHM6Ly93YWxs/cGFwZXJjYXZlLmNv/bS93cC93cDY2Njg2/ODUuanBn",
                title = "Rich dad poor dad",
                description = "In this book about reading, author Rohan Joshi shares his passion for reading and provides insights into the benefits of reading. The book offers practical advice on how to develop a reading habit, choose books, and make the most of reading time.",
                author = "Robert",
                bookPDF = "https://css4.pub/2015/icelandic/dictionary.pdf"
            )*/
        }

    }

    private fun handleHomeBackend() {
        viewModel.homeLiveData.observe(activity) {
            when (it) {
                is MyResponses.Error -> {
                    Log.i(TAG, "handleHomeBackend: ${it.errorMessage}")
                }

                is MyResponses.Loading -> {
                    Log.i(TAG, "handleHomeBackend: Loading...")
                }

                is MyResponses.Success -> {
                    val tempList = it.data
                    tempList?.forEach {
                        list.add(it)
                        adapter.notifyItemChanged(list.size)
                    }
                }
            }
        }
    }
}