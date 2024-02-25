package com.example.snappdf.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.snappdf.Entities.NotesEntity
import com.example.snappdf.databinding.ItemNotesBinding

class NotesAdapter(private var list: MutableList<NotesEntity>, var context: Context) :
    RecyclerView.Adapter<NotesAdapter.ViewHolder>() {
    inner class ViewHolder(private val binding: ItemNotesBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(model: NotesEntity, context: Context) {
            binding.apply {
                mNote.text = model.note
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemNotesBinding.inflate(LayoutInflater.from(context), parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(model = list[position], context = context)
    }
}