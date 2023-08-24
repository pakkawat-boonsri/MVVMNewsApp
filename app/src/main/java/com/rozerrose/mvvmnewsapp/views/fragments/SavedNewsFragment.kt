package com.rozerrose.mvvmnewsapp.views.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.rozerrose.mvvmnewsapp.R
import com.rozerrose.mvvmnewsapp.databinding.FragmentSavednewsBinding

class SavedNewsFragment : Fragment(R.layout.fragment_savednews) {

    private lateinit var binding: FragmentSavednewsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSavednewsBinding.bind(view)
    }
}