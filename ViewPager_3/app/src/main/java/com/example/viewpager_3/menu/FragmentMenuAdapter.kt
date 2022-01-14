package com.example.viewpager_3.menu

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentMenuAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    var fragmentMenuList = listOf<Fragment>()

    override fun getItemCount(): Int {
        return fragmentMenuList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentMenuList[position]
    }
}