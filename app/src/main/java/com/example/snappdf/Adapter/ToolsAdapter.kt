package com.example.snappdf.Adapter

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.snappdf.AppDatabase
import com.example.snappdf.Enums.ToolsType
import com.example.snappdf.Fragments.BookmarksFragment
import com.example.snappdf.Fragments.NotesFragment
import com.example.snappdf.Fragments.ToolsViewModel
import com.example.snappdf.Models.ToolsModel
import com.example.snappdf.databinding.ItemToolBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class ToolsAdapter(
    private var list: MutableList<ToolsModel>,
    var viewModel: ToolsViewModel,
    var fragment: BottomSheetDialogFragment,
    var context: Context
) :
    RecyclerView.Adapter<ToolsAdapter.ViewHolder>() {

    val activity = context as AppCompatActivity

    inner class ViewHolder(private val binding: ItemToolBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(model: ToolsModel, context: Context) {
            binding.apply {
                mTitle.text = model.title
                mImage.setImageResource(model.image)

                root.setOnClickListener {
                    handleClickEvent(model)
                }

            }
        }
    }

    private fun handleClickEvent(model: ToolsModel) {
        when (model.type) {
            ToolsType.BOOKMARKS -> {
                val bookmarksFragment = BookmarksFragment()
                bookmarksFragment.show(activity.supportFragmentManager, bookmarksFragment.tag)
                fragment.dismiss()
            }

            ToolsType.ADD_TO_BOOKMARKS -> {
                viewModel.addBookmark()
                fragment.dismiss()
            }

            ToolsType.NOTES -> {
                val notesFragment = NotesFragment()
                notesFragment.show(activity.supportFragmentManager, notesFragment.tag)
                fragment.dismiss()
            }

            ToolsType.NIGHT_MODE -> {
                viewModel.toggleNightMode()
                fragment.dismiss()
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemToolBinding.inflate(LayoutInflater.from(context), parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(model = list[position], context = context)
    }
}