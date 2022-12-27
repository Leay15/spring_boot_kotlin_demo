package com.example.kt.demo_kt.enterprise_business_rules.models

import com.google.gson.annotations.SerializedName

data class PokeApiList(
    @SerializedName("count") val count: Int,
    @SerializedName("next") val next: String,
    @SerializedName("previous") val previous: String,
    @SerializedName("results") val results: List<Pokemon?>
)