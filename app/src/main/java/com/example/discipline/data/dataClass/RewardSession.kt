package com.example.discipline.data.dataClass

import java.security.Timestamp

data class RewardSession(
    val id: String = "",
    val startTime: Timestamp? = null,
    val endTime: Timestamp? = null,
    val duration: Long = 0,
    val isActive: Boolean = true,
)
