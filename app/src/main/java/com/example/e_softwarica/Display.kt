package com.example.e_softwarica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.NonNull
import androidx.fragment.app.Fragment
import android.view.MenuItem
import com.example.e_softwarica.Fragments.AboutFragment
import com.example.e_softwarica.Fragments.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class Display : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView
    private val navListner = object: BottomNavigationView.OnNavigationItemReselectedListener{
        override fun onNavigationItemReselected(@NonNull menuItem:MenuItem) {
            var selectedFragment: Fragment? = null
            when (menuItem.getItemId()) {
                R.id.navHome -> selectedFragment = HomeFragment()
                R.id.navAdd -> selectedFragment = AddFragment()
                R.id.navAbout -> selectedFragment = AboutFragment()
            }
            if (selectedFragment != null) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    selectedFragment).commit()
            }
            return
        }
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)
        bottomNavigationView = findViewById(R.id.bottom_navigation)
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
            HomeFragment()).commit()
    }
}


