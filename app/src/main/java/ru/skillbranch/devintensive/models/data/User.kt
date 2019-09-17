package ru.skillbranch.devintensive.models.data

import ru.skillbranch.devintensive.extensions.humanizeDiff
import ru.skillbranch.devintensive.utils.Utils
import java.util.*

/**
 * Created by A.Khozyainov on 28.07.19
 */

data class User(
        val id: String,
        var firstName: String?,
        var lastName: String?,
        var avatar: String?,
        var rating: Int = 0,
        var respect: Int = 0,
        var lastVisit: Date? = null,
        var isOnline: Boolean = false
) {
    fun toUserItem(): UserItem {
        val lastActivity = when {
            lastVisit == null -> "do not came in yet"
            isOnline -> "online"
            else -> "last time was in ${lastVisit}"
        }
        return UserItem(
                id,
                "${firstName.orEmpty()} ${lastName.orEmpty()}",
                Utils.toInitials(firstName, lastName),
                avatar,
                lastActivity,
                false,
                isOnline

        )
    }

    constructor(
            id: String,
            firstName: String?,
            lastName: String?
    ) : this(
            id = id,
            firstName = firstName,
            lastName = lastName,
            avatar = null
    )

    companion object Factory {
        private var lastId: Int = -1
        fun makeUser(fullName: String?): User {
            lastId++

            val (firstName, lastName) = Utils.parseFullName(fullName)
            return User(id = "$lastId", firstName = firstName, lastName = lastName)
        }
    }
}