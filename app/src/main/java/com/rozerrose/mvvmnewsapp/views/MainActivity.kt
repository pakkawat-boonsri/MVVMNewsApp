package com.rozerrose.mvvmnewsapp.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.rozerrose.mvvmnewsapp.R
import com.rozerrose.mvvmnewsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomNavigationView: BottomNavigationView = binding.navView
        val navController = findNavController(R.id.newsNavHostFragment)

        bottomNavigationView.setupWithNavController(navController)
    }
}