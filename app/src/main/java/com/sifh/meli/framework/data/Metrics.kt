package com.sifh.meli.framework.data

import com.google.gson.annotations.SerializedName


data class Metrics (

    @SerializedName("cancellations"         ) var cancellations       : Cancellations?       = Cancellations(),
    @SerializedName("claims"                ) var claims              : Claims?              = Claims(),
    @SerializedName("delayed_handling_time" ) var delayedHandlingTime : DelayedHandlingTime? = DelayedHandlingTime(),
    @SerializedName("sales"                 ) var sales               : Sales?               = Sales()

)