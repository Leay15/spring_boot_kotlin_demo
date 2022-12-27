package com.example.kt.demo_kt.enterprise_business_rules.services.pokeapi

import com.example.kt.demo_kt.enterprise_business_rules.models.PokeApiList
import com.example.kt.demo_kt.enterprise_business_rules.models.Pokemon
import retrofit2.http.GET
import java.util.concurrent.CompletableFuture

interface PokeApiService {

    @GET("pokemon/")
    fun getPokemonList(): CompletableFuture<PokeApiList>
}