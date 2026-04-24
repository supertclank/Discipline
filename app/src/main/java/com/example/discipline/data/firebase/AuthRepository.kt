package com.example.discipline.data.firebase

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class AuthRepository {

    private val auth = FirebaseAuth.getInstance()
    private val db = FirebaseFirestore.getInstance()

    fun register(
        email: String,
        password: String,
        onResult: (Boolean, String?) -> Unit
    ){

    }

}