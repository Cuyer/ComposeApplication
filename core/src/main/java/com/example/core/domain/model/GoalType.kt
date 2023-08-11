package com.example.core.domain.model

sealed class GoalType {
    data object LoseWeight : GoalType()

    data object KeepWeight : GoalType()

    data object GainWeight : GoalType()

   companion object {
        fun fromString(goalType: String): GoalType {
            return when (goalType) {
                LoseWeight.toString() -> LoseWeight
                KeepWeight.toString() -> KeepWeight
                GainWeight.toString() -> GainWeight
                else -> KeepWeight
            }
        }
    }
}
