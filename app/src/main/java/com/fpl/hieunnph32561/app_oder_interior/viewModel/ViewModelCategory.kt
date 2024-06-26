package com.fpl.hieunnph32561.app_oder_interior.viewModel

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fpl.hieunnph32561.app_oder_interior.data.response.CategoryResponse
import com.fpl.hieunnph32561.app_oder_interior.data.service.RetrofitInstance

import kotlinx.coroutines.launch

class ViewModelCategory:ViewModel() {

    private val _categories = mutableStateOf<List<CategoryResponse>>(emptyList())
    val categories: State<List<CategoryResponse>> = _categories

    fun categoryViewModel() {
        viewModelScope.launch {
            try {
                _categories.value = RetrofitInstance.apiService.getCategories()
                Log.d("TAG", "thanhcong: ${_categories.value}")
            } catch (e: Exception) {
                Log.d("TAG", "thatbai: ${e.message}")
            }
        }
    }
}