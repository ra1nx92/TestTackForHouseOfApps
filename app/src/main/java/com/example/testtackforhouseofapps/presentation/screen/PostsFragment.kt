package com.example.testtackforhouseofapps.presentation.screen

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.testtackforhouseofapps.R
import com.example.testtackforhouseofapps.databinding.FragmentPostsBinding

class PostsFragment : Fragment(R.layout.fragment_posts) {

  private lateinit var  binding: FragmentPostsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPostsBinding.bind(view)
    }
}