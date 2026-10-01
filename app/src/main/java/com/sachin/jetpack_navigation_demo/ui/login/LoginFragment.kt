package com.sachin.jetpack_navigation_demo.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.sachin.jetpack_navigation_demo.R
import com.sachin.jetpack_navigation_demo.databinding.FragmentLoginBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class LoginFragment : Fragment() {
    lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_login,
            container,
            false
        )


        //Click event handle
        binding.btnLogIn.setOnClickListener {
            if (!binding.edtEmail.text.isNullOrBlank()) {
                home()
            } else {
                Toast.makeText(context, "Please Enter Email!", Toast.LENGTH_LONG).show()
            }
        }

        return binding.root
    }

    private fun home() {
        //Set args using bundle to pass to the home fragment
        val name = binding.edtEmail.text.toString()
        val bundle = Bundle().apply {
            putInt("amount", 200)
            putString("name", name)
        }
        //Navigate to home fragment with args
        findNavController().navigate(R.id.action_loginFragment_to_homeFragment, bundle)
    }
}
