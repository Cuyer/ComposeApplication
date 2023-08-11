package com.example.core.domain.model

sealed class ActivityLevel {
    data object Low : ActivityLevel()

    data object Medium : ActivityLevel()

    data object High : ActivityLevel()


    companion object {
        fun fromString(activityLevel: String): ActivityLevel {
            return when (activityLevel) {
                Low.toString() -> Low
                Medium.toString() -> Medium
                High.toString() -> High
                else -> Medium
            }
        }
    }
}
