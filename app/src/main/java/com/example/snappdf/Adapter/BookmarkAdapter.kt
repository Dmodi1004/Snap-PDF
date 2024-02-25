package com.example.snappdf.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.snappdf.Fragments.ToolsViewModel
import com.example.snappdf.databinding.ItemBookmarksBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BookmarkAdapter(
    private var list: MutableList<Int>,
    private var viewModel: ToolsViewModel,
    var fragment: BottomSheetDialogFragment,
    var context: Context
) :
    RecyclerView.Adapter<BookmarkAdapter.ViewHolder>() {
    inner class ViewHolder(private val binding: ItemBookmarksBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(pageNub: Int, context: Context) {
            binding.apply {
                mBtnBookmark.text = "${pageNub + 1}"
                mBtnBookmark.setOnClickListener {
                    viewModel.jumpToPage(pageNub)
                    fragment.dismiss()
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemBookmarksBinding.inflate(LayoutInflater.from(context), parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position], context)
    }
}