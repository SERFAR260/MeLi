package com.sifh.meli.framework.data

import com.google.gson.annotations.SerializedName
import com.sifh.meli.framework.data.Ratings


data class Transactions (

    @SerializedName("canceled"  ) var canceled  : Int?     = null,
    @SerializedName("period"    ) var period    : String?  = null,
    @SerializedName("total"     ) var total     : Int?     = null,
    @SerializedName("ratings"   ) var ratings   : Ratings? = Ratings(),
    @SerializedName("completed" ) var completed : Int?     = null

)