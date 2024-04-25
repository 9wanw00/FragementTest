package com.daelim.fragementtest

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.daelim.fragementtest.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val inputID = binding.inputID.text.toString()
            val inputPW = binding.inputPW.text.toString()
            if (inputPW.equals("1234")){
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("ID", inputID)
                startActivity(intent)
            } else {
                Toast.makeText(applicationContext, "비밀번호가 틀렸습니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}