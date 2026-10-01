package com.sachin.jetpack_navigation_demo.ui.animation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.sachin.jetpack_navigation_demo.R
import com.sachin.jetpack_navigation_demo.databinding.FragmentAnimationBinding


class AnimationFragment : Fragment() {
    lateinit var binding: FragmentAnimationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_animation,
            container,
            false
        )

        return binding.root
    }
}
