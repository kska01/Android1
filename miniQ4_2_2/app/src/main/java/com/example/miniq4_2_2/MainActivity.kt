package com.example.miniq4_2_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import com.example.miniq4_2_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}
    val listener by lazy { CompoundButton.OnCheckedChangeListener { button, checkedId ->
        if (button.id == R.id.checkApple) {
            binding.textView.text = "사과가 체크되었습니다."
        }
    }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.checkApple.setOnCheckedChangeListener(listener)
        binding.checkBanana.setOnCheckedChangeListener(listener)
        binding.checkOrange.setOnCheckedChangeListener(listener)
    }
}

when (button.id) {
//                R.id.checkApple ->
//                R.id.checkBanana -> binding.textView.text = "바나나가 체크되었습니다."
//                R.id.checkOrange -> binding.textView.text = "오렌지가 체크되었습니다."
    R.id.checkApple, R.id.checkBanana -> binding.textView.text = "사과와 바나나가 체크되었습니다."
    R.id.checkApple, R.id.checkOrange -> binding.textView.text = "사과와 오렌지가 체크되었습니다."
    R.id.checkBanana, R.id.checkOrange -> binding.textView.text = "바나나와 오렌지가 체크되었습니다."
    R.id.checkApple, R.id.checkBanana, R.id.checkOrange -> binding.textView.text = "사과, 바나나, 오렌지 모두 체크되었습니다."