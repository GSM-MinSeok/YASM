package com.minstone.happygsm.model.DTO

import com.google.gson.annotations.SerializedName

data class MenuInfoModel(
    @SerializedName("DDISH_NM")
    var menu : String?,
    @SerializedName("SCHUL_NM")
    var schoolName : String?,
    @SerializedName("MMEAL_SC_NM")
    var mealName:String?,
    @SerializedName("MLSV_YMD")
    var date:String?
)
