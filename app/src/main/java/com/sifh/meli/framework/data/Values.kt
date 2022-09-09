package com.sifh.meli.framework.data

import com.google.gson.annotations.SerializedName


data class Values (

  @SerializedName("id"      ) var id      : String? = null,
  @SerializedName("name"    ) var name    : String? = null,
  @SerializedName("struct" ) var struct : Struct?    = null,
  @SerializedName("source" ) var source : Long?    = null

)