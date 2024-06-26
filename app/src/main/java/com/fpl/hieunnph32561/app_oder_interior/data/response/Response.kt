package com.fpl.hieunnph32561.app_oder_interior.data.response

data class Response(
    val status: Int,
    val message: String,
    val data: Data? // Giả sử thông tin người dùng nằm trong đối tượng này
)

data class Data(
    val userID: String // Thêm thuộc tính này
)
