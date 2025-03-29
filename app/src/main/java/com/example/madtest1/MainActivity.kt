package com.example.madtest1

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottom_navigation)

        // Show LoginFragment first
        showLoginFragment()

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.bottom_home -> {
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.bottom_search -> {
                    replaceFragment(SearchFragment())
                    true
                }
                R.id.bottom_add -> {
                    replaceFragment(AddFragment())
                    true
                }
                R.id.bottom_favourite -> {
                    replaceFragment(FavouriteFragment())
                    true
                }
                R.id.bottom_profile -> {
                    replaceFragment(ProfileFragment())
                    true
                }
                else -> false
            }
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_container, fragment)
            .commit()
    }

    // Navigate to HomeFragment after successful login
    fun navigateToHome() {
        bottomNavigationView.visibility = BottomNavigationView.VISIBLE
        replaceFragment(HomeFragment())
    }

    // Sign Out Function: Navigate to LoginFragment and hide bottom navigation
    fun signOut() {
        bottomNavigationView.visibility = BottomNavigationView.GONE
        replaceFragment(LoginFragment())
    }

    private fun showLoginFragment() {
        bottomNavigationView.visibility = BottomNavigationView.GONE
        replaceFragment(LoginFragment())
    }

        private fun showLandingFragment() {
            bottomNavigationView.visibility = View.GONE
            replaceFragment(LandingFragment())
        }


    }

