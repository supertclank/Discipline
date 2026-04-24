package com.example.discipline.data.dataClass

import android.util.Log.e
import java.security.Timestamp

data class User(
    val id: String = "",
    val firstName: String = "",
    val lastName: String = "",
    val email: String = "",
    val password: String = "",
    val createdAt: Timestamp? = null,
    val isActive: Boolean = true,
)

