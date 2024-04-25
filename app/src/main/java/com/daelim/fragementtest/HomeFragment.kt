package com.daelim.fragementtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.daelim.fragementtest.databinding.ActivityMainBinding
import com.daelim.fragementtest.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentHomeBinding.inflate(layoutInflater)
    
        binding.btn1.setOnClickListener {
            (activity as? OnDataPassListener)?.onDataPass("1")
        }
        binding.btn2.setOnClickListener {
            (activity as? OnDataPassListener)?.onDataPass("2")
        }
        binding.btn3.setOnClickListener {
            (activity as? OnDataPassListener)?.onDataPass("3")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding.btnMy.setOnClickListener {
            it.findNavController().navigate((R.id.action_homeFragment_to_myFragment))
        }

        return binding.root
    }
}