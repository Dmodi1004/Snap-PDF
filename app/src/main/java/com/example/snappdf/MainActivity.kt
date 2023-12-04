package com.example.snappdf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.snappdf.Adapter.HomeAdapter
import com.example.snappdf.Models.HomeModel
import com.example.snappdf.Repository.MainRepo
import com.example.snappdf.Utils.MyResponses
import com.example.snappdf.Utils.SpringScrollHelper
import com.example.snappdf.Utils.removeWithAnim
import com.example.snappdf.Utils.showWithAnim
import com.example.snappdf.ViewModels.MainViewModel
import com.example.snappdf.ViewModels.MainViewModelFactory
import com.example.snappdf.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val activity = this
    val list: ArrayList<HomeModel> = ArrayList()
    val adapter = HomeAdapter(list, activity)
    private val TAG = "MainActivity"
    private val repo = MainRepo(activity)
    private val viewModel by lazy {
        ViewModelProvider(activity, MainViewModelFactory(repo))[MainViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            rvHome.adapter = adapter
//            SpringScrollHelper().attachToRecyclerView(rvHome)
            viewModel.getHomeData()
            handleHomeBackend()

            errorLayout.tryAgainBtn.setOnClickListener {
                viewModel.getHomeData()
            }
        }

    }

    private fun handleHomeBackend() {
        viewModel.homeLiveData.observe(activity) {
            when (it) {
                is MyResponses.Error -> {
                    Log.i(TAG, "handleHomeBackend: ${it.errorMessage}")
                    binding.errorHolder.showWithAnim()
                    binding.loaderHolder.removeWithAnim()
                }

                is MyResponses.Loading -> {
                    Log.i(TAG, "handleHomeBackend: Loading...")
                    binding.errorHolder.removeWithAnim()
                    binding.loaderHolder.showWithAnim()
                }

                is MyResponses.Success -> {
                    binding.errorHolder.removeWithAnim()
                    binding.loaderHolder.removeWithAnim()
                    val tempList = it.data
                    list.clear()
                    Log.i(TAG, "handleHomeBackend: Success Called $tempList ")
                    tempList?.forEach {
                        list.add(it)
                    }
                    adapter.notifyDataSetChanged()
                }
            }

        }
    }

}