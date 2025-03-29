package com.example.madtest1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button // ✅ Import Button
import androidx.fragment.app.Fragment

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        val btnSignOut = view.findViewById<Button>(R.id.btnSignOut)

        // Sign Out Logic
        btnSignOut.setOnClickListener {
            (activity as? MainActivity)?.signOut()
        }

        return view
    }
}