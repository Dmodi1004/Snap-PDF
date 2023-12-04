package com.example.snappdf

import android.app.ActionBar
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.snappdf.Repository.BookRepo
import com.example.snappdf.Utils.MyResponses
import com.example.snappdf.Utils.loadOnline
import com.example.snappdf.View.BookViewModel
import com.example.snappdf.View.BookViewModelFactory
import com.example.snappdf.Models.BooksModel
import com.example.snappdf.databinding.ActivityDetailsBinding
import com.example.snappdf.databinding.LayoutProgressBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding
    private val activity = this

    private val repo = BookRepo(activity)
    private val viewModel by lazy {
        ViewModelProvider(
            activity,
            BookViewModelFactory(repo)
        )[BookViewModel::class.java]
    }

    private val TAG = "Details Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bookModel = intent.getSerializableExtra("book_model") as BooksModel

        binding.apply {

            bookModel.apply {
                bookTitle.text = title
                authorName.text = author
                bookDesc.text = description
                bookImage.loadOnline(image)
            }

            readBook.setOnClickListener {
                viewModel.downloadFile(bookModel.bookPDF, "${bookModel.title}.pdf")
            }

            val dialogBinding = LayoutProgressBinding.inflate(layoutInflater)
            val dialog = Dialog(activity).apply {
                setCancelable(false)
                setContentView(dialogBinding.root)

                this.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                this.window!!.setLayout(
                    ActionBar.LayoutParams.MATCH_PARENT,
                    ActionBar.LayoutParams.WRAP_CONTENT
                )
            }

            viewModel.downloadLiveData.observe(activity) {
                when (it) {
                    is MyResponses.Error -> {
                        dialog.dismiss()
                        Log.e(TAG, "onCreate: ${it.errorMessage}")
                    }

                    is MyResponses.Loading -> {
                        dialogBinding.progress.text = "${it.progress}%"
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                            dialogBinding.progressBar.setProgress(it.progress, true)
                        } else {
                            dialogBinding.progressBar.progress = it.progress
                        }
                        dialog.show()
                        Log.i(TAG, "onCreate: ${it.progress}")
                    }

                    is MyResponses.Success -> {
                        dialog.dismiss()
                        Log.i(TAG, "onCreate: Downloaded ${it.data}")
                        Intent().apply {
                            putExtra("book_pdf", it.data?.filePath)
                            setClass(activity, PdfActivity::class.java)
                            startActivity(this)
                        }
                    }
                }
            }
        }
    }
}