package com.example.tracker_domain.model

sealed class MealType {

    data object Breakfast : MealType()

    data object Lunch : MealType()

    data object Dinner : MealType()

    data object Snack : MealType()

    companion object {
        fun fromString(name: String): MealType {
            return when (name) {
                Breakfast.toString() -> Breakfast
                Lunch.toString() -> Lunch
                Dinner.toString() -> Dinner
                Snack.toString() -> Snack
                else -> Breakfast
            }
        }
    }
}