package com.example.checkinapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.checkinapp.R
import com.example.checkinapp.fragment.LeaveBottomSheetFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        bottomNavigation.setupWithNavController(navController)

        navController.addOnDestinationChangedListener{ _, destination, _ ->
            when(destination.id) {
                R.id.teamDetailFragment -> {
                    hideBotNavBar()
                }
                else -> showBotNavBar()
            }

        }
    }

    private fun hideBotNavBar() {
        bottomNavigation.visibility = View.GONE
    }

    private fun showBotNavBar() {
        bottomNavigation.visibility = View.VISIBLE
    }
}