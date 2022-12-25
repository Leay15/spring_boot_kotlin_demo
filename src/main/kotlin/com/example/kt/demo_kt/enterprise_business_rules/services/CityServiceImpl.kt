package com.example.kt.demo_kt.enterprise_business_rules.services

import com.example.kt.demo_kt.application_business_rules.repositories.CityRepository
import com.example.kt.demo_kt.enterprise_business_rules.models.City
import com.example.kt.demo_kt.enterprise_business_rules.entities.City as CityEntity
import org.springframework.stereotype.Service

@Service
class CityServiceImpl constructor(val cityRepository: CityRepository) : CityService {

    override fun create(city: City): CityEntity {
        return cityRepository.save(CityEntity(null,city.name,city.population))
    }

    override fun findAll(): List<CityEntity> {
        val cities = cityRepository.findAll()
        return cities.map {
            CityEntity(it.id, it.name, it.population)
        }
    }
}