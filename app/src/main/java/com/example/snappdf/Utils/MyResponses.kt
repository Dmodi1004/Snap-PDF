package com.example.snappdf.Utils

sealed class MyResponses<T>(
    val data: T? = null,
    val errorMessage: String? = null,
    val progress: Int = 0
) {

    class Loading<T>(private val mProgress: Int = 0): MyResponses<T>(progress = mProgress)

    class Success<T>(private val mData:T?): MyResponses<T>(data = mData)
    class Error<T>(private val mErrorMessage:String?): MyResponses<T>(errorMessage = mErrorMessage)

}