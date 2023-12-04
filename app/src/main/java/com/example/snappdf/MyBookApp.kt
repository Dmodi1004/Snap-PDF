package com.example.snappdf

import android.app.Application
import com.google.firebase.database.FirebaseDatabase

class MyBookApp(): Application() {

    override fun onCreate() {
        super.onCreate()
        FirebaseDatabase.getInstance().setPersistenceEnabled(true)
    }

}