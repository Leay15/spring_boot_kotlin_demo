package com.example.kt.demo_kt.enterprise_business_rules.services

import com.example.kt.demo_kt.enterprise_business_rules.models.PokeApiList
import java.util.concurrent.CompletableFuture

interface PokemonService {

    fun getPokemon(): CompletableFuture<PokeApiList>
}