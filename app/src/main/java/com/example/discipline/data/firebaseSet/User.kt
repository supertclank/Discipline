package com.example.discipline.data.firebaseSet

import android.util.Log
import com.example.discipline.data.dataClass.User
import com.google.firebase.Timestamp
import com.google.firebase.firestore.FirebaseFirestore

private fun setUser() {
    val user = hashMapOf(
        "firstName" to "",
        "lastName" to "",
        "email" to "",
        "password" to "",
        "isActive" to true,
        "createdAt" to Timestamp.now(),
        "updatedAt" to Timestamp.now()
    )


    val db = FirebaseFirestore.getInstance()

    db.collection("User").document()
        .set(user)
        .addOnSuccessListener { Log.d("TAG", "DocumentSnapshot successfully written!") }
        .addOnFailureListener { Log.w("TAG", "Error writing document") }
}