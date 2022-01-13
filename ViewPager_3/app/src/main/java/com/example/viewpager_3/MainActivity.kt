package com.example.viewpager_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager_3.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val fragmentList = listOf(FragmentMenu(), FragmentCart(), FragmentMy100())
        val adapter = FragmentAdapter(this)
        adapter.fragmentList = fragmentList
        binding.viewPager2.adapter = adapter

        val tabTitle = listOf<String>("Menu", "Cart", "나의백년")
        TabLayoutMediator(binding.tabLayout, binding.viewPager2) { tab, position ->
            tab.text = tabTitle[position]
        }.attach()
    }
}