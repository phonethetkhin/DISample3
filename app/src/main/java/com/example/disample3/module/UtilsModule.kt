package com.example.disample3.module

import com.example.disample3.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UtilsModule {

    @Singleton
    @Provides
    fun provideAccomplishments() = Accomplishments(
        arrayListOf(
            AccomplishmentsModel(
                "Material Tracking Project",
                "Mobile Project",
                "3 months",
                "application with rfid and barcode scanning of the stock in the warehouse"
            ),
            AccomplishmentsModel(
                "Republic of Singapore Air Force",
                "Mobile Project",
                "1 weeks",
                "Mobile app that scan rfid for the military air force of the Republic of Singapore"
            )
        )
    )

    @Singleton
    @Provides
    fun provideHobbies() = Hobbies(
        arrayListOf(
            HobbiesModel("Mobile Development", 10),
            HobbiesModel("Music Creation", 9),
            HobbiesModel("Gaming", 9),
            HobbiesModel("Martial Arts", 4),
            HobbiesModel("Piano", 9),
            HobbiesModel("Violin", 2),
        )
    )

    @Singleton
    @Provides
    fun provideSkills() = Skills(
        arrayListOf(
            SkillModel("Java", 10),
            SkillModel("Kotlin", 10),
            SkillModel("Dart", 5),
            SkillModel("Swift", 5),
            SkillModel("PHP", 2),
            SkillModel("C#", 2),
            SkillModel("Laravel Framework", 1),
            SkillModel("Android Framework", 10),
            SkillModel("Flutter Framework", 6),
            SkillModel("SwiftUI Framework", 1),
            SkillModel("Jetpack Compose Framework", 7),
        )
    )

    @Singleton
    @Provides
    fun provideInformation() =
        Information(provideHobbies(), provideSkills(), provideAccomplishments())

    @Singleton
    @Provides
    fun provideEducation() = Education(
        arrayListOf(
            EduModel(
                "University of Greenwich",
                "Bachelor Degree(hons)",
                "Bsc.(hons) in BIT",
                "2014-2017",
                "3 year studies with Business IT & have done 1 Laravel Project."
            ),
            EduModel(
                "University of East Yangon(Tarwa)",
                "Bachelor Degree",
                "B.A in English Language & Literatures",
                "2013-2017",
                "4 year studies with English Language & Literatures."
            )
        )
    )

    @Singleton
    @Provides
    fun provideExperience() = Experience(
        arrayListOf(
            ExpModel(
                "Nuzay Company",
                "Business Development Consultant(Software Sales)",
                "3 months",
                "Worked 3 months and sold application to 1 customer"
            ),
            ExpModel(
                "T3K Technology",
                "Junior Android Developer",
                "1 year & 6 months",
                "Worked 1 year & 6 months and Have done 4 applications"
            ),
            ExpModel(
                "FYI Myanmar",
                "Mobile Developer",
                "6 months",
                "Worked 6 months and Have done 1 Online shop application"
            ),
            ExpModel(
                "e-Tag RFID PTE.LTD",
                "Software Developer(Mobile)",
                "1 year",
                "Worked 1 year and still working in this company, developed 11 applications for the company."
            )

        )
    )

    @Singleton
    @Provides
    fun provideResume() = Resume(provideEducation(), provideExperience(), provideInformation())

    @Singleton
    @Provides
    fun provideEmployee() = Employee(
        "E01", "Thomas", provideEducation(), provideExperience(),
        provideResume(), provideInformation()
    )

    @Singleton
    @Provides
    fun provideCompany() = Company("eTag", provideEmployee())
}