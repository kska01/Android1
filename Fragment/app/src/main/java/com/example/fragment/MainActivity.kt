package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setFragment()
    }

    //프래그먼트 삽입 함수
    fun setFragment() {
//        val listFragment: ListFragment = ListFragment()
//
//        val transaction = supportFragmentManager.beginTransaction()
//        transaction.add(R.id.frameLayout, listFragment)
//        transaction.commit()
    }
}