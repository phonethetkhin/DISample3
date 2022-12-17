package com.example.disample3

data class Hobbies(val hobbiesList: List<HobbiesModel>)

data class HobbiesModel(val hobbyName: String, val passionateLevel: Int)