package com.sachin.jetpack_navigation_demo.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.sachin.jetpack_navigation_demo.R
import com.sachin.jetpack_navigation_demo.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding
    private var amount: Int = 0
    lateinit var name: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Get args using safeArgs
        val safeArgs: HomeFragmentArgs by navArgs()
        amount = safeArgs.amount
        name = safeArgs.name
        //Print received values of args
        println("Amount ---------- $amount \nName ------ $name")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_home,
            container,
            false
        )

        binding.animationFragmentBtn.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_animationFragment)
        }
        return binding.root
    }

}
