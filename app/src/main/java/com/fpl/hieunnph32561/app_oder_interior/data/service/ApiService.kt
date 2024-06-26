package com.fpl.hieunnph32561.app_oder_interior.data.service


import com.fpl.hieunnph32561.app_oder_interior.data.model.CartRequest
import com.fpl.hieunnph32561.app_oder_interior.data.model.LoginRequest
import com.fpl.hieunnph32561.app_oder_interior.data.model.RegisterRequest
import com.fpl.hieunnph32561.app_oder_interior.data.response.CategoryResponse
import com.fpl.hieunnph32561.app_oder_interior.data.response.ProductResponse
import com.fpl.hieunnph32561.app_oder_interior.data.response.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query


interface ApiService {
    @POST("register")
    suspend fun register(@Body registerReq: RegisterRequest): Response?

    @POST("login")
    suspend fun login(@Body loginRequest: LoginRequest): Response?

    @GET("categories")
    suspend fun getCategories(): List<CategoryResponse>

    @GET("products")
    suspend fun getProducts(@Query("cateID") cateID: String?): List<ProductResponse>

    @GET("get-product-by-id/{productID}")
    suspend fun getProductByID(@Path("productID") productID: String?): ProductResponse?


    //
    @POST
    suspend fun addcart(@Body addCartRequest: CartRequest): Response?




}