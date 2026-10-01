package com.sachin.jetpack_navigation_demo.ui.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.LinearInterpolator
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.sachin.jetpack_navigation_demo.R
import com.sachin.jetpack_navigation_demo.databinding.FragmentSplashBinding
import kotlinx.coroutines.*


class SplashFragment : Fragment() {
    private val mDelayJob: CompletableJob = Job()
    private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_splash,
            container,
            false
        )

        // --------- set animation for splash logo ------------
        val animation: Animation = AnimationUtils.loadAnimation(context, R.anim.splash_logo)
        animation.interpolator = LinearInterpolator()
        animation.duration = 2000
        binding.imgLogo.animation = animation
        // --------- redirection after splash screen ------------
        splash()
        return binding.root
    }

    private fun splash() = CoroutineScope(Dispatchers.Main).launch(mDelayJob) {
        delay(2500)
        //Navigate to Login fragment
        findNavController().navigate(R.id.action_splashFragment_to_loginFragment)
    }
}
