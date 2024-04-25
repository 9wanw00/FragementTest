package com.daelim.fragementtest

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.daelim.fragementtest.databinding.ActivityLoginBinding
import com.daelim.fragementtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnDataPassListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getID = intent.getStringExtra("ID")
        binding.textWelcome.text = getID + "님 환영합니다."
    }

    override fun onDataPass(data: String) {
        binding.textFrag.text = data
    }
}