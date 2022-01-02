package com.example.centennial2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.centennial2.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

     val binding by lazy { ActivityLoginBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val intent = Intent(this, SignUpActivity::class.java)
        binding.signUpbtn.setOnClickListener { startActivity(intent) }

        val intent_main = Intent(this, MainActivity::class.java)
        binding.loginButton.setOnClickListener { startActivity(intent_main) }
    }
}