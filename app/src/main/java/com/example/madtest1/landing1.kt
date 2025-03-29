package com.example.madtest1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class LandingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_landing1, container, false)

        // Handle click event on the whole layout
        view.findViewById<View>(R.id.landingLayout).setOnClickListener {
            (activity as? MainActivity)?.navigateToHome()
        }

        return view
    }
}