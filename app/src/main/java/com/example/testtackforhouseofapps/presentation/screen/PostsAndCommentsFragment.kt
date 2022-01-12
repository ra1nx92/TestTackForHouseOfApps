package com.example.testtackforhouseofapps.presentation.screen

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.testtackforhouseofapps.R
import com.example.testtackforhouseofapps.databinding.FragmentPostsAndCommentsBinding

class PostsAndCommentsFragment : Fragment(R.layout.fragment_posts_and_comments) {

    private lateinit var binding: FragmentPostsAndCommentsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPostsAndCommentsBinding.bind(view)
    }
}