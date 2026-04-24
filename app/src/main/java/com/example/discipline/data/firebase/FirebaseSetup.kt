package com.example.discipline.data.firebase

import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import com.google.firebase.firestore.firestoreSettings
import com.google.firebase.firestore.memoryCacheSettings
import com.google.firebase.firestore.persistentCacheSettings

private fun FirebaseSetup () {

    val db = Firebase.firestore

    val settings = firestoreSettings {
        isPersistenceEnabled = true
        setLocalCacheSettings(persistentCacheSettings {})
        setLocalCacheSettings(memoryCacheSettings { cacheSizeBytes = 5L * 1024 * 1024 })
    }
    db.firestoreSettings = settings
}

