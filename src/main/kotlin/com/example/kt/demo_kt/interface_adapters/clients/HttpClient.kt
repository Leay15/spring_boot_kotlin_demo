package com.example.kt.demo_kt.interface_adapters.clients

import okhttp3.Cache
import okhttp3.OkHttp
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File

object HttpClient {

    private const val cacheSize = 10 * 1024 * 1024L
    private val cache = Cache(File("/src/cache/"), cacheSize)

    private val httpClientBuilder = OkHttpClient.Builder()

    val retrofit = Retrofit.Builder()
        .baseUrl("https://pokeapi.co/api/v2/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(httpClientBuilder.cache(cache).build())
        .build()

    inline fun <reified T> createService(): T = retrofit.create(T::class.java)
}