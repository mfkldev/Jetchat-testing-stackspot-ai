package com.example.compose.jetchat.model

import com.google.gson.annotations.SerializedName

data class AnyFixResponse(
    @SerializedName("id") val id: String = "",
    @SerializedName("title") val title: String = "",
    @SerializedName("image") val image: String = "",
    @SerializedName("year") val year: String = "",
    @SerializedName("plot") val plot: String = "",
    @SerializedName("inMyList") val inMyList: Boolean = false,
)
