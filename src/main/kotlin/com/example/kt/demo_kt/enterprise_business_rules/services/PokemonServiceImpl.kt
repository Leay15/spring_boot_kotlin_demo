package com.example.kt.demo_kt.enterprise_business_rules.services

import com.example.kt.demo_kt.enterprise_business_rules.models.PokeApiList
import com.example.kt.demo_kt.enterprise_business_rules.services.pokeapi.PokeApiService
import com.example.kt.demo_kt.interface_adapters.clients.HttpClient
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Service
import java.util.concurrent.CompletableFuture

@Service
class PokemonServiceImpl : PokemonService {

    var pokeApiService: PokeApiService = HttpClient.createService()

    @Async
    override fun getPokemon(): CompletableFuture<PokeApiList> {
        return pokeApiService.getPokemonList()
    }
}