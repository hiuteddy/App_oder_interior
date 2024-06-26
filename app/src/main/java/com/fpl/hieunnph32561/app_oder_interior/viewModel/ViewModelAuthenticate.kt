package com.fpl.hieunnph32561.app_oder_interior.viewModel

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fpl.hieunnph32561.app_oder_interior.data.model.LoginRequest
import com.fpl.hieunnph32561.app_oder_interior.data.model.RegisterRequest
import com.fpl.hieunnph32561.app_oder_interior.data.response.Response
import com.fpl.hieunnph32561.app_oder_interior.data.service.RetrofitInstance

import kotlinx.coroutines.launch

class ViewModelAuthenticate:ViewModel() {

    private val _register = mutableStateOf<Response?>(null)
    val register: State<Response?> = _register

    fun registerViewModel(registerReq: RegisterRequest) {
        viewModelScope.launch {
            try {
                _register.value = RetrofitInstance.apiService.register(registerReq)
                Log.d("TAG", "thanhcong: ${_register.value}")
            } catch (e: Exception) {
                Log.d("TAG", "thatbai: ${e.message}")
            }
        }
    }

    private val _login = mutableStateOf<Response?>(null)
    val login: State<Response?> = _login

    fun loginViewModel(loginReq: LoginRequest) {
        viewModelScope.launch {
            try {
                _login.value = RetrofitInstance.apiService.login(loginReq)
                Log.d("TAG", "thanhcong: ${_login.value}")
            } catch (e: Exception) {
                Log.d("TAG", "thatbai: ${e.message}")
            }
        }
    }
}