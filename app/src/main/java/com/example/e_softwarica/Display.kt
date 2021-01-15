package com.example.e_softwarica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.NonNull
import androidx.fragment.app.Fragment
import android.view.MenuItem
import com.example.e_softwarica.Fragments.AddFragment
import com.example.e_softwarica.Fragments.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class Display : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)
        bottomNavigationView = findViewById(R.id.bottom_navigation)
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,
            HomeFragment()).commit()





    }


    }



