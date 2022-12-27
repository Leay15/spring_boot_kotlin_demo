package com.example.kt.demo_kt.interface_adapters.controllers

import com.example.kt.demo_kt.enterprise_business_rules.models.Pokemon
import com.example.kt.demo_kt.enterprise_business_rules.models.City
import com.example.kt.demo_kt.enterprise_business_rules.entities.City as CityEntity
import com.example.kt.demo_kt.enterprise_business_rules.services.CityService
import com.example.kt.demo_kt.enterprise_business_rules.services.PokemonService
import org.springframework.web.bind.annotation.*

@RestController
class LoginController constructor(val cityService: CityService, val pokemonService: PokemonService) {

    @PostMapping("/addCities")
    fun createCity(@RequestBody city: City): CityEntity {
        val city = cityService.create(city)
        return city
    }

    @GetMapping("/showCities")
    fun findCities(): List<CityEntity> {
        val cities = cityService.findAll()
        return cities
    }

    @GetMapping("/getPokemon")
    fun getPokemons(): List<Pokemon> {
        val pokemonsFuture = pokemonService.getPokemon().join()
        println(pokemonsFuture)
        return pokemonsFuture.results.map {
            it?.run {
                Pokemon(id, name)
            } ?: Pokemon(-1L, "No Name")
        }
    }

}