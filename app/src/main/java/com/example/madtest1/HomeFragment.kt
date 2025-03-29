package com.example.madtest1

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Find the ImageView by ID
        val adoptImageView: ImageView = view.findViewById(R.id.adoptImageView)

        // Set click listener to navigate to petdetails activity
        adoptImageView.setOnClickListener {
            val intent = Intent(requireContext(), petdeatils::class.java)
            startActivity(intent)
        }

        return view
    }
}


