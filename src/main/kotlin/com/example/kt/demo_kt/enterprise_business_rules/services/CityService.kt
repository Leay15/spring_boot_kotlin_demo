package com.example.kt.demo_kt.enterprise_business_rules.services

import com.example.kt.demo_kt.enterprise_business_rules.entities.City as CityEntity
import com.example.kt.demo_kt.enterprise_business_rules.models.City

interface CityService {

    fun create(city: City): CityEntity

    fun findAll(): List<CityEntity>
}