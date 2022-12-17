package com.example.disample3

data class Skills(val skillList:List<SkillModel>)

data class SkillModel(val skillName:String, val proficiencyRate:Int)