package com.example.lesson19

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CitiesData(
    val imageOfCity: Int,
    val imageOfEmblem: Int,
    val title: String,
    val desc: String
) : Parcelable
