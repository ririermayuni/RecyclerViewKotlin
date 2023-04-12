package com.example.recyclerviewkotlin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Superhero(
    val imgsuperhero: Int,
    val nameSuperhero: String,
    val desSuperhero: String
) : Parcelable
