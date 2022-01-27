package com.robe.myapplication.dataclasses
import kotlinx.serialization.Serializable

@Serializable
data class Links(
    val self: String,
    val related: String = ""
)
