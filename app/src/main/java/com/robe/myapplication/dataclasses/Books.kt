package com.robe.myapplication.dataclasses
import kotlinx.serialization.Serializable

@Serializable
data class Books(
    val type: String,
    val id: String,
    val attributes: Attributes,
    val relationships: Relationships,
    val links: Links
)
