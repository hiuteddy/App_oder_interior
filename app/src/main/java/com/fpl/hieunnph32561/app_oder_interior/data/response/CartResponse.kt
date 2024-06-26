package com.fpl.hieunnph32561.app_oder_interior.data.response

import com.google.gson.annotations.SerializedName

data class CartResponse (
    @SerializedName("_id") val productID: String,
    @SerializedName("_id") val userID: String,
    val quality: Int
)