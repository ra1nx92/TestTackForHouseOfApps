package com.example.testtackforhouseofapps.data.network.model

import com.google.gson.annotations.SerializedName

data class PostsList(
    @SerializedName("userId") var userId: Int,
    @SerializedName("id") var id: Int,
    @SerializedName("title") var title: String,
    @SerializedName("body") var body: String
    )