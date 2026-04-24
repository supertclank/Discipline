package com.example.discipline.data.dataClass

import java.security.Timestamp

data class WorkSession(
    val id: String = "",
    val projectId: String = "",
    val startTime: Timestamp? = null,
    val endTime: Timestamp? = null,
    val duration: Long = 0,
    val notes: String = "",
    val isActive: Boolean = true,
)
