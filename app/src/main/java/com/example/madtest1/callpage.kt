package com.example.madtest1

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.example.madtest1.databinding.ActivityCallpageBinding

class callpage : AppCompatActivity() {

    private lateinit var binding: ActivityCallpageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize View Binding
        binding = ActivityCallpageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set toolbar as the action bar
        setSupportActionBar(binding.toolbar)

        // Floating Action Button click listener
        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }
}