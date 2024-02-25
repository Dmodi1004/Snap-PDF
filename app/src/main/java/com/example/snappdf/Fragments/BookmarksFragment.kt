package com.example.snappdf.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.snappdf.Adapter.BookmarkAdapter
import com.example.snappdf.Adapter.ToolsAdapter
import com.example.snappdf.AppDatabase
import com.example.snappdf.Models.ToolsModel
import com.example.snappdf.PdfActivity
import com.example.snappdf.R
import com.example.snappdf.databinding.FragmentBookmarksBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class BookmarksFragment : BottomSheetDialogFragment() {

    private val binding by lazy {
        FragmentBookmarksBinding.inflate(layoutInflater)
    }

    private val viewMode by lazy {
        val mActivity = requireActivity() as PdfActivity
        ViewModelProvider(mActivity, ToolsViewModelFactory(mActivity))[ToolsViewModel::class.java]
    }

    private val list: MutableList<Int> = mutableListOf()
    private val adapter by lazy {
        BookmarkAdapter(list, viewModel = viewMode, fragment = this, context = requireActivity())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.apply {
            mBookmarksRv.adapter = adapter
            getData()
        }
    }

    private fun getData() {
        val mactivity = requireActivity() as PdfActivity
        val database = AppDatabase.getDatabase(requireActivity())
        CoroutineScope(Dispatchers.IO).launch {
            database?.bookmarksDao()?.getBookmarks(bookId = mactivity.bookId)?.forEach {
                list.add(it.pageNub)
            }
            mactivity.runOnUiThread {
                adapter.notifyDataSetChanged()
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = binding.root

}