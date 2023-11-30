package com.example.snappdf

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import com.example.snappdf.databinding.ActivityPdfBinding

class PdfActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPdfBinding
    val activity = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPdfBinding.inflate(layoutInflater)
        activity.window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(binding.root)

        binding.apply {
            val book_pdf = intent.getStringExtra("book_pdf").toString()
            Log.d("TAG", "onCreate: $book_pdf")
            pdfView.fromUri(Uri.parse(book_pdf))
                .swipeHorizontal(true)
                .enableSwipe(true)
                .pageSnap(true)
                .autoSpacing(true)
                .pageFling(true)
                .load()
        }

    }
}