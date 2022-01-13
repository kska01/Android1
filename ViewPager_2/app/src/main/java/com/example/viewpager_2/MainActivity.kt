package com.example.viewpager_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager_2.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Fragment 와 Adapter 연결 그리고 ViewPager Adapter 에 연결
        val fragmentList = listOf(Fragment1(), Fragment2(), Fragment3(), Fragment4(), Fragment5())
        val adapter = FragmentAdapter(this)
        adapter.fragmentList = fragmentList
        binding.viewPager.adapter = adapter

        // TabLayout 과 ViewPager 연결하기
        val tabTitles = listOf<String>("간장게장", "간장새우장", "안면도 어리굴젓", "젓갈", "백년의 선택")
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = tabTitles[position]
        }.attach()
    }
}