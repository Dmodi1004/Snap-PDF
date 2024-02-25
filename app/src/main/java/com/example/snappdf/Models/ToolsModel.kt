package com.example.snappdf.Models

import androidx.annotation.DrawableRes
import com.example.snappdf.Enums.ToolsType

data class ToolsModel(
    val title: String,
    @DrawableRes
    val image: Int,
    val type: ToolsType
)
