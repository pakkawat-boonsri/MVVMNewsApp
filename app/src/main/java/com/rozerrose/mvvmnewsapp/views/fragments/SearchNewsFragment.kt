package com.rozerrose.mvvmnewsapp.views.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.rozerrose.mvvmnewsapp.R
import com.rozerrose.mvvmnewsapp.databinding.FragmentSearchnewsBinding

class SearchNewsFragment : Fragment(R.layout.fragment_searchnews) {

    private lateinit var binding: FragmentSearchnewsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSearchnewsBinding.bind(view)
    }
}