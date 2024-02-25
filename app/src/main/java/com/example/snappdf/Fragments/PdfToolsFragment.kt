package com.example.snappdf.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.snappdf.Adapter.ToolsAdapter
import com.example.snappdf.Enums.ToolsType
import com.example.snappdf.Models.ToolsModel
import com.example.snappdf.PdfActivity
import com.example.snappdf.R
import com.example.snappdf.databinding.FragmentPdfToolsBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class PdfToolsFragment : BottomSheetDialogFragment() {

    private val binding by lazy {
        FragmentPdfToolsBinding.inflate(layoutInflater)
    }

    private val list: MutableList<ToolsModel> = mutableListOf()

    private val viewMode by lazy {
        val mActivity = requireActivity() as PdfActivity
        ViewModelProvider(mActivity, ToolsViewModelFactory(mActivity))[ToolsViewModel::class.java]
    }

    private val adapter by lazy {
        ToolsAdapter(list, viewModel = viewMode, fragment = this, requireActivity())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        rvInit()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = binding.root

    private fun rvInit() {
        binding.mToolsRv.adapter = adapter
        list.apply {
            add(ToolsModel("Bookmarks Me", R.drawable.ic_bookmark, ToolsType.ADD_TO_BOOKMARKS))
            add(ToolsModel("My Bookmarks", R.drawable.ic_collection_bookmark, ToolsType.BOOKMARKS))
            add(ToolsModel("My Notes", R.drawable.ic_note_add, ToolsType.NOTES))
            add(ToolsModel("Dark Mode", R.drawable.ic_dark_mode, ToolsType.NIGHT_MODE))
        }

    }

}