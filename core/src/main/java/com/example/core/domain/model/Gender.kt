package com.example.core.domain.model

sealed class Gender {
    data object Male : Gender()

    data object Female : Gender()

    companion object {
        fun fromString(name: String): Gender {
            return when (name) {
                Male.toString() -> Male
                Female.toString() -> Female
                else -> Male
            }
        }
    }
}
