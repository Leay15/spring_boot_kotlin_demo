package com.example.kt.demo_kt.enterprise_business_rules.models

import com.google.gson.annotations.SerializedName

data class Pokemon(@SerializedName("id") val id: Long, @SerializedName("name") val name: String)