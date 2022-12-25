package com.example.kt.demo_kt.enterprise_business_rules.entities

import jakarta.persistence.*

@Entity
@Table(name = "cities")
class City(
    @Id @GeneratedValue(strategy = GenerationType.UUID) var id: String?,
    var name: String,
    var population: Int,
    var description: String? = null
)