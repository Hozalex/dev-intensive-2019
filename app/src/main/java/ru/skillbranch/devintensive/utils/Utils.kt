package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName: String?): Pair<String?, String?> {
        val parts: List<String>? = fullName?.split(" ")
        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)

        return when {
            firstName == "" -> return null to null
            firstName == " " -> return null to null
            else -> firstName to lastName
        }
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        val n = firstName?.getOrNull(0)
        val l = lastName?.getOrNull(0)
        return when {
            n == null -> null
            l == null -> ("$n").toUpperCase()
            else -> ("$n$l").toUpperCase()
        }

    }

    fun transliteration(payload: String, divider: String = " "): String {
        TODO()
    }
}