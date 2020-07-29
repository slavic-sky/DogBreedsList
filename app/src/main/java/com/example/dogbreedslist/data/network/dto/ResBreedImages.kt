package com.example.dogbreedslist.data.network.dto

import com.squareup.moshi.Json

data class ResBreedImages(@Json(name = "message")
                       val images: List<String>?,
                          @Json(name = "status")
                       val status: String = "")