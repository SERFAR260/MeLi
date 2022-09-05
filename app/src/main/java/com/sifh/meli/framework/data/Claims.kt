package com.sifh.meli.framework.data

import com.google.gson.annotations.SerializedName


data class Claims (

  @SerializedName("period" ) var period : String? = null,
  @SerializedName("rate"   ) var rate   : Double? = null,
  @SerializedName("value"  ) var value  : Int?    = null

)