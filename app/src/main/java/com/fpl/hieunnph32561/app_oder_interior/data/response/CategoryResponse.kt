package com.fpl.hieunnph32561.app_oder_interior.data.response

import com.google.gson.annotations.SerializedName

data class CategoryResponse(
    @SerializedName("_id") val cateID: String,
    val cateName: String,
    val image: String
)
