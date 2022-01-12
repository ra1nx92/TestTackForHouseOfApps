package com.example.testtackforhouseofapps.data.network.model

import com.google.gson.annotations.SerializedName

data class AlbumsList(
    @SerializedName("userId") var userId: Int,
    @SerializedName("id") var id: Int,
    @SerializedName("title") var title: String

)