package com.example.bottomnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bottomnavigation.databinding.FragmentMenuBinding
import com.google.android.material.tabs.TabLayoutMediator

class MenuFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentMenuBinding.inflate(inflater, container, false)
        val fragmentList = listOf(CrabFragment(), ShrimpFragment(), OysterFragment(), JeotgalFragment(), ChoiceFragment())
        val adapter = FragmentAdapter(this)
        adapter.fragmentList = fragmentList
        binding.viewPager.adapter = adapter

        val tabTitles = listOf<String>("간장게장", "간장새우장", "안면도 어리굴젓", "젓갈", "백년의 선택")
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = tabTitles[position]
        }.attach()

        return binding.root
    }

}