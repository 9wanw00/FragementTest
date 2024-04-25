package com.daelim.fragementtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.daelim.fragementtest.databinding.ActivityMainBinding
import com.daelim.fragementtest.databinding.FragmentHomeBinding
import com.daelim.fragementtest.databinding.FragmentMyBinding

class MyFragment : Fragment() {

    private lateinit var binding: FragmentMyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentMyBinding.inflate(layoutInflater)


        binding.btn1.setOnClickListener {
            (activity as? OnDataPassListener)?.onDataPass("My")
        }
        binding.btn2.setOnClickListener {
            (activity as? OnDataPassListener)?.onDataPass("Profile")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding.btnHome.setOnClickListener {
            it.findNavController().navigate((R.id.action_myFragment_to_homeFragment))
        }

        return binding.root
    }
}