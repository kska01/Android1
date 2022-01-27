package com.example.bottomnavigation

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.bottomnavigation.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    private val fl: FrameLayout by lazy {
        findViewById(R.id.frameLayout)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottomNavigation)

        bottomNavigation.setOnItemSelectedListener { item ->
            changeFragment(
                when (item.itemId) {
                    R.id.menu -> MenuFragment()
                    R.id.cart -> CartFragment()
                    else -> My100Fragment()
                }
            )
            true
        }
        bottomNavigation.selectedItemId = R.id.menu

        // MenuFragment Adapter
//        val fragmentList = listOf(CrabFragment(), ShrimpFragment(), OysterFragment(), JeotgalFragment(), ChoiceFragment())
//        val adapter = FragmentAdapter(this)
//        adapter.fragmentList = fragmentList
//        val menuFragment = MenuFragment()
    }

    private fun changeFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frameLayout, fragment)
            .commit()
    }
}