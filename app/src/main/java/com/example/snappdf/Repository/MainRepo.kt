package com.example.snappdf.Repository

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.example.snappdf.Utils.MyResponses
import com.example.snappdf.ViewModel.HomeModel
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MainRepo(val context: Context) {

    private val firebaseDatabase = FirebaseDatabase.getInstance()
    private val databaseRef = firebaseDatabase.getReference("AppData").child("Home")

    private val homeLD = MutableLiveData<MyResponses<ArrayList<HomeModel>>>()

    val homeLiveData get() = homeLD

    suspend fun getHomeData() {

        homeLiveData.postValue(MyResponses.Loading())

        databaseRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshots: DataSnapshot) {
                if (!snapshots.exists()) {
                    homeLiveData.postValue(MyResponses.Error("Data not exist."))
                    return
                }
                val tempList = ArrayList<HomeModel>()
                for (snapshot in snapshots.children) {
                    val homeModel = snapshot.getValue(HomeModel::class.java)
                    homeModel?.let {
                        tempList.add(homeModel)
                    }
                }
                if (tempList.size > 0)
                    homeLiveData.postValue(MyResponses.Success(tempList))
            }

            override fun onCancelled(error: DatabaseError) {
                homeLiveData.postValue(MyResponses.Error("Something went wrong. Please try again."))
            }

        })

    }

}