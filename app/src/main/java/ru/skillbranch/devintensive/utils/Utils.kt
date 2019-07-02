package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName: String?): Pair<String?, String?> {
        val parts: List<String>? = fullName?.split(" ")
        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)
        return firstName to lastName
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        val n = firstName?.getOrNull(0)
        val l = lastName?.getOrNull(0)
        return when {
            (n != null && l != null) -> ("$n$l").toUpperCase()
            (n != null && l == null) -> ("$n").toUpperCase()
            else -> null
        }

    }
}