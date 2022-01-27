package com.robe.myapplication.dataclasses

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Attributes(
    val title: String,
    val slug: String,
    val content: String,

    @SerialName("created-at")
    val created_at: String,

    @SerialName("updated-at")
    val updated_at: String

    )
