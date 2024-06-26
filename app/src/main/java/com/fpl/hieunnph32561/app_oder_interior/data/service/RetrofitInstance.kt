package com.fpl.hieunnph32561.app_oder_interior.data.service

object RetrofitInstance {
    private const val BASE_URL = "http://10.0.3.2:3000/api/"

    val apiService: ApiService by lazy {
        retrofit2.Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(retrofit2.converter.gson.GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}