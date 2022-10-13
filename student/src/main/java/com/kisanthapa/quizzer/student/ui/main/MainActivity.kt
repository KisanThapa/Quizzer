package com.kisanthapa.quizzer.student.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.google.firebase.firestore.FirebaseFirestore
import com.kisanthapa.quizzer.student.R
import com.kisanthapa.quizzer.student.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
//    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Obtain binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // Bind layout with ViewModel
//        binding.viewModel = viewModel

        // Specify the current activity as the lifecycle owner.
//        binding.lifecycleOwner = this





        val db = FirebaseFirestore.getInstance()

        // Create a new user with a first and last name
        // Create a new user with a first and last name
        val user: MutableMap<String, Any> = HashMap()
        user["first"] = "Ada"
        user["last"] = "Lovelace Student"
        user["born"] = 1815

        // Add a new document with a generated ID

        // Add a new document with a generated ID
        db.collection("users")
            .add(user)
            .addOnSuccessListener { documentReference ->
                Log.d(
                    TAG,
                    "DocumentSnapshot added with ID: " + documentReference.id
                )
            }
            .addOnFailureListener { e -> Log.w(TAG, "Error adding document", e) }


    }

    companion object {
        private const val TAG = "MainActivity"
    }
}