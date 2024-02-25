package com.example.snappdf

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import androidx.core.net.toUri
import androidx.lifecycle.ViewModelProvider
import com.example.snappdf.Fragments.PdfToolsFragment
import com.example.snappdf.Fragments.ToolsViewModel
import com.example.snappdf.Fragments.ToolsViewModelFactory
import com.example.snappdf.databinding.ActivityPdfBinding
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle

class PdfActivity : AppCompatActivity() {

    lateinit var binding: ActivityPdfBinding
    val activity = this

    lateinit var bookPdf: String
    lateinit var bookId: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPdfBinding.inflate(layoutInflater)
        this.window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(binding.root)

        setUpBasicViews();

        binding.apply {

            bookPdf = intent.getStringExtra("book_pdf").toString()
            bookId = intent.getStringExtra("book_id").toString()

            pdfView.fromUri(bookPdf.toUri())
                .swipeHorizontal(false)
                .scrollHandle(DefaultScrollHandle(activity))
                .enableSwipe(true)
                .pageSnap(true)
                .autoSpacing(true)
                .pageFling(true)
                .load()
        }

    }

    private fun setUpBasicViews() {

        binding.mToolsFab.setOnClickListener {
            val toolsBottomSheets = PdfToolsFragment()
            toolsBottomSheets.show(supportFragmentManager, toolsBottomSheets.tag)

        }

    }
}