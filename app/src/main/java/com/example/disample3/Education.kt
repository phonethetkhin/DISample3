package com.example.disample3

data class Education(
    val educationList: List<EduModel>

)

data class EduModel(
    val schoolName: String,
    val qualificationType: String,
    val degreeName: String,
    val attendedYear: String,
    val description: String
)