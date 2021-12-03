package com.example.miniq4_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.miniq4_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.radioGroup.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.buttonApple -> binding.textView.text = "사과"
                R.id.buttonBanana -> binding.textView.text = "바나나"
                R.id.buttonOrange -> binding.textView.text = "오렌지"
            }
        }
    }
}