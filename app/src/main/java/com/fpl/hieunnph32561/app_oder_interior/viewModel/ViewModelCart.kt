package com.fpl.hieunnph32561.app_oder_interior.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fpl.hieunnph32561.app_oder_interior.data.model.CartRequest
import com.fpl.hieunnph32561.app_oder_interior.data.service.ApiService
import com.fpl.hieunnph32561.app_oder_interior.data.service.RetrofitInstance.apiService
import kotlinx.coroutines.launch

class ViewModelCart : ViewModel() {

    fun addBillViewModel(productID: String,userID: String, quantity: Int) {
        viewModelScope.launch {
            try {
                val request = CartRequest(productID, userID , quantity)
                val response = apiService.addcart(request)
                Log.d("TAG", "Thêm bill thành công: $response")
            } catch (e: Exception) {
                Log.d("TAG", "Thêm bill thất bại: ${e.message}")
            }
        }
    }
}