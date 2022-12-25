package com.example.kt.demo_kt.application_business_rules.repositories

import com.example.kt.demo_kt.enterprise_business_rules.entities.City
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CityRepository: CrudRepository<City, String> {
}